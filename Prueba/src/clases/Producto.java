package clases;

public class Producto {
    private int codigoProducto;
    private String descripcion;
    private double precio;
    private int stock;
    private int cantidadesVendidas;

    public Producto(int codigoProducto, String descripcion, double precio, int stock, int cantidadesVendidas) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.cantidadesVendidas = cantidadesVendidas;
    }

    // Constructor sin cantidadesVendidas (se establece en 0 por defecto)
    public Producto(int codigoProducto, String descripcion, double precio, int stock) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.cantidadesVendidas = 0; // Valor por defecto
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantidadesVendidas() {
        return cantidadesVendidas;
    }

    public void setCantidadesVendidas(int cantidadesVendidas) {
        this.cantidadesVendidas = cantidadesVendidas;
    }
}