package dialogs;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class MantenimientoProductos extends DialogModelo{
	private static final long serialVersionUID = 1L;
	
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JTextField txtPrecio;
	private JTextField txtDescripcion;
	private JLabel lblIngreso;
	private JLabel lblConsulta;
	private JLabel lblModificacion;
	private JLabel lblEliminar;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblPrecio;
	private JLabel lblDescripcion;

	public MantenimientoProductos() {
		getLblTitle().setBounds(36, 0, 155, 36);
		getLblTitle().setText("Mantenimiento clientes");
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

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPrecio.setBounds(400, 10, 100, 20);
		getPanelContenido().add(txtPrecio);

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
