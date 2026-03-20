import java.util.Scanner;

public class Tp3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        int cnt =0;
        int somme =0;
        while (n < 0){
            System.out.println("pas de negatif");
            n = s.nextInt();
        }
        while (cnt<n){
            int val = s.nextInt();
            ++cnt;
            somme += val;
        }
        double avg = somme / n;
        System.out.println(avg);
    }
}
