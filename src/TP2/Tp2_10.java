import java.util.Scanner;

public class Tp2_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();
        if (a <= b && a<=c){
            if (b <= c){
                System.out.println(a+","+b+","+c);
            }else{
                System.out.println(a+","+c+","+b);
            }
        }
        if (a>b && b<=c) {
            if (a <= c) {
                System.out.println(b + "," + a + "," + c);
            } else {
                System.out.println(b + "," + c + "," + a);
            }
        }if (c < b){
            System.out.println(c+","+b+","+a);
        } else if (a <= b) {
            System.out.println(c+","+a+","+b);
        }
    }
}
