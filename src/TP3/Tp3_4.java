import java.util.Scanner;

public class Tp3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = s.nextInt();
        int n=0;
        int somme=1;
        while (somme < max){
            n++;
            somme += n;
        }
        System.out.println(n-1);
    }
}

