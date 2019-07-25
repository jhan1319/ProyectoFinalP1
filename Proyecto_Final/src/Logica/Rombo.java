package Logica;

public class Rombo extends Prismas {
	
	private double x1;
	private double y1;
	private double d1;
	private double d2;
	
	/*
	 * D1 es la chiquita y D2 es la grande
	 */
	
	public Rombo(double altura, String nombre, double x12, double y12, double d12, double d22) {
		super(altura, nombre);
		this.x1 = x12;
		this.y1 = y12;
		this.d1 = d12;
		this.d2 = d22;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}

	public double getD2() {
		return d2;
	}

	public void setD2(double d2) {
		this.d2 = d2;
	}
	
	
	public  double perimetro() {
		
		double ladoD1=0;
		double ladoD2=0;
		double lado=0;
		
			ladoD1=d1/2;
			ladoD2=d2/2;
			lado= (double) Math.sqrt((Math.pow(ladoD1, 2)+ (Math.pow(ladoD2, 2))));
			
		return (4*lado);
		
	}

	@Override
	public double areaDeLaBase() {
		double area=0;
		
		area= ((d1*d2)/2);
		
		return area ;
	}
	
	

}
