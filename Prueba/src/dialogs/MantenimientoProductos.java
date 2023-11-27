package dialogs;

import arreglos.ArregloProductos;
import clases.Producto;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class MantenimientoProductos extends DialogModelo{
	private static final long serialVersionUID = 1L;

	private JLabel lblCodigo;

	private JLabel lblIngreso;
	private JLabel lblConsulta;
	private JLabel lblModificacion;
	private JLabel lblEliminar;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblPrecio;
	private JLabel lblDescripcion;
	private JLabel lblStock;
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JTextField txtDescripcion;
	private JTextField txtStock;
	private DefaultTableModel model;
	private String[] codigosProductos;

	public MantenimientoProductos() {
		getLblTitle().setBounds(36, 0, 180, 36);
		getLblTitle().setText("Mantenimiento productos");
		getPanelContenido().setLocation(0, 36);
		getPanelContenido().setSize(760, 444);

		lblCodigo = new JLabel("Código:");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigo.setForeground(new Color(229, 9, 127));
		lblCodigo.setBounds(10, 10, 90, 23);
		getPanelContenido().add(lblCodigo);

		lblPrecio = new JLabel("Precio:");
		lblPrecio.setForeground(new Color(229, 9, 127));
		lblPrecio.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblPrecio.setBounds(280, 10, 90, 20);
		getPanelContenido().add(lblPrecio);

		lblStock = new JLabel("Stock:");
		lblStock.setForeground(new Color(229, 9, 127));
		lblStock.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblStock.setBounds(10, 35, 144, 23);
		getPanelContenido().add(lblStock);

		lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setForeground(new Color(229, 9, 127));
		lblDescripcion.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblDescripcion.setBounds(10, 60, 144, 23);
		getPanelContenido().add(lblDescripcion);

		txtCodigo = new JTextField();
		txtCodigo.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtCodigo.setBounds(160, 10, 100, 20);
		getPanelContenido().add(txtCodigo);
		txtCodigo.setColumns(10);
		txtCodigo.setEditable(false);
		txtCodigo.setFocusable(false);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPrecio.setBounds(400, 10, 100, 20);
		getPanelContenido().add(txtPrecio);

		txtStock = new JTextField();
		txtStock.setColumns(10);
		txtStock.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtStock.setBounds(160, 35, 100, 20);
		getPanelContenido().add(txtStock);

		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtDescripcion.setBounds(160, 60, 340, 20);
		getPanelContenido().add(txtDescripcion);

		lblIngreso = new JLabel("Ingreso");
		lblIngreso.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblIngreso.setBackground(new Color(55, 55, 57));
		lblIngreso.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIngreso.setForeground(new Color(229, 9, 127));
		lblIngreso.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreso.setOpaque(true);
		lblIngreso.setBounds(530, 10, 108, 35);
		getPanelContenido().add(lblIngreso);
		lblIngreso.addMouseListener(this);

		lblConsulta = new JLabel("Consulta");
		lblConsulta.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblConsulta.setBackground(new Color(55, 55, 57));
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblConsulta.setForeground(new Color(229, 9, 127));
		lblConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsulta.setOpaque(true);
		lblConsulta.setBounds(648, 10, 108, 35);
		getPanelContenido().add(lblConsulta);
		lblConsulta.addMouseListener(this);

		lblModificacion = new JLabel("Modificación");
		lblModificacion.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblModificacion.setBackground(new Color(55, 55, 57));
		lblModificacion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblModificacion.setForeground(new Color(229, 9, 127));
		lblModificacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificacion.setOpaque(true);
		lblModificacion.setBounds(530, 55, 108, 35);
		getPanelContenido().add(lblModificacion);
		lblModificacion.addMouseListener(this);

		lblEliminar = new JLabel("Eliminar");
		lblEliminar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblEliminar.setBackground(new Color(55, 55, 57));
		lblEliminar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEliminar.setForeground(new Color(229, 9, 127));
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setOpaque(true);
		lblEliminar.setBounds(648, 55, 108, 35);
		getPanelContenido().add(lblEliminar);
		lblEliminar.addMouseListener(this);

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 101, 740, 332);
		getPanelContenido().add(scrollPane);

		model = new DefaultTableModel();
		model.addColumn("Código");
		model.addColumn("Precio");
		model.addColumn("Descripción");
		model.addColumn("Stock");

		table = new JTable(model);
		table.setBorder(null);
		scrollPane.setViewportView(table);
		getPbX().setLocation(724, 0);
		getPaneHeader().setBounds(0, 0, 760, 36);
		setBounds(0, 0, 760, 480);
		getLblX().addMouseListener(this);

		mostrarTabla();

		txtCodigo.setText("" + arregloProductos.codigoCorrelativo());

		consulta.getComboBox().addActionListener(this);
		actualizarcomboBox();

	}

	ArregloProductos arregloProductos = new ArregloProductos();
	Consulta consulta = new Consulta();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == consulta.getComboBox()) {
			actualizarDatosEnTextArea();
		}
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == getLblX() && getLblX().contains(e.getPoint())) {
			HoverMenu(getLblX(), magenta, oscuro);
			Salir();
		}
		if (e.getSource() == lblIngreso && lblIngreso.contains(e.getPoint())) {
			agregarProducto();
		}
		if (e.getSource() == lblModificacion && lblModificacion.contains(e.getPoint())) {
			modificarProducto();
		}
		if (e.getSource() == lblConsulta && lblConsulta.contains(e.getPoint())) {
			dialogs(consulta);
		}
		if (e.getSource() == lblEliminar && lblEliminar.contains(e.getPoint())) {
			eliminarProducto();
		}
	}

	public void mouseEntered(MouseEvent e) {

		if (e.getSource() == getLblX()) {
			HoverMenu(getLblX(), oscuro, magenta);
		}
		if (e.getSource() == lblIngreso) {
			HoverMenu(lblIngreso, dark, magenta);
		}
		if (e.getSource() == lblModificacion) {
			HoverMenu(lblModificacion, dark, magenta);
		}
		if (e.getSource() == lblConsulta) {
			HoverMenu(lblConsulta, dark, magenta);
		}
		if (e.getSource() == lblEliminar) {
			HoverMenu(lblEliminar, dark, magenta);
		}

	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == getLblX()) {
			HoverMenu(getLblX(), magenta, oscuro);
		}
		if (e.getSource() == lblIngreso) {
			HoverMenu(lblIngreso, magenta, dark);
		}
		if (e.getSource() == lblModificacion) {
			HoverMenu(lblModificacion, magenta, dark);
		}
		if (e.getSource() == lblConsulta) {
			HoverMenu(lblConsulta, magenta, dark);
		}
		if (e.getSource() == lblEliminar) {
			HoverMenu(lblEliminar, magenta, dark);
		}
	}

	private void agregarProducto() {
		try {
			// Obtener datos de las áreas de texto
			int codigo = Integer.parseInt(txtCodigo.getText().trim());
			double precio = Double.parseDouble(txtPrecio.getText().trim());
			String descripcion = txtDescripcion.getText().trim();
			int stock = Integer.parseInt(txtStock.getText().trim());

			// Crear objeto Producto con el próximo código correlativo
			Producto nuevoProducto = new Producto(codigo, descripcion, precio, stock);

			// Agregar el producto al arreglo y guardar en el archivo
			arregloProductos.adicionar(nuevoProducto);
			arregloProductos.grabarProductos();
			actualizarTabla();

			// Limpiar las áreas de texto después de agregar
			limpiarAreasTexto();
			txtCodigo.setText("" + arregloProductos.codigoCorrelativo());

			// Puedes mostrar un mensaje indicando que se agregó el producto con éxito
			JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	// Método para limpiar las áreas de texto después de agregar un producto
	private void limpiarAreasTexto() {
		txtCodigo.setText("");
		txtPrecio.setText("");
		txtDescripcion.setText("");
		txtStock.setText("");
	}

	// Tabla
	private void mostrarTabla() {
		for (int i = 0; i < arregloProductos.tamanio(); i++) {
			Producto producto = arregloProductos.obtener(i);
			Object[] row = { producto.getCodigoProducto(), producto.getPrecio(), producto.getDescripcion(),
					producto.getStock() };
			model.addRow(row);
		}
	}

	private void eliminarProducto() {
		if (!arregloProductos.estaVacio()) {
			int selectedRow = table.getSelectedRow();

			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "Seleccione un producto.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				// Obtener el código del producto seleccionado
				int codigoProducto = (int) model.getValueAt(selectedRow, 0);

				// Mostrar un cuadro de diálogo de confirmación
				int confirmacion = JOptionPane.showConfirmDialog(this,
						"¿Está seguro que desea eliminar este producto?\n\nCódigo: " + codigoProducto,
						"Confirmar eliminación", JOptionPane.YES_NO_OPTION);

				// Si el usuario confirma la eliminación
				if (confirmacion == JOptionPane.YES_OPTION) {
					// Eliminar y reasignar códigos correlativos
					arregloProductos.eliminarYReasignar(codigoProducto);

					// Actualizar la tabla
					actualizarTabla();
					// Obtener y establecer el próximo código correlativo
					int proximoCodigo = arregloProductos.codigoCorrelativo();
					txtCodigo.setText(String.valueOf(proximoCodigo));
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "No existen productos registrados :(", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	// Método para actualizar la tabla con los productos actuales
	private void actualizarTabla() {
		// Limpiar el modelo actual
		model.setRowCount(0);

		// Agregar los productos al modelo de la tabla
		for (int i = 0; i < arregloProductos.tamanio(); i++) {
			Producto producto = arregloProductos.obtener(i);
			Object[] row = { producto.getCodigoProducto(), producto.getPrecio(), producto.getDescripcion(),
					producto.getStock() };
			model.addRow(row);
		}
	}

	private void modificarProducto() {
		if (!arregloProductos.estaVacio()) {
			int selectedRow = table.getSelectedRow();

			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "Seleccione un producto.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				// Obtener el producto seleccionado
				Producto productoSeleccionado = arregloProductos.obtener(selectedRow);

				// Crear una ventana de diálogo para modificar datos
				JTextField txtPrecio = new JTextField(String.valueOf(productoSeleccionado.getPrecio()));
				JTextField txtDescripcion = new JTextField(productoSeleccionado.getDescripcion());
				JTextField txtStock = new JTextField(String.valueOf(productoSeleccionado.getStock()));

				Object[] message = { "Código: " + productoSeleccionado.getCodigoProducto(), "Precio:", txtPrecio,
						"Descripción:", txtDescripcion, "Stock:", txtStock };

				int option = JOptionPane.showConfirmDialog(this, message, "Modificar Producto",
						JOptionPane.OK_CANCEL_OPTION);

				if (option == JOptionPane.OK_OPTION) {
					try {
						// Obtener datos modificados
						double nuevoPrecio = Double.parseDouble(txtPrecio.getText().trim());
						String nuevaDescripcion = txtDescripcion.getText().trim();
						int nuevoStock = Integer.parseInt(txtStock.getText().trim());

						// Modificar el producto
						productoSeleccionado.setPrecio(nuevoPrecio);
						productoSeleccionado.setDescripcion(nuevaDescripcion);
						productoSeleccionado.setStock(nuevoStock);

						// Grabar los cambios en el archivo
						arregloProductos.grabarProductos();
						// Actualizar la tabla
						actualizarTabla();
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "No existen productos registrados :(", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void dialogs(JDialog x) {
		if (!arregloProductos.estaVacio()) {
			actualizarcomboBox();
			x.setLocationRelativeTo(null);
			x.setVisible(true);
			x.requestFocus();
		} else {
			JOptionPane.showMessageDialog(this, "No existen productos registrados :(", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	// Método para actualizar el área de texto con los datos del producto
	// seleccionado
	private void actualizarDatosEnTextArea() {
		if (!arregloProductos.estaVacio()) {
			// Obtener el código seleccionado del JComboBox
			String codigoSeleccionado = (String) consulta.getComboBox().getSelectedItem();
			if (codigoSeleccionado != null) {
				// Obtener el producto correspondiente al código seleccionado
				Producto producto = arregloProductos.buscarProductoPorCodigo(Integer.parseInt(codigoSeleccionado));

				// Mostrar los datos en el área de texto
				if (producto != null) {
					consulta.getTextArea()
							.setText("Código: " + producto.getCodigoProducto() + "\nPrecio: " + producto.getPrecio()
									+ "\nDescripción: " + producto.getDescripcion() + "\nStock: "
									+ producto.getStock());
				} else {
					// Limpiar el área de texto si no se encuentra el producto
					consulta.getTextArea().setText("");
				}
			}
		}
	}

	private void actualizarcomboBox() {
		consulta.getComboBox().removeAllItems();
		codigosProductos = arregloProductos.getCodigos();
		consulta.setCodigosEnComboBox(codigosProductos);
		
	}
}
