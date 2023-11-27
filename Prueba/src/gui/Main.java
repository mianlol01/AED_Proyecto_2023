package gui;

import paneles.*;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Main extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel paneHeader;
	private JPanel pbX;
	private JPanel pbMantenimiento;
	private JPanel pbVentas;
	private JPanel pbReportes;
	private JPanel pbAyuda;
	private JPanel pbSalir;
	private JPanel paneMain;
	private JPanel panelIcon;
	private JLabel lblTitle;
	private JLabel lblIcon;
	private JLabel iconMan;
	private JLabel lblX;
	private JLabel lblMantenimiento;
	private JLabel lblVentas;
	private JLabel lblReportes;
	private JLabel lblAyuda;
	private JLabel lblSalir;
	private JPanel panelIconVentas;
	private JLabel iconVentas;
	private JPanel panelIconReportes;
	private JLabel iconReportes;
	private JPanel panelIconAyuda;
	private JLabel iconAyuda;
	private JPanel panelIconSalir;
	private JLabel iconSalir;
	private JPanel panelIconMan;

	private ImageIcon icon;
	private Image iconImage;
	private ImageIcon resizedIcon;
	private Color magenta = new Color(229, 9, 127);
	private Color oscuro = new Color(25, 25, 26);
	private static int xMosue;
	private static int yMosue;
	private ImageIcon mantenimiento;
	private ImageIcon mantenimientoDark;
	private ImageIcon ventas;
	private ImageIcon ventasDark;
	private ImageIcon reportes;
	private ImageIcon reportesDark;
	private ImageIcon ayuda;
	private ImageIcon ayudaDark;
	private ImageIcon salir;
	private ImageIcon salirDark;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Main frame = new Main();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		mantenimiento = rezisedImage(new ImageIcon("Iconos/mant.png"));
		mantenimientoDark = rezisedImage(new ImageIcon("Iconos/mantDark.png"));
		ventas = rezisedImage(new ImageIcon("Iconos/ventas.png"));
		ventasDark = rezisedImage(new ImageIcon("Iconos/ventasDark.png"));
		reportes = rezisedImage(new ImageIcon("Iconos/reportes.png"));
		reportesDark = rezisedImage(new ImageIcon("Iconos/reportesDark.png"));
		ayuda = rezisedImage(new ImageIcon("Iconos/ayuda.png"));
		ayudaDark = rezisedImage(new ImageIcon("Iconos/ayudaDark.png"));
		salir = rezisedImage(new ImageIcon("Iconos/salir.png"));
		salirDark = rezisedImage(new ImageIcon("Iconos/salirDark.png"));

		icon = new ImageIcon("Iconos/titleIcon.png");

		iconImage = icon.getImage().getScaledInstance(34, 34, Image.SCALE_DEFAULT);
		resizedIcon = new ImageIcon(iconImage);

		setTitle("Ventas");
		setUndecorated(true);
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1282, 722);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(62, 62, 64));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		paneHeader = new JPanel();
		paneHeader.setBackground(new Color(25, 25, 26));
		paneHeader.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneHeader.setBounds(1, 1, 1280, 36);
		contentPane.add(paneHeader);
		paneHeader.setLayout(null);
		paneHeader.addMouseListener(this);
		paneHeader.addMouseMotionListener(this);

		pbX = new JPanel();
		pbX.setBackground(new Color(25, 25, 26));
		pbX.setForeground(new Color(25, 25, 26));
		pbX.setBorder(new EmptyBorder(0, 0, 0, 0));
		pbX.setBounds(1244, 0, 36, 36);
		paneHeader.add(pbX);
		pbX.setLayout(null);
		pbX.addMouseListener(this);

		lblX = new JLabel("x");
		lblX.setVerticalAlignment(SwingConstants.TOP);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(new Color(229, 9, 127));
		lblX.setFont(new Font("Candara Light", Font.PLAIN, 40));
		lblX.setBounds(0, 0, 36, 36);
		pbX.add(lblX);

		panelIcon = new JPanel();
		panelIcon.setOpaque(false);
		panelIcon.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIcon.setBounds(10, 0, 36, 36);
		paneHeader.add(panelIcon);
		panelIcon.setLayout(null);

		lblIcon = new JLabel(resizedIcon);
		lblIcon.setBounds(2, 2, 34, 34);
		panelIcon.add(lblIcon);

		lblTitle = new JLabel(getTitle());
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitle.setForeground(new Color(229, 9, 127));
		lblTitle.setBounds(58, 0, 120, 36);
		paneHeader.add(lblTitle);

		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(new Color(25, 25, 26));
		paneMenu.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneMenu.setBounds(1, 37, 320, 684);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);

		pbMantenimiento = new JPanel();
		pbMantenimiento.setForeground(new Color(229, 9, 127));
		pbMantenimiento.setBackground(new Color(25, 25, 26));
		pbMantenimiento.setBorder(new EmptyBorder(0, 0, 0, 0));
		pbMantenimiento.setBounds(0, 76, 320, 76);
		paneMenu.add(pbMantenimiento);
		pbMantenimiento.setLayout(null);
		pbMantenimiento.addMouseListener(this);

		lblMantenimiento = new JLabel("Mantenimiento");
		lblMantenimiento.setBackground(new Color(255, 255, 255));
		lblMantenimiento.setForeground(new Color(229, 9, 127));
		lblMantenimiento.setFont(new Font("Arial", Font.BOLD, 30));
		lblMantenimiento.setBounds(100, 0, 220, 76);
		pbMantenimiento.add(lblMantenimiento);

		panelIconMan = new JPanel();
		panelIconMan.setOpaque(false);
		panelIconMan.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconMan.setBounds(36, 11, 54, 54);
		pbMantenimiento.add(panelIconMan);
		panelIconMan.setLayout(null);

		iconMan = new JLabel(mantenimiento);
		iconMan.setBounds(0, 0, 54, 54);
		panelIconMan.add(iconMan);

		pbVentas = new JPanel();
		pbVentas.setLayout(null);
		pbVentas.setBorder(new EmptyBorder(0, 0, 0, 0));
		pbVentas.setBackground(new Color(25, 25, 26));
		pbVentas.setBounds(0, 152, 320, 76);
		paneMenu.add(pbVentas);
		pbVentas.addMouseListener(this);

		lblVentas = new JLabel("Ventas");
		lblVentas.setBackground(new Color(25, 25, 26));
		lblVentas.setForeground(new Color(229, 9, 127));
		lblVentas.setFont(new Font("Arial", Font.BOLD, 30));
		lblVentas.setBounds(100, 0, 220, 76);
		pbVentas.add(lblVentas);

		panelIconVentas = new JPanel();
		panelIconVentas.setLayout(null);
		panelIconVentas.setOpaque(false);
		panelIconVentas.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconVentas.setBounds(36, 11, 54, 54);
		pbVentas.add(panelIconVentas);

		iconVentas = new JLabel(ventas);
		iconVentas.setBounds(0, 0, 54, 54);
		panelIconVentas.add(iconVentas);

		pbReportes = new JPanel();
		pbReportes.setLayout(null);
		pbReportes.setBorder(new EmptyBorder(0, 0, 0, 0));
		pbReportes.setBackground(new Color(25, 25, 26));
		pbReportes.setBounds(0, 228, 320, 76);
		paneMenu.add(pbReportes);
		pbReportes.addMouseListener(this);

		lblReportes = new JLabel("Reportes");
		lblReportes.setBackground(new Color(25, 25, 26));
		lblReportes.setForeground(new Color(229, 9, 127));
		lblReportes.setFont(new Font("Arial", Font.BOLD, 30));
		lblReportes.setBounds(100, 0, 220, 76);
		pbReportes.add(lblReportes);

		panelIconReportes = new JPanel();
		panelIconReportes.setLayout(null);
		panelIconReportes.setOpaque(false);
		panelIconReportes.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconReportes.setBounds(36, 11, 54, 54);
		pbReportes.add(panelIconReportes);

		iconReportes = new JLabel(reportes);
		iconReportes.setBounds(0, 0, 54, 54);
		panelIconReportes.add(iconReportes);

		pbAyuda = new JPanel();
		pbAyuda.setLayout(null);
		pbAyuda.setBorder(new EmptyBorder(0, 0, 0, 0));
		pbAyuda.setBackground(new Color(25, 25, 26));
		pbAyuda.setBounds(0, 304, 320, 76);
		paneMenu.add(pbAyuda);
		pbAyuda.addMouseListener(this);

		lblAyuda = new JLabel("Ayuda");
		lblAyuda.setBackground(new Color(25, 25, 26));
		lblAyuda.setForeground(new Color(229, 9, 127));
		lblAyuda.setFont(new Font("Arial", Font.BOLD, 30));
		lblAyuda.setBounds(100, 0, 220, 76);
		pbAyuda.add(lblAyuda);

		panelIconAyuda = new JPanel();
		panelIconAyuda.setLayout(null);
		panelIconAyuda.setOpaque(false);
		panelIconAyuda.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconAyuda.setBounds(36, 11, 54, 54);
		pbAyuda.add(panelIconAyuda);

		iconAyuda = new JLabel(ayuda);
		iconAyuda.setBounds(0, 0, 54, 54);
		panelIconAyuda.add(iconAyuda);

		pbSalir = new JPanel();
		pbSalir.setLayout(null);
		pbSalir.setBorder(new EmptyBorder(0, 0, 0, 0));
		pbSalir.setBackground(new Color(25, 25, 26));
		pbSalir.setBounds(0, 380, 320, 76);
		paneMenu.add(pbSalir);
		pbSalir.addMouseListener(this);

		lblSalir = new JLabel("Salir");
		lblSalir.setBackground(new Color(25, 25, 26));
		lblSalir.setForeground(new Color(229, 9, 127));
		lblSalir.setFont(new Font("Arial", Font.BOLD, 30));
		lblSalir.setBounds(100, 0, 220, 76);
		pbSalir.add(lblSalir);

		panelIconSalir = new JPanel();
		panelIconSalir.setLayout(null);
		panelIconSalir.setOpaque(false);
		panelIconSalir.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconSalir.setBounds(36, 11, 54, 54);
		pbSalir.add(panelIconSalir);

		iconSalir = new JLabel(salir);
		iconSalir.setBounds(0, 0, 54, 54);
		panelIconSalir.add(iconSalir);

		paneMain = new JPanel();
		paneMain.setForeground(new Color(229, 9, 127));
		paneMain.setBackground(new Color(55, 55, 57));
		paneMain.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneMain.setBounds(321, 37, 960, 684);
		contentPane.add(paneMain);
		paneMain.setLayout(null);
		paneMain.add(welcome);

		model.getPanelHome().addMouseListener(this);
		p01.getPanelHome().addMouseListener(this);
		p02.getPanelHome().addMouseListener(this);
		p03.getPanelHome().addMouseListener(this);
		p04.getPanelHome().addMouseListener(this);

	}

	// Paneles
	PanelBienvenida welcome = new PanelBienvenida();
	Modelo model = new Modelo();
	PanelMantenimiento p01 = new PanelMantenimiento();
	PanelVentas p02 = new PanelVentas();
	PanelReportes p03 = new PanelReportes();
	PanelAyuda p04 = new PanelAyuda();

	// Dialogs

	public void mouseDragged(MouseEvent e) {
		if (e.getSource() == paneHeader) {
			moverVentana(e);
		}
	}

	public void mouseMoved(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		if (e.getSource() == paneHeader) {
			campturarCoordenadas(e);
		}

	}

	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == pbX && pbX.contains(e.getPoint())) {
			Salir();
		}
		if (e.getSource() == pbMantenimiento && pbMantenimiento.contains(e.getPoint())) {
			CambiarPaneles(p01);
		}
		if (e.getSource() == pbVentas && pbVentas.contains(e.getPoint())) {
			CambiarPaneles(p02);
		}
		if (e.getSource() == pbReportes && pbReportes.contains(e.getPoint())) {
			CambiarPaneles(p03);
		}
		if (e.getSource() == pbAyuda && pbAyuda.contains(e.getPoint())) {
			CambiarPaneles(p04);
		}
		if (e.getSource() == pbSalir && pbSalir.contains(e.getPoint())) {
			Salir();
		}
		if (e.getSource() == p01.getPanelHome() && p01.getPanelHome().contains(e.getPoint())) {
			p01.hover(p01.getResizedCasitaDark());
			CambiarPaneles(welcome);
		}
		if (e.getSource() == p02.getPanelHome() && p02.getPanelHome().contains(e.getPoint())) {
			p02.hover(p02.getResizedCasitaDark());
			CambiarPaneles(welcome);
		}
		if (e.getSource() == p03.getPanelHome() && p03.getPanelHome().contains(e.getPoint())) {
			p03.hover(p03.getResizedCasitaDark());
			CambiarPaneles(welcome);
		}
		if (e.getSource() == p04.getPanelHome() && p04.getPanelHome().contains(e.getPoint())) {
			p04.hover(p04.getResizedCasitaDark());
			CambiarPaneles(welcome);
		}
	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == pbX) {
			Hover(pbX, lblX, oscuro, magenta);
		}
		if (e.getSource() == pbMantenimiento) {
			HoverMenu(pbMantenimiento, panelIconMan, iconMan, mantenimientoDark, lblMantenimiento, oscuro, magenta);
		}
		if (e.getSource() == pbVentas) {
			HoverMenu(pbVentas, panelIconVentas, iconVentas, ventasDark, lblVentas, oscuro, magenta);
		}
		if (e.getSource() == pbReportes) {
			HoverMenu(pbReportes, panelIconReportes, iconReportes, reportesDark, lblReportes, oscuro, magenta);
		}
		if (e.getSource() == pbAyuda) {
			HoverMenu(pbAyuda, panelIconAyuda, iconAyuda, ayudaDark, lblAyuda, oscuro, magenta);
		}
		if (e.getSource() == pbSalir) {
			HoverMenu(pbSalir, panelIconSalir, iconSalir, salirDark, lblSalir, oscuro, magenta);
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == pbX) {
			HoverOut(pbX, lblX, oscuro, magenta);
		}
		if (e.getSource() == pbMantenimiento) {
			HoverMenu(pbMantenimiento, panelIconMan, iconMan, mantenimiento, lblMantenimiento, magenta, oscuro);
		}
		if (e.getSource() == pbVentas) {
			HoverMenu(pbVentas, panelIconVentas, iconVentas, ventas, lblVentas, magenta, oscuro);
		}
		if (e.getSource() == pbReportes) {
			HoverMenu(pbReportes, panelIconReportes, iconReportes, reportes, lblReportes, magenta, oscuro);
		}
		if (e.getSource() == pbAyuda) {
			HoverMenu(pbAyuda, panelIconAyuda, iconAyuda, ayuda, lblAyuda, magenta, oscuro);
		}
		if (e.getSource() == pbSalir) {
			HoverMenu(pbSalir, panelIconSalir, iconSalir, salir, lblSalir, magenta, oscuro);
		}

	}

	public void actionPerformed(ActionEvent e) {
	}

	// Salir
	private void Salir() {
		System.exit(0);
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
	private void Hover(JPanel panel, JLabel lbl, Color o, Color m) {
		panel.setBackground(m);
		lbl.setForeground(o);
	}

	private void HoverOut(JPanel panel, JLabel lbl, Color o, Color m) {
		panel.setBackground(o);
		lbl.setForeground(m);
	}

	private void HoverMenu(JPanel panel, JPanel panelIcon, JLabel icon, ImageIcon imageIcon, JLabel lbl, Color o,
			Color m) {
		panelIcon.removeAll();
		icon = new JLabel(imageIcon);
		icon.setBounds(0, 0, 54, 54);
		panelIcon.add(icon);
		panel.setBackground(m);
		lbl.setForeground(o);

		repaint();
		revalidate();
	}

	public void CambiarPaneles(JPanel p) {
		paneMain.removeAll();
		paneMain.add(p);
		revalidate();
		repaint();
	}

	public ImageIcon rezisedImage(ImageIcon img) {
		Image icon;
		ImageIcon resizedIcon;
		icon = img.getImage().getScaledInstance(54, 54, Image.SCALE_DEFAULT);
		resizedIcon = new ImageIcon(icon);

		return resizedIcon;
	}
}
