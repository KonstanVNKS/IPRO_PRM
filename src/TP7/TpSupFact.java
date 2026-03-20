package TP7;

import java.util.Scanner;

public class TpSupFact {
    public static long fact(int n){
       if (n<0)
           throw new RuntimeException("Can't have a factorial of a negatif ");
       if(n==1 || n == 0)
           return 1;
       else
           return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What number's factorial do you need ? : ");
        int n = s.nextInt();
        System.out.println(fact(n));
    }
}
