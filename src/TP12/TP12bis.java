package TP12;
import eu.epfc.prm.Array;
import TP12.TP12.*;
import TP12.Date; import TP12.Personne;

import java.util.Scanner;



public class TP12bis {
    public static void main(String[] args) {

        saisir(5);
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i));
        }


    }

    public static Array<Integer> tab = new Array<>();
    public static Array<Personne> p = new Array<>();

    /* Here under are the basic code for the principal types of sort*/
    public static void triSelection(Array<Integer> tab) {
        for (int i = 0; i < tab.size() - 1; i++) {
            int indMin = i;
            for (int j = 0; j < tab.size(); j++) {
                if (tab.get(j) < tab.get(indMin))
                    indMin = j;
            }
            int tmp = tab.get(i);
            tab.set(i, tab.get(indMin));
            tab.set(indMin, tmp);
        }
    }

    public static void triInsertion(Array<Integer> tab) {
        for (int i = 0; i < tab.size(); i++) {
            var val = tab.get(i);
            int j = i;
            while (j > 0 && val < tab.get(j - 1)) {
                tab.set(j, tab.get(j - 1));
                --j;
            }
            tab.set(j, val);
        }
    }

    public static void triBulle(Array<Integer> tab) {
        for (int i = tab.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tab.get(j) > tab.get(j + 1)) {
                    int tmp = tab.get(j);
                    tab.set(j, tab.get(j + 1));
                    tab.set(j + 1, tmp);
                }
            }
        }
    }

    public static void triParNom(Array<Personne> per) {
        //tri select pour le tri par nom prenom
        for (int i = 0; i < per.size() - 1; i++) {
            int indMin = i;
            for (int j = 0; j < per.size(); j++) {
                if (TP12.compareNomPrenom(per.get(j), per.get(indMin)) < 0) {
                    indMin = j;
                }
            }
            Personne tmp = per.get(i);
            per.set(i, per.get(indMin));
            per.set(indMin, tmp);
        }
    }

    public static void triParAge(Array<Personne> per) {
        // tri insert pour le tri des age
        for (int i = 0; i < per.size(); i++) {
            var val = per.get(i);
            int j = i;
            while (j > 0 && TP12.compareAge(val, per.get(j - 1)) > 0) {
                per.set(j, per.get(j - 1));
                --j;
            }
            per.set(j, val);
        }
    }

    public static void saisir(int n) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Entre le " + i + "eme nombre : ");
            int val = s.nextInt();
            insertion(val, tab);
        }
    }

    public static void insertion(int nb, Array<Integer> tab) {
        tab.add(nb);
        int i = tab.size() - 1;
        while (i > 0 && tab.get(i) < tab.get(i - 1)) {
            int tmp = tab.get(i);
            tab.set(i, tab.get(i - 1));
            tab.set(i - 1, tmp);
            i--;
        }
    }


    public static void saisirP(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Entre le " + i + "eme nombre : ");
            Personne po = new Personne();
            TP12.saisie(po);
            insertP(po, p);
        }
    }
    private static void insertP(Personne po, Array<Personne> p) {
        p.add(po);
        int i = p.size()-1;
        while (i>0 && TP12.compareNomPrenom(p.get(i), p.get(i-1))<0){
            var tmp = p.get(i);
            p.set(i, p.get(i-1));
            p.set(i-1,tmp);
        }
    }
}