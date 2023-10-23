package paneles;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import dialogs.MantenimientoClientes;
import dialogs.MantenimientoProductos;
import dialogs.MantenimientoVendedores;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;

public class PanelMantenimiento extends Modelo {
	private static final long serialVersionUID = 1L;
	
	private JPanel menuVendedores;
	private JPanel menuClientes;
	private JPanel menuProductos;
	private JLabel lblVendedores;
	private JLabel lblProductos;
	private JLabel lblClientes;
	private JLabel lblSellerIcon;
	private JLabel lblProductIcon;
	private JLabel lblClientIcon;
	private JPanel panelIconSeller;
	
	private ImageIcon seller;
	private ImageIcon sellerDark;
	private ImageIcon product;
	private ImageIcon productDark;
	private ImageIcon client;
	private ImageIcon clientDark;
	
	private Image scaledSeller;
	private ImageIcon resizedSeller;
	private Image scaledSellerDark;
	private ImageIcon resizedSellerDark;
	
	private Image scaledProduct;
	private ImageIcon resizedProduct;
	private Image scaledProductDark;
	private ImageIcon resizedProductDark;
	
	private Image scaledClient;
	private ImageIcon resizedClient;
	private Image scaledClientDark;
	private ImageIcon resizedClientDark;
	private JPanel panelIconClient;
	private JLabel lblSellerIcon_1;
	private JPanel panelIconProd;
	private JLabel lblSellerIcon_2;
	

