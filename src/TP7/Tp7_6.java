package TP7;

public class Tp7_6 {
    public static int mul(int a, int b){
        int somme=0;
        int  res = 0;
        if((a > 0 && b >0) || (a<0 && b<0) ) {
            if(b<0)
                for (int i = 0; i < -b; i++) {
                    somme +=a;
                }
            res = -somme;
            if(b>0)
                for (int i = 0; i < b; i++) {
                    somme +=a;
                }
            res = somme;
        }
        if((a>0 && b<0)||(a<0 && b>0)){
            if(b<0) {
                for (int i = 0; i < -b; i++) {
                    somme += a;
                }
                res = somme;
            }
            if(a<0) {
                for (int i = 0; i < b; i++) {
                    somme += a;
                }
                res = -somme;
            }
        }
        if((a==0 && b==0)||(a==0 && b>0)||(a==0 && b<0) ||(a<0 && b==0)|| (a>0 && b==0)){
            res = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mul(-9,-6));
    }
}
