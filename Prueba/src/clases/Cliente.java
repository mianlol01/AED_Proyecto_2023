package clases;

public class Cliente extends Persona {
	private int codigoCliente;

	public Cliente(String nombre, String apellido, String dni, String telefono, int codigoCliente) {
		super(nombre, apellido, dni, telefono);
		this.codigoCliente = codigoCliente;

	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}
