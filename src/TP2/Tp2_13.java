import java.util.Scanner;

public class Tp2_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        if (h == 23 && m == 59){
            System.out.println("00h00");
        }else{
            if (m>=0 && m<59){
                m+=1;
                System.out.println(h+"h "+m);
            } else if (m==59) {
                m = 0;
                h+=1;
                System.out.println(h+"h "+m);

            }
        }

    }
}
