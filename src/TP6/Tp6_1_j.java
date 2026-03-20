package TP6;

import java.util.Scanner;

public class Tp6_1_j {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int demi = h/2;
        for (int i = h; i >=1 ; i-=2) {
            for (int j = 0; j < (h-i)/2; j++) {
                System.out.print("o");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("X");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= demi +1 ; i+=2) {
            for (int j = 1; j < (h-i)/2; j++) {
                System.out.print("o");
            }
            for (int k = 0; k <= i+1; k++) {
                System.out.print("X");
            }
            System.out.println(" ");
        }
    }
}
