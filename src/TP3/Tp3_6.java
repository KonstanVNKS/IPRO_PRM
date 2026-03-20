import java.util.Scanner;

public class Tp3_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 1;
        int max = s.nextInt();
        while (n * n < max){
            System.out.print(n + " ");
            n++;
        }
    }
}
