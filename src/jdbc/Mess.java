package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mess {
    public static int whoDelete(Connection connection){
        Scanner scanner = new Scanner(System.in);
        try {
            ArrayList<Client> clients = ClientQueries.readClient(connection);//je recupère tout mes client pour afficher leurs nom au user
            System.out.println("Qui voulez vous supprimer ? ");
            for (Client client:
                    clients) {
                System.out.printf("%s ,",client.getFirstName());
            }
            String name = scanner.nextLine();//le client choisis qui supprimer en réecrivant le nom du client
            scanner.close();

            for (Client client:
                    clients) {
                if (client.getFirstName().equals(name)){//quand le nom equal a un client je renvoie l'id a la methode deleteClient dans clientQueries
                    return client.getId();
                }
            }

            System.out.println("Votre saisie est erroné");// sinon je lui dit qu'il a mit un mauvaise saisie
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());;
        }

        return 0;
    }

    public static void clientFound(Client client){
        System.out.println(client.toString());
    }

    public static int giveIdClient(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donner l'identifiant du client à trouver ? ");
        Integer id = scanner.nextInt();
        if (id != null){
            return id;
        }
        return 0;
    }

    public static void noClientWithId(){
        System.out.println("Il n'y a pas de client avec cet id");
    }
}
