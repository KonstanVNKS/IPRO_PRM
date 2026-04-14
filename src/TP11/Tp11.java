package TP11;
import java.util.Scanner;

public class Tp11 {
    public static void main(String[] args) {

        System.out.println(isMin('z'));
        System.out.println(getCaps('z'));
        System.out.println(allmin("gqserhughusyeq"));
        System.out.println(allmin("Bohbeuqgfdukyegyfkg"));
        System.out.println(Capslock("kosta"));
        System.out.println(ocurrencesOf("Konstantinos", 'n'));
        System.out.println(reverse("Konstantinos"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(palindromeSentence("Esope reste ici et se repose"));
        System.out.println(sontEgaux("moi","moi"));
        System.out.println(compare("bonbon", "bonbon"));
        System.out.println(intPositifToString(123));
        System.out.println(intToString(-108545494));
        int[] freq = tableOfOccurrences("je vais sur la lune et sur mars pour trouver de la biere pas chere");
        display(freq);
        System.out.println(capsForStOfWord("je suis konstantinos et je mange"));
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
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean palindromeSentence(String s){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ')
                res.append(s.charAt(i));
        }
        return isPalindrome(Capslock(res.toString()));
    }

    public static boolean sontEgaux(String s1, String s2){
        boolean is = true;
        int j = 0;
        int i = 0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j))
                is=false;
            i++;j++;
        }
        return is;
    }

    public static  int compare(String ch1, String ch2){
        int len1 = ch1.length();
        int len2 = ch2.length();
        int minlen = Math.min(len1, len2);
        for (int i = 0; i < minlen; i++) {
            char c1=ch1.charAt(i);
            char c2=ch2.charAt(i);

            if(c1!=c2)
                return c1-c2;
        }
        return len1-len2;
    }

    public static String intPositifToString(int s){
        StringBuilder res = new StringBuilder();
        if(s<0)
            throw new RuntimeException("l'entier doit etre positif");
        res.append(s);
        return res.toString();
    }

    public static String intToString(int s){
        StringBuilder t = new StringBuilder();
        t.append(s);
        return t.toString();
    }

    public static int[] tableOfOccurrences(String t){
        int[] freq = new int[26];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (Character.isLetter(c)){
                c = getCaps(c);
                int idx = c-'A';
                freq[idx]++;
            }
        }
        return freq;
    }

    public static void display(int[] freq){
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0){
                char l = (char)('A'+i);
                System.out.print(l +" : "+freq[i]+" | ");
            }
        }
        System.out.println(" ");
    }

    public static String capsForStOfWord(String t){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            if(i==0 ||( t.charAt(i-1)< 'A' && t.charAt(i-1)> 'Z') || (t.charAt(i-1)< 'a' && t.charAt(i-1)> 'z'))
                res.append(getCaps(t.charAt(i)));
            else
                res.append(t.charAt(i));
        }
        return res.toString();
    }

    // if(i==0 || t.charAt(i-1)< 'A' && t.charAt(i-1)> 'Z' && t.charAt(i-1)< 'a' && t.charAt(i-1)> 'z')

}
