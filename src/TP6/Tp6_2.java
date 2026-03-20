package TP6;

import java.util.Scanner;

public class Tp6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = 1;
        int n2 = 1;
        int temp =0;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i = 2; i < n; i++) {
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
            System.out.print(n2+" ");
        }
    }
}
