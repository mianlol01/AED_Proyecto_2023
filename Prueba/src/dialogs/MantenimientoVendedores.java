package dialogs;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MantenimientoVendedores extends DialogModelo {
	private static final long serialVersionUID = 1L;

	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JTextField txtCategoria;
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
	private JLabel lblCategoria;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblDni;

	public MantenimientoVendedores() {
		getLblTitle().setBounds(36, 0, 182, 36);
		getLblTitle().setText("Mantenimiento vendedores");
		getPanelContenido().setLocation(0, 36);
		getPanelContenido().setSize(760, 444);

		lblCodigo = new JLabel("Código:");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigo.setForeground(new Color(229, 9, 127));
		lblCodigo.setBounds(10, 10, 90, 20);
		getPanelContenido().add(lblCodigo);

		lblCategoria = new JLabel("Categoría:");
		lblCategoria.setForeground(new Color(229, 9, 127));
		lblCategoria.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCategoria.setBounds(10, 40, 120, 20);
		getPanelContenido().add(lblCategoria);

		lblNombre = new JLabel("Nombres:");
		lblNombre.setForeground(new Color(229, 9, 127));
		lblNombre.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblNombre.setBounds(270, 10, 120, 20);
		getPanelContenido().add(lblNombre);

		lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(new Color(229, 9, 127));
		lblApellido.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblApellido.setBounds(270, 40, 108, 20);
		getPanelContenido().add(lblApellido);

		lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setForeground(new Color(229, 9, 127));
		lblTelefono.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblTelefono.setBounds(10, 70, 108, 20);
		getPanelContenido().add(lblTelefono);

		lblDni = new JLabel("DNI:");
		lblDni.setForeground(new Color(229, 9, 127));
		lblDni.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblDni.setBounds(270, 70, 108, 20);
		getPanelContenido().add(lblDni);

		txtCodigo = new JTextField();
		txtCodigo.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtCodigo.setBounds(150, 10, 100, 20);
		getPanelContenido().add(txtCodigo);
		txtCodigo.setColumns(10);

		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtCategoria.setBounds(150, 40, 100, 20);
		getPanelContenido().add(txtCategoria);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtNombre.setBounds(400, 10, 100, 20);
		getPanelContenido().add(txtNombre);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtApellido.setBounds(400, 40, 100, 20);
		getPanelContenido().add(txtApellido);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtTelefono.setBounds(150, 70, 100, 20);
		getPanelContenido().add(txtTelefono);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtDNI.setBounds(400, 70, 100, 20);
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

		table = new JTable();
		table.setBorder(null);
		scrollPane.setViewportView(table);
		getPbX().setLocation(724, 0);
		getPaneHeader().setBounds(0, 0, 760, 36);
		setBounds(0, 0, 760, 480);
		getLblX().addMouseListener(this);
	}
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == getLblX() && getLblX().contains(e.getPoint())) {
			HoverMenu(getLblX(), magenta, oscuro);
			Salir();
		}
		if (e.getSource() == lblIngreso && lblIngreso.contains(e.getPoint())) {
			JOptionPane.showMessageDialog(null, "Has presionado el botón: Ingreso :)");	
		}
		if (e.getSource() == lblModificacion && lblModificacion.contains(e.getPoint())) {
			JOptionPane.showMessageDialog(null, "Has presionado el botón: Modificación :)");	
		}	
		if (e.getSource() == lblConsulta && lblConsulta.contains(e.getPoint())) {
			JOptionPane.showMessageDialog(null, "Has presionado el botón: Consulta :)");	
		}	
		if (e.getSource() == lblEliminar && lblEliminar.contains(e.getPoint())) {
			JOptionPane.showMessageDialog(null, "Has presionado el botón: Eliminar :)");	
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

}
