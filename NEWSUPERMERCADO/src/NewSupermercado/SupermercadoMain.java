package NewSupermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SupermercadoMain {
	
	static Scanner entrada = new Scanner(System.in);
	static Supermercado Javadona = new Supermercado("Javadona");
	static ArrayList <Producto> listaProductos = Javadona.productosIniciales();
	
	
	public static void main(String [] args) {
		menuInicial();
	}
	
	
	public static void menuInicial() {	

		System.out.println("**********MENÚ**********" );												   
		System.out.println("1.Personal de supermercado");
		System.out.println("2.Cliente");
		
		int eleccionTrabajador = entrada.nextInt();
			
			   switch (eleccionTrabajador){									 								   
			   case 1:{
	            	
	            	final String clave = "J4v4d0n4";																
	            	System.out.println("Introduzca su clave: ");						
	            	
	            	for (int i = 1; i <= 3; i++) {
	            																							
	            		String respuestaUsuario = entrada.next();
																													
	            		if(respuestaUsuario.equals(clave)) {												
	            			System.out.println("La clave introducida es correcta.");
	            			menuTrabajador();
	            		} else if( i == 3) {
	            			System.err.println("Contraseña incorrecta, vuelva a empezar.");
	            			menuInicial();
	            		}	            		
	            		else  			
	            			System.err.println("Contraseña incorrecta, vuelve a introducirla.");
					}
	            	break; 																					
	            }
	            case 2:{
	            	menuUsuario();																				
	                break;
	            }
	            default:       
	            	System.err.println("La opción es incorrecta, por favor, escoja de entre las opciones disponibles");  
	                menuInicial();
			   
			   }
	
	}
	
//--------------------------------------------------- SECCIÓN TRABAJADOR ------------------------------------------------------------------
	public static void menuTrabajador() {
		
		System.out.println("Introduce tu elección en el siguiente menú: ");
		System.out.println("**********MENÚ**********");
		System.out.println("1.Mostrar productos del Supermercado por categoría");
		System.out.println("2.Añadir productos");
		System.out.println("3.Eliminar productos");
		System.out.println("4.Modificar productos");
		System.out.println("5.Salir" );
		
		int respuesta = entrada.nextInt();
		
		if (respuesta < 1 || respuesta > 5) {
			System.err.println("Elección incorrecta, volviendo al menú inicial...");
			menuInicial();
		} else
			
			switch (respuesta) {
			case 1: {
				
				menuOpcion1Trabajador();
				break;
			}
			case 2: {
				
				Producto productoUsuario = new Producto();
				
				System.out.println("Nombre del producto: ");
				String productoNombre = entrada.next();
				productoUsuario.setNombre(productoNombre);
				System.out.println("Precio del producto: ");
				int precioProducto = entrada.nextInt();
				productoUsuario.setPrecio(precioProducto);
				System.out.println("Categoría del producto: ");
				String categoriaProducto = entrada.next();
				productoUsuario.setCategoria(Categoria.valueOf(categoriaProducto));
				
				listaProductos.add(productoUsuario);
				
				for (int i = 0; i < listaProductos.size(); i++) {
					System.out.println("Nombre:" + listaProductos.get(i).getNombre() + "\nPrecio:" + listaProductos.get(i).getPrecio() 
							+ "\nCategoria:" + listaProductos.get(i).getCategoria() + "\n");
				}
				
				break;
					}
			case 3: {
				System.out.println("Introduzca el alimento que desea eliminar: ");
				String alimentoEliminar = entrada.next();
				
				Javadona.eliminarObjeto(listaProductos, alimentoEliminar);
				for (int i = 0; i < listaProductos.size(); i++) {
					System.out.println("Nombre:" + listaProductos.get(i).getNombre() + "\nPrecio:" + listaProductos.get(i).getPrecio() 
							+ "\nCategoria:" + listaProductos.get(i).getCategoria() + "\n");
				}
			}
			case 4: {
				
				break;
			}
			case 5: {
				
				break;
			}
			default:
				System.err.println("Elección errónea.");
				menuTrabajador();
			}
	}
	
	public static void menuOpcion1Trabajador() {
		System.out.println("Introduzca la categoría del producto: ");
		System.out.println("1.FRUTERIA");
		System.out.println("2.CARNICERIA");
		System.out.println("3.PESCADERIA");
		System.out.println("4.HOGAR");
		System.out.println("5.BEBIDAS");
		System.out.println("6.LACTEOS");
		
		int eleccion = entrada.nextInt();
		
		
		if (eleccion < 1 || eleccion > 6) {
			System.err.println("Elección incorrecta, volviendo al menú inicial...");
			menuTrabajador();
		} else {
				
	
			switch (eleccion) {
			case 1:
				
				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCategoria().equals(Categoria.FRUTERIA)) {
						System.out.println(listaProductos.get(i).getNombre());
					}	
				}
				break;
			case 2:
				
				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCategoria().equals(Categoria.CARNICERIA)) {
						System.out.println(listaProductos.get(i).getNombre());
					}	
				}	 	
				break;
			case 3:
				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCategoria().equals(Categoria.PESCADERIA)) {
						System.out.println(listaProductos.get(i).getNombre());
					}	
				}
				break;
			case 4:
				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCategoria().equals(Categoria.HOGAR)) {
						System.out.println(listaProductos.get(i).getNombre());
					}	
				}
				break;
			case 5:
				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCategoria().equals(Categoria.BEBIDAS)) {
						System.out.println(listaProductos.get(i).getNombre());
					}	
				}
				break;
			case 6:
				for (int i = 0; i < listaProductos.size(); i++) {
					if (listaProductos.get(i).getCategoria().equals(Categoria.LÁCTEOS)) {
						System.out.println(listaProductos.get(i).getNombre());
					}	
				}
				break;

			default: 
				System.err.println("Opción no válida.");
				break;
			}
		}
	}
	
//----------------------------------------------------- SECCION USUARIO ------------------------------------------------------------------
	public static void menuUsuario() {
		
		System.out.println("**********MENÚ**********");
		System.out.println("1.Añadir productos del supermercado");
		System.out.println("2.Añadir productos al carrito");
		System.out.println("3.Mostrar carrito de la compra ordenado");
		System.out.println("4.Consultar producto del carrito");
		System.out.println("5.Cambiar un producto por otro");
		System.out.println("6.Salir");
		
	}
	

	
	
	
	
	
	


}
