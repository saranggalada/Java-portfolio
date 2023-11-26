import java.util.Scanner;

public class PermutationsCombinations { // calculates permutations and combinations
    public static long factorial(long n) { // handy factorial tool
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'p' for permutations or 'c' for combinations: ");
        char ch = input.next().charAt(0);
        System.out.print("Enter n value: ");
        long n = input.nextLong();
        long n1 = n;
        System.out.print("Enter r value: ");
        long r = input.nextLong();
        long r1 = r;
        long nr = n - r;
        long fnr = factorial(nr);// n-r factorial
        long fn = factorial(n); // n factorial
        long fr = factorial(r); // r factorial
        long p = (fn) / (fnr);
        long c = p / fr; // preparation
        switch (ch) { // gives user option btw p and c
            case 'p':
                System.out.println(n1 + "P" + r1 + " = " + p);
                break;
            case 'c':
                System.out.println(n1 + "C" + r1 + " = " + c);
        }
    }
}