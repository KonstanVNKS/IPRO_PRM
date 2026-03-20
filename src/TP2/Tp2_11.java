import java.util.Scanner;

public class Tp2_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a > b && a > c){
            if (b<c){
                System.out.println(a+","+c);
            }else{
                System.out.println(a+","+b);
            }
        }
        else if( b > a && b > c){
            if (a<c){
                System.out.println(b+","+c);
            }else{
                System.out.println(b+","+a);
            }
        }
        else{
            if (a<b){
                System.out.println(c+","+b);
            }else{
                System.out.println(c+","+a);
            }
        }
    }
}
