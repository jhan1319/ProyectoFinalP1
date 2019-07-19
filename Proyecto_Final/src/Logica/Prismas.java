package Logica;

public abstract class Prismas {
	
	protected float altura;
	protected String nombre;
	
	
	public Prismas(float altura, String nombre) {
		super();
		this.altura = altura;
		this.nombre = nombre;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract float areaLateral();
	
	

}
