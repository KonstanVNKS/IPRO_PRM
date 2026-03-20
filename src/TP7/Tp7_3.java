package TP7;

public class Tp7_3 {
    public static int max(int a,int b){
        int res;
        if(a>b)
            res = a;
        else
            res =b;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(max(10,11));
    }
}
