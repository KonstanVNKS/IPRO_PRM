package TP5;

import java.util.Scanner;

public class Tp5_2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int cpt =1;
        int somme = 0;
        do {
            if (a > 0){
                somme += a;
                cpt++;
                a = s.nextInt();
            }else{
                System.out.println("entrez un nombre prositif");
                a = s.nextInt();

            }

        }while(cpt < n);
        double avg = (double) somme/n;
        System.out.println("moyenne : " + avg);
    }
}
