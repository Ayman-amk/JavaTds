package td2_ex2;

public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1111, "Alice", "Smith", null);
        Etudiant etudiant2 = new Etudiant(2222, "Bob", "Johnson", null);

        int age1 = etudiant1.calculerAge();
        int age2 = etudiant2.calculerAge();

        System.out.println("Âge d'étudiant 1 : " + age1 + " ans");
        System.out.println("Âge d'étudiant 2 : " + age2 + " ans");

        etudiant1.estFrerede(etudiant2); 
    }
}
