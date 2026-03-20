import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        int a,b,c,d;
        int temp, temp1;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        temp = a;
        a = d;
        temp1 = b;
        b= c;
        c = temp1;
        d = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        }
}


