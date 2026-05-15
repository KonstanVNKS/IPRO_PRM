package TP13;
import TP13.Datev2.*;
import TP13.Personnev2.*;
import eu.epfc.prm.Array;
import java.util.Scanner;

public class Tp13 {
    public static void main(String[] args) {
        Personnev2 p1 = new Personnev2();
        p1.setPerson();
        p1.affiche();
        System.out.println("the person "+ p1 + " is " + p1.getAge());
    }

    public static void exercice2() {
        Array<Personnev2> tab = new Array<>();
        saisie(tab);
        affiche(tab);
    }

    public static void exercice3() {
        Array<Personnev2> tab = new Array<>();
        saisie(tab);
        System.out.println("La personne la plus jeune est : ");
        Personnev2 p = getYounger(tab);
        System.out.println(p + " " + p.getAge());
    }

    public static void affiche(Array<Personnev2> tab){
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i));
        }
    }

    public static void saisie(Array<Personnev2> tab){
        Scanner s = new Scanner(System.in);
        System.out.print("How many people do you need to add ? : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            Personnev2 per = new Personnev2();
            per.setPerson();
            tab.add(per);
        }
    }

    public static Personnev2 getYounger(Array<Personnev2> tab){
        Personnev2 res = null;
        if(!tab.isEmpty()){
            res = tab.get(0);
            int n = tab.size()-1;
            while (n>=1){
                if(res.compareAge(tab.get(n))>0)
                    res = tab.get(n);
                n--;
            }
        }
        return res;
    }
}
