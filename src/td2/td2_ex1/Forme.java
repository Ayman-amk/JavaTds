package td2_ex1;

public abstract class Forme {
	private double x;
	private double y;
	
	public Forme(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Forme() {
		x = 0.0;
		y = 0.0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void deplacer(double nx, double ny) {
		this.x = nx;
		this.y = ny;
	}
	
	public abstract double surface();
	
	public abstract double perimeter();
	
	
	
}
