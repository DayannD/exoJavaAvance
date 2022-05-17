public class Tp6Mois {
    int numMois ;

    public Tp6Mois(int numMois){
        this.numMois = numMois;
    }

    public void select(){
        switch (numMois){
            case 1:
                System.out.println("Vous êtes né en Janvier");
                break;
            case 2:
                System.out.println("Vous êtes né en Février");
                break;
            case 3:
                System.out.println("Vous êtes né en Mars");
                break;
            case 4:
                System.out.println("Vous êtes né en Avril");
                break;
            case 5:
                System.out.println("Vous êtes né en Mai");
                break;
            case 6:
                System.out.println("Vous êtes né en Juin");
                break;
            case 7:
                System.out.println("Vous êtes né en Juillet");
                break;
            case 8:
                System.out.println("Vous êtes né en Août");
                break;
            case 9:
                System.out.println("Vous êtes né en Septembre");
                break;
            case 10:
                System.out.println("Vous êtes né en Octobre");
                break;
            case 11:
                System.out.println("Vous êtes né en Novembre");
                break;
            case 12:
                System.out.println("Vous êtes né en Décembre");
                break;
        }
    }
}
