package TP8;
import seqint.*;

public class Tp8_1 {
    public static void main(String[] args) {
        SeqInt s = new SeqInt(5, 6, 5, 8, 7, 41, 2, 2, 8, 3,41,42);
        int trgt = 5;
        int trgt1 = 9;
        if (isEmpty(s))
            System.out.println(s + " est vide");
        else
            System.out.println(s + " n'est pas vide");
        SeqInt s1 = new SeqInt();
        if (isEmpty(s1))
            System.out.println(s1 + " est vide");
        else
            System.out.println(s1 + " n'est pas vide");
        SeqInt s3 = new SeqInt(1,2,3,4,5,6,85,89,100);

        System.out.println(" la taile de la liste " + s + " est de : " + len(s));
        System.out.println(" la taile de la liste " + s1 + " est de : " + len(s1));
        System.out.println(" la somme des elements de la liste est de:  " + listSum(s));
        System.out.println(" la moyenne de la liste " + s + " est de: " + avgOfListElements(s));
        //System.out.println(" la moyenne de la liste " + s1 + " est de: " + avgOfListElements(s1) );
        System.out.println(" le maximum de " + s + " est: " + max(s));
        System.out.println(" l'element " + trgt + " apparait " + timesOfApparition(s, trgt) + " fois.");
        System.out.println(" la derniere position connu de " + trgt + " est: " + lastSeenPos(s, trgt));
        System.out.println(" la derniere position connu de " + trgt1 + " est: " + lastSeenPos(s, trgt1));
        System.out.println(" la premiere position connu de " + trgt + " est: " + firstSeenPos(s, trgt));
        System.out.println(" la premiere position connu de " + trgt1 + " est: " + firstSeenPos(s, trgt1));
        if (!isAscending(s))
            System.out.println("la liste s :" + s + "  n'est pas croissante");
        else
            System.out.println("la liste s :" + s + " est croissante");

        if (!isAscending(s3))
            System.out.println("la liste s :" + s3 + " n'est pas croissante");
        else
            System.out.println("la liste s :" + s3 + " est croissante" );
        if (containsPairs(s))
            System.out.println("la liste s :" + s + " contient un palier");
        else
            System.out.println("la liste s :" + s + " ne contient pas de palier" );

        if (containsPairs(s3))
            System.out.println("la liste s :" + s3 + " contient un palier");
        else
            System.out.println("la liste s :" + s3 + " ne contient pas de palier" );

        System.out.println(" la derniere position du maximun de " + s + " est: "+ lastMaxPos(s));
        System.out.println(" la premiere position du maximun de " + s + " est: "+ firstMaxPos(s));
        System.out.println(" l'element " + max(s) + " apparait " + timesOfApparitionOfMax(s) + " fois.");
        System.out.println(" le minimun et maximun de " + s+ " sont "+ MaxMin(s));
        System.out.println(" les deux plus grande valeurs de  " + s+ " sont "+ TwoMax(s));
    }

    public static boolean isEmpty(SeqInt l) {
        SeqIntIterator li = l.iterator();
        return !li.hasNext();
    }

    public static int len(SeqInt l) {
        SeqIntIterator li = l.iterator();
        int cnt = 0;
        while (li.hasNext()) {
            li.next();
            cnt++;
        }
        return cnt;
    }

    public static int listSum(SeqInt l) {
        int somme = 0;
        SeqIntIterator li = l.iterator();
        while (li.hasNext()) {
            int a = li.next();
            somme += a;
        }
        return somme;
    }

    public static int timesOfApparition(SeqInt l, int trgt) {
        int cnt = 0;
        SeqIntIterator li = l.iterator();
        while (li.hasNext()) {
            int a = li.next();
            if (a == trgt)
                cnt++;

        }
        return cnt;
    }

    public static double avgOfListElements(SeqInt l) {
        int somme = 0;
        int cnt = 0;
        SeqIntIterator li = l.iterator();
        if (!isEmpty(l))
            while (li.hasNext()) {
                int a = li.next();
                somme += a;
                cnt++;
            }
        else
            throw new RuntimeException("the list is empty");

        return (double) somme / cnt;
    }

    public static int max(SeqInt l) {
        int max = 0;
        SeqIntIterator li = l.iterator();
        if (!isEmpty(l))
            while (li.hasNext()) {
                int a = li.next();
                if (a >= max)
                    max = a;

            }
        else
            throw new RuntimeException("the list is empty");
        return max;
    }

