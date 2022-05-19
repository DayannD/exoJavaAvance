package ExoTp;

import java.util.ArrayList;

public class Users {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;


    public Users(String id, String nom,String prenom, String email, String mdp) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    private String getEmail() {
        return email;
    }

    private String getMdp() {
        return mdp;
    }

    public static Users  verifConnect(ArrayList<Users> user, String email, String mdp){
        for (Users users: user
        ) {
            if (users.getEmail().equals(email) && users.getMdp().equals(mdp)){
                return users;
            }
        }
        return null;
    }

}
