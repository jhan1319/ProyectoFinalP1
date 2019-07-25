package Logica;

public class Trapecio extends Prismas {
	
	private double x1;
	private double x2;
	private double x3;
	private double x4;
	private double y1;
	private double y2;
	private double y3;
	private double y4;
	
	public Trapecio(double altura, String nombre, double x12, double x22, double x32, double x42, double y12, double y22, double y32,
			double y42) {
		super(altura, nombre);
		this.x1 = x12;
		this.x2 = x22;
		this.x3 = x32;
		this.x4 = x42;
		this.y1 = y12;
		this.y2 = y22;
		this.y3 = y32;
		this.y4 = y42;
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

	public double getX4() {
		return x4;
	}

	public void setX4(double x4) {
		this.x4 = x4;
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

	public double getY4() {
		return y4;
	}

	public void setY4(double y4) {
		this.y4 = y4;
	}

	@Override
	public double perimetro() {

		double lado1=0;
		double lado2=0;
		double lado3=0;
		double lado4=0;
		
		////PARA Y2=Y3 ^ Y1=Y4/////
		lado1 = Math.sqrt( (Math.pow(x2-x1, 2)) + (Math.pow(y2-y1,2)) );
		lado2=x3-x2;
		lado3= Math.sqrt( (Math.pow(x4-x3, 2)) + (Math.pow(y4-y3, 2)) );
		lado4=x4-x1 ;
		
		return (lado1 + lado2 + lado3 + lado4);
	}

	@Override
	public double areaDeLaBase() {

		double lado1=0;
		double lado2=0;
		double lado3=0;
		double lado4=0;
		double area=0;
		double altu =0;

					////PARA Y2=Y3 ^ Y1=Y4/////
		lado2=x3-x2;
		lado4=x4-x1 ;
		altu= y2 -y1;
		area = ((lado4 + lado2 ) * altu) /2 ;
		
		return area;
	}
	
	
	

}
