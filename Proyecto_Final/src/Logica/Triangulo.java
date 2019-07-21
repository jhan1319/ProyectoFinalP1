package Logica;

public class Triangulo extends Prismas {
	
	private float x1;
	private float x2;
	private float x3;
	private float y1;
	private float y2;
	private float y3;
	
	public Triangulo(float altura, String nombre, float x1, float x2, float x3, float y1, float y2, float y3) {
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
	public float perimetro() {
		
		
		
		
		
		float lado1 = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		float lado2 = (float) Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		
		float lado3 = (float) Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		
		return lado1 + lado2 + lado3;
	}
	
	
	

}
