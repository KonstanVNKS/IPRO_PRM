package TP7;

public class Tp7_8 {
    public static double exp2(int a, int b){
        double res = 1;
        if(b>0) {
            for (int i = 0; i < b; i++) {
                res = Tp7_6.mul((int)res,a);
            }
        }else{
            for (int i = 0; i < -(b); i++) {
                res = Tp7_6.mul((int)res, a);
            }
            res = 1/res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(exp2(2,4));
        System.out.println(exp2(2,-4));
    }
}
