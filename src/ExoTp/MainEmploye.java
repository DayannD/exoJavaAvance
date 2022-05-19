package ExoTp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainEmploye {

    public static void main(String[] args) {

        /**********************************        AVEC UN TABLEAU       ***************************/

       /* var scanner=new Scanner(System.in);
        System.out.print("Combien d'employés souhaitez-vous enregistrer?");
        var nombreEmployes=scanner.nextInt();

        ExoTp.Employe[] employes=new ExoTp.Employe[nombreEmployes];
        employes[0]=new ExoTp.Employe(1,"Christian","Lisangola");

        for(int i=0;i<employes.length;i++){
            System.out.print("Id : ");
            int id=scanner.nextInt();
            scanner.nextLine();

            System.out.print("Votre nom : ");
            String nom=scanner.nextLine();


            System.out.print("Votre prenom : ");
            String prenom=scanner.nextLine();

//            ExoTp.Employe employe=new ExoTp.Employe(id,prenom,nom);
//            employes[i]=employe;

            employes[i]=new ExoTp.Employe(id,prenom,nom);
        }


//        Affichage de tous les employés
        System.out.println(Arrays.toString(employes));


//        Affichage de chaque employé de manière individuelle : Mauvaise pratique
//        System.out.println("Employé[0] : "+employes[0]);
//        System.out.println("Employé[1] : "+employes[1]);

        //        Affichage de chaque employé de manière individuelle : Bonne pratique

        for(int i=0;i<employes.length;i++){
//            System.out.println("Employé["+i+"] : "+employes[i]);
            System.out.println("Employé["+i+"] : "+employes[i].getLastName());
        }

//        String[] fruits=new String[3];
//        fruits[0]="pommes";
//        fruits[1]="bananes";
//        fruits[2]="oranges";
//
//        System.out.println(Arrays.toString(fruits));

//        ExoTp.Employe chris=new ExoTp.Employe(3,"Jean","Zozor");
//        System.out.println(chris);*/

        /************************************     AVEC UN ARRAYS LIST  ***********************************/

        System.out.println(UUID.randomUUID().toString());

        var scanner=new Scanner(System.in);
        System.out.print("Combien d'employés souhaitez-vous enregistrer?");
        var nombreEmployes=scanner.nextInt();

        ArrayList<Employe> employes=new ArrayList<>();
        int i;
        for(i=0;i<nombreEmployes;i++){
            System.out.println("Taille du tableau : "+employes.size());
            System.out.print("Id : ");
            int id=scanner.nextInt();
            scanner.nextLine();

            System.out.print("Votre nom : ");
            String nom=scanner.nextLine();


            System.out.print("Votre prenom : ");
            String prenom=scanner.nextLine();


            employes.add(new Employe(id,prenom,nom));
        }

        System.out.println(employes);


        for(int j=0;j<employes.size();j++){
            System.out.println("Employé["+j+"] : "+employes.get(j));
        }

        System.out.println("Souhaitez-vous ajouter un autre employé?");
        String response=scanner.nextLine();

        if(response.equals("oui")){
            employes.add(new Employe(5,"Zozor","Zazar"));
        }else{
            System.out.println("Bye bye");
        }
        System.out.println("Taille du tableau à la fin : "+employes.size());
        employes.get(3);
    }


}
