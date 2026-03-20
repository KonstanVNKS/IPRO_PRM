package TP7;

public class Tp7_7 {
    public static double exp(int a, int b){
        double res=1;
        if(b>0) {
            for (int i = 0; i < b; i++) {
                res *= a;
            }
        }else
        {
            for (int i = 0; i < -b; i++) {
                res *= 1/(double)a;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(exp(2,4));
    }
}
