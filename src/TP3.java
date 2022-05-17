public class TP3 {
    public static void main(String[] args) {
        int a =51;
        int b = 876;
        int c = 235;
        int sponge = 0;


        System.out.println(String.format("a vaut : %d,b vaut : %d,c vaut : %d",a,b,c));

        sponge = c;
        c = b;
        b = a;
        a = sponge;

        System.out.println(String.format("Après la permuetation a vaut : %d,b vaut : %d,c vaut : %d",a,b,c));
    }
}
