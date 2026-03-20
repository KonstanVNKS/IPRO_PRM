import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
       int a,b,c;
       int temp;
       Scanner s = new Scanner(System.in);
       a = s.nextInt();
       b = s.nextInt();
       c = s.nextInt();

       temp = a;
       a = c;
       c = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
