import java.util.Scanner;

public class Tp4_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int somme =0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            somme+=a;
        }
        double moy = (double)somme / n;
        System.out.println("moyenne : " +moy);
    }
}
