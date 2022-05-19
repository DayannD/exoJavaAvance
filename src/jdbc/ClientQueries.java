package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class ClientQueries {
    public static ArrayList<Client> readClient(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();//Je crée mon statement pour crée ma requet
        ResultSet resultSet = statement.executeQuery("SELECT * FROM clients ");
        var clients = new ArrayList<Client>();//j'instancie mon ArrayList pour récuperer mes clients

        while (resultSet.next()) {//tant qu'il y'a des infos
            Client client = new Client(
                    resultSet.getInt("id"),
                    resultSet.getString("companyName"),
                    resultSet.getString("firstName"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("address"),
                    resultSet.getString("zipCode"),
                    resultSet.getString("city"),
                    resultSet.getByte("state"));

            clients.add(client);//je récuper les infos et ajoute dans mon ArrayList
        }
        return clients;//Je retourne mon client
    }

    public static void findClientById(Connection connection) throws SQLException {
        Client client = null;
        int id = Mess.giveIdClient();//Je fait appel a ma méthode dans ma class Mess qui va me renvoie id choisis par le user

        PreparedStatement statement=connection.prepareStatement("SELECT * FROM clients WHERE `id` = ?" );//Je crée ma requete
        statement.setInt(1,id);//J'affect mon ? dans ma requête par l'id que le user a rentre (on fait comme sa pour la sécurité)
        ResultSet resultSet = statement.executeQuery();//j'execute ma requête et je la recup grace a resultset

        while (resultSet.next()){
            int idClient = resultSet.getInt("id");
            String companyName = resultSet.getString("companyName");
            String firstName = resultSet.getString("firstName");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");
            String zipCode = resultSet.getString("zipCode");
            String city = resultSet.getString("city");
            byte state = resultSet.getByte("state");

            client = new Client(idClient, companyName, firstName, email, phone, address, zipCode, city, state);
        }//Je récupere les infos en créant un objet client

        if (client != null){//si la requet a trouver un client et different de null
            Mess.clientFound(client);//je fait appelle a ma méthode qui va afficher le client avec un toString
            return;
        }
        Mess.noClientWithId();//si il rentre pas dans le if, il a rien trouver donc j'affiche au user qu'il y a rien
    }

    public static void deleteClient(Connection connection) throws SQLException {
        int id = Mess.whoDelete(connection);//j'appelle ma méthode qui me renvoie l'id du client que l'utilisateur veut delete
        PreparedStatement statement=connection.prepareStatement("DELETE FROM clients WHERE `id` = ?" );//Je crée ma requête
        statement.setInt(1,id);
        statement.executeUpdate();//j'execute ma requêtes
    }

    public static void updateClient(Client client,Connection connection) throws SQLException{

        PreparedStatement statement=connection.prepareStatement("UPDATE clients SET" +
                " companyName= ?, `firstName`= ?,`email`= ?," +
                "`phone`= ?,`address`= ?,`zipCode`= ?," +
                "`city`= ?,`state`= ? WHERE `id` = ?" );
            statement.setString(1,client.getCompanyName());
            statement.setString(2,client.getFirstName());
            statement.setString(3,client.getEmail());
            statement.setString(4,client.getPhone());
            statement.setString(5,client.getAddress());
            statement.setString(6,client.getZipCode());
            statement.setString(7,client.getCity());
            statement.setByte(8,client.getState());
            statement.setInt(9,client.getId());

        statement.executeQuery();

    }

}

