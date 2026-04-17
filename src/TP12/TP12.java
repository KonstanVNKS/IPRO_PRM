package TP12;

import java.util.Scanner;

public class TP12 {
    // message à afficher quand on demande au user d'entrer une valeur
    public static String m1 = "veillez renseigner un jour";
    public static String m2 = "veillez renseigner un mois";
    public static String m3 = "veillez renseigner une annee";
    public static String m4 = "veillez renseigner un nom";
    public static String m5 = "veillez renseigner un prenom";
    public static String m6 = "veillez renseigner une date";


    public static void main(String[] args) {
        Date d = new Date();
        Personne p = new Personne();
//        saisie(d);
//        afficheD(d);
        saisie(p);
        afficheP(p);
    }
    public static void saisie (Date d){
        Scanner s = new Scanner(System.in);
        System.out.println(m1);
        d.jour = s.nextInt();
        System.out.println(m2);
        d.mois = s.nextInt();
        System.out.println(m3);
        d.annee = s.nextInt();
    }
    public static void afficheD(Date d){
        System.out.println(d.jour+"/"+d.mois+"/"+d.annee);
    }
    public static void afficheP(Personne p){
        System.out.print(p.nom+ " "+p.prenom+" "); afficheD(p.ddn);
    }

    public static void saisie(Personne p){
        Scanner s = new Scanner(System.in);
        System.out.println(m4);
        p.nom = s.nextLine();
        System.out.println(m5);
        p.prenom = s.nextLine();
        System.out.println(m6);
        p.ddn = new Date();
        saisie(p.ddn);
    }
}
