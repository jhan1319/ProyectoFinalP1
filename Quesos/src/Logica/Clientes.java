package Logica;

public class Clientes {
	
	private String nombre;
	private String direccion;
	private String telefono;
	private String id;
	private float credito;
	


	public Clientes(String nombre, String direccion, String telefono, String id, float credito) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.id = id;
		this.credito = credito;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public float getCredito() {
		return credito;
	}



	public void setCredito(float credito) {
		this.credito = credito;
	}

	
	
	
	

}
