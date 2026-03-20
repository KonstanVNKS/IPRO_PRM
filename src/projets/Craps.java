package projets;

import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Random d = new Random();
        int jetons = 10;
        int mise;
        System.out.println("==============================");
        System.out.println("  Bienvenue au jeu du craps   ");
        System.out.println("==============================" );

        do {

            System.out.println("vous avez " + jetons + " jetons");
            System.out.print("Combien voulez vous misez ? (0 pour arreter) :");
            Scanner m = new Scanner(System.in);
            do {
                mise = m.nextInt();
                if (mise < 0) {
                    System.out.println("Votre mise est incorrecte\nRecommencez");
                    System.out.println("vous avez " + jetons + " jetons");
                    System.out.print("Combien voulez vous misez ? (0 pour arreter) :");
                }
                if (mise > jetons){
                    System.out.println("Tu essaye de miser plus que vous avez\nRecommencez");
                    System.out.println("vous avez " + jetons + " jetons");
                    System.out.print("Combien voulez vous misez ? (0 pour arreter) :");
                }
            } while (mise < 0 || mise > jetons);
            if (mise > 0) {
                int d1 = d.nextInt(6) + 1;
                int d2 = d.nextInt(6) + 1;
                int somme = d1 + d2;
                jetons -= mise;
                System.out.println("Vous avez lancé " + d1 + " et " + d2 + " la somme est " + somme + ".");
                if (somme == 7 || somme == 11) {
                    System.out.println("gagné !");
                    jetons += 2 * mise;
                } else if (somme == 2 || somme == 3 || somme == 12) {
                    System.out.println("Perdu !");
                } else {
                    int but = somme;
                    System.out.println("Votre but est : " + but);
                    do {
                        d1 = d.nextInt(6) +1;
                        d2 = d.nextInt(6) +1;
                        somme = d1 + d2;
                        System.out.println("Vous avez lancé " + d1 + " et " + d2 + " la somme est " + somme + ".");
                        if (somme == 7) {
                            System.out.println("Perdu!");
                        } else {
                            if (somme == but) {
                                System.out.println("Gagné");
                                jetons += 2 * mise;
                            }
                        }
                    } while (!(somme == but) && somme != 7);
                }
            }
        } while (jetons > 0 && mise != 0);

        System.out.println("\n==============================");
        System.out.println("         Cheh t'es nul      ");
        System.out.println("==============================\n");
    }
}

