package TP12;

import eu.epfc.prm.Array;

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
        Array<Personne> table = new Array<Personne>();
        Scanner s = new Scanner(System.in);
        System.out.println("Combien de personnes voules vous enregister? : ");
        int n = s.nextInt();
        while(n>0){
            Personne p = new Personne();
            saisie(p);
            System.out.print("\n");
            table.add(p);
            n--;
        }

        for (int i = 0; i < table.size(); i++) {
            System.out.println("___________________________");
            afficheP(table.get(i));
        }
        System.out.println("_____________________________________________________________________________ \n");
        var younger = getyounger(table);
        afficheP(younger);
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
    public static void afficheD(Date d){System.out.print(d.jour+"/"+d.mois+"/"+d.annee);}
    public static void afficheP(Personne p){System.out.print(p.nom+ " "+p.prenom+" | "); afficheD(p.ddn);System.out.println(" ");}

    public static void saisie(Personne p){
        Scanner s = new Scanner(System.in);
        System.out.println(m4);
        p.nom = s.nextLine();
        System.out.println(m5);
        p.prenom = s.nextLine();
        System.out.println(m6);
        p.ddn = new Date();
        System.out.println(" ");
        saisie(p.ddn);
    }
    public static int compare(Date d1,Date d2){
        int j1 = d1.jour;int m1= d1.mois*100;int a1 = d1.annee*10000;
        int j2 = d2.jour;int m2= d2.mois*100;int a2 = d2.annee*10000;
        return (a1+m1+j1)-(a2+m2+j2);
    }

    public static int compareAge(Personne p1, Personne p2){
        return -compare(p1.ddn,p2.ddn);
    }

    public static int compareNomPrenom(Personne p1, Personne p2){
        String per1 = p1.nom +" "+p1.prenom;
        String per2 = p2.nom +" "+p2.prenom;
        return per1.compareToIgnoreCase(per2);
   }

   public static Personne getyounger(Array<Personne> table) {
       Personne res = null;
       if (!table.isEmpty()) {
           res = table.get(0);
           int n = table.size()-1;
           while (n >= 1) {
               if (compareAge(res, table.get(n)) > 0)
                   res = table.get(n);
               n--;
           }

       }
       return res;
   }
}
