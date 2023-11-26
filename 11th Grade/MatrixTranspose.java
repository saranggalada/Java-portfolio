import java.util.*;

public class MatrixTranspose {

    public static void transpose(int[][] m1, int[][] m2) { // converts rows to columns and vice versa
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m2[i][j] = m1[j][i];
            }
        }
        System.out.println("Converted to");
    }

    public static void display(int[][] m) { // Displays the final/sum matrix
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void getMatrix(int[][] m) { // Creates matrices from user input
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ":");
                m[i][j] = input.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows in square matrix: ");
        int n = input.nextInt();
        int[][] m = new int[n][n];
        int[][] mat = new int[n][n];
        getMatrix(m);
        display(m);
        transpose(m, mat);
        display(mat);
    }
}