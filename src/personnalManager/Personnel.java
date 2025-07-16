package personnalManager;

public abstract class Personnel extends Person{
    private String matricule;
    public Personnel(String matricule,String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.matricule = matricule;
    }

    public abstract void afficherRole();
    public abstract void afficherRole(String jeux);
}
