import javax.print.DocFlavor.STRING;
import java.util.*;

public class TestProg {        
    public static void main(String[] args) {
        Craking cracker = null;
        User user1;
        String pass = "";
        
        System.out.print("taper 1 pour dictionnaire et 2 pour brute force:   ");
        Scanner reponse = new Scanner(System.in);
        int rep = reponse.nextInt();
        

        if (rep == 1) {
            cracker = FactoryCraking.getInstance("dico");
            reponse.nextLine();
            System.out.print("Entrez le mot de passe: ");
            pass = reponse.nextLine();
        }
        else if(rep == 2) {
            cracker = FactoryCraking.getInstance("brutForce");
            reponse.nextLine();
            do{
                System.out.print("Entrez le mot de passe(entre 1 et 6 cqrqcteres): ");
                pass = reponse.nextLine();
            }while(pass.length() > 6);     
        }
        else{
            System.out.println("erreur de saisi");
        }
        user1 = new User(pass);
        cracker.passwordTest(user1);
    }
        
}

