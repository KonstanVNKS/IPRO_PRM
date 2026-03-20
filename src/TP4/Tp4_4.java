import java.util.Scanner;

public class Tp4_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int min= a;
        for (int i = 0; i < n-1; i++) {
            a = s.nextInt();
            if (a < min){
                min = a;
            }
        }System.out.println("le minimun est : " + min);

    }
}
