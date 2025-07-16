package personnalManager;

public class Person {
    private String nom;
    private String prenom;
    private int age;

    public Person(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficherInfos(){
        System.out.println("NOM : "+this.nom);
        System.out.println("PRENOM : "+this.prenom);
        System.out.println("AGE : "+this.age);
    }

}
