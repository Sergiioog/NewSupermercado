package NewSupermercado;

public class Carrito {
	
	private String productosCarritos;
	private int numeroProductos;
	private double impuestos;
	private String metodoPago;
	private double precioTotal;
	
	
	public Carrito(String productosCarritos, int numeroProductos, double impuestos, String metodoPago, double precioTotal) {

		this.productosCarritos = productosCarritos;
		this.numeroProductos = numeroProductos;
		this.impuestos = impuestos;
		this.metodoPago = metodoPago;
		this.precioTotal = precioTotal;
	}
	
	
	public String getProductosCarritos() {
		return productosCarritos;
	}
	public void setProductosCarritos(String productosCarritos) {
		this.productosCarritos = productosCarritos;
	}
	public int getNumeroProductos() {
		return numeroProductos;
	}
	public void setNumeroProductos(int numeroProductos) {
		this.numeroProductos = numeroProductos;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}


	
	
	
	public void agregarProducto(Producto producto) {
		
	}
	
	public void eliminarProducto(Producto producto) {
		
	}
	
	public double calcularTotal () {
		return precioTotal;	
	}
	
	public double calcularImpuestos() {
		return impuestos;
	}
	
	public void aplicarDescuento(double descuento) {
		
	}
	
	public String cancelar(String operacion) {
		return operacion;
		
	}
	
}
