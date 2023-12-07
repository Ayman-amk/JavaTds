package td3_ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class TestFichier {
    private File fichier;

    public TestFichier() {
        fichier = null;
    }

    public TestFichier(String adresse) {
        fichier = new File(adresse);
    }

    public void modifier(String txt) {
        try {
            FileWriter writer = new FileWriter(fichier, true);
            writer.write(txt);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour afficher le contenu du fichier
    public void afficher() {
        try {
            java.util.Scanner sc = new java.util.Scanner(fichier);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour copier-coller le fichier
    public void copierColler(String adresse) {
        File destination = new File(adresse);
        if (fichier.exists() && destination.isDirectory()) {
            File destinationFile = new File(destination.getAbsolutePath() + "\\" + fichier.getName());
            try {
                java.nio.file.Files.copy(fichier.toPath(), destinationFile.toPath());
                System.out.println("Fichier copié avec succès.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Impossible de copier-coller le fichier.");
        }
    }
}
