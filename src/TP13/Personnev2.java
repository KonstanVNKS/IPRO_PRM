package TP13;
import java.time.LocalDate;
import java.util.Scanner;
import TP13.Datev2.*;


public class Personnev2 {
    public String nom, prenom;
    public Datev2 ddn;

    public Personnev2(String nom, String prenom, Datev2 ddn){
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
   }

   public Personnev2(){}

   public void setPerson(){
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the name and surname of the person : ");
        this.nom = s.next();
        this.prenom = s.next();
        this.ddn = new Datev2();
        this.ddn.setDate();
   }

   public void affiche(){
       System.out.print(this.nom + " " + this.prenom+"\n"+"Born on the :" + " " );
       this.ddn.show();
   }

   public int compareAge(Personnev2 other){
        return -ddn.compare(other.ddn);
   }

   public int compareName(Personnev2 other){
        String per1 = this.nom+" "+this.prenom;
        String per2 = other.nom+" "+other.prenom;
        return per1.compareToIgnoreCase(per2);
   }

    @Override
    public String toString() {
        return this.nom + " " + this.prenom + " " + this.ddn.toString();
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        int jour = now.getDayOfMonth();
        int mois = now.getMonthValue();
        int annee = now.getYear();
        Datev2 other = new Datev2(jour,mois,annee);
        return -ddn.compare(other)/10000;
    }


}
