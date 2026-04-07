package TP10;
import eu.epfc.prm.Array;

import java.net.Inet4Address;

public class TP10_ {
    public static void main(String[] args) {
        Array<Integer> t = new Array<>(1,2,3,4,5,6,7,8,9);
        Array<Integer> t2 = new Array<>(1,2,3,1,1,4,5,6,7,8,9,8,5);
        System.out.println(t2);
        //System.out.println("la somme de tous les elements de "+t+" est de :"+sum(t));
        //System.out.println("la moyenne de tous les elements de "+t+" est de :"+avg(t));
        //System.out.println(isIn(t,10));
        //System.out.println(isIn(t,5));
        //System.out.println(firstOccurence(t2,4));
        //System.out.println(lastOccurence(t2,5));
        //System.out.println(exchange(t, 2,5));
        //System.out.println(reverse(t));
        //System.out.println(cyclicalL(t), 1);
        //System.out.println(cyclicalR(t));
        //System.out.println(insert(t,55,4));
        //System.out.println(delete(t,4));
        //System.out.println(t2);
        System.out.println(deleteOccurence(t2,1));
        System.out.println(t2);
//        System.out.println(set(t2));
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

    public static int firstOccurence(Array<Integer> t, int trg){
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

    public static int lastOccurence(Array<Integer> t, int trg){
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

    public static Array<Integer> deleteOccurence(Array<Integer> t, int val){
        int cnt = 0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i)==val){
                cyclicalL(t,i);
                if(t.get(i)!=val)
                    cnt--;
                cnt++;
            }
        }
        t.reduceTo(t.size()-cnt);
        return t;
    }

    public static Array<Integer> set(Array<Integer> t){
        int cnt = 0;
        for (int i = 0; i < t.size(); i++) {
            if(isIn2(t,t.get(i),i+1)){
                cyclicalL(t,i);
            }
        }

        return t;
    }

}
