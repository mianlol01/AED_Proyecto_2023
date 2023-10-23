package paneles;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Modelo extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;

	private JPanel panelHome;
	private JLabel lblHome;

	private ImageIcon casita;
	private ImageIcon casitaDark;

	private Image scaledImage;
	private ImageIcon resizedCasita;

	private Image scaledImageDark;
	private ImageIcon resizedCasitaDark;
	
	public Color magenta = new Color(229, 9, 127);
	public Color oscuro = new Color(55, 55, 57);

	public Modelo() {
		setForeground(magenta);
		setBounds(0, 0, 960, 684);
		setBackground(new Color(55, 55, 57));
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(null);

		casitaDark = new ImageIcon("Iconos/casitaDark.png");
		scaledImageDark = casitaDark.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		resizedCasitaDark = new ImageIcon(scaledImageDark);

		casita = new ImageIcon("Iconos/casita.png");
		scaledImage = casita.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		resizedCasita = new ImageIcon(scaledImage);

		panelHome = new JPanel();
		panelHome.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelHome.setBackground(oscuro);
		panelHome.setBounds(880, 603, 70, 70);
		add(panelHome);
		panelHome.setLayout(null);
		panelHome.addMouseListener(this);

		lblHome = new JLabel(resizedCasitaDark);
		lblHome.setBounds(0, 0, 70, 70);
		panelHome.add(lblHome);

	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == panelHome) {
			hover(resizedCasita);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == panelHome) {
			hover(resizedCasitaDark);

		}

	}

	public void hover(ImageIcon ic) {
		panelHome.removeAll();
		lblHome = new JLabel(ic);
		lblHome.setBounds(0, 0, 70, 70);
		panelHome.add(lblHome);
		repaint();
		revalidate();
	}

	public JPanel getPanelHome() {
		return panelHome;
	}

	public void setPanelHome(JPanel panelHome) {
		this.panelHome = panelHome;
	}

	public ImageIcon getResizedCasitaDark() {
		return resizedCasitaDark;
	}

	public void setResizedCasitaDark(ImageIcon resizedCasitaDark) {
		this.resizedCasitaDark = resizedCasitaDark;
	}

	public ImageIcon getResizedCasita() {
		return resizedCasita;
	}

	public void setResizedCasita(ImageIcon resizedCasita) {
		this.resizedCasita = resizedCasita;
	}

}
