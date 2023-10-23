package dialogs;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Vender extends DialogModelo{
	private static final long serialVersionUID = 1L;
	private JTextField txtCodigoCliente;
	private JTextField txtCodigoVendedor;
	private JTextField txtCodigoProducto;
	private JTextField txtUnidades;

	public Vender() {
		getPanelContenido().setBounds(0, 36, 480, 564);
		getPanelContenido().setLayout(null);
		
		JLabel lblCodigoCliente = new JLabel("Código Cliente:");
		lblCodigoCliente.setForeground(new Color(229, 9, 127));
		lblCodigoCliente.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigoCliente.setBounds(46, 36, 180, 20);
		getPanelContenido().add(lblCodigoCliente);
		
		txtCodigoCliente = new JTextField();
		txtCodigoCliente.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		txtCodigoCliente.setForeground(new Color(229, 9, 127));
		txtCodigoCliente.setFont(new Font("Monospaced", Font.PLAIN, 19));
		txtCodigoCliente.setBounds(260, 36, 180, 24);
		getPanelContenido().add(txtCodigoCliente);
		txtCodigoCliente.setColumns(10);
		
		JLabel lblCodigoVendedor = new JLabel("Código Vendedor:");
		lblCodigoVendedor.setForeground(new Color(229, 9, 127));
		lblCodigoVendedor.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigoVendedor.setBounds(46, 100, 194, 20);
		getPanelContenido().add(lblCodigoVendedor);
		
		JLabel lblCodigoProducto = new JLabel("Código Producto:");
		lblCodigoProducto.setForeground(new Color(229, 9, 127));
		lblCodigoProducto.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCodigoProducto.setBounds(46, 164, 194, 20);
		getPanelContenido().add(lblCodigoProducto);
		
		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setForeground(new Color(229, 9, 127));
		lblUnidades.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblUnidades.setBounds(46, 228, 194, 20);
		getPanelContenido().add(lblUnidades);
		
		txtCodigoVendedor = new JTextField();
		txtCodigoVendedor.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		txtCodigoVendedor.setForeground(new Color(229, 9, 127));
		txtCodigoVendedor.setFont(new Font("Monospaced", Font.PLAIN, 19));
		txtCodigoVendedor.setColumns(10);
		txtCodigoVendedor.setBounds(260, 100, 180, 24);
		getPanelContenido().add(txtCodigoVendedor);
		
		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		txtCodigoProducto.setForeground(new Color(229, 9, 127));
		txtCodigoProducto.setFont(new Font("Monospaced", Font.PLAIN, 19));
		txtCodigoProducto.setColumns(10);
		txtCodigoProducto.setBounds(260, 164, 180, 24);
		getPanelContenido().add(txtCodigoProducto);
		
		txtUnidades = new JTextField();
		txtUnidades.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		txtUnidades.setForeground(new Color(229, 9, 127));
		txtUnidades.setFont(new Font("Monospaced", Font.PLAIN, 19));
		txtUnidades.setColumns(10);
		txtUnidades.setBounds(260, 228, 180, 24);
		getPanelContenido().add(txtUnidades);
		
		JPanel panelSell = new JPanel();
		panelSell.setBackground(new Color(55, 55, 57));
		panelSell.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		panelSell.setBounds(170, 280, 130, 50);
		getPanelContenido().add(panelSell);
		panelSell.setLayout(null);
		
		JLabel lblVender = new JLabel("Vender");
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setForeground(new Color(229, 9, 127));
		lblVender.setFont(new Font("Arial", Font.BOLD, 15));
		lblVender.setBounds(0, 32, 130, 18);
		panelSell.add(lblVender);
		
		JPanel panelIconSell = new JPanel();
		panelIconSell.setOpaque(false);
		panelIconSell.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconSell.setBounds(0, 0, 130, 32);
		panelSell.add(panelIconSell);
		panelIconSell.setLayout(null);
		
		JLabel IconSell = new JLabel("");
		IconSell.setBounds(0, 0, 130, 32);
		panelIconSell.add(IconSell);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(229, 9, 127)));
		scrollPane.setBounds(10, 336, 460, 217);
		getPanelContenido().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(null);
		scrollPane.setViewportView(textArea);
		getPbX().setLocation(444, 0);
		setBounds(100, 100, 480, 600);
		getLblTitle().setText("Vender");
		getPaneHeader().setBounds(0, 0, 480, 36);
		getContentPanel().setLayout(null);
	}
}
