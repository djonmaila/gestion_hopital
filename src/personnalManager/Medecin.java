package personnalManager;

public class Medecin extends Personnel{
    private String specialite;
    public Medecin(String specialite,String matricule,String nom, String prenom, int age){
        super(matricule,nom,prenom,age);
        this.specialite = specialite;
    }

    @Override
    public void afficherRole(){
        super.afficherInfos();
        System.out.println("je suis spécialisé en "+this.specialite);
        System.out.println("-----------------------------------------------------");
    }
    @Override
    public void afficherRole(String jeux){
        super.afficherInfos();
        System.out.println("je suis spécialisé en "+this.specialite);
        System.out.println("jeux : "+jeux);
        System.out.println("-----------------------------------------------------");
    }

}
