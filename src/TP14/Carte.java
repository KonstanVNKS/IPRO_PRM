package TP14;


import eu.epfc.prm.Array;

public class Carte {
    public int valeur, couleur;
    private static Array<String> nom_couleur = new Array<>("tréfle", "carreau", "coeur", "pique");
    private static Array<String> nom_carte = new Array<>("As","2","3", "4","5","6","7","8","9","10","Valet","Dame","Roi");

    public Carte(int valeur, int couleur) {
        if (valeur < 1 || valeur > 13 || couleur < 0 || couleur > 3)
            throw new Error("Erreur paramètre");
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int compareTo( Carte other){
        if(this.valeur == other.valeur)
            return this.couleur- other.couleur;
        return this.valeur - other.valeur;
    }

    @Override
    public String toString(){
        return nom_carte.get(this.valeur-1) + " de " + nom_couleur.get(this.couleur);
    }
}
