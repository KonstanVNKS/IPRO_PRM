package TP6;

import java.util.Scanner;

public class tp6_1_h {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (j>=i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
