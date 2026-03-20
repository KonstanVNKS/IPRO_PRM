package TP6;

import java.util.Scanner;

public class Tp6_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = n;
        int max = n;
        while(n !=0){
            n = s.nextInt();
            if(n < min && n!=0)
                min = n;
            if(n>max)
                max = n;
        }
        System.out.println(min + " " + max);

    }
}
