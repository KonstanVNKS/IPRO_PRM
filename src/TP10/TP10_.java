package TP10;
import eu.epfc.prm.Array;

import java.net.Inet4Address;
import java.util.Objects;

public class TP10_ {
    public static void main(String[] args) {
        Array<Integer> t = new Array<>(1,2,3,4,5,6,7,8,9);
        Array<Integer> t2 = new Array<>(1,2,3,1,1,1,4,5,5,6,7,8,9,8,5);
        System.out.println(t2);
//        System.out.println("la somme de tous les elements de "+t+" est de :"+sum(t));
//        System.out.println("la moyenne de tous les elements de "+t+" est de :"+avg(t));
//        System.out.println(isIn(t,10));
//        System.out.println(isIn(t,5));
//        System.out.println(firstOccurrence(t2,4));
//        System.out.println(lastOccurrence(t2,5));
//        System.out.println(exchange(t, 2,5));
//        System.out.println(reverse(t));
//        System.out.println(cyclicalL(t), 1);
//        System.out.println(cyclicalR(t));
//        System.out.println(insert(t,55,4));
//        System.out.println(delete(t,4));
//        System.out.println(t2);
//        System.out.println(deleteOccurrence(t2,5));
//        System.out.println(deleteOccurrencev2(t2,5));
     System.out.println(set(t2));
    }
    public static int sum(Array<Integer> t){
        int sum = 0;
        if(!t.isEmpty()) {
            for (int i = 0; i < t.size(); i++) {
                sum += t.get(i);
            }
        }
        return sum;
    }

    public static double avg(Array<Integer> t){
        return (double)sum(t) / t.size();
    }

    public static boolean isIn(Array<Integer> t, int trg){
        return isIn2(t,trg,0);
    }

    public static boolean isIn2(Array<Integer> t, int trg, int idx){
        boolean res = false;
        int i = idx;
        if(!t.isEmpty()) {
            while( i < t.size() && !res ){
                int act = t.get(i);
                if (act == trg)
                    res = true;
                ++i;
            }
        }
        return res;
    }

    public static int firstOccurrence(Array<Integer> t, int trg){
        int idx = 0;
        boolean found = false;
        if(t.isEmpty())
            idx = -1;
        else{
            int i = 0;
            while(i<t.size() && !found){
                int act = t.get(i);
                if(act == trg){
                    idx = i;
                    found = true;
                }
                i++;
            }
        }
        return idx;
    }

    public static int lastOccurrence(Array<Integer> t, int trg){
        int idx = 0;
        boolean found = false;
        if(t.isEmpty())
            idx = -1;
        else{
            int i = t.size()-1;
            while(i > 0 && !found){
                int act = t.get(i);
                if(act == trg){
                    idx = i;
                    found = true;
                }
                i--;
            }
        }
        return idx;
    }

    public static Array<Integer> exchange(Array<Integer> t, int p1, int p2){
        t.set(p1,t.get(p2));
        t.set(p2,t.get(p1));
        return t;
    }

    public static Array<Integer> reverse(Array<Integer> t){
        int l = t.size()-1;
        for (int i = 0; i < t.size()/2; i++) {
            exchange(t,i,l--);
        }
        return t;
    }
    public static Array<Integer> cyclicalL(Array<Integer> t, int s){
        int f = t.get(s);
        for (int i = s+1; i < t.size(); i++) {
            t.set(i-1, t.get(i));
        }
        t.set(t.size()-1,f);
        return t;
    }

    public static Array<Integer> cyclicalR(Array<Integer> t, int s){
        int l = t.get(t.size()-1);
        for (int i = t.size()-1; i > s; i--) {
            int tmp1 = t.get(i-1);
            t.set(i,tmp1);
        }
        t.set(0,l);
        return t;
    }
    public static Array<Integer> insert(Array<Integer> t, int val, int x){
        t.add(1);
        cyclicalR(t,x);
        t.set(x,val);
        return t;
    }
    public static int getIndex(Array<Integer> t , int val){
        int i =0;
        while(t.get(i) != val)
            i++;
        return i;
    }

    public static Array<Integer> delete(Array<Integer> t, int x){
        cyclicalL(t,x);
        t.reduceTo(t.size()-1);
        return t;
    }

    public static Array<Integer> deleteOccurrence(Array<Integer> t, int val){
        // O(n) max == O(n²) quadratique
        int i = 0;
        while (i<t.size()){
            if(t.get(i) == val)
                delete(t,i);
            else{
                i++;
            }
        }
        return t;
    }

    public static Array<Integer> deleteOccurrencev2(Array<Integer> t, int val, int pos){
        // O(n) max = O(n) lineaire
        if(pos>=0 && pos<t.size()){
            int w = 0;
            for (int r = 0; r < t.size(); r++) {
                int v = t.get(r);
                if (v != val) {
                    t.set(w, v);
                    ++w;
                }
            }
            t.reduceTo(w);
        }

        return t;
    }

    public static int nbOccurrence(Array<Integer> t, int val){
        int c = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i) == val)
                c++;
        }
        return c;
    }

    public static Array<Integer> set(Array<Integer> t){
        for (int l = 0; l < t.size(); l++) {
            for (int r = t.size()-1; r > 0; r--) {
                if (Objects.equals(t.get(l), t.get(r)) && (nbOccurrence(t,t.get(r))>1))
                    delete(t,r);
            }
        }
        return t;
    }

}
