package TP6;

import java.util.Scanner;

public class Tp6_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int somme=0;
        if((a > 0 && b >0) || (a<0 && b<0) ) {
            if(b<0)
                for (int i = 0; i < -b; i++) {
                    somme +=a;
                }
            if(b>0)
                for (int i = 0; i < b; i++) {
                    somme +=a;
                }
            System.out.println(somme);
        }
        if((a>0 && b<0)||(a<0 && b>0)){
            if(b<0)
                for (int i = 0; i < -b; i++) {
                    somme +=a;
                }
            if(a<0)
                for (int i = 0; i < b; i++) {
                    somme +=a;
                }
            System.out.println(-somme);
        }
        if((a==0 && b==0)||(a==0 && b>0)||(a==0 && b<0) ||(a<0 && b==0)|| (a>0 && b==0)){
            System.out.println(0);
        }
    }
}
