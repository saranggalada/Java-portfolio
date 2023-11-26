import java.util.Scanner;

public class PalindromeSort {
    String data;
    Scanner input = new Scanner(System.in);

    PalindromeSort() {
    }

    void readData() {
        System.out.print("Enter a sentence: ");
        data = input.nextLine();
    }

    boolean isPalin(String word) {
        int l = word.length();
        if (word.charAt(0) != word.charAt(l - 1)) {
            return false;
        } else {
            if (l > 2) {
                return isPalin(word.substring(1, l - 1));
            } else {
                return true;
            }
        }
    }

    void print() {
        String p = "";
        String q = "";
        String[] a = data.split(" ");
        for (int x = 0; x < a.length; x++) {
            if (isPalin(a[x])) {
                p += (a[x] + " ");
            } else {
                q += (a[x] + " ");
            }
        }
        System.out.println("Palindrome sorted sentence is: " + p + q);
    }

    public static void main(String[] args) {
        PalindromeSort p = new PalindromeSort();
        p.readData();
        p.print();
    }
}