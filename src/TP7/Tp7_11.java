package TP7;

public class Tp7_11 {
    public static boolean isPrime(int a){
        if(a<=3 && a>=1)
            return true;
        if(a%2==0 || a%3==0)
            return false;
        for (int i = 5; i*i<=a ; i+=6) {
            if(a%i==0 || a%(i+2)==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(35));
    }
}
