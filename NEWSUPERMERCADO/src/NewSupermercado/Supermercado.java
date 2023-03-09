package NewSupermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private int stock;
	private ArrayList <Producto> productos;
	
	
	public Supermercado(String nombre) {
		
		this.nombre = nombre;
		this.productos = productosIniciales();
	}
	
	public ArrayList <Producto> productosIniciales (){
		
		ArrayList <Producto> productos = new ArrayList <Producto>();
		
		Producto Lomo = new Producto("Lomo", 15, Categoria.CARNICERIA);
		Producto Jamon = new Producto("Jamón", 10, Categoria.CARNICERIA);
		Producto Cordero = new Producto("Cordero", 10, Categoria.CARNICERIA);
		Producto Chorizo = new Producto("Chorizo", 20, Categoria.CARNICERIA);
		Producto Salchicha = new Producto("Salchicha", 30, Categoria.CARNICERIA);

		Producto Agua = new Producto("Agua", 20, Categoria.BEBIDAS);
		Producto CocaCola = new Producto("CocaCola", 10, Categoria.BEBIDAS);
		Producto Cerveza = new Producto("Cerveza", 25, Categoria.BEBIDAS);
		Producto Fanta = new Producto("Fanta", 15, Categoria.BEBIDAS);
		Producto Ron = new Producto("Ron", 10, Categoria.BEBIDAS);
		
		Producto Manzana = new Producto("Manzana", 15, Categoria.FRUTERIA);
		Producto Platano = new Producto("Platano", 35, Categoria.FRUTERIA);
		Producto Pina = new Producto("Pina", 20, Categoria.FRUTERIA);
		Producto Fresa = new Producto("Fresa", 31, Categoria.FRUTERIA);
		Producto Melocoton = new Producto("Melocoton", 23, Categoria.FRUTERIA);
		
		Producto Actimel = new Producto("Actimel", 20, Categoria.LÁCTEOS);
		Producto Danonino = new Producto("Danonino", 30, Categoria.LÁCTEOS);
		Producto BiFrutas = new Producto("BiFrutas", 12, Categoria.LÁCTEOS);
		Producto Danacol = new Producto("Danacol", 20, Categoria.LÁCTEOS);
		Producto Yogurt = new Producto("Yogurt", 30, Categoria.LÁCTEOS);
		
		Producto Dorada = new Producto("Dorada", 10, Categoria.PESCADERIA);
		Producto Percebes = new Producto("Dorada", 85, Categoria.PESCADERIA);
		Producto Lubina = new Producto("Dorada", 5, Categoria.PESCADERIA);
		Producto Langostinos = new Producto("Dorada", 100, Categoria.PESCADERIA);
		Producto Gambones = new Producto("Dorada", 60, Categoria.PESCADERIA);
		
		Producto Estropajo = new Producto("Estropajo", 20, Categoria.HOGAR);
		Producto Fairy = new Producto("Fairy", 30, Categoria.HOGAR);
		Producto Esponja = new Producto("Esponja", 20, Categoria.HOGAR);
		Producto Balleta = new Producto("Balleta", 20, Categoria.HOGAR);
		Producto Cubiertos = new Producto("Cubiertos", 30, Categoria.HOGAR);
		
		productos.add(Lomo);
		productos.add(Jamon);
		productos.add(Cordero);
		productos.add(Chorizo);
		productos.add(Salchicha);
		productos.add(Agua);
		productos.add(CocaCola);
		productos.add(Cerveza);
		productos.add(Fanta);
		productos.add(Ron);
		productos.add(Manzana);
		productos.add(Platano);
		productos.add(Pina);
		productos.add(Fresa);
		productos.add(Melocoton);
		productos.add(Actimel);
		productos.add(Danonino);
		productos.add(BiFrutas);
		productos.add(Danacol);
		productos.add(Yogurt);
		productos.add(Dorada);
		productos.add(Percebes);
		productos.add(Lubina);
		productos.add(Langostinos);
		productos.add(Gambones);
		productos.add(Estropajo);
		productos.add(Fairy);
		productos.add(Esponja);
		productos.add(Balleta);
		productos.add(Cubiertos);
		
		
		return productos;
		
	}
	
	public Supermercado(ArrayList<Producto> productos, int stock) {
	
		this.productos = productos;
		this.stock = stock;
	}
	
	public ArrayList<Producto> getProductos() {
		
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
	
	public void agregarProducto(Producto producto) {
		
	}
	
	public void eliminarProducto(Producto producto) {
		
	}
	
	public void buscarProducto(String nombreProducto) {
		
	}


	

	
}
