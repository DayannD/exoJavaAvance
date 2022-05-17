import java.util.InputMismatchException;
import java.util.Scanner;

public class Tp6 {
    public static void main(String[] args) {
        /********************                     TP6                              ***********************/
        Integer numMois = null;

        Scanner scanner = new Scanner(System.in);

        while (numMois == null){
            try{
                System.out.print("Veuillez saisir le numéro de votre mois de naissance : ");
                numMois = scanner.nextInt();
                if(numMois <= 0 || numMois > 12){
                    System.out.println("Votre saisie est incorrect, réessaye");
                    numMois = null;
                    continue;
                }
            }catch (InputMismatchException ime){
                System.out.println("Votre saisie est incorrect, réessaye");
                scanner.nextLine();
            }
        }

        scanner.close();

        Tp6Mois birth = new Tp6Mois(numMois);

        birth.select();
    }
}
