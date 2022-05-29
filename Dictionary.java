import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class Dictionary {


    public static void passwordTest( User user) {
        int vu=0;

        try {
            File myObj = new File("list_pw.txt");
            Scanner myReader = new Scanner(myObj);             
            while (myReader.hasNextLine()) {
                String pw = myReader.nextLine();
                if(user.authentificate(pw))
                 System.out.println("mot de passe trouvé");
                 vu=1;               
                }

                myReader.close();
            } 

            catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }  
            if(vu==0)         
     System.out.println("mot de passe non trouvé");
    }
}
