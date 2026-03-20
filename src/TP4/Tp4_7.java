import java.util.Scanner;

public class Tp4_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c =n;
        if (n > 0){
            for (int i = 1; i < n-1; i++) {
                int pro = c * (n-i);
                c = pro;

            }
        }
        System.out.println("la factorielle de " + n + " est de : "+ c);
    }
}
