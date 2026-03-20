package TP6;

import java.util.Scanner;

public class Tp6_1_g {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i+1 < h-j) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println(" ");
        }
    }
}
