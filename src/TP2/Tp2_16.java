import java.util.Scanner;

public class Tp2_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if((a%4==0 && a%100!=0) || a%400==0){
            System.out.println("l'année est bissextile");
        }else{
            System.out.println("l'année n'est pas bissextile");
        }
    }
}
