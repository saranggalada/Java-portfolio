import java.util.Scanner;

public class WordMerge {
    String wrd;
    int len;

    WordMerge() {
        wrd = "";
        len = 0;
    }

    void feedWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        wrd = input.next().toUpperCase();
        len = wrd.length();
    }

    void mixWord(WordMerge p, WordMerge q) {
        int i = 0;
        int j = 0;
        while (true) {
            if (i < p.len && j < q.len) {
                this.wrd += p.wrd.charAt(i);
                this.wrd += q.wrd.charAt(j);
            } else {
                break;
            }
            i++;
            j++;
        }
        if (i < p.len)
            this.wrd += p.wrd.substring(i);
        if (j < q.len)
            this.wrd += q.wrd.substring(i);
    }

    void display() {
        System.out.println(wrd);
    }

    public static void main(String[] args) {
        WordMerge obj1 = new WordMerge();
        WordMerge obj2 = new WordMerge();
        WordMerge result = new WordMerge();
        obj1.feedWord();
        obj2.feedWord();
        result.mixWord(obj1, obj2);
        result.display();
    }
}