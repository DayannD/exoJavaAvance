package ExoTp;

public class Tp2Sentence {
    String nom = null;
    String prenom = null;
    int age;

    public Tp2Sentence(String nom,String prenom,int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void echo(){
        System.out.println(String.format("Vous vous appelez %s %s et vous avez %d ans",nom,prenom,age));
    }
}
