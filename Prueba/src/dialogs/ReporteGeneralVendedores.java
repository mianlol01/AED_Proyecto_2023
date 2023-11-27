package dialogs;

import arreglos.*;
import clases.*;

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
		
		informe();
	}
	
	ArregloVendedores arregloVendedores = new ArregloVendedores();
	ArregloFacturas arregloFacturas = new ArregloFacturas();

	private void informe() {
		for (int i = 0; i < arregloVendedores.tamanio(); i++) {
		    Vendedor vendedor = arregloVendedores.obtener(i);

		    // 2. Obtener Información de Ventas
		    int numVentas = 0;
		    int unidadesVendidasAcumuladas = 0;
		    double importeTotalAcumulado = 0;

		    // Recorrer el Arreglo de Facturas para el vendedor actual
		    for (int j = 0; j < arregloFacturas.tamanio(); j++) {
		        Factura factura = arregloFacturas.obtener(j);

		        // Verificar si la factura pertenece al vendedor actual
		        if (factura.getCodigoVendedor() == vendedor.getCodigoVendedor()) {
		            numVentas++;
		            unidadesVendidasAcumuladas += factura.getUnidades();
		            importeTotalAcumulado += factura.getPrecio();
		        }
		    }

		    txtArea.append("Código: " + vendedor.getCodigoVendedor() + "\n");
		    txtArea.append("Nombre: " + vendedor.getNombre() + "\n");
		    txtArea.append("Apellido: " + vendedor.getApellido() + "\n");
		    txtArea.append("Número de Ventas: " + numVentas + "\n");
		    txtArea.append("Unidades Vendidas Acumuladas: " + unidadesVendidasAcumuladas + "\n");
		    txtArea.append("Importe Total Acumulado: " + importeTotalAcumulado + "\n");
		    txtArea.append("------------------------------\n");
		}
	}

}

