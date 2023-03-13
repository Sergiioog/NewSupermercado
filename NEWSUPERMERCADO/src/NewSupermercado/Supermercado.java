package NewSupermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private int stock;
	private static ArrayList<Producto> productos;
	
	
	public Supermercado(String nombre) {
		
		this.nombre = nombre;
		this.productos = productosIniciales();
	}
	
	public ArrayList <Producto> productosIniciales (){
		
		ArrayList <Producto> productos = new ArrayList <Producto>();
		
		productos.add(new Producto("Lomo", 15, Categoria.CARNICERIA));
		productos.add(new Producto("Jamón", 10, Categoria.CARNICERIA));
		productos.add(new Producto("Cordero", 10, Categoria.CARNICERIA));
		productos.add(new Producto("Chorizo", 20, Categoria.CARNICERIA));
		productos.add(new Producto("Salchicha", 30, Categoria.CARNICERIA));

		productos.add(new Producto("Agua", 20, Categoria.BEBIDAS));
		productos.add(new Producto("CocaCola", 10, Categoria.BEBIDAS));
		productos.add(new Producto("Cerveza", 25, Categoria.BEBIDAS));
		productos.add(new Producto("Fanta", 15, Categoria.BEBIDAS));
		productos.add(new Producto("Ron", 10, Categoria.BEBIDAS));
		
		productos.add(new Producto("Manzana", 15, Categoria.FRUTERIA));
		productos.add(new Producto("Platano", 35, Categoria.FRUTERIA));
		productos.add(new Producto("Pina", 20, Categoria.FRUTERIA));
		productos.add(new Producto("Fresa", 31, Categoria.FRUTERIA));
		productos.add(new Producto("Melocoton", 23, Categoria.FRUTERIA));
		
		productos.add(new Producto("Actimel", 20, Categoria.LÁCTEOS));
		productos.add(new Producto("Danonino", 30, Categoria.LÁCTEOS));
		productos.add(new Producto("BiFrutas", 12, Categoria.LÁCTEOS));
		productos.add(new Producto("Danacol", 20, Categoria.LÁCTEOS));
		productos.add(new Producto("Yogurt", 30, Categoria.LÁCTEOS));
		
		productos.add(new Producto("Dorada", 10, Categoria.PESCADERIA));
		productos.add(new Producto("Lubina", 85, Categoria.PESCADERIA));
		productos.add(new Producto("Gambas", 5, Categoria.PESCADERIA));
		productos.add(new Producto("Gambones", 100, Categoria.PESCADERIA));
		productos.add(new Producto("Nécoras", 60, Categoria.PESCADERIA));
		
		productos.add(new Producto("Estropajo", 20, Categoria.HOGAR));
		productos.add(new Producto("Fairy", 30, Categoria.HOGAR));
		productos.add(new Producto("Esponja", 20, Categoria.HOGAR));
		productos.add(new Producto("Balleta", 20, Categoria.HOGAR));
		productos.add(new Producto("Cubiertos", 30, Categoria.HOGAR));
	
		
		return productos;
		
	}
	
	
	
	
	
	public Supermercado(ArrayList<Producto> productos, int stock) {
	
		this.productos = productos;
		this.stock = stock;
	}
	


	public List<Producto> getProductos() {
		
		return productos;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void agregarProducto(Producto producto) {
		
	}
	
	public void eliminarProducto(Producto producto) {
		
	}
	
	public void buscarProducto(String nombreProducto) {
		
	}




	

	
}
