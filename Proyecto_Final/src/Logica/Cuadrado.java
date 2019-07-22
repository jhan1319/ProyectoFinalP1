package Logica;

public class Cuadrado extends Prismas {
	
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public Cuadrado(double altura, String nombre, double x12, double x22, double y12, double y22) {
		super(altura, nombre);
		this.x1 = x12;
		this.x2 = x22;
		this.y1 = y12;
		this.y2 = y22;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(float x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(float x2) {
		this.x2 = x2;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(float y1) {
		this.y1 = y1;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(float y2) {
		this.y2 = y2;
	}

	public double perimetro() {
		
		double lado = Math.abs(x2 - x1);
		
		if (lado == 0) {
			
			lado = Math.abs(y2-y1);
			
		}
				
		return (double) Math.pow(lado, 2) ;
	}

}
