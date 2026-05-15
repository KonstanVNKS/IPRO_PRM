package TP13;
import java.util.Scanner;

public class Datev2 {

    public int jour, mois, annee;


    public Datev2(int day, int month, int year){
        this.jour = day;
        this.mois= month;
        this.annee= year;
    }

    public Datev2(){}

    public void setDate(){
        Scanner s = new Scanner(System.in);
        System.out.print("Saisissez la date :");
        this.jour = s.nextInt();
        this.mois= s.nextInt();
        this.annee= s.nextInt();
    }

    public void show(){
        System.out.println(this.jour+"/"+this.mois+"/"+this.annee);
    }

    public int compare(Datev2 d2){
        return (this.jour+(this.mois*10)+(this.annee*10000))-(d2.jour+(d2.mois*10)+(d2.annee*10000));
    }

    @Override
    public String toString() {
        return this.jour+"/"+this.mois+"/"+this.annee;
    }
}
