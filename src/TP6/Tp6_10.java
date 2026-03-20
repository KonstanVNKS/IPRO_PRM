package TP6;

import java.util.Scanner;

public class Tp6_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int pos = 0,last=pos,n=0;
        do{
            n = s.nextInt();
            pos++;
            if(n == val)
                last = pos;
        }while(n !=-1);
        if(last==0)
            throw new RuntimeException("Number not in given list");
        else
            System.out.println(val+ " last known position "+ last );
    }
}