	public PanelMantenimiento() {
		
		sellerDark = new ImageIcon("Iconos/sellerDark.png");
		scaledSellerDark = sellerDark.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedSellerDark = new ImageIcon(scaledSellerDark);

		seller = new ImageIcon("Iconos/seller.png");
		scaledSeller = seller.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedSeller = new ImageIcon(scaledSeller);
		
		productDark = new ImageIcon("Iconos/productDark.png");
		scaledProductDark = productDark.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedProductDark = new ImageIcon(scaledProductDark);

		product = new ImageIcon("Iconos/product.png");
		scaledProduct = product.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedProduct = new ImageIcon(scaledProduct);
		
		clientDark = new ImageIcon("Iconos/customerDark.png");
		scaledClientDark = clientDark.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedClientDark = new ImageIcon(scaledClientDark);

		client = new ImageIcon("Iconos/customer.png");
		scaledClient = client.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedClient = new ImageIcon(scaledClient);
		
		menuVendedores = new JPanel();
		menuVendedores.setBackground(new Color(55, 55, 57));
		menuVendedores.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		menuVendedores.setBounds(100, 100, 320, 228);
		add(menuVendedores);
		menuVendedores.setLayout(null);
		menuVendedores.addMouseListener(this);
		
		lblVendedores = new JLabel("Vendedores");
		lblVendedores.setForeground(new Color(229, 9, 127));
		lblVendedores.setFont(new Font("Arial", Font.BOLD, 30));
		lblVendedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendedores.setBounds(0, 176, 320, 50);
		menuVendedores.add(lblVendedores);
		
		panelIconSeller = new JPanel();
		panelIconSeller.setOpaque(false);
		panelIconSeller.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconSeller.setBounds(0, 0, 320, 176);
		menuVendedores.add(panelIconSeller);
		panelIconSeller.setLayout(null);
		
		lblSellerIcon = new JLabel(resizedSeller);
		lblSellerIcon.setBounds(0, 0, 320, 176);
		panelIconSeller.add(lblSellerIcon);
		
		menuClientes = new JPanel();
		menuClientes.setBackground(new Color(55, 55, 57));
		menuClientes.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		menuClientes.setBounds(540, 100, 320, 228);
		add(menuClientes);
		menuClientes.setLayout(null);
		menuClientes.addMouseListener(this);
		
		lblClientes = new JLabel("Clientes");
		lblClientes.setForeground(new Color(229, 9, 127));
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setFont(new Font("Arial", Font.BOLD, 30));
		lblClientes.setBounds(0, 176, 320, 50);
		menuClientes.add(lblClientes);
		
		panelIconClient = new JPanel();
		panelIconClient.setLayout(null);
		panelIconClient.setOpaque(false);
		panelIconClient.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconClient.setBounds(0, 0, 320, 176);
		menuClientes.add(panelIconClient);
		
		lblSellerIcon_1 = new JLabel((Icon) null);
		lblSellerIcon_1.setBounds(0, 0, 320, 176);
		panelIconClient.add(lblSellerIcon_1);
		
		lblClientIcon = new JLabel(resizedClient);
		lblClientIcon.setBounds(0, 0, 320, 176);
		panelIconClient.add(lblClientIcon);
		
		menuProductos = new JPanel();
		menuProductos.setBackground(new Color(55, 55, 57));
		menuProductos.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		menuProductos.setBounds(100, 356, 320, 228);
		add(menuProductos);
		menuProductos.setLayout(null);
		menuProductos.addMouseListener(this);
		
		lblProductos = new JLabel("Productos");
		lblProductos.setForeground(new Color(229, 9, 127));
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setFont(new Font("Arial", Font.BOLD, 30));
		lblProductos.setBounds(0, 176, 320, 50);
		menuProductos.add(lblProductos);
		
		panelIconProd = new JPanel();
		panelIconProd.setLayout(null);
		panelIconProd.setOpaque(false);
		panelIconProd.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconProd.setBounds(0, 0, 320, 176);
		menuProductos.add(panelIconProd);
		
		lblSellerIcon_2 = new JLabel((Icon) null);
		lblSellerIcon_2.setBounds(0, 0, 320, 176);
		panelIconProd.add(lblSellerIcon_2);
		
		lblProductIcon = new JLabel(resizedProduct);
		lblProductIcon.setBounds(0, 0, 320, 176);
		panelIconProd.add(lblProductIcon);	
	}
	MantenimientoVendedores mv = new MantenimientoVendedores();
	MantenimientoClientes mc = new MantenimientoClientes();
	MantenimientoProductos mp = new MantenimientoProductos();
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == menuVendedores && menuVendedores.contains(e.getPoint())) {
			dialogs(mv);
		}
		if (e.getSource() == menuClientes && menuClientes.contains(e.getPoint())) {
			dialogs(mc);
		}
		if (e.getSource() == menuProductos && menuProductos.contains(e.getPoint())) {
			dialogs(mp);
		}
	}
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == menuVendedores) {
			hover(menuVendedores, panelIconSeller, lblSellerIcon, lblVendedores, resizedSellerDark, oscuro, magenta);
		}
		if (e.getSource() == menuClientes) {
			hover(menuClientes, panelIconClient, lblClientIcon, lblClientes, resizedClientDark, oscuro, magenta);
		}
		if (e.getSource() == menuProductos) {
			hover(menuProductos, panelIconProd, lblProductIcon, lblProductos, resizedProductDark, oscuro, magenta);
		}
		if (e.getSource() == getPanelHome()) {
			hover(getResizedCasita());
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == menuVendedores) {
			hover(menuVendedores, panelIconSeller, lblSellerIcon, lblVendedores, resizedSeller, magenta, oscuro);
		}
		if (e.getSource() == menuClientes) {
			hover(menuClientes, panelIconClient, lblClientIcon, lblClientes, resizedClient, magenta, oscuro);
		}
		if (e.getSource() == menuProductos) {
			hover(menuProductos, panelIconProd, lblProductIcon, lblProductos, resizedProduct, magenta, oscuro);
		}
		if (e.getSource() == getPanelHome()) {
			hover(getResizedCasitaDark());
		}

	}

	public void hover(JPanel pm, JPanel p,JLabel icon, JLabel lbl, ImageIcon ic, Color d, Color m) {
		p.removeAll();
		icon = new JLabel(ic);
		p.add(icon);
		icon.setBounds(0, 0, 320, 176);
		lbl.setForeground(d);
		pm.setBackground(m);
		repaint();
		revalidate();
	}
	public void dialogs(JDialog x) {
		x.setLocationRelativeTo(null);
		x.setVisible(true);
	}
}
