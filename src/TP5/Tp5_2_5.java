package TP5;

import java.util.Scanner;

public class Tp5_2_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nb = s.nextInt();
        int cpt = 0, somme = 0;
        do{
           somme += nb;
           cpt++;
           nb = s.nextInt();
        }while(nb != -1);
        double avg = (double)somme / cpt;
        System.out.println("moyenne : "+ avg);
    }
}
