public class FactoryCraking{
    public static Craking getInstance(Strinting method){
        Craking cracker = null;

        if(method.equalsIgnoreCase("brutForce")){
            cracker = new BruteForce();
        }
        else if(method.equalsIgnoreCase("dico")){
            cracker = new Dictionary();
        }

        return cracker;
    }
}