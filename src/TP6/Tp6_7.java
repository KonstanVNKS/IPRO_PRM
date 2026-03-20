package TP6;

import java.util.Scanner;

public class Tp6_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("quel est votre traget");
        int target = s.nextInt();
        int cnt=0;
        System.out.println("entrez un nombre");
        int n = s.nextInt();
        while(n!=-1){
            if(n==target)
                cnt++;
            n = s.nextInt();
        }
        System.out.println(cnt);
    }
}
