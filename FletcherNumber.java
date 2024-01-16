import java.util.Scanner;

public class FletcherNumber {
    int fno;
    Scanner input = new Scanner(System.in);

    FletcherNumber() {
        System.out.print("Enter a number: ");
        fno = input.nextInt();
    }

    boolean isPrime(int p, int i) {
        if (p == 2) {
            return true;
        }
        if (p % i == 0) {
            return false;
        }
        if (p < i * i) {
            return true;
        } else {
            return isPrime(p, ++i);
        }
    }

    int rotate(int n) {
        String s = Integer.toString(n), p = "";
        int len = s.length();
        for (int x = 0; x < len; x++) {
            p += s.charAt((len + x - 1) % len);
        }
        return Integer.parseInt(p);
    }

    boolean checkFletcher() {
        boolean b = true;
        int l = (Integer.toString(fno)).length(), m = fno;
        for (int x = 0; x < l; x++) {
            for (int y = 0; y < x; y++) {
                m = rotate(m);
            }
            if (!isPrime(m, 2)) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        FletcherNumber f = new FletcherNumber();
        System.out.println(f.checkFletcher());
    }
}
