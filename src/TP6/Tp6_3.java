package TP6;

import java.util.Scanner;

public class Tp6_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        int un = s.nextInt();
        int n1 = 1;
        int n2 = 1;
        int temp =0;
        System.out.println(n1);
        System.out.println(n2);
        while(n2+n1 < un) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.println(n2);
        }
    }
}
