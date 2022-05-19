package ExoTp;

import java.util.Scanner;

public class Tp1 {
    public static void main(String[] args) {
        /********************                     TP1                              ***********************/
        int diametre = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le diamètre :");
        diametre = scanner.nextInt();
        scanner.close();

        Tp1_dia calcul = new Tp1_dia(diametre);

        calcul.calcul();
    }
}
