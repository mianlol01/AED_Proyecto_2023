package dialogs;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class ReporteGeneralVendedores extends DialogModelo{

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtArea;

	public ReporteGeneralVendedores() {
		getPanelContenido().setBounds(0, 36, 640, 444);
		getPbX().setLocation(604, 0);
		getPaneHeader().setBounds(0, 0, 640, 36);
		setBounds(0, 0, 640, 480);
		getLblTitle().setBounds(36, 0, 212, 36);
		getLblTitle().setText("Reporte general por vendedores");
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 11, 620, 422);
		getPanelContenido().add(scrollPane);
		
		txtArea = new JTextArea();
		scrollPane.setViewportView(txtArea);
	}

}
