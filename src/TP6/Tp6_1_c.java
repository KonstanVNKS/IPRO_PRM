package TP6;

import java.util.Scanner;

public class Tp6_1_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = 0; j < h; j++) {
                if(((i+j) == h-1) || i==j) {
                    System.out.print(" X ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
