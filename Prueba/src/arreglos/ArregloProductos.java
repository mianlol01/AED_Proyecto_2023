package arreglos;

import clases.Producto;

import java.io.*;
import java.util.ArrayList;

public class ArregloProductos {

	// Atributos privados
	private ArrayList<Producto> productos;

	// Constructor
	public ArregloProductos() {
		productos = new ArrayList<>();
		cargarProductos();
	}

	// Operaciones públicas básicas
	public void adicionar(Producto x) {
		productos.add(x);
	}

	public int tamanio() {
		return productos.size();
	}

	public Producto obtener(int i) {
		return productos.get(i);
	}

	public Producto buscar(int codigoProducto) {
		for (int i = 0; i < tamanio(); i++)
			if (obtener(i).getCodigoProducto() == codigoProducto)
				return obtener(i);
		return null;
	}

	public void eliminar(Producto x) {
		productos.remove(x);
	}

	public void grabarProductos() {
		try {
			PrintWriter pw;
			String linea;
			Producto x;
			pw = new PrintWriter(new FileWriter("productos.txt"));
			for (int i = 0; i < tamanio(); i++) {
				x = obtener(i);
				linea = x.getCodigoProducto() + ";" + x.getDescripcion() + ";" + x.getPrecio() + ";" + x.getStock()
						+ ";" + x.getCantidadesVendidas(); // Agregar cantidadesVendidas al archivo
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void cargarProductos() {
		try {
			BufferedReader br;
			String linea, descripcion;
			String[] s;
			int codigoProducto, stock, cantidadesVendidas;
			double precio;
			br = new BufferedReader(new FileReader("productos.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoProducto = Integer.parseInt(s[0].trim());
				descripcion = s[1].trim();
				precio = Double.parseDouble(s[2].trim());
				stock = Integer.parseInt(s[3].trim());
				cantidadesVendidas = Integer.parseInt(s[4].trim()); // Leer cantidadesVendidas del archivo
				adicionar(new Producto(codigoProducto, descripcion, precio, stock, cantidadesVendidas));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Operaciones públicas complementarias
	public int codigoCorrelativo() {
		if (tamanio() == 0) {
			return 3001;
		} else
			return obtener(tamanio() - 1).getCodigoProducto() + 1;
	}

	public void eliminarYReasignar(int codigoProducto) {
		Producto productoEliminado = null;

		// Buscar y eliminar el producto con el código especificado
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getCodigoProducto() == codigoProducto) {
				productoEliminado = obtener(i);
				eliminar(productoEliminado);
				break;
			}
		}

		// Reasignar códigos correlativos
		for (int i = 0; i < tamanio(); i++) {
			Producto producto = obtener(i);
			producto.setCodigoProducto(3001 + i); // Asignar códigos correlativos desde 3001
		}

		// Grabar los cambios en el archivo
		grabarProductos();
	}

	// Método para obtener los códigos de los productos
	public String[] getCodigos() {
		String[] codigos = new String[productos.size()];

		for (int i = 0; i < productos.size(); i++) {
			codigos[i] = String.valueOf(productos.get(i).getCodigoProducto());
		}

		return codigos;
	}

	// Método para buscar un producto por su código
	public Producto buscarProductoPorCodigo(int codigoProducto) {
		for (Producto producto : productos) {
			if (producto.getCodigoProducto() == codigoProducto) {
				return producto;
			}
		}
		return null; // Devolver null si no se encuentra el producto
	}

	public boolean estaVacio() {
		return productos.isEmpty();
	}
}