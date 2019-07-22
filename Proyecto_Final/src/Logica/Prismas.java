package Logica;

public abstract class Prismas {
	
	protected double altura;
	protected String nombre;
	
	
	public Prismas(double altura2, String nombre) {
		super();
		this.altura = altura2;
		this.nombre = nombre;
	}


	public double getAltura() {
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
	
	public  double areaLateral() {
		
		return  altura * perimetro();
	}
	
	public abstract double perimetro();

}
