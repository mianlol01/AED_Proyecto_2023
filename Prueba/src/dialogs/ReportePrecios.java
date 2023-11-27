package dialogs;

import java.awt.Color;
import java.text.DecimalFormat;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

import arreglos.ArregloFacturas;
import arreglos.ArregloProductos;
import arreglos.ArregloVendedores;
import clases.Producto;

public class ReportePrecios extends DialogModelo {
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtArea;

	public ReportePrecios() {
		getPanelContenido().setBounds(0, 36, 640, 444);
		getPbX().setLocation(604, 0);
		getPaneHeader().setBounds(0, 0, 640, 36);
		setBounds(0, 0, 640, 480);
		getLblTitle().setBounds(36, 0, 124, 36);
		getLblTitle().setText("Reporte por precio");

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 11, 620, 422);
		getPanelContenido().add(scrollPane);

		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		informe();
	}

	ArregloVendedores arregloVendedores = new ArregloVendedores();
	ArregloFacturas arregloFacturas = new ArregloFacturas();
	ArregloProductos arregloProductos = new ArregloProductos();

	private void informe() {
		// Verificar si hay productos en el arreglo
		if (arregloProductos.estaVacio()) {
			txtArea.setText("No hay productos para generar el informe de precios.");
			return;
		}

		// Inicializar variables para el cálculo
		double precioTotal = 0;
		double precioPromedio;
		double precioMaximo = Double.MIN_VALUE;
		double precioMinimo = Double.MAX_VALUE;

		// Iterar sobre los productos para calcular los precios
		for (int i = 0; i < arregloProductos.tamanio(); i++) {
			Producto producto = arregloProductos.obtener(i);
			double precioActual = producto.getPrecio();

			// Actualizar el precio máximo
			if (precioActual > precioMaximo) {
				precioMaximo = precioActual;
			}

			// Actualizar el precio mínimo
			if (precioActual < precioMinimo) {
				precioMinimo = precioActual;
			}

			// Acumular el precio total
			precioTotal += precioActual;
		}

		// Calcular el precio promedio
		precioPromedio = precioTotal / arregloProductos.tamanio();

		// Formatear el precio promedio con dos decimales
		DecimalFormat df = new DecimalFormat("#.##");
		String precioPromedioFormateado = df.format(precioPromedio);

		// Mostrar el informe en el txtArea
		txtArea.setText("Informe de Precios\n");
		txtArea.append("--------------------------------\n");
		txtArea.append("Precio Promedio: " + precioPromedioFormateado + "\n");
		txtArea.append("Precio Máximo: " + precioMaximo + "\n");
		txtArea.append("Precio Mínimo: " + precioMinimo + "\n");
	}
}