package TP14;
import eu.epfc.prm.Array;


public class Tp14 {
    public static void main(String[] args) {
        //ex1
        Array<String> texte = new Array<>(
                "Question 4) Imaginons qu'un texte soit memorise",
                "dans un tableau de strings. Chaque string du",
                "tableau correspond a une ligne du texte.", // space after
                "Les traitements de texte disposent en general d'une fonctionnalite",
                "qui, pour ameliorer la lisibilite, insere de l'espace vertical",
                "entre deux paragraphes. Pour nos besoins, la fin d'un paragraphe",
                "sera definie comme une ligne se terminant par un point ('.').",//space after
                "Ecrivez une fonction separerParagraphes(Array<String> texte)",
                "qui recoit un Array de String et qui insere un string vide",
                "apres chaque string se terminant par un point.", "Et donc cet exercice te casse les bonbons",
                "parce que nous n'utilisons pas la vrai class array.");
        affiche(texte);
        separerParagraphes(texte);
        affiche(texte);

        // ex2
    }

// -------------------------------------------------------ex1--------------------------------------------------------

    public static void affiche(Array<String> texte) {
        for (String s : texte) {
            System.out.println(s);
        }
        System.out.println("===========================================");
    }

    public static void separerParagraphes(Array<String> text){
        int nbPeriod = nbLinesEndingWithPeriod(text);
        int r = text.size()-1;
        text.extend(nbPeriod,"");
        int w = text.size()-1;
        while (w >r){
            String s = text.get(r);
            if (endWithPeriod(s)){
                text.set(w,"");
                --w;
            }
            text.set(w,s);
            --w;
            --r;
        }
    }

    public static int nbLinesEndingWithPeriod(Array<String> t){
        int cpt = 0;
        for (String s: t){
            if (endWithPeriod(s))
                ++cpt;
        }
        return cpt;
    }

    public static boolean endWithPeriod(String s){return (!s.isEmpty() && s.charAt(s.length()-1) == '.');}



//    --------------------------------------------------ex2-----------------------------

}
