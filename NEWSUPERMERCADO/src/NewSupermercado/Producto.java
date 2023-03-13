package NewSupermercado;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	private double precio;
	private Categoria Categoria;
	
	
	
	public Producto(String nombre, double precio, NewSupermercado.Categoria categoria) {

		this.nombre = nombre;
		this.precio = precio;
		Categoria = categoria;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList <Producto>  productosIniciales() {
		return null;
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return Categoria;
	}

	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	
	
	
}
