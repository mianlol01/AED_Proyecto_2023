package arreglos;

import clases.Cliente;

import java.io.*;
import java.util.ArrayList;

public class ArregloClientes {

	// Atributos privados
	private ArrayList<Cliente> clientes;

	// Constructor
	public ArregloClientes() {
		clientes = new ArrayList<>();
		cargarClientes();
	}

	// Operaciones públicas básicas
	public void adicionar(Cliente x) {
		clientes.add(x);
	}

	public int tamanio() {
		return clientes.size();
	}

	public Cliente obtener(int i) {
		return clientes.get(i);
	}

	public Cliente buscar(int codigoCliente) {
		for (int i = 0; i < tamanio(); i++)
			if (obtener(i).getCodigoCliente() == codigoCliente)
				return obtener(i);
		return null;
	}

	public void eliminar(Cliente x) {
		clientes.remove(x);
	}

	public void grabarClientes() {
		try {
			PrintWriter pw;
			String linea;
			Cliente x;
			pw = new PrintWriter(new FileWriter("clientes.txt"));
			for (int i = 0; i < tamanio(); i++) {
				x = obtener(i);
				linea = x.getCodigoCliente() + ";" + x.getNombre() + ";" + x.getApellido() + ";" + x.getDni() + ";"
						+ x.getTelefono();
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void cargarClientes() {
		try {
			BufferedReader br;
			String linea;
			String[] s;
			int codigoCliente;
			String nombre, apellido, dni, telefono;
			br = new BufferedReader(new FileReader("clientes.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoCliente = Integer.parseInt(s[0].trim());
				nombre = s[1].trim();
				apellido = s[2].trim();
				dni = s[3].trim();
				telefono = s[4].trim();
				adicionar(new Cliente(nombre, apellido, dni, telefono, codigoCliente));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Operaciones públicas complementarias
	public int codigoCorrelativo() {
		if (tamanio() == 0) {
			return 1001;
		} else
			return obtener(tamanio() - 1).getCodigoCliente() + 1;
	}

	public void eliminarYReasignar(int codigoCliente) {
		Cliente clienteEliminado = null;

		// Buscar y eliminar el cliente con el código especificado
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getCodigoCliente() == codigoCliente) {
				clienteEliminado = obtener(i);
				eliminar(clienteEliminado);
				break;
			}
		}

		// Reasignar códigos correlativos
		for (int i = 0; i < tamanio(); i++) {
			Cliente cliente = obtener(i);
			cliente.setCodigoCliente(1001 + i); // Asignar códigos correlativos desde 1001
		}

		// Grabar los cambios en el archivo
		grabarClientes();
	}

	// Método para obtener los códigos de los clientes
	public String[] getCodigos() {
		String[] codigos = new String[clientes.size()];

		for (int i = 0; i < clientes.size(); i++) {
			codigos[i] = String.valueOf(clientes.get(i).getCodigoCliente());
		}

		return codigos;
	}

	// Método para buscar un cliente por su código
	public Cliente buscarClientePorCodigo(int codigoCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getCodigoCliente() == codigoCliente) {
				return cliente;
			}
		}
		return null; // Devolver null si no se encuentra el cliente
	}

	public boolean estaVacio() {
		return clientes.isEmpty();
	}

	public void adicionarNuevoCliente(String nombre, String apellido, String dni, String telefono) {
		// Obtener el próximo código correlativo
		int codigoCliente = codigoCorrelativo();

		// Crear un nuevo cliente
		Cliente nuevoCliente = new Cliente(nombre, apellido, dni, telefono, codigoCliente);

		// Adicionar el nuevo cliente al arreglo
		adicionar(nuevoCliente);

		// Grabar cambios en el archivo
		grabarClientes();
	}
}