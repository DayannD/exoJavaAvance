package ExoTp;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        int nombre = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("rentrer un nombre : ");
        nombre = scanner.nextInt();

        String nature = "positif";
        String pair = "impair";

        if (nombre < 0){
            nature = "négatif";
        }
        if (nombre % 2==0){
            pair = "pair";
        }

        System.out.println(String.format("le nombre %d est %s et %s",nombre,nature,pair));
    }
}
