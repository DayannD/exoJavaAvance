import java.util.InputMismatchException;
import java.util.Scanner;

public class Tp2 {


    public static void main(String[] args) {
        String nom = null;
        String prenom = null;
        int age = 0;

        Scanner scanner = new Scanner(System.in);

        try{
            while (nom == null || prenom == null){
                System.out.print("Veuillez saisir votre nom :");
                nom = scanner.nextLine();
                System.out.print("Veuillez saisir votre prénom :");
                prenom = scanner.nextLine();
                System.out.print("Veuillez saisir votre âge :");
                age = scanner.nextInt();

                if (nom.length() > 20 || prenom.length() > 20 || isDigits(nom) == true || isDigits(prenom) == true){
                    System.out.println("Votre saisie est incorrect, réessaye");
                    nom = null;
                    prenom = null;
                    continue;
                }
                if (age < 0 || age > 100){
                    System.out.println("Votre saisie est incorrect, réessaye");
                    nom = null;
                    prenom = null;
                    continue;
                }
            }
        }catch (InputMismatchException ime){
            System.out.println("Votre saisie est incorrect, réessaye");
            scanner.nextLine();
        }
        scanner.close();

        Tp2Sentence echo = new Tp2Sentence(nom,prenom,age);

        echo.echo();
    }

    static boolean isDigits(String input){
        String regex = "[0-9, .]+";
        return input.matches(regex);
    }
}


