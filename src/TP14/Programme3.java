package TP14;

import eu.epfc.prm.Array;

public class Programme3 {
    public static void main(String[] args) {
        Array<Carte> jeu = new Array<>();
        Carte coeur5 = new Carte(5, 2), carreau5 = new Carte(5, 1),
                trefle7 = new Carte(7, 0), piqueAs = new Carte(1, 3),
                trefle5 = new Carte(5, 0);
        System.out.println("Affichage de la Carte(5,2) : " + coeur5);
        System.out.println("Affichage de la Carte(1,3) : " + piqueAs);
        System.out.println("Affichage de la Carte(11,0) : "
                + new Carte(11,0));
        System.out.println("Affichage de la Carte(12,1) : "
                + new Carte(12,1));
        System.out.println("Affichage de la Carte(13,3) : "
                + new Carte(13,3));
        System.out.println(" ");
        joue(jeu, coeur5);
        joue(jeu, carreau5);
        joue(jeu, trefle7);
        joue(jeu, piqueAs);
        affiche(jeu, "Jeu :");
        joue(jeu, trefle5);
        affiche(jeu, "Jeu après l'introduction d'un brelan :");
        joue(jeu, trefle7);
        affiche(jeu, "Jeu après l'ajout d'une carte déjà existante("+trefle7+") :");
    }

    public static void joue(Array<Carte> j, Carte c) {
        if(!existe(j,c))
            if(nbCarteValeur(j,c)==2){
                Array<Carte> brelan = removeCards(j,c.valeur);
                ajout_carte(brelan,c);
                affiche(brelan, "brelan : ");
            }else
                ajout_carte(j,c);

    }

    public static Array<Carte> removeCards(Array<Carte> jeu, int valeur) {
        Array<Carte> res = new Array<>();
        int toWrite = 0;
        for(int toRead = 0; toRead < jeu.size(); ++toRead){
            if(jeu.get(toRead).valeur == valeur) {
                res.add(jeu.get(toRead));
            } else {
                jeu.set(toWrite, jeu.get(toRead));
                ++toWrite;
            }
        }
        jeu.reduceTo(toWrite);
        return res;
    }

    public static int nbCarteValeur(Array<Carte> j, Carte c) {
        int nb = 0;
        for (int i = 0; i < j.size() && j.get(i).valeur <= c.valeur; i++) {
            if(j.get(i).valeur == c.valeur)
                nb++;
        }
        return nb;
    }

    public static boolean existe(Array<Carte> jeu, Carte c) {
        for (Carte cc : jeu) {
            if (cc.compareTo(c) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void affiche (Array<Carte> j, String txt){
        System.out.println(txt);
        for (int i = 0; i < j.size(); i++) {
            System.out.println(j.get(i));
        }
    }

    public static void ajout_carte(Array<Carte> j , Carte c){
        int idx = pos(j,c);
        j.add(null);
        for (int i = j.size()-1; i > idx ; i--) {
            var tmp = j.get(i-1);
            j.set(i, tmp);
        }
        j.set(idx,c);
    }

    public static int pos(Array<Carte> j , Carte c){
        int idx = 0;
        while (idx < j.size() && j.get(idx).compareTo(c)<0)
            idx++;
        return idx;
    }

}
