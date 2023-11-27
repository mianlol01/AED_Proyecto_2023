package dialogs;

import clases.*;
import arreglos.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class Vender extends DialogModelo {
	private static final long serialVersionUID = 1L;
	private JTextField txtUnidades;
	private JLabel lblCodigoCliente;
	private JLabel lblCodigoVendedor;
	private JLabel lblCodigoProducto;
	private JLabel lblUnidades;
	private JPanel panelSell;
	private JLabel lblVender;
	private JPanel panelIconSell;
	private JLabel IconSell;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private ImageIcon vender;
	private ImageIcon venderDark;
	private JComboBox<String> cboVendedor;
	private JComboBox<String> cboCliente;
	private JComboBox<String> cboProducto;
	private DefaultComboBoxModel<String> modelProductos;
	private DefaultComboBoxModel<String> modelVendedores;
	private DefaultComboBoxModel<String> modelClientes;

	public Vender() {
		getLblX().setOpaque(false);
		vender = rezisedImage(new ImageIcon("Iconos/vender.png"));
		venderDark = rezisedImage(new ImageIcon("Iconos/venderDark.png"));

		getPanelContenido().setBounds(0, 36, 480, 564);
		getPanelContenido().setLayout(null);

		lblCodigoCliente = new JLabel("Código Cliente:");
		lblCodigoCliente.setForeground(new Color(229, 9, 127));
		lblCodigoCliente.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigoCliente.setBounds(10, 37, 180, 20);
		getPanelContenido().add(lblCodigoCliente);

		lblCodigoVendedor = new JLabel("Código Vendedor:");
		lblCodigoVendedor.setForeground(new Color(229, 9, 127));
		lblCodigoVendedor.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigoVendedor.setBounds(10, 101, 194, 20);
		getPanelContenido().add(lblCodigoVendedor);

		lblCodigoProducto = new JLabel("Código Producto:");
		lblCodigoProducto.setForeground(new Color(229, 9, 127));
		lblCodigoProducto.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigoProducto.setBounds(10, 165, 194, 20);
		getPanelContenido().add(lblCodigoProducto);

		lblUnidades = new JLabel("Unidades:");
		lblUnidades.setForeground(new Color(229, 9, 127));
		lblUnidades.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblUnidades.setBounds(10, 229, 194, 20);
		getPanelContenido().add(lblUnidades);

		txtUnidades = new JTextField();
		txtUnidades.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		txtUnidades.setForeground(new Color(0, 0, 0));
		txtUnidades.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtUnidades.setColumns(10);
		txtUnidades.setBounds(200, 228, 90, 24);
		getPanelContenido().add(txtUnidades);

		panelSell = new JPanel();
		panelSell.setBackground(new Color(55, 55, 57));
		panelSell.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		panelSell.setBounds(170, 280, 130, 50);
		getPanelContenido().add(panelSell);
		panelSell.setLayout(null);
		panelSell.addMouseListener(this);

		lblVender = new JLabel("Vender");
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setForeground(new Color(229, 9, 127));
		lblVender.setFont(new Font("Arial", Font.BOLD, 15));
		lblVender.setBounds(0, 32, 130, 18);
		panelSell.add(lblVender);

		panelIconSell = new JPanel();
		panelIconSell.setOpaque(false);
		panelIconSell.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconSell.setBounds(0, 0, 130, 32);
		panelSell.add(panelIconSell);
		panelIconSell.setLayout(null);

		IconSell = new JLabel(vender);
		IconSell.setBounds(0, 0, 130, 32);
		panelIconSell.add(IconSell);

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 336, 460, 217);
		getPanelContenido().add(scrollPane);

		textArea = new JTextArea();
		textArea.setBorder(null);
		scrollPane.setViewportView(textArea);

		cboVendedor = new JComboBox<String>();
		cboVendedor.setForeground(new Color(0, 0, 0));
		cboVendedor.setFont(new Font("Monospaced", Font.PLAIN, 20));
		cboVendedor.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		cboVendedor.setBounds(200, 103, 90, 25);
		getPanelContenido().add(cboVendedor);

		cboCliente = new JComboBox<String>();
		cboCliente.setForeground(new Color(0, 0, 0));
		cboCliente.setFont(new Font("Monospaced", Font.PLAIN, 20));
		cboCliente.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		cboCliente.setBounds(200, 39, 90, 25);
		getPanelContenido().add(cboCliente);

		cboProducto = new JComboBox<String>();
		cboProducto.setForeground(new Color(0, 0, 0));
		cboProducto.setFont(new Font("Monospaced", Font.PLAIN, 20));
		cboProducto.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		cboProducto.setBounds(200, 167, 90, 25);
		getPanelContenido().add(cboProducto);
		getPbX().setLocation(444, 0);
		setBounds(100, 100, 480, 600);
		getLblTitle().setText("Vender");
		getPaneHeader().setBounds(0, 0, 480, 36);
		getContentPanel().setLayout(null);
		getPbX().addMouseListener(this);

		cboProducto.addActionListener(this);

		modelProductos = new DefaultComboBoxModel<>(codigosProductos);
		modelVendedores = new DefaultComboBoxModel<>(codigosVendedores);
		modelClientes = new DefaultComboBoxModel<>(codigosClientes);

		cboProducto.setModel(modelProductos);
		cboVendedor.setModel(modelVendedores);
		cboCliente.setModel(modelClientes);

		txtCliente = new JTextField();
		txtCliente.setForeground(new Color(0, 0, 0));
		txtCliente.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtCliente.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		txtCliente.setBounds(300, 38, 170, 25);
		getPanelContenido().add(txtCliente);
		txtCliente.setColumns(10);

		txtVendedor = new JTextField();
		txtVendedor.setForeground(new Color(0, 0, 0));
		txtVendedor.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtVendedor.setColumns(10);
		txtVendedor.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		txtVendedor.setBounds(300, 104, 170, 25);
		getPanelContenido().add(txtVendedor);

		txtProducto = new JTextField();
		txtProducto.setForeground(new Color(0, 0, 0));
		txtProducto.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtProducto.setColumns(10);
		txtProducto.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		txtProducto.setBounds(300, 168, 170, 25);
		getPanelContenido().add(txtProducto);

		codigosProductos = arregloProductos.getCodigos();
		codigosVendedores = arregloVendedores.getCodigos();
		codigosClientes = arregloClientes.getCodigos();

		txtUnidades.setText("" + 1);

		txtStock = new JTextField();
		txtStock.setText("");
		txtStock.setForeground(new Color(0, 0, 0));
		txtStock.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtStock.setColumns(10);
		txtStock.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 128)));
		txtStock.setBounds(300, 229, 170, 25);
		getPanelContenido().add(txtStock);
		mostrarDescripcion();
	}

	ArregloFacturas arregloFacturas = new ArregloFacturas();
	ArregloProductos arregloProductos = new ArregloProductos();
	ArregloVendedores arregloVendedores = new ArregloVendedores();
	ArregloClientes arregloClientes = new ArregloClientes();

	String[] codigosProductos = arregloProductos.getCodigos();
	String[] codigosVendedores = arregloVendedores.getCodigos();
	String[] codigosClientes = arregloClientes.getCodigos();
	private JTextField txtCliente;
	private JTextField txtVendedor;
	private JTextField txtProducto;
	private JTextField txtStock;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboProducto) {
			mostrarDescripcion();
		}
	}

	public void mostrarDescripcion() {
		txtVendedor.setText("");
		txtCliente.setText("");
		txtProducto.setText("");
		String codigoProductoSeleccionado = (String) cboProducto.getSelectedItem();
		String codigoClienteSeleccionado = (String) cboCliente.getSelectedItem();
		String codigoVendedorSeleccionado = (String) cboVendedor.getSelectedItem();
		Vendedor v = arregloVendedores.buscar(Integer.parseInt(codigoVendedorSeleccionado));
		Cliente c = arregloClientes.buscar(Integer.parseInt(codigoClienteSeleccionado));
		Producto p = arregloProductos.buscar(Integer.parseInt(codigoProductoSeleccionado));
		txtProducto.setText(p.getDescripcion());
		txtCliente.setText(c.getNombre() + " " + c.getApellido());
		txtVendedor.setText(v.getNombre() + " " + v.getApellido());
		txtStock.setText("Stock : " + p.getStock());
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == getPbX() && getPbX().contains(e.getPoint())) {
			Hover(getPbX(), getLblX(), magenta, oscuro);
			Salir();
		}
		if (e.getSource() == panelSell && panelSell.contains(e.getPoint())) {
			vender();
		}
	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == getPbX()) {
			Hover(getPbX(), getLblX(), oscuro, magenta);
		}
		if (e.getSource() == panelSell) {
			hover(panelSell, lblVender, dark, magenta);
			hover(venderDark);

		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == getPbX()) {
			Hover(getPbX(), getLblX(), magenta, oscuro);
		}
		if (e.getSource() == panelSell) {
			hover(panelSell, lblVender, magenta, dark);
			hover(vender);

		}

	}

	// Hover
	public void hover(JPanel panel, JLabel lbl, Color o, Color m) {
		panel.setBackground(m);
		lbl.setForeground(o);
	}

	public void hover(ImageIcon ic) {
		panelIconSell.removeAll();
		IconSell = new JLabel(ic);
		IconSell.setBounds(0, 0, 130, 32);
		panelIconSell.add(IconSell);
		repaint();
		revalidate();
	}

	public ImageIcon rezisedImage(ImageIcon img) {
		Image icon;
		ImageIcon resizedIcon;
		icon = img.getImage().getScaledInstance(120, 28, Image.SCALE_DEFAULT);
		resizedIcon = new ImageIcon(icon);

		return resizedIcon;
	}

	private void vender() {
		// Verificar si existen clientes
		if (arregloClientes.estaVacio()) {
			JOptionPane.showMessageDialog(this, "No existen clientes registrados. Cree un nuevo cliente.", "Error",
					JOptionPane.ERROR_MESSAGE);
			// Crear un nuevo cliente
			crearNuevoCliente();
			return;
		}
		try {
			String codigoProductoSeleccionado = (String) cboProducto.getSelectedItem();
			String codigoClienteSeleccionado = (String) cboCliente.getSelectedItem();
			String codigoVendedorSeleccionado = (String) cboVendedor.getSelectedItem();

			int codigoProducto = Integer.parseInt(codigoProductoSeleccionado);
			int codigoCliente = Integer.parseInt(codigoClienteSeleccionado);
			int codigoVendedor = Integer.parseInt(codigoVendedorSeleccionado);

			Producto productoSeleccionado = arregloProductos.buscarProductoPorCodigo(codigoProducto);
			Cliente clienteSeleccionado = arregloClientes.buscarClientePorCodigo(codigoCliente);
			Vendedor vendedorSeleccionado = arregloVendedores.buscarVendedorPorCodigo(codigoVendedor);

			if (productoSeleccionado == null) {
				JOptionPane.showMessageDialog(this, "Seleccione un producto válido.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}

			int unidades = Integer.parseInt(txtUnidades.getText().trim());

			if (unidades <= 0) {
				JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if(unidades > productoSeleccionado.getStock()) {
				JOptionPane.showMessageDialog(this, "No existe stock suficiente.", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			double precioUnitario = productoSeleccionado.getPrecio();
			double precioTotal = unidades * precioUnitario;

			// Obtener el código de factura adecuado
			int codigoFactura = arregloFacturas.codigoCorrelativo();

			Factura nuevaFactura = new Factura(codigoFactura, codigoProducto, codigoVendedor, unidades, precioTotal);
			// Mostrar detalles de la factura en un cuadro de diálogo
			mostrarDetallesFactura(nuevaFactura, productoSeleccionado, clienteSeleccionado, vendedorSeleccionado,
					precioTotal);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void crearNuevoCliente() {
		JPanel panel = new JPanel(new GridLayout(4, 2));
		JTextField txtNombre = new JTextField();
		JTextField txtApellido = new JTextField();
		JTextField txtDni = new JTextField();
		JTextField txtTelefono = new JTextField();

		panel.add(new JLabel("Nombre:"));
		panel.add(txtNombre);
		panel.add(new JLabel("Apellido:"));
		panel.add(txtApellido);
		panel.add(new JLabel("DNI:"));
		panel.add(txtDni);
		panel.add(new JLabel("Teléfono:"));
		panel.add(txtTelefono);

		int result = JOptionPane.showConfirmDialog(null, panel, "Ingrese los datos del nuevo cliente",
				JOptionPane.OK_CANCEL_OPTION);

		if (result == JOptionPane.OK_OPTION) {
			// Obtener datos ingresados
			String nuevoNombre = txtNombre.getText().trim();
			String nuevoApellido = txtApellido.getText().trim();
			String nuevoDni = txtDni.getText().trim();
			String nuevoTelefono = txtTelefono.getText().trim();

			// Agregar el nuevo cliente
			arregloClientes.adicionarNuevoCliente(nuevoNombre, nuevoApellido, nuevoDni, nuevoTelefono);

			// Después de crear un nuevo cliente, actualizar el combo box de clientes
			actualizarComboBoxClientes();
			arregloClientes.grabarClientes();
		}
	}

	private void actualizarDatosDespuesDeVenta(int unidades, int codigoVendedor, int codigoProducto) {

		String cProductoSelected = (String) cboProducto.getSelectedItem();
		String cVendedorSelected = (String) cboVendedor.getSelectedItem();

		int cProducto = Integer.parseInt(cProductoSelected);
		int cVendedor = Integer.parseInt(cVendedorSelected);

		Producto productoSeleccionado = arregloProductos.buscarProductoPorCodigo(cProducto);
		Vendedor vendedorSeleccionado = arregloVendedores.buscarVendedorPorCodigo(cVendedor);

		vendedorSeleccionado.setVentas(vendedorSeleccionado.getVentas() + 1);
		productoSeleccionado.setStock(productoSeleccionado.getStock() - unidades);
		productoSeleccionado.setCantidadesVendidas(productoSeleccionado.getCantidadesVendidas() + unidades);

		arregloVendedores.grabarVendedores();
		arregloProductos.grabarProductos();
		mostrarDescripcion();
	}

	private void mostrarDetallesFactura(Factura factura, Producto producto, Cliente cliente, Vendedor vendedor,
			double totalPagar) {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("Código de Factura: ").append(factura.getCodigoFactura()).append("\n");
		mensaje.append("Producto: ").append(producto.getDescripcion()).append("\n");
		mensaje.append("Precio: ").append(factura.getCodigoFactura()).append("\n");
		mensaje.append("Total a pagar: ").append(totalPagar).append("\n");
		mensaje.append("Cliente: ").append(cliente.getNombre() + " ").append(cliente.getApellido()).append("\n");
		mensaje.append("Vendedor: ").append(vendedor.getNombre() + " ").append(vendedor.getApellido()).append("\n");
		// Mostrar cuadro de diálogo con detalles de la factura
		int opcion = JOptionPane.showConfirmDialog(this, mensaje.toString(), "Detalles de la Factura",
				JOptionPane.OK_CANCEL_OPTION);

		// Si el usuario acepta, puedes realizar acciones adicionales
		if (opcion == JOptionPane.OK_OPTION) {
			// Actualizar interfaz gráfica después de la venta
			actualizarInterfazDespuesDeVenta(factura, producto, cliente, vendedor, totalPagar);
			arregloFacturas.adicionar(factura);
			arregloFacturas.grabarFacturas();
			actualizarDatosDespuesDeVenta(factura.getUnidades(), vendedor.getCodigoVendedor(),
					cliente.getCodigoCliente());

		} else {
			JOptionPane.showMessageDialog(this, "Venta cancelada.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void actualizarInterfazDespuesDeVenta(Factura factura, Producto producto, Cliente cliente,
			Vendedor vendedor, double totalPagar) {

		String boleta = ("Factura No: " + factura.getCodigoFactura() + "\n" + "\n" + "Producto: "
				+ producto.getDescripcion() + "\n" + "Precio: " + factura.getPrecio() + "\n" + "Total a pagar: "
				+ totalPagar + "\n" + "Cliente: " + cliente.getNombre() + " " + cliente.getApellido() + "\n"
				+ "Vendedor: " + vendedor.getNombre() + " " + vendedor.getApellido() + "\n");
		textArea.setText(boleta);

		guardarEnArchivo(boleta, "boletas.txt");
	}

	public void actualizarComboBoxClientes() {
		// Limpiar el modelo actual del ComboBox de clientes
		cboCliente.removeAllItems();

		// Obtener los códigos de los clientes del arreglo de clientes
		String[] codigosClientes = arregloClientes.getCodigos();

		// Agregar los códigos al ComboBox de clientes
		for (String codigoCliente : codigosClientes) {
			cboCliente.addItem(codigoCliente);
		}
	}

	private static void guardarEnArchivo(String contenido, String rutaArchivo) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
			// El segundo parámetro 'true' indica que se agregará al final del archivo
			// existente
			writer.write(contenido);
			writer.newLine(); // Agrega una nueva línea para separar las boletas
			System.out.println("Contenido agregado al archivo correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
