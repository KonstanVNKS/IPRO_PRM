import java.util.Scanner;

//public class Ex12 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int strt1, strt2,nd1,nd2;
//        strt1 = s.nextInt();
//        strt2 = s.nextInt();
//        nd1 = s.nextInt();
//        nd2 = s.nextInt();

//        int duree1,duree2;
//        duree1 = (nd1 - strt1) %60;
  //      duree2 = (nd2 - strt2) %60;

    //    System.out.println("la duree de l'evenement est de : " + duree1 + "h "+ duree2+ "min");

    //}
//}

public class Ex12 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int strt1, strt2,nd1,nd2;
        strt1 = s.nextInt();
        strt2 = s.nextInt();
        nd1 = s.nextInt();
        nd2 = s.nextInt();

        strt1 *=60;
        nd1 *=60;

        int debut = strt1+strt2;
        int fin = nd1+nd2;

        int duree = fin - debut;
        int d_h = duree / 60;
        int d_m = duree % 60;
        System.out.println("La durée de l'event est de : " + d_h + "h "+ d_m + "min ");

    }
}
