import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        a = s.nextDouble();
        if (a != 0){
            if (a > 0){
                System.out.println(a);
            }
            if (a < 0){
                a = -a;
                System.out.println(a);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
