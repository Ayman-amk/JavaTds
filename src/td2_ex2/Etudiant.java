package td2_ex2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Etudiant implements Personne {
	private int numSom;
	private String nom;
	private String prenom;
	private Date dat_naiss;
	
	public Etudiant() {
		this.numSom = 1111;
		this.nom = "aaa";
		this.prenom = "bbb";
		this.dat_naiss = new Date();
	}
	
	public Etudiant(int numSom, String nom, String prenom, Date dat_naiss) {
		this.numSom = numSom;
		this.nom = nom;
		this.prenom = prenom;
		this.dat_naiss = dat_naiss;
	}
	
	public int getNumSom() {
		return numSom;
	}
	public void setNumSom(int numSom) {
		this.numSom = numSom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDat_naiss() {
		return dat_naiss;
	}
	public void setDat_naiss(Date dat_naiss) {
		this.dat_naiss = dat_naiss;
	}
	
	@Override
	public int calculerAge() {
        LocalDate dateNaissance = dat_naiss.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate dateActuelle = LocalDate.now();

        int age = dateActuelle.getYear() - dateNaissance.getYear();

        if (dateActuelle.getMonthValue() < dateNaissance.getMonthValue() ||
            (dateActuelle.getMonthValue() == dateNaissance.getMonthValue() &&
             dateActuelle.getDayOfMonth() < dateNaissance.getDayOfMonth())) {
            age--;
        }

        return age;
	}

	@Override
	public void estFrerede(Personne autrePersonne) {
	    if (autrePersonne instanceof Etudiant) {
	        Etudiant autreEtudiant = (Etudiant) autrePersonne;

	        if (this.nom.equals(autreEtudiant.getNom())) {
	            System.out.println("Les étudiants ont le même nom.");
	        } else {
	            System.out.println("Les étudiants n'ont pas le même nom.");
	        }
	    }
	}


}
