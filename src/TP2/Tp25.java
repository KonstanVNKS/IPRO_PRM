import java.util.Scanner;

public class Tp25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b){
            System.out.println("Le premier est plus grand que le deuxième");
        }
        else if (a < b) {
            System.out.println( "Le premier est plus petit que le deuxième");
        }
        else{
            System.out.println("Les deux nombres sont égaux");
        }
    }
}
