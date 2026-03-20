package TP6;

import java.util.Scanner;

public class Tp6_1_b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int l = s.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = 0; j < l; j++) {
                if ((i == 0)||(i== h-1)|| (j == 0)|| (j==l-1)) {
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
