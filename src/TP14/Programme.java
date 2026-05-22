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
        nouvelleMedaille(medailles, "Chypres");
        affiche(medailles);
    }

    public static void nouvelleMedaille(Array<MedaillePays> medailles, String pays){
//        if(!isIn(medailles,pays)){
//            MedaillePays p = new MedaillePays(1,pays);
//            medailles.add(p);
//        }else {
//            int i = 0;
//            while(i< medailles.size()) {
//                if (medailles.get(i).pays.compareToIgnoreCase(pays) == 0) {
//                    medailles.get(i).updateMedals();
//                    if(i>0) {
//                        int c = i - 1;
//                        while (c >= 0) {
//                            while (medailles.get(i).compareTo(medailles.get(c)) > 0) {
//                                var tmp = medailles.get(c);
//                                medailles.set(c, medailles.get(i));
//                                medailles.set(i, tmp);
//                            }
//                            c--;
//                        }
//                    }
//                }
//                i++;
//            }
//        }
        int idx = 0;
        while(idx < medailles.size() && pays.compareTo(medailles.get(idx).pays) !=0)
            idx++;
        if (idx == medailles.size())
            medailles.add(new MedaillePays(1,pays));
        else {
            medailles.get(idx).updateMedals();
            positionne(medailles,idx);
        }

    }

    private static void positionne(Array<MedaillePays> t,int idx) {
        var val = t.get(idx);
        while (idx > 0 && t.get(idx-1).compareTo(val)<0){
            t.set(idx, t.get(idx-1));
            --idx;
        }
        t.set(idx,val);
    }
}
