package dialogs;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Consulta extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JComboBox<String> comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnCerrar;

	public static void main(String[] args) {
		try {
			Consulta dialog = new Consulta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Consulta() {
		setBounds(100, 100, 450, 300);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblNewLabel = new JLabel("Código");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPanel.add(lblNewLabel);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(66, 7, 113, 22);
		comboBox.addActionListener(this);
		contentPanel.add(comboBox);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 414, 203);
		contentPanel.add(scrollPane);

		textArea = new JTextArea();
		textArea.setFocusable(false);
		scrollPane.setViewportView(textArea);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnCerrar);
		btnCerrar.addActionListener(this);
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public void setCodigosEnComboBox(String[] codigos) {
		if (comboBox != null) {
			for (String codigo : codigos) {
				comboBox.addItem(codigo);
			}
		} else {
			// Manejo de caso cuando comboBox es nulo
			System.err.println("comboBox es nulo");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			this.dispose();
			;
		}
	}

}
