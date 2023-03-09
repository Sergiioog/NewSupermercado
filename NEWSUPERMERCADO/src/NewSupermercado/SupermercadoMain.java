package NewSupermercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SupermercadoMain {
	
	static Scanner entrada = new Scanner(System.in);
	static Supermercado Javadona = new Supermercado("Javadona");
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
	
	
	public static void menuTrabajador() {
		
		System.out.println("Introduce tu elección en el siguiente menú: ");
		System.out.println("**********MENÚ**********");
		System.out.println("1.Mostrar productos del Supermercado");
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
						
				break;
					}
			case 3: {
				
				break;
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
	
	public static void menuUsuario() {
		
		System.out.println("**********MENÚ**********");
		System.out.println("1.Añadir productos del supermercado");
		System.out.println("2.Añadir productos al carrito");
		System.out.println("3.Mostrar carrito de la compra ordenado");
		System.out.println("4.Consultar producto del carrito");
		System.out.println("5.Cambiar un producto por otro");
		System.out.println("6.Salir");
		
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
		
		
		if (eleccion < 1 || eleccion > 5) {
			System.err.println("Elección incorrecta, volviendo al menú inicial...");
			menuTrabajador();
		} else {
				
			switch (eleccion) {
			case 1:
				Javadona.getProductos();
				//BUSCAR COMO MOSTRAR LOS PRODUCTOS DE LAS LISTA
				break;
			case 2:
						 
						
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;

			default:
				break;
			}
		}
	}
	public static void main(String [] args) {

		
		menuInicial();
		

	}

}
