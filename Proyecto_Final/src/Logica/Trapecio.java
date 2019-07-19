package Logica;

public class Trapecio extends Prismas {
	
	private float x1;
	private float x2;
	private float x3;
	private float x4;
	private float y1;
	private float y2;
	private float y3;
	private float y4;
	
	public Trapecio(float altura, String nombre, float x1, float x2, float x3, float x4, float y1, float y2, float y3,
			float y4) {
		super(altura, nombre);
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
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

	public float getX4() {
		return x4;
	}

	public void setX4(float x4) {
		this.x4 = x4;
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

	public float getY4() {
		return y4;
	}

	public void setY4(float y4) {
		this.y4 = y4;
	}
	
	
	

}
