package NewSupermercado;

public class Cliente {
	
	private String nombre;
	private String email;
	private int telefono;
	private String genero;
	private String comprasRealizadas;
	private int numeroCompras;
	
	
	public Cliente(String nombre, String email, int telefono, String genero, String comprasRealizadas, int numeroCompras) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.genero = genero;
		this.comprasRealizadas = comprasRealizadas;
		this.numeroCompras = numeroCompras;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getComprasRealizadas() {
		return comprasRealizadas;
	}
	public void setComprasRealizadas(String comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}
	
	public int getNumeroCompras() {
		return numeroCompras;
	}

	public void setNumeroCompras(int numeroCompras) {
		this.numeroCompras = numeroCompras;
	}

	public String saberCompras() {
		return comprasRealizadas;
	}
	public int numeroCompras() {
		return numeroCompras;
		
	}
}
