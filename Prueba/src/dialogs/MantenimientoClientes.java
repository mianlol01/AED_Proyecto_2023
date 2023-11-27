package dialogs;

import arreglos.ArregloClientes;
import clases.Cliente;

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

public class MantenimientoClientes extends DialogModelo {
	private static final long serialVersionUID = 1L;

	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JLabel lblIngreso;
	private JLabel lblConsulta;
	private JLabel lblModificacion;
	private JLabel lblEliminar;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private DefaultTableModel model;
	private String[] codigosClientes;

	public MantenimientoClientes() {
		getLblTitle().setBounds(36, 0, 155, 36);
		getLblTitle().setText("Mantenimiento clientes");
		getPanelContenido().setLocation(0, 36);
		getPanelContenido().setSize(760, 444);

		lblCodigo = new JLabel("Código:");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigo.setForeground(new Color(229, 9, 127));
		lblCodigo.setBounds(10, 10, 90, 20);
		getPanelContenido().add(lblCodigo);

		lblNombre = new JLabel("Nombres:");
		lblNombre.setForeground(new Color(229, 9, 127));
		lblNombre.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblNombre.setBounds(270, 10, 120, 20);
		getPanelContenido().add(lblNombre);

		lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(new Color(229, 9, 127));
		lblApellido.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblApellido.setBounds(10, 40, 108, 20);
		getPanelContenido().add(lblApellido);

		lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setForeground(new Color(229, 9, 127));
		lblTelefono.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblTelefono.setBounds(270, 40, 108, 20);
		getPanelContenido().add(lblTelefono);

		lblDni = new JLabel("DNI:");
		lblDni.setForeground(new Color(229, 9, 127));
		lblDni.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblDni.setBounds(10, 70, 108, 20);
		getPanelContenido().add(lblDni);

		txtCodigo = new JTextField();
		txtCodigo.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtCodigo.setBounds(150, 10, 100, 20);
		getPanelContenido().add(txtCodigo);
		txtCodigo.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtNombre.setBounds(400, 10, 100, 20);
		getPanelContenido().add(txtNombre);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtApellido.setBounds(150, 40, 100, 20);
		getPanelContenido().add(txtApellido);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtTelefono.setBounds(400, 40, 100, 20);
		getPanelContenido().add(txtTelefono);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtDNI.setBounds(150, 70, 100, 20);
		getPanelContenido().add(txtDNI);

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
		model.addColumn("Nombre");
		model.addColumn("Apellido");
		model.addColumn("Teléfono");
		model.addColumn("DNI");

		table = new JTable(model);
		table.setBorder(null);
		scrollPane.setViewportView(table);
		getPbX().setLocation(724, 0);
		getPaneHeader().setBounds(0, 0, 760, 36);
		setBounds(0, 0, 760, 480);
		getLblX().addMouseListener(this);

		txtCodigo.setText("" + arregloClientes.codigoCorrelativo());
		consulta.getComboBox().addActionListener(this);
		actualizarTablaClientes();
		actualizarComboBoxClientes();
	}

