import java.util.Scanner;

public class Tp4_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        double somme =0;
        int cnt = 0;
        double moy;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (a>0) {
                somme += a;
                cnt++;
            }
        }
        moy = somme / cnt;
        System.out.println("moyenne : " + moy);
    }
}
