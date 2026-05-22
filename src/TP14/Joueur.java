package TP14;

public class Joueur {
    public String idJoueur;
    public int score;

    public Joueur(String idJoueur, int score){
        this.idJoueur = idJoueur;
        this.score = score;
    }

    public int compareScore( int other){
        return this.score-other;
    }
    @Override
    public String toString(){
        return this.idJoueur + " " + this.score + " \n";
    }


}
