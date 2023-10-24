package td2_ex1;

public class Rectangle extends Forme {

	private double largeur;
	private double longeur;
	
	public Rectangle() {
		super();
		this.largeur = 0;
		this.longeur = 0;
	}

	public Rectangle(double x, double y, double largeur, double longeur) {
		super(x, y);
		this.largeur = largeur;
		this.longeur = longeur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public double surface() {
		
		return largeur * longeur;
	}

	public double perimeter() {
		return (largeur + longeur) * 2;
	}

	public String toString() {
		return "Rectangle [largeur = " + largeur + ", longeur = " + longeur + ", surface = " + surface() + ", perimeter() = "
				+ perimeter() + "]";
	}
	
	

}
