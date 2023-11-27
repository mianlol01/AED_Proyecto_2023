package paneles;

import arreglos.*;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import dialogs.ReportesVentas;
import dialogs.Vender;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PanelVentas extends Modelo {
	private static final long serialVersionUID = 1L;

	private JPanel paneVender;
	private JLabel lblVender;
	private JLabel lblSellIcon;
	private JPanel paneReportes;
	private JLabel lblReportesVentas;
	private JLabel lblReportIcon;
	private JPanel panelIconVender;
	private JPanel panelIconReport;

	private ImageIcon sell;
	private ImageIcon sellDark;
	private ImageIcon report;
	private ImageIcon reportDark;

	private Image scaledSell;
	private ImageIcon resizedSell;
	private Image scaledSellDark;
	private ImageIcon resizedSellDark;

	private Image scaledReport;
	private ImageIcon resizedReport;
	private Image scaledReportDark;
	private ImageIcon resizedReportDark;

	public PanelVentas() {
		getPanelHome().setBounds(880, 603, 70, 70);

		sellDark = new ImageIcon("Iconos/sellDark.png");
		scaledSellDark = sellDark.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedSellDark = new ImageIcon(scaledSellDark);

		reportDark = new ImageIcon("Iconos/reportDark.png");
		scaledReportDark = reportDark.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedReportDark = new ImageIcon(scaledReportDark);

		report = new ImageIcon("Iconos/report.png");
		scaledReport = report.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedReport = new ImageIcon(scaledReport);

		sell = new ImageIcon("Iconos/sell.png");
		scaledSell = sell.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		resizedSell = new ImageIcon(scaledSell);
		setLayout(null);

		paneVender = new JPanel();
		paneVender.setBounds(100, 100, 320, 228);
		paneVender.setLayout(null);
		paneVender.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		paneVender.setBackground(new Color(55, 55, 57));
		add(paneVender);
		paneVender.addMouseListener(this);

		lblVender = new JLabel("Vender");
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setForeground(new Color(229, 9, 127));
		lblVender.setFont(new Font("Arial", Font.BOLD, 30));
		lblVender.setBounds(0, 176, 320, 50);
		paneVender.add(lblVender);

		panelIconVender = new JPanel();
		panelIconVender.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconVender.setOpaque(false);
		panelIconVender.setBackground(new Color(55, 55, 57));
		panelIconVender.setBounds(0, 0, 320, 176);
		paneVender.add(panelIconVender);
		panelIconVender.setLayout(null);

		lblSellIcon = new JLabel(resizedSell);
		lblSellIcon.setBounds(0, 0, 320, 176);
		panelIconVender.add(lblSellIcon);

		paneReportes = new JPanel();
		paneReportes.setBounds(540, 100, 320, 228);
		paneReportes.setLayout(null);
		paneReportes.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(229, 9, 127)));
		paneReportes.setBackground(new Color(55, 55, 57));
		add(paneReportes);
		paneReportes.addMouseListener(this);

		lblReportesVentas = new JLabel("Reportes");
		lblReportesVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblReportesVentas.setForeground(new Color(229, 9, 127));
		lblReportesVentas.setFont(new Font("Arial", Font.BOLD, 30));
		lblReportesVentas.setBounds(0, 176, 320, 50);
		paneReportes.add(lblReportesVentas);

		panelIconReport = new JPanel();
		panelIconReport.setOpaque(false);
		panelIconReport.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelIconReport.setBackground(new Color(55, 55, 57));
		panelIconReport.setBounds(0, 0, 320, 176);
		paneReportes.add(panelIconReport);
		panelIconReport.setLayout(null);

		lblReportIcon = new JLabel(resizedReport);
		lblReportIcon.setBounds(0, 0, 320, 176);
		panelIconReport.add(lblReportIcon);
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == paneVender && paneVender.contains(e.getPoint())) {
			ArregloVendedores av = new ArregloVendedores();
			ArregloProductos ap = new ArregloProductos();
			ArregloClientes ac = new ArregloClientes();
			if (av.estaVacio()) {
				JOptionPane.showMessageDialog(this, "No existe vendedor registrado.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			else if (ap.estaVacio()) {
				JOptionPane.showMessageDialog(this, "No existe producto registrado.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			else if (ac.estaVacio()) {
				JOptionPane.showMessageDialog(this, "No existe cliente registrado.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}else {
				Vender v = new Vender();
				dialogs(v);
			}
		}

		if (e.getSource() == paneReportes && paneReportes.contains(e.getPoint())) {
			ReportesVentas r = new ReportesVentas();
			dialogs(r);
		}
	}

	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == paneVender) {
			hover(paneVender, panelIconVender, lblSellIcon, lblVender, resizedSellDark, oscuro, magenta);
		}
		if (e.getSource() == paneReportes) {
			hover(paneReportes, panelIconReport, lblReportIcon, lblReportesVentas, resizedReportDark, oscuro, magenta);
		}
		if (e.getSource() == getPanelHome()) {
			hover(getResizedCasita());
		}
	}

	public void mouseExited(MouseEvent e) {
		if (e.getSource() == paneVender) {
			hover(paneVender, panelIconVender, lblSellIcon, lblVender, resizedSell, magenta, oscuro);
		}
		if (e.getSource() == paneReportes) {
			hover(paneReportes, panelIconReport, lblReportIcon, lblReportesVentas, resizedReport, magenta, oscuro);
		}
		if (e.getSource() == getPanelHome()) {
			hover(getResizedCasitaDark());
		}

	}

	public void hover(JPanel pm, JPanel p, JLabel icon, JLabel lbl, ImageIcon ic, Color d, Color m) {
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
