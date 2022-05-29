import javax.print.DocFlavor.STRING;
import java.util.*;

public class TestProg {        

    public static void main(String[] args) {

        User user1 = new User("qwerty");
        
        System.out.println("taper 1 pour dictionnaire et 2 pour brute force");
        Scanner reponse = new Scanner(System.in);
        int rep = reponse.nextInt();
        

        if (rep == 1) {
            Dictionary.passwordTest(user1);
        }


        else if(rep == 2) {
            BruteForce.passwordTest2(user1);        
        }
        else
        System.out.println("erreur de saisi");        
    }
        
}

