package td3_ex1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

class GestionFichier {
    private String adress;

    public GestionFichier() {
        this.adress = "C:\\Users\\huawei\\OneDrive\\Desktop\\Study Folder\\Cycle d'ingénieur FSTE\\Semstre 3\\2023 - 2024\\Programmation Java\\Source Codes TPs\\TPS\\src\\td3_ex1";
    }

    public GestionFichier(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void creeFichier(String nomFichier) {
        File file = new File(adress + "\\" + nomFichier);
        try {
            if (file.createNewFile())
                System.out.println("Fichier créé : " + file.getName());
            else
                System.out.println("Impossible de créer le fichier, il existe déjà.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void creeDossier(String nomDossier) {
        File directory = new File(adress + "\\" + nomDossier);
        if (directory.mkdir()) 
            System.out.println("Dossier créé : " + directory.getName());
        else
            System.out.println("Impossible de créer le dossier, il existe déjà.");
    }

    public void supprimer(String nom) {
        File fileOrDirectory = new File(adress + "\\" + nom);
        if (fileOrDirectory.exists()) {
            if (fileOrDirectory.isFile()) {
                if (fileOrDirectory.delete())
                    System.out.println("Fichier supprimé : " + nom);
                else
                    System.out.println("Impossible de supprimer le fichier.");
            } else if (fileOrDirectory.isDirectory()) {
                if (fileOrDirectory.delete())
                    System.out.println("Dossier supprimé : " + nom);
                else
                    System.out.println("Impossible de supprimer le dossier.");
            }
        } else {
            System.out.println("Le fichier ou dossier n'existe pas.");
        }
    }

    public void list() {
        File directory = new File(adress);
        if (directory.exists()) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("NOM\tTYPE\tDATE_MODIFICATION\tTAILLE");
                for (File file : files) {
                    String type = file.isDirectory() ? "dossier" : "fichier";
                    Date lastModified = new Date(file.lastModified());
                    long size = file.length();
                    System.out.println(file.getName() + "\t" + type + "\t" + lastModified + "\t" + size);
                }
            }
        } else {
            System.out.println("Impossible, l'adresse est un fichier, pas un dossier.");
        }
        }
    }
}