    public static int lastSeenPos(SeqInt l, int trgt) {
        int lastPos = 0;
        int cnt = 0;
        SeqIntIterator li = l.iterator();
        if (!isEmpty(l)) {
            while (li.hasNext()) {
                int a = li.next();
                cnt++;
                if (a == trgt)
                    lastPos = cnt;

            }
            if (lastPos < 0)
                lastPos = -1;
        } else
            throw new RuntimeException("the list is empty");
        return lastPos;
    }

    public static int firstSeenPos(SeqInt l, int trgt) {
        int firstPos = 1;
        int cnt = 0;
        SeqIntIterator li = l.iterator();
        if (!isEmpty(l)) {
            int a = li.next();
            while (li.hasNext() && a != trgt) {
                cnt++;
                a = li.next();
            }
            firstPos += cnt;
            if (cnt == len(l) - 1 && firstPos == len(l))
                firstPos = -1;
        } else
            throw new RuntimeException("the list is empty");
        return firstPos;
    }

    public static boolean isAscending(SeqInt l) {
        SeqIntIterator li = l.iterator();
        boolean res = true;
        if (!isEmpty(l)) {
            int tmp = li.next();
            while (li.hasNext()) {
                int act = li.next();
                if (act < tmp)
                    res = false;
                tmp = act;
            }
        } else
            throw new RuntimeException("the list is empty");
        return res;
    }

    public static boolean containsPairs(SeqInt l){
        SeqIntIterator li =l.iterator();
        boolean contains = false;
        if (!isEmpty(l)) {
            int tmp = li.next();
            while (li.hasNext()) {
                int act = li.next();
                if (act == tmp)
                    contains = true;
                tmp = act;
            }
        } else
            throw new RuntimeException("the list is empty");
        return contains;
    }

    public static int lastMaxPos(SeqInt l){
        int trgt = max(l);
        int pos =0 ; int cnt =0;
        SeqIntIterator li = l.iterator();
        if (!isEmpty(l)) {
            while (li.hasNext()) {
                int act = li.next();
                cnt++;
                if (act == trgt)
                    pos = cnt;
            }
        } else
            throw new RuntimeException("the list is empty");
        return pos;
    }

    public static int firstMaxPos(SeqInt l) {
        int firstPos = 1;
        int cnt = 0;
        int trgt = max(l);
        SeqIntIterator li = l.iterator();
        if (!isEmpty(l)) {
            int a = li.next();
            while (li.hasNext() && a != trgt) {
                cnt++;
                a = li.next();
            }
            firstPos += cnt;
            if (cnt == len(l) - 1 && firstPos == len(l))
                firstPos = -1;
        } else
            throw new RuntimeException("the list is empty");
        return firstPos;
    }

    public static int timesOfApparitionOfMax(SeqInt l) {
        int cnt = 0;
        int trgt = max(l);
        SeqIntIterator li = l.iterator();
        while (li.hasNext()) {
            int a = li.next();
            if (a == trgt)
                cnt++;

        }
        return cnt;
    }

    public static int absNeg(SeqInt l){
        int absmin = 0;
        int absneg = 0;
        SeqIntIterator li = l.iterator();
        int act = li.next();
        while(li.hasNext() && act>=0 ) {
            act = li.next();
        }
        absmin = act;
        while(li.hasNext()){
            act = li.next();
            if(act < absmin)
                absneg = act;
        }
        return absneg;
    }

    public static SeqInt MaxMin(SeqInt l){
        SeqIntIterator li = l.iterator();
        int max =0;
        int min = li.next();
        while (li.hasNext()){
            int act = li.next();
            if(act >= max)
                max = act;
            if(act <= min)
                min = act;
        }
        SeqInt res = new SeqInt(min,max);
        return res;
    }

    public static SeqInt TwoMax(SeqInt l){
        SeqIntIterator li = l.iterator();
        SeqIntIterator lj = l.iterator();
        int max1 =0;
        int max2 = 0;
        int tmp = lj.next();
        while(li.hasNext()){
            int act = li.next();
            if(act >= max1)
                max1=act;

        }
        while(lj.hasNext()){
            int act = lj.next();
            if(act < max1 && act>= tmp)
                max2 = act;
        }
        SeqInt res = new SeqInt(max1,max2);
        return res;
    }
}
