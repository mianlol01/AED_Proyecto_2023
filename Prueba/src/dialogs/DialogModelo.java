package dialogs;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
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

public class DialogModelo extends JDialog implements ActionListener, MouseListener, MouseMotionListener{

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
	
	public DialogModelo() {
		setAutoRequestFocus(false);
		setUndecorated(true);
		setModal(true);
		setBounds(100, 100, 700, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(55, 55, 57));
		contentPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(62, 62, 64)));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		paneHeader = new JPanel();
		paneHeader.setBackground(new Color(25, 25, 26));
		paneHeader.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(62, 62, 64)));
		paneHeader.setBounds(0, 0, 700, 36);
		contentPanel.add(paneHeader);
		paneHeader.setLayout(null);
		paneHeader.addMouseListener(this);
		paneHeader.addMouseMotionListener(this);
		
		pbX = new JPanel();
		pbX.setLayout(null);
		pbX.setForeground(new Color(25, 25, 26));
		pbX.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(62, 62, 64)));
		pbX.setBackground(new Color(25, 25, 26));
		pbX.setBounds(664, 0, 36, 36);
		paneHeader.add(pbX);
		
		lblX = new JLabel("x");
		lblX.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(62, 62, 64)));
		lblX.setOpaque(true);
		lblX.setBackground(new Color(25, 25, 26));
		lblX.setBounds(0, 0, 36, 36);
		pbX.add(lblX);
		lblX.setVerticalAlignment(SwingConstants.TOP);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(new Color(229, 9, 127));
		lblX.setFont(new Font("Candara Light", Font.PLAIN, 40));
		
		lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblTitle.setForeground(new Color(229, 9, 127));
		lblTitle.setBounds(36, 0, 105, 36);
		paneHeader.add(lblTitle);
		
		lblIcon = new JLabel("");
		lblIcon.setBounds(0, 0, 36, 36);
		paneHeader.add(lblIcon);
		
		panelContenido = new JPanel();
		panelContenido.setOpaque(false);
		panelContenido.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelContenido.setBounds(0, 36, 700, 564);
		contentPanel.add(panelContenido);
		panelContenido.setLayout(null);
		pbX.addMouseListener(this);
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
			HoverMenu(lblX, oscuro, magenta);
		}
		
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == pbX) {
			HoverMenu(lblX, magenta, oscuro);
		}
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	//
	public void Salir() {
		HoverMenu(lblX, magenta, oscuro);
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
	public void HoverMenu(JLabel lbl, Color o, Color m) {
		lbl.setBackground(m);
		lbl.setForeground(o);
	}
	public void Hover(JPanel panel, JLabel lbl, Color o, Color m) {
		panel.setBackground(m);
		lbl.setForeground(o);
	}

	public void HoverOut(JPanel panel, JLabel lbl, Color o, Color m) {
		panel.setBackground(o);
		lbl.setForeground(m);
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

}
