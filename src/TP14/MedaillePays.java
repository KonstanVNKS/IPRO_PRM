package TP14;

public class MedaillePays {
    public int medailles;
    public String pays;

    public MedaillePays(int medailles, String pays) {
        this.medailles = medailles;
        this.pays = pays;
    }

    public int compareTo(MedaillePays other){return this.medailles-other.medailles;}

    @Override
    public String toString(){return this.pays + " : " + this.medailles +" medailles";}

    public void updateMedals(){
        this.medailles++;
    }
}
