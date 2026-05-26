package TP15;

import eu.epfc.prm.Array;
import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.math.BigInteger;

public class TP15_1 {

    //ex2
    public static long fact(long n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
    //ex3
    public static int fibo(int n){
        if(n<=2){
            return 1;
        }
        else
            return fibo(n-1)+fibo(n-2);
    }
//    ex4
    public static long exp(int a,int n ){
        if(n == 0)
            return 1;
        else if (n==1) {return a;}
        else
            return a*exp(a,n-1);
    }
//      ex5
    public static long exp2(int a,int n ){
        if(n == 0)
            return 1;
        else if (n==1) {return a;}
        else if(n%2 == 0)
            return exp2(a*a,n/2);
        else
            return a*exp2(a,n-1);
    }

//    ex6
    public static int len(int a){
        if(a==0)
            return 0;
        if (a<10)
            return 1;
        else
            return 1+len(a/10);
    }

//    ex7
    public static int sumofdigitsof(int a){
        if(a==0)
            return 0;
        if (a<10)
            return a;
        else
            return a%10 + sumofdigitsof(a/10);
    }
//    ex8
    public static int sum(Array<Integer> l){
        return sumofelem(l,0);
    }

    public static int sumofelem(Array<Integer> l, int idx ){
        int len = l.size();
        if (idx == len) {
            return 0;
        }
        return l.get(idx)+sumofelem(l, idx+1);
    }
//    ex9 recherche dichothomique
    public static boolean rDichotomique(Array<Integer> l , int val){
        int di = 0;
        int ds = l.size()-1;
        return isIn(l,val,di,ds);
    }


    public static boolean isIn(Array<Integer> l, int val, int di, int ds){
        int m = (di+ds)/2;
        if(di == ds)
            return false;
        if(val == l.get(m))
            return true;
        else {
            if (val < l.get(m))
                return isIn(l, val, di, m);
            else
                return isIn(l, val, m + 1, ds);
        }
    }
//    ex10
    public static int somme(SeqInt s){SeqIntIterator si = s.iterator(); return sum(si);}
    public static int sum(SeqIntIterator s){
        if(!s.hasNext())
            return 0;
        else
            return s.next() + sum(s);
    }

//    ex11
    public static int nbPlateau(SeqInt s){
        SeqIntIterator si = s.iterator();
        if(!si.hasNext()) {
            return 0;
        }
        int first = si.next();
        return 1+nbPlateauRec(si,first);

    }

    private static int nbPlateauRec(SeqIntIterator s, int prec) {
        if(!s.hasNext()) {
            return 0;
        }
        int act = s.next();
        if(act!=prec)
            return 1+nbPlateauRec(s,act);
        else
            return nbPlateauRec(s,act);
    }

//    ex12
    public static int timesOf2(int n){
        if (n<2)
            return 0;
        else if (n%10 == 2)
            return 1 + timesOf2(n/10);
        else
            return timesOf2(n/10);
    }

    public static boolean digitsPair(int n){
        if(n==0) {
            return false;
        }
        int tocheck = n%10;
        if (tocheck%2==0) {
            return true;
        }
        else
            return digitsPair(n/10);
    }
// ex16
    public static int binaryToDecimal(int bin){
       double res = 0.0;
       var exp = 0;
       return reccall(bin, res, exp);
    }

    public static int reccall(int bin, double res, int exp){
        if(bin == 0)
            return (int)res;
        return reccall(bin/10,res + (bin%10 * Math.pow(2,exp)), exp+1);
    }

    // ex17
    public static int findMax(Array<Integer> t, int idx) {
        if (idx == t.size() - 1) {
            return t.get(idx);
        }
        return Math.max(t.get(idx), findMax(t, idx + 1));
    }

    // ex18
    public static int nbCapsInString(String txt, int i){
        if (i == txt.length())
            return 0;
        if(txt.charAt(i)>= (int)'A' && txt.charAt(i)<= (int)'Z')
            return 1+nbCapsInString(txt, i+1);
        return nbCapsInString(txt,i+1);
    }


    public static void main(String[] args) {
//        int n = 10;
        var l = new Array<Integer>(1,2,3,4,15,5,6,7,8,9);
        var txt = " Je Suis KonStantinoS";
//        SeqInt s = new SeqInt(1,2,2,3,3,5,5,5,5,5,8,4,9,7,7,7,7);
//        System.out.println(fact(n));
//        System.out.println(fibo(n));
//        System.out.println(exp(2,n));
//        System.out.println(exp2(2,n));
//        System.out.println(len(124843));
//        System.out.println(sumofdigitsof(123456789));
//        System.out.println(sum(l));
//        System.out.println(isIn(l,5,0,l.size()));
//        SeqIntIterator si = s.iterator();
//        System.out.println(somme(s));
//        System.out.println(nbPlateau(s));
//        System.out.println(timesOf2(20024));
        System.out.println(binaryToDecimal(10000000));
        System.out.println(findMax(l,0));
        System.out.println(nbCapsInString(txt,0));
    }
}
