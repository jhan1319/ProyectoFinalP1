package Logica;

public class Rectangulo extends Prismas {
	
	private float x1;
	private float x2;
	private float x3;
	private float y1;
	private float y2;
	private float y3;
	
	
	public Rectangulo(float altura, String nombre, float x1, float x2, float x3, float y1, float y2, float y3) {
		super(altura, nombre);
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}


	public float getX1() {
		return x1;
	}


	public void setX1(float x1) {
		this.x1 = x1;
	}


	public float getX2() {
		return x2;
	}


	public void setX2(float x2) {
		this.x2 = x2;
	}


	public float getX3() {
		return x3;
	}


	public void setX3(float x3) {
		this.x3 = x3;
	}


	public float getY1() {
		return y1;
	}


	public void setY1(float y1) {
		this.y1 = y1;
	}


	public float getY2() {
		return y2;
	}


	public void setY2(float y2) {
		this.y2 = y2;
	}


	public float getY3() {
		return y3;
	}


	public void setY3(float y3) {
		this.y3 = y3;
	}


	@Override
	public double perimetro() {
		
		float lado1 = 0;
		float lado2 = 0;
		
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
	
	
	
	

}
