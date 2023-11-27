package dialogs;

import arreglos.*;
import clases.*;

import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextArea;

public class ReporteGeneralProductos extends DialogModelo {
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtArea;

	public ReporteGeneralProductos() {
		getPanelContenido().setBounds(0, 36, 640, 444);
		getPbX().setLocation(604, 0);
		getPaneHeader().setBounds(0, 0, 640, 36);
		setBounds(0, 0, 640, 480);
		getLblTitle().setBounds(36, 0, 203, 36);
		getLblTitle().setText("Reporte general por productos");

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 11, 620, 422);
		getPanelContenido().add(scrollPane);

		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		informe();
	}

	ArregloProductos arregloProductos = new ArregloProductos();
	ArregloFacturas arregloFacturas = new ArregloFacturas();

	public void informe() {
		for (int i = 0; i < arregloProductos.tamanio(); i++) {
			Producto producto = arregloProductos.obtener(i);

			// 2. Obtener Información de Ventas
			int numVentas = 0;
			int unidadesVendidasAcumuladas = 0;
			double importeTotalAcumulado = 0;

			// Recorrer el Arreglo de Facturas para el producto actual
			for (int j = 0; j < arregloFacturas.tamanio(); j++) {
				Factura factura = arregloFacturas.obtener(j);

				// Verificar si la factura pertenece al producto actual
				if (factura.getCodigoProducto() == producto.getCodigoProducto()) {
					numVentas++;
					unidadesVendidasAcumuladas += factura.getUnidades();
					importeTotalAcumulado += factura.getPrecio();
				}
			}

			// 3. Mostrar el Informe en el JTextArea
			txtArea.append("Producto: " + producto.getCodigoProducto() + "\n");
			txtArea.append("Descripción: " + producto.getDescripcion() + "\n");
			txtArea.append("Número de Ventas: " + numVentas + "\n");
			txtArea.append("Unidades Vendidas Acumuladas: " + unidadesVendidasAcumuladas + "\n");
			txtArea.append("Importe Total Acumulado: " + importeTotalAcumulado + "\n");
			txtArea.append("------------------------------\n");
		}

	}
}
