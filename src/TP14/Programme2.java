package TP14;

import eu.epfc.prm.Array;
import TP14.Joueur.*;

public class Programme2 {
    public static void main(String[] args) {
        Array<Joueur> e = new Array<>();
        gestion(e, "Anne", 90);
        gestion(e, "Daniel", 20);
        gestion(e, "Emile", 60);
        gestion(e, "Jules", 18);
        gestion(e, "Julie", 30);
        gestion(e, "Raoul", 11);

        affiche(e);

        System.out.println("======================================");

        gestion(e, "Julie", 20);

        affiche(e);

        System.out.println("======================================");

        gestion(e, "Daniel", 40);

        affiche(e);

        System.out.println("======================================");

        gestion(e, "Carine", 25);

        affiche(e);
        System.out.println("======================================");
    }

    public static void gestion(Array<Joueur> t, String n, int s) {
        int idx = 0;
        while (idx < t.size() && t.get(idx).idJoueur.compareTo(n) < 0)
            ++idx;
        if (idx < t.size() && t.get(idx).idJoueur.compareTo(n) == 0) {
            if (t.get(idx).compareScore(s)<=0)
                t.get(idx).score = s;
            else
                remove(t,idx);
        }
        else{
            Joueur nJ = new Joueur(n, s);
            ajout_nv_jouer(t,nJ, idx);
        }
    }

    public static void affiche(Array<Joueur> t){
        for (int i = 0; i < t.size(); i++) {
            System.out.print(t.get(i));
        }
    }

    public static void remove(Array<Joueur> t,int idx){
        var last = t.get(idx);
        for (int i = idx+1; i < t.size(); i++) {
            t.set(i-1, t.get(i));
        }
        t.set(t.size()-1,last);
        t.reduceTo(t.size()-1);
    }

    public static void ajout_nv_jouer(Array<Joueur> t, Joueur nJ, int p){
        t.add(null);
        for (int i = t.size()-1; i > p ; i--) {
            var tmp = t.get(i-1);
            t.set(i, tmp);
        }
        t.set(p,nJ);
    }
}
