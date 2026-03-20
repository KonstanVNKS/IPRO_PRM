package TP6;

import java.util.Scanner;

public class Tp6_1_i {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1 ; ++k) {
                System.out.print("X");
            }
            System.out.println();
        }

   }
}