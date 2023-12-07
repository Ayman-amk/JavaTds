package td2_ex1;

public class Cercle extends Forme {

	private double rayon;

	public Cercle() {
		super();
		rayon = 0.0;
	}

	public Cercle(double x, double y, double rayon) {
		super(x, y);
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double surface() {

		return rayon * rayon * Math.PI;
	}

	@Override
	public double perimeter() {
		
		return 2 * rayon * Math.PI;
	}

	public String toString() {
		return "Cercle [rayon = " + rayon + ", surface = " + surface() + ", perimeter = " + perimeter() + "]";
	}

	
	
	
	
}
