package TP14;

import eu.epfc.prm.Array;

import java.util.Scanner;

public class Programme {
    public static void affiche(Array<MedaillePays> medailles) {
        System.out.println("Médailles des pays :");
        for (MedaillePays m : medailles) {
            System.out.println(m);
        }
        System.out.println("============================================");
    }
    public static void main(String[] args) {
        Array<MedaillePays> medailles = new Array<>();
        nouvelleMedaille(medailles, "Belgique");
        affiche(medailles);
        nouvelleMedaille(medailles, "France");
        affiche(medailles);
        nouvelleMedaille(medailles, "France");
        affiche(medailles);
        nouvelleMedaille(medailles, "Allemagne");
        affiche(medailles);
        nouvelleMedaille(medailles, "Belgique");
        affiche(medailles);
        nouvelleMedaille(medailles, "Belgique");
        affiche(medailles);
        nouvelleMedaille(medailles, "Grece");
        nouvelleMedaille(medailles, "Chypres");
        nouvelleMedaille(medailles, "USA");
        affiche(medailles);
    }

    public static void nouvelleMedaille(Array<MedaillePays> medailles, String pays){
        if(!isIn(medailles,pays)){
            MedaillePays p = new MedaillePays(1,pays);
            medailles.add(p);
        }else {

            for (int i = 0; i < medailles.size(); i++) {
                if (medailles.get(i).pays.compareToIgnoreCase(pays) == 0) {
                    medailles.get(i).updateMedals();
                    if(i>0) {
                        int c = i - 1;
                        while (c <= 0) {
                            if (medailles.get(i).compareTo(medailles.get(c)) > 0) {
                                var tmp = medailles.get(c);
                                medailles.set(c, medailles.get(i));
                                medailles.set(i, tmp);
                            }
                            c--;
                        }
                    }
                }
            }
        }

    }

    private static boolean isIn(Array<MedaillePays> t,String pays) {
        for (MedaillePays p : t){
            if(p.pays.compareToIgnoreCase(pays) == 0)
                return true;
        }
        return false;
    }

}
