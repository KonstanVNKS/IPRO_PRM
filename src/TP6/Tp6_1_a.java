package TP6;

import java.util.Scanner;

public class Tp6_1_a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int l = s.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = 0; j < l; j++) {
                System.out.print(" X ");
            }
            System.out.println(" ");
        }
    }
}
