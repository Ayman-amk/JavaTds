package td3_ex1;

public class Main {
    public static void main(String[] args) {
        GestionFichier gestionFichier = new GestionFichier();

        gestionFichier.creeFichier("test.txt");

        gestionFichier.creeDossier("test_folder");

        gestionFichier.list();

        gestionFichier.supprimer("test.txt");

        gestionFichier.supprimer("test_folder");
    }
}
