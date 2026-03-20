package TP5;

import java.util.Scanner;

public class Tp5_2_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nb = s.nextInt();
        int last = nb;
        do{
            last = nb;
            nb = s.nextInt();
        }while(nb != -1);
        System.out.println("le dernier nombre est : " + last);

    }
}
