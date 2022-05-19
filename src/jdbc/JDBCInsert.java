package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCInsert {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("Connexion établie avec succès");

            ClientQueries.readClient(connection);//je fait appel a ma méthode readClient en lui passant la connection
            ClientQueries.findClientById(connection);
            ClientQueries.deleteClient(connection);
/*            ClientQueries.updateClient(connection);*/


        }catch (SQLException sqle){
            System.out.println("La requête a échoué");
            System.out.println(sqle.getMessage());
        }

    }
}
