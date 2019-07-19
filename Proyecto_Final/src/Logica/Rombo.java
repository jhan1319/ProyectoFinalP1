package Logica;

public class Rombo extends Prismas {
	
	private float x1;
	private float y1;
	private float d1;
	private float d2;
	
	/*
	 * D1 es la chiquita y D2 es la grande
	 */
	
	public Rombo(float altura, String nombre, float x1, float y1, float d1, float d2) {
		super(altura, nombre);
		this.x1 = x1;
		this.y1 = y1;
		this.d1 = d1;
		this.d2 = d2;
	}

	public float getX1() {
		return x1;
	}

	public void setX1(float x1) {
		this.x1 = x1;
	}

	public float getY1() {
		return y1;
	}

	public void setY1(float y1) {
		this.y1 = y1;
	}

	public float getD1() {
		return d1;
	}

	public void setD1(float d1) {
		this.d1 = d1;
	}

	public float getD2() {
		return d2;
	}

	public void setD2(float d2) {
		this.d2 = d2;
	}
	
	
	
	
	

}
