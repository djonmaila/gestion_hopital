import personnalManager.Infirmier;
import personnalManager.Medecin;
import personnalManager.Patient;
import personnalManager.Personnel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Patient[] listPatient = {
                new Patient("P123","Grippe","Jean","Dupont",40),
                new Patient("P124","Diabète","Alice","Martin",40)
        };
        Personnel[] listPersonnel = {
                new Medecin("Cardiologie","AZ12","Dr. Paul","Bernard",30),
                new Infirmier("Réanimation","QS12","Dr Julie","Morel",13)
        };

        for (Patient p :listPatient){
            p.afficherInfos();
        }

        for (Personnel p :listPersonnel){
            p.afficherRole();
        }
    }
}