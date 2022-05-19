package ExoTp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prenom;
        String nom;
        String email = null;
        String mdp = null;
        String id;
        int j = 0;
        boolean bool;

        ArrayList<Users> user = new ArrayList<>();
        user.add(new Users(UUID.randomUUID().toString(), "deshayes", "dayann", "dayann@gmail.fr", "azerty"));
        user.add(new Users(UUID.randomUUID().toString(), "shqh", "dqfjhqdnn", "ykyufh,x@sdgh.fr", "ugsjljkrkls"));
        user.add(new Users(UUID.randomUUID().toString(), "rdwfhd", "dhhhnsf", "uimggjl@dsg.fr", "sffhnffn"));
        user.add(new Users(UUID.randomUUID().toString(), "kkjgfjsj", "jsjyfdgj", "dslgfjlg@sdgh.fr", "lkehsklest"));
        user.add(new Users(UUID.randomUUID().toString(), "ultletlu", "sjsjypsj", "dslgjklg@sdgh.fr", "lkeehklest"));

        int i;
        for(i=0;i<5;i++){
            id = id= UUID.randomUUID().toString();

            System.out.print("Votre nom : ");
            nom = scanner.nextLine();

            System.out.print("Votre prenom : ");
            prenom = scanner.nextLine();

            System.out.print("Votre email : ");
            email = scanner.nextLine();

            System.out.print("Votre mdp : ");
            mdp = scanner.nextLine();

            user.add(new ExoTp.Users(id,nom,prenom,email,mdp));
        }
        System.out.println("Voulez vous rentrer un nouveaux user ? ");
        String response = scanner.nextLine();

        if (response.equals("oui")){
            id = id= UUID.randomUUID().toString();

            System.out.print("Votre nom : ");
            nom = scanner.nextLine();

            System.out.print("Votre prenom : ");
            prenom = scanner.nextLine();

            System.out.print("Votre email : ");
            email = scanner.nextLine();

            System.out.print("Votre mdp : ");
            mdp = scanner.nextLine();

            user.add(new Users(id,nom,prenom,email,mdp));
        }
        System.out.println("Vous êtes sur le point de vous identifier");

        do {
            try {
                System.out.println("Saisir un mail : ");
                email = scanner.nextLine();
                while (UseOfVal.isEmail(email)){
                    System.out.println("L'email est incorrect, réecriver le :");
                    email = scanner.nextLine();
                }
                System.out.println("Saisir un mdp : ");
                mdp = scanner.nextLine();
                while (UseOfVal.isLength(mdp)){
                    System.out.println("Le mot de passe doit contenir entre 8 et 20 caractère, reecriver le :");
                    mdp = scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.print("Oups une erreur est survenue");
            }
            j++;
            if (j == 3) {
                System.out.printf("Vous avez saisie %d fois des identifiants incorrect votre compte est bloqué",j);
                break;
            }
            if (Users.verifConnect(user, email, mdp) == null)
            {
                System.out.println("Mail ou mot de passe erroné, réessayer");
            } else if (Users.verifConnect(user, email, mdp) != null) {
                System.out.println("Bienvenu Mr,Mme "+ Users.verifConnect(user, email, mdp).getNom()+ " " + Users.verifConnect(user, email, mdp).getPrenom());
            }
        } while (Users.verifConnect(user, email, mdp) == null);
        scanner.close();
    }
}
