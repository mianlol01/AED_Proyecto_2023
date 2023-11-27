package arreglos;

import clases.Vendedor;

import java.io.*;
import java.util.ArrayList;

public class ArregloVendedores {

	// Atributos privados
	private ArrayList<Vendedor> vendedores;

	// Constructor
	public ArregloVendedores() {
		vendedores = new ArrayList<>();
		cargarVendedores();
	}

	// Operaciones públicas básicas
	public void adicionar(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	public int tamanio() {
		return vendedores.size();
	}

	public Vendedor obtener(int i) {
		return vendedores.get(i);
	}

	public Vendedor buscar(int codigoVendedor) {
		for (int i = 0; i < tamanio(); i++)
			if (obtener(i).getCodigoVendedor() == codigoVendedor)
				return obtener(i);
		return null;
	}

	public void eliminar(Vendedor vendedor) {
		vendedores.remove(vendedor);
	}

	public void grabarVendedores() {
		try {
			PrintWriter pw;
			String linea;
			Vendedor vendedor;
			pw = new PrintWriter(new FileWriter("vendedores.txt"));
			for (int i = 0; i < tamanio(); i++) {
				vendedor = obtener(i);
				linea = vendedor.getCodigoVendedor() + ";" + vendedor.getNombre() + ";" + vendedor.getApellido() + ";"
						+ vendedor.getDni() + ";" + vendedor.getTelefono() + ";" + vendedor.getVentas() + ";"
						+ vendedor.getCategoria() + ";" + vendedor.getUnidadesVendidas(); // Agregar unidadesVendidas
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void cargarVendedores() {
		try {
			BufferedReader br;
			String linea;
			String[] s;
			int codigoVendedor, ventas, unidadesVendidas, categoria; // Agregar unidadesVendidas
			String nombre, apellido, dni, telefono;
			br = new BufferedReader(new FileReader("vendedores.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoVendedor = Integer.parseInt(s[0].trim());
				nombre = s[1].trim();
				apellido = s[2].trim();
				dni = s[3].trim();
				telefono = s[4].trim();
				ventas = Integer.parseInt(s[5].trim());
				categoria = Integer.parseInt(s[6].trim());
				unidadesVendidas = Integer.parseInt(s[7].trim()); // Agregar unidadesVendidas
				adicionar(new Vendedor(nombre, apellido, dni, telefono, codigoVendedor, ventas, categoria,
						unidadesVendidas));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Operaciones públicas complementarias
	public int codigoCorrelativo() {
		if (tamanio() == 0) {
			return 2001;
		} else {
			return obtener(tamanio() - 1).getCodigoVendedor() + 1;
		}
	}

	public void eliminarYReasignar(int codigoVendedor) {
		Vendedor vendedorEliminado = null;

		// Buscar y eliminar el vendedor con el código especificado
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getCodigoVendedor() == codigoVendedor) {
				vendedorEliminado = obtener(i);
				eliminar(vendedorEliminado);
				break;
			}
		}

		// Reasignar códigos correlativos
		for (int i = 0; i < tamanio(); i++) {
			Vendedor vendedor = obtener(i);
			vendedor.setCodigoVendedor(2001 + i); // Asignar códigos correlativos desde 2001
		}

		// Grabar los cambios en el archivo
		grabarVendedores();
	}

	// Método para obtener los códigos de los vendedores
	public String[] getCodigos() {
		String[] codigos = new String[vendedores.size()];

		for (int i = 0; i < vendedores.size(); i++) {
			codigos[i] = String.valueOf(vendedores.get(i).getCodigoVendedor());
		}

		return codigos;
	}

	// Método para buscar un vendedor por su código
	public Vendedor buscarVendedorPorCodigo(int codigoVendedor) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getCodigoVendedor() == codigoVendedor) {
				return vendedor;
			}
		}
		return null; // Devolver null si no se encuentra el vendedor
	}

	public boolean estaVacio() {
		return vendedores.isEmpty();
	}
}