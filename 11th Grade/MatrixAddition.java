import java.util.*;

public class MatrixAddition { // Creates 2 matrices from user input
    public static void display(int[][] m) { // and prints their sum
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            } // Displays the final/sum matrix
            System.out.println();
        }
    }

    public static void add(int[][] m, int[][] m1, int[][] m2) {
        System.out.println(" =");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) { // Adds the 2 matrices
                m[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getMatrix(int[][] m, int n) { // Creates matrices from user input
        Scanner input = new Scanner(System.in);
        System.out.println("For matrix " + n + ": ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ":");
                m[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows per matrix: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns per matrix: ");
        int columns = input.nextInt();
        int[][] m1 = new int[rows][columns];
        getMatrix(m1, 1);
        int[][] m2 = new int[rows][columns];
        getMatrix(m2, 2);
        int[][] m = new int[rows][columns];
        System.out.println();
        display(m1);
        System.out.println(" +");
        display(m2);
        add(m, m1, m2);
    }
}
