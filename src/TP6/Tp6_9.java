package TP6;

import java.util.Scanner;

public class Tp6_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quelle est votre valeur: ");
        int val = s.nextInt();
        int n = s.nextInt();
        int pos = 1;
        while(n!=-1 && n !=val){
            pos++;
            n = s.nextInt();
        }
        if(n==val)
            System.out.println(pos);
        else
            throw new RuntimeException("Error number not in given list");
    }
}
