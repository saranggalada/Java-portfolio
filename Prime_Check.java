import java.util.Scanner;

public class Prime_Check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt(); // receives input
        int x = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // checks divisibility
                x++;
            }
        }

        // decides output
        if (x == 0) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }
}
