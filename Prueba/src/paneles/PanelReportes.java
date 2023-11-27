package paneles;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import dialogs.ReporteGeneralProductos;
import dialogs.ReporteGeneralVendedores;
import dialogs.ReportePrecios;
import dialogs.ReporteProducto;
import dialogs.ReporteVendedor;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;

public class PanelReportes extends Modelo {

	private static final long serialVersionUID = 1L;

	private JPanel panelRGProductos;
	private JPanel panelRGVendedor;
	private JPanel panelRPrecios;
	private JPanel panelRProducto;
	private JPanel panelRVendedor;

	private JLabel lblRGProductos;
	private JLabel lblRGVendedores;
	private JLabel lblRPrecios;
	private JLabel lblRProductos;
	private JLabel lblRVendedor;

	private JLabel IconProducts;
	private JLabel IconSellers;
	private JLabel IconPrices;
	private JLabel IconProduct;
	private JLabel IconSeller;

	private ImageIcon products;
	private ImageIcon product;
	private ImageIcon sellers;
	private ImageIcon seller;
	private ImageIcon price;

	private ImageIcon productsDark;
	private ImageIcon productDark;
	private ImageIcon sellersDark;
	private ImageIcon sellerDark;
	private ImageIcon priceDark;

	private Image scaledProducts;
	private ImageIcon resizedProducts;
	private Image scaledProductsDark;
	private ImageIcon resizedProductsDark;

	private Image scaledProduct;
	private ImageIcon resizedProduct;
	private Image scaledProductDark;
	private ImageIcon resizedProductDark;

	private Image scaledSellers;
	private ImageIcon resizedSellers;
	private Image scaledSellersDark;
	private ImageIcon resizedSellersDark;

	private Image scaledSeller;
	private ImageIcon resizedSeller;
	private Image scaledSellerDark;
	private ImageIcon resizedSellerDark;

	private Image scaledPrice;
	private ImageIcon resizedPrice;
	private Image scaledPriceDark;
	private ImageIcon resizedPriceDark;
	private JPanel panelIconRGP;
	private JPanel panelIconRGV;
	private JPanel panelIconPrice;
	private JPanel panelIconProd;
	private JPanel panelIconSeller;

