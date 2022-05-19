package ExoTp;

public class Tp1_dia {
    private int diametre;

    public Tp1_dia(int diametre){
        this.diametre = diametre;
    }

    public void calcul() throws  ArithmeticException{
        int rayon = 0;
        int surface = 0;
        try{
            rayon = diametre/2;
            surface = diametre * diametre /2;
        }catch(ArithmeticException ae){
            System.out.println("les données que vous avez saisie semble incorect");
        }

        if (rayon <0 || surface < 0){
            System.out.println("les données que vous avez saisie semble incorect");
            return;
        }
        System.out.println(String.format("la surface est de %d et le rayon de %d",rayon,surface));
    }
}
