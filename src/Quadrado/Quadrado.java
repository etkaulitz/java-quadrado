package Quadrado;

public class Quadrado {

	double x1, y1, x2, y2;

	public Quadrado(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public double getArea() {
		double a = Math.pow(x1,2) + Math.pow(y1,2);
		return a;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

}	
	
