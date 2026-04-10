package TP11;

public class Tp11 {
    public static void main(String[] args) {
        System.out.println(isMin('z'));
        System.out.println(getCaps('z'));
        System.out.println(allmin("gqserhughusyeq"));
        System.out.println(allmin("Bohbeuqgfdukyegyfkg"));
        System.out.println(Capslock("kosta"));
        System.out.println(ocurrencesOf("Konstantinos", 'n'));
        System.out.println(reverse("Konstantinos"));
        System.out.println(isPalindrome("electrique"));
    }

    public static boolean isMin(char c){
        return c >= 'a' && c<='z';
    }

    public static char getCaps(char c){
        char res = c;
        if(isMin(c)){
          res = (char)((int)c + ((int)'A'-(int)'a'));
        }
        return res;
    }

    public static boolean allmin(String s){
        boolean res = true;
        int i = 0;
        while(i< s.length() && res){
            if(!isMin(s.charAt(i)))
                res = false;
            i++;
        }
        return res;
    }

    public static String Capslock(String s){
        StringBuilder res = new StringBuilder(); // stringBiulder permet de creer un string muable
        for (int i = 0; i < s.length(); i++) {
            res.append(getCaps(s.charAt(i)));
        }
        return res.toString();
    }

    public static int ocurrencesOf(String s, char trg){
        int nb =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == trg)
                nb++;
        }
        return nb;
    }

    public static String reverse(String s){
        StringBuilder res = new StringBuilder();
        for (int i = s.length()-1; i >= 0 ; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static boolean isPalindrome(String s){
        boolean res = true;
        for (int i = 0; i <= s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                res = false;
            }
        }
        return res;
    }

    public static boolean palindromeSentence(String s){

    }

}
