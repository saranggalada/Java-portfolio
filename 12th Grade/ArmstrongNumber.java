import java.util.Scanner;

public class ArmstrongNumber {
    int n, l;

    ArmstrongNumber(int nn) {
        n = nn;
        l = Integer.toString(n).length();
    }

    int sum_pow(int i) {
        if (i == 0) {
            return 0;
        } else {
            return (int) (Math.pow(i % 10, l) + sum_pow(i / 10));
        }
    }

    void isArmstrong() {
        if (n == sum_pow(n)) {
            System.out.println(n + " is an Armstrong Number!");
        } else {
            System.out.println(n + " isn't an Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        ArmstrongNumber a = new ArmstrongNumber(x);
        a.isArmstrong();
    }
}