package TP7;


public class Tp7_9 {
    public static int fact(int a){
        int c = a;
        for (int i = 1; i < a-1; i++) {
            int pro = c * (a - i);
            c = pro;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
