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
        System.out.println("");
        joue(jeu, coeur5);
        joue(jeu, carreau5);
        joue(jeu, trefle7);
        joue(jeu, piqueAs);
        affiche(jeu, "Jeu :");
        joue(jeu, trefle5);
        affiche(jeu, "Jeu après l'introduction d'un brelan :");
        joue(jeu, trefle7);
        affiche(jeu, "Jeu après l'ajout d'une carte déjà
                existante("+trefle7+") :");
    }

    public static void joue(Array<Carte> jeu, Carte coeur5) {
    }

}
