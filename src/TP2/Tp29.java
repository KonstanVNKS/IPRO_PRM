import java.util.Scanner;

public class Tp29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int [] l = new int [6];
        int len;
        len = l.length;
        for (int i = 0; i < len; i++) {

        }
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if( b >= a && b >= c){
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }
}