	ArregloClientes arregloClientes = new ArregloClientes();
	Consulta consulta = new Consulta();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == consulta.getComboBox()) {
			actualizarDatosEnTextAreaClientes();
		}
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == getLblX() && getLblX().contains(e.getPoint())) {
			HoverMenu(getLblX(), magenta, oscuro);
			Salir();
		}
		if (e.getSource() == lblIngreso && lblIngreso.contains(e.getPoint())) {
			agregarCliente();
		}
		if (e.getSource() == lblModificacion && lblModificacion.contains(e.getPoint())) {
			modificarCliente();
		}
		if (e.getSource() == lblConsulta && lblConsulta.contains(e.getPoint())) {
			dialogsClientes(consulta);
		}
		if (e.getSource() == lblEliminar && lblEliminar.contains(e.getPoint())) {
			eliminarCliente();
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

	private void actualizarTablaClientes() {
		// Limpiar el modelo actual
		model.setRowCount(0);

		// Agregar los clientes al modelo de la tabla
		for (int i = 0; i < arregloClientes.tamanio(); i++) {
			Cliente cliente = arregloClientes.obtener(i);
			Object[] row = { cliente.getCodigoCliente(), cliente.getNombre(), cliente.getApellido(), cliente.getDni(),
					cliente.getTelefono() };
			model.addRow(row);
		}
	}

	private void actualizarComboBoxClientes() {
		consulta.getComboBox().removeAllItems();
		codigosClientes = arregloClientes.getCodigos();
		consulta.setCodigosEnComboBox(codigosClientes);
	}

	private void actualizarDatosEnTextAreaClientes() {
		if (!arregloClientes.estaVacio()) {
			// Obtener el código seleccionado del JComboBox
			String codigoSeleccionado = (String) consulta.getComboBox().getSelectedItem();
			if (codigoSeleccionado != null) {
				// Obtener el cliente correspondiente al código seleccionado
				Cliente cliente = arregloClientes.buscarClientePorCodigo(Integer.parseInt(codigoSeleccionado));

				// Mostrar los datos en el área de texto
				if (cliente != null) {
					consulta.getTextArea()
							.setText("Código: " + cliente.getCodigoCliente() + "\nNombre: " + cliente.getNombre()
									+ "\nApellido: " + cliente.getApellido() + "\nDNI: " + cliente.getDni()
									+ "\nTeléfono: " + cliente.getTelefono());
				} else {
					// Limpiar el área de texto si no se encuentra el cliente
					consulta.getTextArea().setText("");
				}
			}
		}
	}

	private void agregarCliente() {
		// Obtener datos de las áreas de texto
		String codigoTexto = txtCodigo.getText().trim();
		String nombre = txtNombre.getText().trim();
		String apellido = txtApellido.getText().trim();
		String dni = txtDNI.getText().trim();
		String telefono = txtTelefono.getText().trim();

		// Verificar que el código no esté vacío y sea un entero positivo
		int codigo = Integer.parseInt(codigoTexto);

		// Verificar que los campos obligatorios no estén vacíos
		if (!nombre.isEmpty() && !apellido.isEmpty() && !dni.isEmpty() && !telefono.isEmpty()) {
			// Crear objeto Cliente con el próximo código correlativo
			Cliente nuevoCliente = new Cliente(nombre, apellido, dni, telefono, codigo);
			// Agregar el cliente al arreglo y guardar en el archivo
			arregloClientes.adicionar(nuevoCliente);
			arregloClientes.grabarClientes();
			// Puedes realizar otras operaciones necesarias, como actualizar una tabla
			actualizarTablaClientes();
			// Limpiar las áreas de texto después de agregar
			limpiarAreasTexto();
			txtCodigo.setText("" + arregloClientes.codigoCorrelativo());
			// Puedes mostrar un mensaje indicando que se agregó el cliente con éxito
			JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.");
		} else {
			JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos obligatorios.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void limpiarAreasTexto() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtDNI.setText("");
		txtTelefono.setText("");
	}

	private void modificarCliente() {
		if (!arregloClientes.estaVacio()) {
			int selectedRow = table.getSelectedRow();

			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "Seleccione un cliente.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				// Obtener el cliente seleccionado
				Cliente clienteSeleccionado = arregloClientes.obtener(selectedRow);

				// Crear una ventana de diálogo para modificar datos
				JTextField txtNombre = new JTextField(clienteSeleccionado.getNombre());
				JTextField txtApellido = new JTextField(clienteSeleccionado.getApellido());
				JTextField txtDNI = new JTextField(clienteSeleccionado.getDni());
				JTextField txtTelefono = new JTextField(clienteSeleccionado.getTelefono());

				Object[] message = { "Código: " + clienteSeleccionado.getCodigoCliente(), "Nombre:", txtNombre,
						"Apellido:", txtApellido, "DNI:", txtDNI, "Teléfono:", txtTelefono };

				int option = JOptionPane.showConfirmDialog(this, message, "Modificar Cliente",
						JOptionPane.OK_CANCEL_OPTION);

				if (option == JOptionPane.OK_OPTION) {
					try {
						// Obtener datos modificados
						String nuevoNombre = txtNombre.getText().trim();
						String nuevoApellido = txtApellido.getText().trim();
						String nuevoDNI = txtDNI.getText().trim();
						String nuevoTelefono = txtTelefono.getText().trim();

						// Modificar el cliente
						clienteSeleccionado.setNombre(nuevoNombre);
						clienteSeleccionado.setApellido(nuevoApellido);
						clienteSeleccionado.setDni(nuevoDNI);
						clienteSeleccionado.setTelefono(nuevoTelefono);

						// Grabar los cambios en el archivo
						arregloClientes.grabarClientes();
						// Actualizar la tabla
						actualizarTablaClientes();
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(this, "Por favor, ingresa datos válidos.", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "No existen clientes registrados :(", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void dialogsClientes(JDialog x) {
		if (!arregloClientes.estaVacio()) {
			actualizarComboBoxClientes();
			x.setLocationRelativeTo(null);
			x.setVisible(true);
			x.requestFocus();
		} else {
			JOptionPane.showMessageDialog(this, "No existen clientes registrados :(", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void eliminarCliente() {
		if (!arregloClientes.estaVacio()) {
			int selectedRow = table.getSelectedRow();

			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "Seleccione un cliente.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				// Obtener el código del cliente seleccionado
				int codigoCliente = (int) model.getValueAt(selectedRow, 0);

				// Mostrar un cuadro de diálogo de confirmación
				int confirmacion = JOptionPane.showConfirmDialog(this,
						"¿Está seguro que desea eliminar este cliente?\n\nCódigo: " + codigoCliente,
						"Confirmar eliminación", JOptionPane.YES_NO_OPTION);

				// Si el usuario confirma la eliminación
				if (confirmacion == JOptionPane.YES_OPTION) {
					// Eliminar y reasignar códigos correlativos
					arregloClientes.eliminarYReasignar(codigoCliente);

					// Actualizar la tabla
					actualizarTablaClientes();
					// Obtener y establecer el próximo código correlativo
					int proximoCodigo = arregloClientes.codigoCorrelativo();
					txtCodigo.setText(String.valueOf(proximoCodigo));
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "No existen clientes registrados :(", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
