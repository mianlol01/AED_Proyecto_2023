package arreglos;

import clases.Factura;

import java.io.*;
import java.util.ArrayList;

public class ArregloFacturas {

	// Atributos privados
	private ArrayList<Factura> facturas;

	// Constructor
	public ArregloFacturas() {
		facturas = new ArrayList<>();
		cargarFacturas();
	}

	// Operaciones públicas básicas
	public void adicionar(Factura x) {
		facturas.add(x);
	}

	public int tamanio() {
		return facturas.size();
	}

	public Factura obtener(int i) {
		return facturas.get(i);
	}

	public Factura buscar(int codigoFactura) {
		for (int i = 0; i < tamanio(); i++)
			if (obtener(i).getCodigoFactura() == codigoFactura)
				return obtener(i);
		return null;
	}

	public void eliminar(Factura x) {
		facturas.remove(x);
	}

	public void grabarFacturas() {
		try {
			PrintWriter pw;
			String linea;
			Factura x;
			pw = new PrintWriter(new FileWriter("facturas.txt"));
			for (int i = 0; i < tamanio(); i++) {
				x = obtener(i);
				linea = x.getCodigoFactura() + ";" + x.getCodigoProducto() + ";" + x.getCodigoVendedor() + ";"
						+ x.getUnidades() + ";" + x.getPrecio();
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void cargarFacturas() {
		try {
			BufferedReader br;
			String linea;
			String[] s;
			int codigoFactura, codigoProducto, codigoVendedor, unidades;
			double precio;
			br = new BufferedReader(new FileReader("facturas.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoFactura = Integer.parseInt(s[0].trim());
				codigoProducto = Integer.parseInt(s[1].trim());
				codigoVendedor = Integer.parseInt(s[2].trim());
				unidades = Integer.parseInt(s[3].trim());
				precio = Double.parseDouble(s[4].trim());
				adicionar(new Factura(codigoFactura, codigoProducto, codigoVendedor, unidades, precio));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int codigoCorrelativo() {
        if (tamanio() == 0) {
            return 4001;
        } else {
            Factura ultimaFactura = obtener(tamanio() - 1);
            return ultimaFactura.getCodigoFactura() + 1;
        }
    }

	// Operaciones públicas complementarias...

}