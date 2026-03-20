package TP7;

public class Tp7_12 {
    public static int primesBefore(int a) {
        int cpt = 0;
        for (int i = 1; i < a; i++) {
            if (Tp7_11.isPrime(i))
                cpt++;

        }
        return cpt;
    }

    public static void main(String[] args) {
        System.out.println(primesBefore(30));
    }
}
