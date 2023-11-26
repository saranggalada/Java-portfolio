//Prints multiplication tables of a number

import java.util.Scanner;

public class Multiplication_Tables {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        System.out.print("How many entries of the multiplication table of " + (n) + " do you want?: ");
        int m = inp.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.println(n + " x " + i + " = " + (i * n));
        }
    }
}
