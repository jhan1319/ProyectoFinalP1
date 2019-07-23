package Logica;

import java.io.Serializable;

public abstract class Prismas  implements Serializable{

	private static final long serialVersionUID = 1L; ////CREANDO EL FICHERO
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
	////AREA TOTAL = AL + AB
	public abstract double areaDeLaBase();

	
	public  double areaTotal() {
		double area=0;
		area= (2* areaDeLaBase() + areaLateral()); 
		
		return area;
	}



}
