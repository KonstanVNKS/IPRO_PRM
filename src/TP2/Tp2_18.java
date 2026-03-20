import java.util.Scanner;

public class Tp2_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= 0){
            if (b >= 0) {System.out.println("la somme sera positive");
            } else{
                if (-b>a){System.out.println("la somme sera negative");
                }
                else{System.out.println("la somme sera positive");}
            }
        }else{
            if (b >=0){
                if (-a>b){System.out.println("la somme sera negative");
                }else{System.out.println("la somme sera positive");}
            }else{System.out.println("la somme sera negative");}
        }
    }
}