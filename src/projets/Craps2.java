package projets;
import java.util.Random;
import java.util.Scanner;

public class Craps2 {
    static Random d = new Random();
    static Scanner s = new Scanner(System.in);

    public static int lancerUnDe(){
        int de;
        de = d.nextInt(6)+1;
        return de;
    }
    public static void afficherDes(int de1, int de2){
        System.out.println("Vous avez lance " + de1 + " et " + de2+". La somme est " + (de1+de2));
    }
    public static int saisirMise(int nbjetons){
        System.out.println("Vous avez " + nbjetons + " jetons");
        System.out.print("Combien voulez vous miser ? (0 pour arreter) :");
        int mise = s.nextInt();
        if(mise >=0 && mise<=nbjetons) {
            nbjetons -= mise;
        }
        else {
            System.out.println("Vous pouvez pas miser plus que ce que vous avez!! Recommencez");
            System.out.print("Combien voulez vous miser ? (0 pour arreter) :");
            mise = s.nextInt();
            nbjetons -=mise;
        }
        return nbjetons;
    }
    public static boolean joueEtGagneUnTourDeCraps(){
        boolean win = true;
        int de1 = lancerUnDe() , de2 = lancerUnDe();
        afficherDes(de1,de2);
        if(de1+de2 == 7 || de1+de2 == 11) {
            win = true;
        }
        else if (de1+de2 == 2 || de1+de2 == 3 || de1+de2 == 12) {
            win = false;
        }
        else{
            int but = de1+de2;
            System.out.println("Votre but est " + but);
            do{
                de1 = lancerUnDe(); de2 =lancerUnDe();
                afficherDes(de1,de2);
                if(de1+de2 == 7) {
                    win = !win;
                }
                else{
                    if(de1+de2 == but) {
                        win = win;
                    }
                }
            }while(!(de1+de2 == but) && de1+de2 != 7);
        }
        return win;
    }
    public static int actualiserMise(int nbsjetons,int nbmjetons){
        int mise = nbsjetons - nbmjetons;
        nbmjetons += 2*mise;
        return nbmjetons;
    }

    public static void initGame() {
        System.out.println("==============================");
        System.out.println("  Bienvenue au jeu du craps   ");
        System.out.println("==============================" );
        System.out.print("Avec combien de jetons voulez vous commencez ? : ");

    }

    public static void main(String[] args) {
        initGame();
        int nbjetons = s.nextInt();
        int nbmjetons=saisirMise(nbjetons);
        do {
            if (joueEtGagneUnTourDeCraps()) {
                nbjetons=actualiserMise(nbjetons, nbmjetons);
                System.out.println("gagné");
                nbmjetons = saisirMise(nbjetons);


            } else {
                    System.out.println("perdu");
                    nbmjetons = saisirMise(nbmjetons);
            }
            nbjetons = nbmjetons;
        }while(nbjetons > 0);
    }
}
