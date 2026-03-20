package TP6;

import java.util.Scanner;

public class tp6_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = n;
        while(n !=0){
            n = s.nextInt();
            if(n < min && n!=0)
                min = n;
        }
        System.out.println(min);
    }
}
