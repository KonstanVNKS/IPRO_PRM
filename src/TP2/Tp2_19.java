import java.util.Scanner;

public class Tp2_19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int c_d=250;
        int km = s.nextInt();
        double prix;
        if (km <=50){
            prix = d*c_d;
            System.out.println(prix);
        } else if (km>50 && km<=450) {
            prix = (d*c_d) + (km * 1.25);
            System.out.println(prix);
        }else{
            prix = (d*c_d) + (km * 1.375);
            System.out.println(prix);
        }
    }
}
