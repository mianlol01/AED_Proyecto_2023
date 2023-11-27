package dialogs;

import arreglos.*;
import clases.*;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ReporteProducto extends DialogModelo {
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private JLabel lblNewLabel;
	private JComboBox<String> comboBox;
	private DefaultComboBoxModel<String> productosModel;

	public ReporteProducto() {
		getPanelContenido().setBounds(0, 36, 640, 444);
		getPbX().setLocation(604, 0);
		getPaneHeader().setBounds(0, 0, 640, 36);
		setBounds(0, 0, 640, 480);
		getLblTitle().setBounds(36, 0, 146, 36);
		getLblTitle().setText("Reporte por producto");

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 45, 620, 388);
		getPanelContenido().add(scrollPane);

		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
		
		lblNewLabel = new JLabel("Código");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 11, 53, 23);
		getPanelContenido().add(lblNewLabel);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(73, 10, 113, 22);
		getPanelContenido().add(comboBox);
		comboBox.addActionListener(this);
		
		productosModel = new DefaultComboBoxModel<>();
		comboBox.setModel(productosModel);
		listar();
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) { // Debería ser comboBox en lugar de cboProductos
            String codigoProductoSeleccionado = (String) comboBox.getSelectedItem(); // Debería ser comboBox en lugar de cboProductos
            int codigoProducto = Integer.parseInt(codigoProductoSeleccionado);

            generarInformeProducto(codigoProducto);
        }
    }
	
	ArregloVendedores arregloVendedores = new ArregloVendedores();
	ArregloFacturas arregloFacturas = new ArregloFacturas();
	ArregloProductos arregloProductos = new ArregloProductos();
	
	
	private void listar() {
        for (int i = 0; i < arregloProductos.tamanio(); i++) {
            Producto producto = arregloProductos.obtener(i);
            comboBox.addItem(String.valueOf(producto.getCodigoProducto()));
        }
    }
	private void generarInformeProducto(int codigoProducto) {
	    // Limpiar el área de texto antes de mostrar el nuevo informe
	    txtArea.setText("");

	    // Buscar el producto en el arregloProductos
	    Producto productoSeleccionado = arregloProductos.buscarProductoPorCodigo(codigoProducto);

	    // Verificar si se encontró el producto
	    if (productoSeleccionado != null) {
	        // Mostrar encabezado del informe
	        txtArea.append("Reporte por Producto\n");
	        txtArea.append("Código de Producto: " + productoSeleccionado.getCodigoProducto() + "\n");
	        txtArea.append("Descripción: " + productoSeleccionado.getDescripcion() + "\n");
	        txtArea.append("-------------------------------------------\n");
	        txtArea.append("Código de Factura | Código de Vendedor | Unidades Vendidas | Precio Total\n");
	        txtArea.append("-------------------------------------------\n");

	        // Iterar sobre las facturas para el producto seleccionado
	        for (int i = 0; i < arregloFacturas.tamanio(); i++) {
	            Factura factura = arregloFacturas.obtener(i);

	            // Verificar si la factura corresponde al producto seleccionado
	            if (factura.getCodigoProducto() == codigoProducto) {
	                // Mostrar detalles de la factura en el informe
	                txtArea.append(String.format("%-17d%-22d%-20d%-15.2f\n", factura.getCodigoFactura(),
	                        factura.getCodigoVendedor(), factura.getUnidades(), factura.getPrecio()));
	            }
	        }
	    } else {
	        // Mostrar mensaje si el producto no se encuentra
	        txtArea.append("Producto no encontrado.");
	    }
	}
}