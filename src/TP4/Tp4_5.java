import java.util.Scanner;

public class Tp4_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos=0, neg=0,nul=0;
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            if (a>0){
                pos +=1;
            } else if (a<0) {
                neg +=1;
            }else{
                nul+=1;
            }

        }
        System.out.println("positifs : "+ pos);
        System.out.println("negatifs : "+ neg);
        System.out.println("nulles : "+ nul);
    }
}
