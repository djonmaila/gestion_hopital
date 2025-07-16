package personnalManager;

public class Infirmier extends Personnel{
    private String service;
    public Infirmier(String service,String matricule,String nom, String prenom, int age){
        super(matricule,nom,prenom,age);
        this.service = service;
    }

    @Override
    public void afficherRole(){
        super.afficherInfos();
        System.out.println("je suis infirmier dans le service "+this.service);
        System.out.println("------------------------------------------------------");
    }

    public void afficherRole(String jeux){
        super.afficherInfos();
        System.out.println("je suis spécialisé en "+this.service);
        System.out.println("jeux : "+jeux);
        System.out.println("-----------------------------------------------------");
    }
}
