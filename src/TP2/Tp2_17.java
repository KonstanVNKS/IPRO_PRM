import java.util.Scanner;

public class Tp2_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if ((a>=0 && b>=0) ||(a<=0 && b<=0)){
            System.out.println("le resultat sera positif");
        }else{
            System.out.println("le resultat sera negatif");
        }
    }
}
