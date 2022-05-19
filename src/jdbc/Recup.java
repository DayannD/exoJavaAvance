package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Recup {
    public static ArrayList<Order> recupOrder(ResultSet resultSet) throws SQLException {
        ArrayList<Order> orders = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int clientId = resultSet.getInt("clientId");
                String typePresta = resultSet.getString("typePresta");
                String designation = resultSet.getString("designation");
                int nombreJours = resultSet.getInt("nbDays");
                int prixUnitaire = resultSet.getInt("unitPrice");
                byte state = resultSet.getByte("state");
                int totalExcludeTaxe = resultSet.getInt("totalExcludeTaxe");
                int totalWithTaxe = resultSet.getInt("totalWithTaxe");

                orders.add(new Order(id,clientId,typePresta,designation,nombreJours,prixUnitaire,state,totalExcludeTaxe,totalWithTaxe));
            }
        return orders;
    }
}
