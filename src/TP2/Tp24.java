import java.util.Scanner;

public class Tp24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b){
            int diff = a-b;
            System.out.println(diff);
        }
        else{
            int diff = b-a;
            System.out.println(diff);
        }

    }
}
