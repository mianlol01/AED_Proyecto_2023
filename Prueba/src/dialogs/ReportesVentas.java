package dialogs;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextArea;

public class ReportesVentas extends DialogModelo{
	private static final long serialVersionUID = 1L;
	
	public ReportesVentas() {
		getPanelContenido().setBounds(0, 36, 480, 564);
		getPanelContenido().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 11, 460, 542);
		getPanelContenido().add(scrollPane);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setEnabled(false);
		scrollPane.setViewportView(txtArea);
		getPbX().setLocation(444, 0);
		setBounds(100, 100, 480, 600);
		getLblTitle().setText("Reporte ventas");
		getPaneHeader().setBounds(0, 0, 480, 36);
		getContentPanel().setLayout(null);
		
	}

}
