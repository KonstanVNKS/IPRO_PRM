package projets;

import java.util.Scanner;

public class eval2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuer = true;
        int size = 0;
        System.out.println("encore un damier ? (true ou false) :");
        continuer = s.nextBoolean();
        while(continuer){
            do{
                System.out.println("Introduisez un nombre pair compris entre 4 et 12 :");
                size = s.nextInt();
            } while(size<4 || size >12 || size%2!=0);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if((i+j)%2==0)
                        System.out.print("X");
                    else
                        System.out.print("O");

                }
                System.out.println(" ");
            }
            System.out.println("encore un damier ? (true ou false) : ");
            continuer = s.nextBoolean();
        }
    }
}
