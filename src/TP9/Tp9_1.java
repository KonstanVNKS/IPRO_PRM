package TP9;
import seqint.*;

public class Tp9_1 {
    public static void main(String[] args) {
        SeqInt s0 = new SeqInt(1,1,2,5,5,3,8,8,1,10,8,10,1,1,2);
        SeqInt s1 = new SeqInt(5,2,2,2,3,3,3,3,3,4,1,1,1,8,8,8);
        System.out.println("le nombre de plateau de la sequence "+s0+" est de : "+plateau(s0));
        System.out.println("le nombre de bloc de plateau de la sequence "+s0+" est de : "+blocParite(s0));
        System.out.println("le nombre de bloc de plateau de la sequence "+s0+" avant son premier maximum est de : "+plateauBeforeMax(s0));
        System.out.println("le nombre de bloc de plateau de la sequence "+s0+" apres son dernier maximum est de : "+plateauAfterLastMax(s0));
        System.out.println("le nombre de plateau de taille 3 de la sequence "+s1+" est de : " + nbPlateauxl3(s1));
        System.out.println("le nombre de bloc de parité de taille 3 de la sequence "+s1+" est de : " + plateauParitéL(s1, 3));
        System.out.println(s0+" "+nbPlatHMax(s0));

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

    public static int plateauBeforeMax(SeqInt l){
        int nbP = 0;
        int max = 0;
        int nbM = 0;
        SeqIntIterator li = l.iterator();
        if(li.hasNext())
            nbP =1;
        int act = li.next();
        max = act;
        while(li.hasNext()){
            int prev = act;
            act = li.next();
            if(act!=prev)
                nbP++;
            if(act > max){
                max =act;
                nbM = nbP-1;
            }
        }
        return nbM;
    }
    public static int plateauAfterLastMax(SeqInt l){
        int nbP = 0; int max =0;
        SeqIntIterator li = l.iterator();
        if(li.hasNext())
            nbP=0;
        int act = li.next();
        max = act;
        while(li.hasNext()){
            int prev = act;
            act = li.next();
            if(act != prev){
                ++nbP;
                if(act > max) {
                    max = act;
                    nbP = 0;

                }
            }
        }
        return nbP;
    }

    /*
    * s    5 2 2 2 3 3 3 3 3 4 1 1 1 8 8 8
    * res  0 0 0 1 1 1 2 1 1 1 1 1 2 2 2 3
    * lp   1 1 2 3 1 2 3 4 5 1 1 2 3 1 2 3  if(e==prev) ++lp
    *                                       else lp =1
    *                                       if(lg ==3) ++res
    *                                       else-if(lp > 3) --res;
    * */
    public static int nbPlateauxl3(SeqInt l){
        SeqIntIterator li = l.iterator();
        int res = 0;
        int act = 0;
        if(li.hasNext()) {
            int lp = 1;
            act = li.next();
            while (li.hasNext()) {
                int prev = act;
                act = li.next();
                if(act==prev)
                    ++lp;
                else
                    lp = 1;
                if (lp==3)
                    ++res;
                else if (lp==4) {
                    --res;
                }
            }
        }
        return res;

    }
    /*
    * lg 2
    * res 0 0 1 0 1 1 0 0 0 1 0 1 0 1 1 0
    * s   5 2 2 2 3 3 3 3 3 4 1 1 1 8 8 8
    *
    * if(e == prev) ++lg
    * else lg = 1
    * if(lg == 2) res++;
    * else-if(lg == lg+1) res--;
    *
    * */
    public static int plateauParitéL(SeqInt l , int lg){
        SeqIntIterator li = l.iterator();
        int res = 0;
        if(li.hasNext()){
            int act = li.next();
            int lpar = 1;
            while(li.hasNext()){
                int prev = act;
                act = li.next();
                if(act%2==prev%2)
                    ++lpar;
                else
                    lpar =1;
                if(lpar == lg)
                    res++;
                else if (lpar == lg+1) {
                    res--;
                }
            }
        }
        return res;
    }
    /*
    * res 0 0 1 1 1 2 2
    * lg1 2
    * lg2 3
    * lp  1 1 2 3 1 2 3 4 5 1 1 2 3 1 2 3
    * s   5 2 2 2 3 3 3 3 3 4 1 1 1 8 8 8
    *
    * if(act = prev)
    *   lp++;
    * else
    *   lp=1;
    * if(lp == LG1)
    *   res ++;
    * else-if (lp == LG2+1)
    *   res--;
    *
    * */
    public static int plateauLComprise(SeqInt l, int LG1, int LG2){
        SeqIntIterator li = l.iterator();
        int res = 0;
        if (li.hasNext()){
            int act = li.next();

        }
        return res;
    }
    /*
    * s   5 2 2 2 3 3 3 3 3 4 1 1 1 8 8 8
    * lp  1 1 2 3 1 2 3 4 5 1 1 2 3 1 2 3
    * max = 8
    * res 0 1 1 1 1 1 2 1 1 1 1 1 2 2 2 3
    *
    * */
    public static int nbPlatHMax(SeqInt l){
        int res =0;
        SeqIntIterator li = l.iterator();
        if(li.hasNext()){
            int act = li.next();
            int max = act;
            res=1;
            while (li.hasNext()){
                int prev = act;
                act = li.next();
                if(act != prev) {
                    if(act == max) {
                        res++;
                    } else if (act > max) {
                        max = act;
                        res = 1;
                    }
                }

            }
        }
        return res;
    }
    /*
     * s   5 2 2 2 3 3 3 3 3 4 1 1 1 8 8 8
     * lp  1 1 2 3 1 2 3 4 5 1 1 2 3 1 2 3
     * max = 8
     * res 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 if(act == max && lp>1) ++res;
     *
     *
     *
    * */

    /*public static int plateauHMaxL(SeqInt l){
        int res =0;
        SeqIntIterator li = l.iterator();
        if(li.hasNext()) {
            int act = li.next();
            int max = act;
            int lp = 1;
            while(li.hasNext()) {
                int prev = act;
                act = li.next();
                if (act == prev)
                    lp++;
                else
                    lp =1;
                if (act>max) {
                    max = act;
                    res = 0;
                } else if (act == max && lp == 2) {
                    res++;
                }
            }
        }
        return res;
    }*/

    /*
    * s   7 7 8 1 1 3 3 2 5 4
    * res 0 0 0 0 0 1 1 1 2 2 if(e>prev && down)
    *down f f f t t f f t f t if(e<prev) down = true; else-if(e>prec) down = false
    *
    *
    * */

    public static int nbdown(SeqInt s){
        int res = 0;

        SeqIntIterator li = s.iterator();
        if(li.hasNext()){
            int act = li.next();
            boolean down = false;
            while (li.hasNext()){
                int prev =act;
                act = li.next();
                if(act>prev){
                    if(down)
                        ++res;
                    down = false;
                } else if (act<prev) {
                    

                }
            }

        }


        return res;
    }
}
