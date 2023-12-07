package td2_ex1;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
//On ne peut pas instancier la class forme car elle est abstraite
		//Forme forme1 = new Forme();
		System.out.println("On ne peut pas instancier la class forme car elle est abstraite");
		System.out.println("___________________________________");
		
		Cercle cercle1 = new Cercle(5.0, 4.0, 3.5);
		
		cercle1.setRayon(10.0);
		System.out.println(cercle1.toString());
		
		Rectangle rectangle1 = new Rectangle(5.0, 4.0, 7.0, 8.0);
		
		rectangle1.setLargeur(9);
		rectangle1.setLongeur(8);
		rectangle1.deplacer(2.5, 3.5);
		System.out.println(rectangle1.toString());
		
//		System.out.println("===================================");	
//		System.out.println("cercle1 = rectangle1 \n impossible de convertir de Rectangle en Cercle.");
//		System.out.println("----------------------");
//		System.out.println("rectangle1 = cercle1 \n impossible de convertir de Rectangle en Rectangle.");
//		System.out.println("----------------------");
//		System.out.println("rectangle1 = forme1 \n Impossible de convertir de Forme en Rectangle, on doit ajouter une conversion (cast) vers Forme.");
//		System.out.println("----------------------");
//		System.out.println("cercle1 = forme1 \n Impossible de convertir de Forme en Cercle, on doit ajouter une conversion (cast) vers Cercle.");
//		System.out.println("----------------------");
//		System.out.println("pour form1 recoit cercle ou bien rectangle c'est correct !!");
		
		// ---- Exercice J  ----
		Cercle cercle2 = new Cercle(2.0, 2.0, 6);
		Rectangle rectangle2 = new Rectangle(7.0, 8.0, 2.0, 5.0);
		
		ArrayList<Forme> formes = new ArrayList<>();
		formes.add(cercle1);
        formes.add(cercle2);
        formes.add(rectangle1);
        formes.add(rectangle2);
        
        
		// ---- Exercice K  ----
        for (Forme forme : formes) {
            System.out.println("Surface de la forme : " + forme.surface());
        }
	}

}
