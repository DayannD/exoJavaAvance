import java.util.Scanner;

public class Tp7 {
    public static void main(String[] args) {
        Tp7_auth user = new Tp7_auth();
        Scanner scanner = new Scanner(System.in);
        String email;
        String mdp;

        while (user.itsgood == false){
            try{
                System.out.println("Saisir un mail : ");
                email = scanner.nextLine();
                System.out.println("Saisir un mdp : ");
                mdp = scanner.nextLine();
                user.verif(email,mdp);
            }catch (Exception e){
                System.out.print("Oups une erreur est survenue");
            }
        }
        scanner.close();
    }
}
