import java.util.Scanner;
import java.util.Arrays;

public class StringSwap {
    Scanner input = new Scanner(System.in);
    String Sent;

    StringSwap() {
        this.Sent = "";
    }

    void getSentence() {
        System.out.print("Enter a sentence: ");
        Sent = input.nextLine();
    }

    String SwapAdj(String word) {
        char t;
        int l = word.length();
        char[] a = new char[l];
        for (int x = 0; x < l; x++) {
            a[x] = word.charAt(x);
        }
        for (int y = 0; y < 2 * (l / 2); y += 2) {
            t = a[y];
            a[y] = a[y + 1];
            a[y + 1] = t;
        }
        String swap = new String(a);
        return swap;
    }

    void printSwapSent() {
        String[] words = Sent.split(" ");
        for (int x = 0; x < words.length; x++) {
            words[x] = SwapAdj(words[x]);
        }
        String swapstring = Arrays.toString(words);
        swapstring = swapstring.substring(1, swapstring.length() -
                1);
        swapstring = swapstring.replaceAll(",", "");
        System.out.println(swapstring);
    }

    public static void main(String[] args) {
        StringSwap s = new StringSwap();
        s.getSentence();
        s.printSwapSent();
    }
}
