package NewSupermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Supermercado {
	
	private String nombre;

	private int precio;
	private static ArrayList<Producto> productos;
	
	
	public Supermercado(String nombre) {
		
		this.nombre = nombre;
		this.productos = productosIniciales();
	}
	
	public ArrayList <Producto> productosIniciales (){
		
		ArrayList <Producto> productos = new ArrayList <Producto>();
		
		
		productos.add(new Producto("Lomo", 8.45, Categoria.CARNICERIA));
		productos.add(new Producto("Jamón", 150, Categoria.CARNICERIA));
		productos.add(new Producto("Cordero", 30, Categoria.CARNICERIA));
		productos.add(new Producto("Chorizo", 10, Categoria.CARNICERIA));
		productos.add(new Producto("Salchicha", 8.5, Categoria.CARNICERIA));

		productos.add(new Producto("Agua", 5.50, Categoria.BEBIDAS));
		productos.add(new Producto("CocaCola", 5.50, Categoria.BEBIDAS));
		productos.add(new Producto("Cerveza", 8, Categoria.BEBIDAS));
		productos.add(new Producto("Fanta", 4.50, Categoria.BEBIDAS));
		productos.add(new Producto("Ron", 14.50, Categoria.BEBIDAS));
		
		productos.add(new Producto("Manzana", 2, Categoria.FRUTERIA));
		productos.add(new Producto("Platano", 3, Categoria.FRUTERIA));
		productos.add(new Producto("Pina", 5, Categoria.FRUTERIA));
		productos.add(new Producto("Fresa", 7, Categoria.FRUTERIA));
		productos.add(new Producto("Melocoton", 4, Categoria.FRUTERIA));
		
		productos.add(new Producto("Actimel", 3.50, Categoria.LÁCTEOS));
		productos.add(new Producto("Danonino", 5.75, Categoria.LÁCTEOS));
		productos.add(new Producto("BiFrutas", 4.50, Categoria.LÁCTEOS));
		productos.add(new Producto("Danacol", 3.50, Categoria.LÁCTEOS));
		productos.add(new Producto("Yogurt", 6.85, Categoria.LÁCTEOS));
		
		productos.add(new Producto("Dorada", 6, Categoria.PESCADERIA));
		productos.add(new Producto("Lubina", 8.50, Categoria.PESCADERIA));
		productos.add(new Producto("Gambas", 12.50, Categoria.PESCADERIA));
		productos.add(new Producto("Gambones", 20.75, Categoria.PESCADERIA));
		productos.add(new Producto("Nécoras", 30, Categoria.PESCADERIA));
		
		productos.add(new Producto("Estropajo", 2.50, Categoria.HOGAR));
		productos.add(new Producto("Fairy", 5, Categoria.HOGAR));
		productos.add(new Producto("Esponja", 2.75, Categoria.HOGAR));
		productos.add(new Producto("Balleta", 4, Categoria.HOGAR));
		productos.add(new Producto("Cubiertos", 10, Categoria.HOGAR));
	
		
		return productos;
		
	}
	
	/*public void agregarProducto(Producto producto) {
		ArrayList <Producto> listaProductos = productosIniciales();
		listaProductos.add(producto);
	}*/
	
	public static void eliminarObjeto(ArrayList<Producto> listaProductos, String alimento) {
	    
		for (int i = 0; i < listaProductos.size(); i++) {
			  if (listaProductos.get(i).getNombre().equals(alimento)) {
		            listaProductos.remove(alimento);
		            System.out.println("Objeto eliminado correctamente");
		        } else {
		            System.out.println("El objeto no se encuentra en la lista");
		        }
		}
        //REVISAR
      
    }
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	
	public Supermercado(ArrayList<Producto> productos, int precio) {
	
		this.productos = productos;
		this.precio=precio;
	}
	


	
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
	
	public void buscarProducto(String nombreProducto) {
		
	}




	

	
}
