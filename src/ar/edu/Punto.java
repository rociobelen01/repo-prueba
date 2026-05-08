package ar.edu;

public class Punto {
	private float x;
	private float y;
	
	public void setYY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public Punto(float x, float y) {
		super();
		this.setYY(x, y);	}
	
}
