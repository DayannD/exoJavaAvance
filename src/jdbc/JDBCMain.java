package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class JDBCMain {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1","root","" );
            System.out.println("Connexion établie avec succès");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");

           /* ClientQueries.readClient(resultSet);*/
            /*Order.showTable();*/

        }catch (SQLException sqle){
            System.out.println("La requête a échoué");
            System.out.println(sqle.getMessage());
        }
    }
}
