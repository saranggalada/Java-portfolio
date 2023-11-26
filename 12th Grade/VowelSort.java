import java.util.Scanner;

public class VowelSort {
    Scanner input = new Scanner(System.in);
    String wrd, newwrd;

    VowelSort() {
    }

    void readword() {
        System.out.print("Enter a word: ");
        wrd = (input.next()).toUpperCase();
    }

    void freq() {
        int v = 0;
        char ch;
        for (int x = 0; x < wrd.length(); x++) {
            ch = wrd.charAt(x);
            if ("AEIOU".indexOf(ch) != -1) {
                v++;
            }
        }
        System.out.println("No. of vowels: " + v);
        System.out.println("No. of consonants: " + (wrd.length() - v));
    }

    void arrange() {
        String v = "";
        String c = "";
        char ch;
        for (int x = 0; x < wrd.length(); x++) {
            ch = wrd.charAt(x);
            if ("AEIOU".indexOf(ch) != -1) {
                v += ch;
            } else {
                c += ch;
            }
        }
        newwrd = v + c;
    }

    void display() {
        System.out.println("Original word: " + wrd);
        System.out.println("After sorting vowels & consonants: " + newwrd);
    }

    public static void main(String[] args) {
        VowelSort x = new VowelSort();
        x.readword();
        x.freq();
        x.arrange();
        x.display();
    }
}