	public PanelReportes() {

		productsDark = new ImageIcon("Iconos/productsDark.png");
		scaledProductsDark = productsDark.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedProductsDark = new ImageIcon(scaledProductsDark);

		products = new ImageIcon("Iconos/products.png");
		scaledProducts = products.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedProducts = new ImageIcon(scaledProducts);

		productDark = new ImageIcon("Iconos/product02Dark.png");
		scaledProductDark = productDark.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedProductDark = new ImageIcon(scaledProductDark);

		product = new ImageIcon("Iconos/product02.png");
		scaledProduct = product.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedProduct = new ImageIcon(scaledProduct);

		sellersDark = new ImageIcon("Iconos/personsDark.png");
		scaledSellersDark = sellersDark.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedSellersDark = new ImageIcon(scaledSellersDark);

		sellers = new ImageIcon("Iconos/persons.png");
		scaledSellers = sellers.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedSellers = new ImageIcon(scaledSellers);

		sellerDark = new ImageIcon("Iconos/personDark.png");
		scaledSellerDark = sellerDark.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedSellerDark = new ImageIcon(scaledSellerDark);

		seller = new ImageIcon("Iconos/person.png");
		scaledSeller = seller.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedSeller = new ImageIcon(scaledSeller);

		priceDark = new ImageIcon("Iconos/priceDark.png");
		scaledPriceDark = priceDark.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedPriceDark = new ImageIcon(scaledPriceDark);

		price = new ImageIcon("Iconos/price.png");
		scaledPrice = price.getImage().getScaledInstance(118, 118, Image.SCALE_SMOOTH);
		resizedPrice = new ImageIcon(scaledPrice);

		panelRGProductos = new JPanel();
		panelRGProductos.setBackground(new Color(55, 55, 57));
		panelRGProductos.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		panelRGProductos.setBounds(100, 100, 210, 180);
		add(panelRGProductos);
		panelRGProductos.setLayout(null);
		panelRGProductos.addMouseListener(this);

		lblRGProductos = new JLabel("R. General por productos");
		lblRGProductos.setForeground(new Color(229, 9, 127));
		lblRGProductos.setFont(new Font("Arial", Font.BOLD, 15));
		lblRGProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblRGProductos.setBounds(0, 130, 210, 50);
		panelRGProductos.add(lblRGProductos);

		panelIconRGP = new JPanel();
		panelIconRGP.setOpaque(false);
		panelIconRGP.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconRGP.setBounds(0, 0, 210, 130);
		panelRGProductos.add(panelIconRGP);
		panelIconRGP.setLayout(null);

		IconProducts = new JLabel(resizedProducts);
		IconProducts.setBounds(0, 10, 210, 118);
		panelIconRGP.add(IconProducts);

		panelRGVendedor = new JPanel();
		panelRGVendedor.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		panelRGVendedor.setBackground(new Color(55, 55, 57));
		panelRGVendedor.setBounds(375, 100, 210, 180);
		add(panelRGVendedor);
		panelRGVendedor.setLayout(null);
		panelRGVendedor.addMouseListener(this);

		lblRGVendedores = new JLabel("R. General por vendedores");
		lblRGVendedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblRGVendedores.setForeground(new Color(229, 9, 127));
		lblRGVendedores.setFont(new Font("Arial", Font.BOLD, 15));
		lblRGVendedores.setBounds(0, 130, 210, 50);
		panelRGVendedor.add(lblRGVendedores);

		panelIconRGV = new JPanel();
		panelIconRGV.setOpaque(false);
		panelIconRGV.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconRGV.setBounds(0, 0, 210, 130);
		panelRGVendedor.add(panelIconRGV);
		panelIconRGV.setLayout(null);

		IconSellers = new JLabel(resizedSellers);
		IconSellers.setBounds(0, 10, 210, 118);
		panelIconRGV.add(IconSellers);

		panelRPrecios = new JPanel();
		panelRPrecios.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		panelRPrecios.setBackground(new Color(55, 55, 57));
		panelRPrecios.setBounds(655, 100, 210, 180);
		add(panelRPrecios);
		panelRPrecios.setLayout(null);
		panelRPrecios.addMouseListener(this);

		lblRPrecios = new JLabel("R. por precios");
		lblRPrecios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRPrecios.setForeground(new Color(229, 9, 127));
		lblRPrecios.setFont(new Font("Arial", Font.BOLD, 15));
		lblRPrecios.setBounds(0, 130, 210, 50);
		panelRPrecios.add(lblRPrecios);

		panelIconPrice = new JPanel();
		panelIconPrice.setBounds(0, 0, 210, 130);
		panelRPrecios.add(panelIconPrice);
		panelIconPrice.setLayout(null);
		panelIconPrice.setOpaque(false);
		panelIconPrice.setBorder(new EmptyBorder(0, 0, 0, 0));

		IconPrices = new JLabel(resizedPrice);
		IconPrices.setBounds(0, 10, 210, 118);
		panelIconPrice.add(IconPrices);

		panelRProducto = new JPanel();
		panelRProducto.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		panelRProducto.setBackground(new Color(55, 55, 57));
		panelRProducto.setBounds(100, 404, 210, 180);
		add(panelRProducto);
		panelRProducto.setLayout(null);
		panelRProducto.addMouseListener(this);

		lblRProductos = new JLabel("R. por productos");
		lblRProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblRProductos.setForeground(new Color(229, 9, 127));
		lblRProductos.setFont(new Font("Arial", Font.BOLD, 15));
		lblRProductos.setBounds(0, 130, 210, 50);
		panelRProducto.add(lblRProductos);

		panelIconProd = new JPanel();
		panelIconProd.setLayout(null);
		panelIconProd.setOpaque(false);
		panelIconProd.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconProd.setBounds(0, 0, 210, 130);
		panelRProducto.add(panelIconProd);

		IconProduct = new JLabel(resizedProduct);
		IconProduct.setBounds(0, 10, 210, 118);
		panelIconProd.add(IconProduct);

		panelRVendedor = new JPanel();
		panelRVendedor.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		panelRVendedor.setBackground(new Color(55, 55, 57));
		panelRVendedor.setBounds(375, 404, 210, 180);
		add(panelRVendedor);
		panelRVendedor.setLayout(null);
		panelRVendedor.addMouseListener(this);

		lblRVendedor = new JLabel("R. por vendedor");
		lblRVendedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblRVendedor.setForeground(new Color(229, 9, 127));
		lblRVendedor.setFont(new Font("Arial", Font.BOLD, 15));
		lblRVendedor.setBounds(0, 130, 210, 50);
		panelRVendedor.add(lblRVendedor);

		panelIconSeller = new JPanel();
		panelIconSeller.setLayout(null);
		panelIconSeller.setOpaque(false);
		panelIconSeller.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconSeller.setBounds(0, 0, 210, 130);
		panelRVendedor.add(panelIconSeller);

		IconSeller = new JLabel(resizedSeller);
		IconSeller.setBounds(0, 10, 210, 118);
		panelIconSeller.add(IconSeller);

	}

	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == panelRGProductos && panelRGProductos.contains(e.getPoint())) {
			ReporteGeneralProductos rgp = new ReporteGeneralProductos();
			dialogs(rgp);
		}
		if (e.getSource() == panelRGVendedor && panelRGVendedor.contains(e.getPoint())) {
			ReporteGeneralVendedores rgv = new ReporteGeneralVendedores();
			dialogs(rgv);
		}
		if (e.getSource() == panelRProducto && panelRProducto.contains(e.getPoint())) {
			ReporteProducto rp = new ReporteProducto();
			dialogs(rp);
		}
		if (e.getSource() == panelRVendedor && panelRVendedor.contains(e.getPoint())) {
			ReporteVendedor rv = new ReporteVendedor();
			dialogs(rv);
		}
		if (e.getSource() == panelRPrecios && panelRPrecios.contains(e.getPoint())) {
			ReportePrecios rpc = new ReportePrecios();
			dialogs(rpc);
		}
	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == panelRGProductos) {
			hover(panelRGProductos, panelIconRGP, IconProducts, lblRGProductos, resizedProductsDark, oscuro, magenta);
		}
		if (e.getSource() == panelRGVendedor) {
			hover(panelRGVendedor, panelIconRGV, IconSellers, lblRGVendedores, resizedSellersDark, oscuro, magenta);
		}
		if (e.getSource() == panelRProducto) {
			hover(panelRProducto, panelIconProd, IconProduct, lblRProductos, resizedProductDark, oscuro, magenta);
		}
		if (e.getSource() == panelRVendedor) {
			hover(panelRVendedor, panelIconSeller, IconSeller, lblRVendedor, resizedSellerDark, oscuro, magenta);
		}
		if (e.getSource() == panelRPrecios) {
			hover(panelRPrecios, panelIconPrice, IconPrices, lblRPrecios, resizedPriceDark, oscuro, magenta);
		}
		if (e.getSource() == getPanelHome()) {
			hover(getResizedCasita());
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == panelRGProductos) {
			hover(panelRGProductos, panelIconRGP, IconProducts, lblRGProductos, resizedProducts, magenta, oscuro);
		}
		if (e.getSource() == panelRGVendedor) {
			hover(panelRGVendedor, panelIconRGV, IconSellers, lblRGVendedores, resizedSellers, magenta, oscuro);
		}
		if (e.getSource() == panelRProducto) {
			hover(panelRProducto, panelIconProd, IconProduct, lblRProductos, resizedProduct, magenta, oscuro);
		}
		if (e.getSource() == panelRVendedor) {
			hover(panelRVendedor, panelIconSeller, IconSeller, lblRVendedor, resizedSeller, magenta, oscuro);
		}
		if (e.getSource() == panelRPrecios) {
			hover(panelRPrecios, panelIconPrice, IconPrices, lblRPrecios, resizedPrice, magenta, oscuro);
		}

		if (e.getSource() == getPanelHome()) {
			hover(getResizedCasitaDark());
		}

	}

	public void hover(JPanel pm, JPanel p, JLabel icon, JLabel lbl, ImageIcon ic, Color d, Color m) {
		p.removeAll();
		icon = new JLabel(ic);
		p.add(icon);
		icon.setBounds(0, 10, 210, 118);
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
