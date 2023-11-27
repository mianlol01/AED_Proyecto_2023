package dialogs;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Mantenimiento extends JDialog implements ActionListener, MouseListener, MouseMotionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private JPanel paneHeader;
	private JPanel pbX;
	private JLabel lblX;
	
	public Color magenta = new Color(229, 9, 127);
	public Color oscuro = new Color(25, 25, 26);
	public Color dark = new Color(55, 55, 57);
	private static int xMosue;
	private static int yMosue;
	private JLabel lblTitle;
	private JLabel lblIcon;
	private JPanel panelContenido;
	
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
	
	public static void main(String[] args) {
		
		
		try {
			Mantenimiento dialog = new Mantenimiento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
			dialog.pack();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Mantenimiento() {
		setUndecorated(true);
		setModal(true);
		setBounds(100, 100, 760, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(55, 55, 57));
		contentPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(62, 62, 64)));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		paneHeader = new JPanel();
		paneHeader.setBackground(new Color(25, 25, 26));
		paneHeader.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(62, 62, 64)));
		paneHeader.setBounds(0, 0, 760, 36);
		contentPanel.add(paneHeader);
		paneHeader.setLayout(null);
		paneHeader.addMouseListener(this);
		paneHeader.addMouseMotionListener(this);
		
		pbX = new JPanel();
		pbX.setLayout(null);
		pbX.setForeground(new Color(25, 25, 26));
		pbX.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(62, 62, 64)));
		pbX.setBackground(new Color(25, 25, 26));
		pbX.setBounds(724, 0, 36, 36);
		paneHeader.add(pbX);
		
		lblX = new JLabel("x");
		lblX.setBounds(0, 0, 36, 36);
		pbX.add(lblX);
		lblX.setVerticalAlignment(SwingConstants.TOP);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(new Color(229, 9, 127));
		lblX.setFont(new Font("Candara Light", Font.PLAIN, 40));
		
		lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblTitle.setForeground(new Color(229, 9, 127));
		lblTitle.setBounds(36, 0, 216, 36);
		paneHeader.add(lblTitle);
		
		lblIcon = new JLabel("");
		lblIcon.setBounds(0, 0, 36, 36);
		paneHeader.add(lblIcon);
		
		panelContenido = new JPanel();
		panelContenido.setOpaque(false);
		panelContenido.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelContenido.setBounds(0, 36, 760, 444);
		contentPanel.add(panelContenido);
		panelContenido.setLayout(null);
		pbX.addMouseListener(this);
		
		//
		
		lblCodigo = new JLabel("Código:");
		lblCodigo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigo.setForeground(new Color(229, 9, 127));
		lblCodigo.setBounds(10, 9, 90, 23);
		getPanelContenido().add(lblCodigo);
		
		lblCategoria = new JLabel("Categoría:");
		lblCategoria.setForeground(new Color(229, 9, 127));
		lblCategoria.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCategoria.setBounds(270, 69, 120, 23);
		getPanelContenido().add(lblCategoria);
		
		lblNombre = new JLabel("Nombres:");
		lblNombre.setForeground(new Color(229, 9, 127));
		lblNombre.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblNombre.setBounds(270, 9, 120, 23);
		getPanelContenido().add(lblNombre);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setForeground(new Color(229, 9, 127));
		lblApellido.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblApellido.setBounds(270, 39, 108, 23);
		getPanelContenido().add(lblApellido);
		
		lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setForeground(new Color(229, 9, 127));
		lblTelefono.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblTelefono.setBounds(10, 69, 108, 23);
		getPanelContenido().add(lblTelefono);
		
		lblDni = new JLabel("DNI:");
		lblDni.setForeground(new Color(229, 9, 127));
		lblDni.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblDni.setBounds(10, 39, 108, 23);
		getPanelContenido().add(lblDni);
		
		txtCodigo = new JTextField();
		txtCodigo.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtCodigo.setBounds(150, 10, 100, 20);
		getPanelContenido().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtCategoria.setBounds(400, 70, 100, 20);
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
		txtDNI.setBounds(150, 40, 100, 20);
		getPanelContenido().add(txtDNI);
		
		lblIngreso = new JLabel("Ingreso");
		lblIngreso.setOpaque(true);
		lblIngreso.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblIngreso.setBackground(new Color(55, 55, 57));
		lblIngreso.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIngreso.setForeground(new Color(229, 9, 127));
		lblIngreso.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreso.setBounds(530, 10, 102, 35);
		getPanelContenido().add(lblIngreso);
		lblIngreso.addMouseListener(this);
		
		lblConsulta = new JLabel("Consulta");
		lblConsulta.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblConsulta.setBackground(new Color(55, 55, 57));
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblConsulta.setForeground(new Color(229, 9, 127));
		lblConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsulta.setOpaque(true);
		lblConsulta.setBounds(648, 10, 102, 35);
		getPanelContenido().add(lblConsulta);
		lblConsulta.addMouseListener(this);
		
		lblModificacion = new JLabel("Modificación");
		lblModificacion.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblModificacion.setBackground(new Color(55, 55, 57));
		lblModificacion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblModificacion.setForeground(new Color(229, 9, 127));
		lblModificacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificacion.setOpaque(true);
		lblModificacion.setBounds(530, 55, 102, 35);
		getPanelContenido().add(lblModificacion);
		lblModificacion.addMouseListener(this);
		
		lblEliminar = new JLabel("Eliminar");
		lblEliminar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		lblEliminar.setBackground(new Color(55, 55, 57));
		lblEliminar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEliminar.setForeground(new Color(229, 9, 127));
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setOpaque(true);
		lblEliminar.setBounds(648, 55, 102, 35);
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
		setBounds(0 ,0 ,760, 480);
	}

	public void mouseDragged(MouseEvent e) {
		if (e.getSource() == paneHeader) {
			moverVentana(e);
		}
	}
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == paneHeader) {
			campturarCoordenadas(e);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == pbX && pbX.contains(e.getPoint())) {
			Salir();
		}
		
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == pbX) {
			Hover(pbX, lblX, oscuro, magenta);
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
		if (e.getSource() == pbX) {
			Hover(pbX, lblX, magenta, oscuro);
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

	public void mouseMoved(MouseEvent e) {
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	//
	private void Salir() {
		Hover(pbX, lblX, magenta, oscuro);
		this.dispose();
	}

	// Mover Ventana
	public void campturarCoordenadas(MouseEvent e) {
		xMosue = e.getX();
		yMosue = e.getY();
	}

	public void moverVentana(MouseEvent e) {
		int x = e.getXOnScreen();
		int y = e.getYOnScreen();
		this.setLocation(x - xMosue, y - yMosue);
	}

	// Hover
	private void Hover(JPanel panel, JLabel lbl, Color c1, Color c2) {
		panel.setBackground(c2);
		lbl.setForeground(c1);
	}
	private void HoverMenu(JLabel lbl, Color c1, Color c2) {
		lbl.setBackground(c2);
		lbl.setForeground(c1);
	}

	public JPanel getPaneHeader() {
		return paneHeader;
	}

	public void setPaneHeader(JPanel paneHeader) {
		this.paneHeader = paneHeader;
	}

	public JPanel getPbX() {
		return pbX;
	}

	public void setPbX(JPanel pbX) {
		this.pbX = pbX;
	}

	public JLabel getLblX() {
		return lblX;
	}

	public void setLblX(JLabel lblX) {
		this.lblX = lblX;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}

	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JLabel getLblIcon() {
		return lblIcon;
	}

	public void setLblIcon(JLabel lblIcon) {
		this.lblIcon = lblIcon;
	}

	public JPanel getPanelContenido() {
		return panelContenido;
	}

	public void setPanelContenido(JPanel panelContenido) {
		this.panelContenido = panelContenido;
	}

	public Color getMagenta() {
		return magenta;
	}

	public void setMagenta(Color magenta) {
		this.magenta = magenta;
	}

	public Color getOscuro() {
		return oscuro;
	}

	public void setOscuro(Color oscuro) {
		this.oscuro = oscuro;
	}

	public JLabel getLblCodigo() {
		return lblCodigo;
	}

	public void setLblCodigo(JLabel lblCodigo) {
		this.lblCodigo = lblCodigo;
	}

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public JTextField getTxtCategoria() {
		return txtCategoria;
	}

	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JTextField getTxtDNI() {
		return txtDNI;
	}

	public void setTxtDNI(JTextField txtDNI) {
		this.txtDNI = txtDNI;
	}

	public JLabel getLblIngreso() {
		return lblIngreso;
	}

	public void setLblIngreso(JLabel lblIngreso) {
		this.lblIngreso = lblIngreso;
	}

	public JLabel getLblConsulta() {
		return lblConsulta;
	}

	public void setLblConsulta(JLabel lblConsulta) {
		this.lblConsulta = lblConsulta;
	}

	public JLabel getLblModificacion() {
		return lblModificacion;
	}

	public void setLblModificacion(JLabel lblModificacion) {
		this.lblModificacion = lblModificacion;
	}

	public JLabel getLblEliminar() {
		return lblEliminar;
	}

	public void setLblEliminar(JLabel lblEliminar) {
		this.lblEliminar = lblEliminar;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JLabel getLblCategoria() {
		return lblCategoria;
	}

	public void setLblCategoria(JLabel lblCategoria) {
		this.lblCategoria = lblCategoria;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}

	public void setLblTelefono(JLabel lblTelefono) {
		this.lblTelefono = lblTelefono;
	}

	public JLabel getLblDni() {
		return lblDni;
	}

	public void setLblDni(JLabel lblDni) {
		this.lblDni = lblDni;
	}

	public Color getDark() {
		return dark;
	}

	public void setDark(Color dark) {
		this.dark = dark;
	}

}
