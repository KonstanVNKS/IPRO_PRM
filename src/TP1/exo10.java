import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        int a,b,c,d;
        int temp, temp1, temp2,temp3;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        temp = a;
        temp1 = b;
        temp2 = c;
        temp3 = d;
        a = temp3;
        b= temp;
        c= temp1;
        d=temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
