import java.util.Scanner;

public class Tp4_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        double res = 1;
        if (a == 0 && b == 0){
            System.out.println("l'expression 0^0 n'est pas possible");
        } else if (b<0){
            for (int i = 0; i < -b; i++) {
                res *= 1.0 /a;

            }
        }else{
            for (int i = 0; i < b; i++) {
                res *=a;

            }
        }
        System.out.println(res);
    }
}
