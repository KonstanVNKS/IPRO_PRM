package TP7;

public class Tp7_13 {
    public static void drawSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        drawSquare(5);
    }
}
