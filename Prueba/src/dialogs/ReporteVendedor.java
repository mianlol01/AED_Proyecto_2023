package dialogs;

import clases.*;
import arreglos.*;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ReporteVendedor extends DialogModelo {
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel;
	private DefaultComboBoxModel<String> vendedoresModel;

	public ReporteVendedor() {
		getPanelContenido().setBounds(0, 36, 640, 444);
		getPbX().setLocation(604, 0);
		getPaneHeader().setBounds(0, 0, 640, 36);
		setBounds(0, 0, 640, 480);
		getLblTitle().setBounds(36, 0, 146, 36);
		getLblTitle().setText("Reporte por vendedor");

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 45, 620, 388);
		getPanelContenido().add(scrollPane);

		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);

		lblNewLabel = new JLabel("Código");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setBounds(10, 11, 99, 23);
		getPanelContenido().add(lblNewLabel);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(79, 10, 107, 24);
		getPanelContenido().add(comboBox);
		comboBox.addActionListener(this);

		vendedoresModel = new DefaultComboBoxModel<>();
		comboBox.setModel(vendedoresModel);
		lista();
	}

	ArregloVendedores arregloVendedores = new ArregloVendedores();
	ArregloFacturas arregloFacturas = new ArregloFacturas();
	ArregloProductos arregloProductos = new ArregloProductos();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {

			String codigoVendedorSeleccionado = (String) comboBox.getSelectedItem();
			int codigoVendedor = Integer.parseInt(codigoVendedorSeleccionado);

			// Generar el informe por vendedor
			String informe = informe(codigoVendedor);

			// Mostrar el informe en el JTextArea
			txtArea.setText(informe);
		}
	}

	private void lista() {
		for (int i = 0; i < arregloVendedores.tamanio(); i++) {
			Vendedor vendedor = arregloVendedores.obtener(i);
			vendedoresModel.addElement(String.valueOf(vendedor.getCodigoVendedor()));
		}
	}

	private String informe(int codigoVendedor) {
		StringBuilder informe = new StringBuilder();

		// Recorrer todas las facturas y buscar las relacionadas con el vendedor
		// seleccionado
		for (int i = 0; i < arregloFacturas.tamanio(); i++) {
			Factura factura = arregloFacturas.obtener(i);

			// Verificar si la factura pertenece al vendedor seleccionado
			if (factura.getCodigoVendedor() == codigoVendedor) {
				// Agregar detalles al informe
				informe.append("Código de Factura: ").append(factura.getCodigoFactura()).append("\n");
				informe.append("Código de Producto: ").append(factura.getCodigoProducto()).append("\n");
				informe.append("Unidades Vendidas: ").append(factura.getUnidades()).append("\n");
				informe.append("Precio Unitario: ").append(factura.getPrecio()).append("\n");
				informe.append("\n--------------------------\n");
			}
		}

		return informe.toString();

	}

}
