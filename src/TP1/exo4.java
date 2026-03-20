import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entières");
        a = scan.nextInt();
        b = scan.nextInt();
        int temp = b;
        b = a;
        a = temp;
        // Complétez ici uniquement sans rien changer

        System.out.print("Les voici inversées: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }
}

