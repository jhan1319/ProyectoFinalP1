package Logica;

public class Rectangulo extends Prismas {
	
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	
	
	public Rectangulo(double altura, String nombre, double x12, double x22, double x32, double y12, double y22, double y32) {
		super(altura, nombre);
		this.x1 = x12;
		this.x2 = x22;
		this.x3 = x32;
		this.y1 = y12;
		this.y2 = y22;
		this.y3 = y32;
	}


	public double getX1() {
		return x1;
	}


	public void setX1(double x1) {
		this.x1 = x1;
	}


	public double getX2() {
		return x2;
	}


	public void setX2(double x2) {
		this.x2 = x2;
	}


	public double getX3() {
		return x3;
	}


	public void setX3(double x3) {
		this.x3 = x3;
	}


	public double getY1() {
		return y1;
	}


	public void setY1(double y1) {
		this.y1 = y1;
	}


	public double getY2() {
		return y2;
	}


	public void setY2(double y2) {
		this.y2 = y2;
	}


	public double getY3() {
		return y3;
	}


	public void setY3(double y3) {
		this.y3 = y3;
	}


	@Override
	public double perimetro() {
		
		double lado1 = 0;
		double lado2 = 0;
		
		lado1 = Math.abs(x1 - x2);
		
		if (lado1 == 0) {
			
			lado1 = Math.abs(y1 - y2);
			
		}
		
		lado2 = Math.abs(x1 - x3);
		
		if (lado2 == 0) {
			
			lado2 = y1 - y3;
			
		}

		return (2*lado1) + (2*lado2);
	}


	@Override
	public double areaDeLaBase() {
		double lado1 = 0;
		double lado2 = 0;
		
		lado1 = Math.abs(x1 - x2);
		
		if (lado1 == 0) {
			
			lado1 = Math.abs(y1 - y2);
			
		}
		
		lado2 = Math.abs(x1 - x3);
		
		if (lado2 == 0) {
			
			lado2 = y1 - y3;
			
		}
		
		return  (lado1 * lado2);
	}
	
	
	
	

}
