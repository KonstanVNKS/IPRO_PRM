package TP6;

import java.util.Scanner;

public class Tp6_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quelle est votre valeur: ");
        int val = s.nextInt();
        int n = s.nextInt();
        int pos = 1;
        while(n!=val){
                pos++;
                n = s.nextInt();
        }
        System.out.println(pos);
    }
}
