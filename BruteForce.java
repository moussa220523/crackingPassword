public class BruteForce {

    public static void passwordTest2(User user) {
        String chaine;
        String[] characters = {"q", "w", "e", "r", "t", "y", "u",
                "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m","0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        niveau0:{
                for (int i1 = 0; i1 < characters.length; i1++) {
                        chaine=characters[i1];
                            if(user.authentificate(chaine)){
                                System.out.println("mot de passe trouvé");
                                break niveau0;}                                     

                    else{            
                        for(int i2=0;i2<characters.length;i2++){
                            chaine=characters[i1]+characters[i2];
                                if(user.authentificate(chaine)){  
                                    System.out.println("mot de passe trouvé");
                                    break niveau0;}                      

                                else{           
                                    for(int i3 =0;i3<characters.length;i3++){
                                        chaine=characters[i1]+characters[i2]+characters[i3];
                                            if(user.authentificate(chaine)){                                      
                                                System.out.println("mot de passe trouvé");
                                                break niveau0;}
                                                                                      
                                            else{           
                                                for(int i4=0;i4<characters.length;i4++){
                                                    chaine=characters[i1]+characters[i2]+characters[i3]+characters[i4];
                                                    if(user.authentificate(chaine)){                                                   
                                                        System.out.println("mot de passe trouvé");
                                                        break niveau0;}                                                       

                                                        else{           
                                                            for(int i5=0;i5<characters.length;i5++){
                                                                chaine=characters[i1]+characters[i2]+characters[i3]+characters[i4]+characters[i5];
                                                                if(user.authentificate(chaine)){
                                                                    System.out.println("mot de passe trouvé");
                                                                    break niveau0;}                                                                                                                                                                                                                                        

                                                                    else{           
                                                                        for(int i6=0;i6<characters.length;i6++){
                                                                            chaine=characters[i1]+characters[i2]+characters[i3]+characters[i4]+characters[i5]+characters[i6];
                                                                            if(user.authentificate(chaine)){
                                                                                System.out.println("mot de passe trouvé");
                                                                                break niveau0;}
                                                                                                                                                             
                                                                            }                  
                                                                        }   
                                                                }
                                                            }  
                                                }
                                            }  
                                    }              
                                }  
                            }
                        
                    }
                }
            System.out.println("mot de passe non trouvé");   
            

        }
    }
}