package paneles;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class PanelBienvenida extends JPanel {

	private static final long serialVersionUID = 1L;

	private ImageIcon gifIcon;
	private JLabel lblBienvenido;
	private Image gifImage;
	private ImageIcon resizedGifIcon;

	public PanelBienvenida() {
		setBounds(0, 0, 960, 684);
		setBackground(new Color(55, 55, 57));
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(null);
		
		//Cargar gif
		gifIcon = new ImageIcon("Gifs/welcome.gif");		
		//Redimensioanr gif
		gifImage = gifIcon.getImage().getScaledInstance(960, 684, Image.SCALE_DEFAULT);
		resizedGifIcon = new ImageIcon(gifImage);
		lblBienvenido = new JLabel(resizedGifIcon);
		lblBienvenido.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblBienvenido.setBounds(0, 0, 960, 684);
		add(lblBienvenido);

		

	}

}
