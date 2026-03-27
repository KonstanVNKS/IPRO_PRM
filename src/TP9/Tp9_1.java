package TP9;
import seqint.*;

public class Tp9_1 {
    public static void main(String[] args) {
        SeqInt s0 = new SeqInt(1,1,2,5,5,3,8,8,1);
        System.out.println("le nombre de plateau de la sequence "+s0+" est de : "+plateau(s0));
        System.out.println("le nombre de bloc de plateau de la sequence "+s0+" est de : "+blocParite(s0));
    }

    public static int plateau(SeqInt l){
        int nbP =0;
        SeqIntIterator li = l.iterator();
        if(li.hasNext())
            nbP =1;
        int act = li.next();
        while(li.hasNext()){
            int prev = act;
            act = li.next();
            if (act != prev)
                nbP++;
        }
        return nbP;
    }

    public static int blocParite(SeqInt l){
        int nbB = 0;
        SeqIntIterator li = l.iterator();
        if(li.hasNext())
            nbB = 1;
        int act = li.next();
        while (li.hasNext()){
            int prev = act;
            act = li.next();
            if(act%2 != prev%2)
                nbB++;

        }
        return nbB;
    }
}
