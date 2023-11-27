package clases;

public class Vendedor extends Persona {
	private int codigoVendedor;
	private int ventas;
	private int categoria;
	private int unidadesVendidas;

	// Constructor con ventas proporcionado
	public Vendedor(String nombre, String apellido, String dni, String telefono, int codigoVendedor, int ventas,
			int categoria, int unidadesVendidas) {
		super(nombre, apellido, dni, telefono);
		this.codigoVendedor = codigoVendedor;
		this.ventas = ventas;
		this.categoria = categoria;
		this.unidadesVendidas = unidadesVendidas;
	}

	// Constructor sin ventas (ventas se establece en 0 por defecto)
	public Vendedor(String nombre, String apellido, String dni, String telefono, int codigoVendedor, int categoria) {
		super(nombre, apellido, dni, telefono);
		this.codigoVendedor = codigoVendedor;
		this.categoria = categoria;
		this.ventas = 0;
		this.unidadesVendidas = 0;
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}
}