package personnalManager;

public class Patient extends Person{
    private String numeroDossier;
    private String maladie;

    public Patient(String numeroDossier,String maladie,String nom, String prenom, int age){
        super(nom,prenom,age);
        this.numeroDossier = numeroDossier;
        this.maladie = maladie;
    }

    @Override
    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("N° DOSSIER : "+this.numeroDossier);
        System.out.println("MALADIE : "+this.maladie);
        System.out.println("------------------------------------------------------");
    }
}
