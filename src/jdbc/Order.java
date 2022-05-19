package jdbc;

import java.util.ArrayList;

public class Order {
    private int id;
    private int clientId;
    private String typePresta;
    private String designation;
    private int nbDays;
    private int unitPrice;
    private byte state;
    private int totalExcludeTaxe;
    private int totalWithTaxe;

    public Order(int id, int clientId, String typePresta, String designation, int nbDays, int unitPrice, byte state, int totalExcludeTaxe, int totalWithTaxe) {
        this.id = id;
        this.clientId = clientId;
        this.typePresta = typePresta;
        this.designation = designation;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
        this.state = state;
        this.totalExcludeTaxe = totalExcludeTaxe;
        this.totalWithTaxe = totalWithTaxe;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public int getNbDays() {
        return nbDays;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public byte getState() {
        return state;
    }

    public int getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public int getTotalWithTaxe() {
        return totalWithTaxe;
    }

    public static void showTable(ArrayList<Order> orders){
        for (Order order:
             orders) {
            System.out.println(order);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", typePresta='" + typePresta + '\'' +
                ", designation='" + designation + '\'' +
                ", nbDays=" + nbDays +
                ", unitPrice=" + unitPrice +
                ", state=" + state +
                ", totalExcludeTaxe=" + totalExcludeTaxe +
                ", totalWithTaxe=" + totalWithTaxe +
                '}';
    }
}
