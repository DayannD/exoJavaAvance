import java.util.InputMismatchException;
import java.util.Scanner;

public class Tp7_auth {

    private String mail = "dayanndeshayes@gmail.com";
    private String mdp = "bonjour97";
    int num = 5;
    private byte numIte = 5;
    boolean itsgood = false;

    public Tp7_auth(){

    }

    public boolean verif(String mail,String mdp) throws Exception {
        try{
            if (numIte > 0){
                if (mail.equals(this.mail) && mdp.equals(this.mdp)){
                    System.out.println("Bievenue dans votre espace client");
                    itsgood = true;
                    return itsgood;
                }
            }
            if (numIte == 1){
                System.out.printf("Vous avez saisi des mauvais identifiants %d fois, votre compte est bloqué !",num);
                System.exit (0);
            }
            tenta();
            System.out.printf("Identifiants incorrect, réessayer. il vous reste %d essais",numIte);
        }catch (Exception e){
            System.out.println("Oups une erreur est survenue");
        }
        return itsgood;
    }

    public int tenta(){
        numIte--;
        return numIte;
    }
}
