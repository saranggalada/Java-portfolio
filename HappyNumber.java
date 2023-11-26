import java.util.Scanner;

public class HappyNumber {
    int n;

    HappyNumber() {
        n = 0;
    }

    void getNum(int nn) {
        n = nn;
    }

    int sum_sq_digits(int x) {
        if (x == 0) {
            return 0;
        } else {
            return ((x % 10) * (x % 10) + sum_sq_digits(x / 10));
        }
    }

    void isHappy() {
        int s = sum_sq_digits(n);
        while (s > 9) {
            s = sum_sq_digits(s);
        }
        if (s == 1) {
            System.out.print(n + " is");
        } else {
            System.out.print(n + " isn't");
        }
        System.out.println(" a Happy Number.");
    }

    public static void main(String[] args) {
        HappyNumber H = new HappyNumber();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        H.getNum(input.nextInt());
        H.isHappy();
    }
}
