import java.util.Scanner;

public class Determinant {
    Scanner input = new Scanner(System.in);
    double a[][];
    int n;

    Determinant() {
    }

    void getMat() {
        System.out.print("Enter the order of the Determinant: ");
        n = input.nextInt();
        a = new double[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ": ");
                a[i][j] = input.nextDouble();
            }
        }
    }

    double[][] cofactor(double[][] mat, int r, int c) {
        int l = mat.length;
        double[][] x = new double[l - 1][l - 1];
        int ii = 0;
        for (int i = 0; i < l; i++) {
            if (i == r)
                continue;
            int jj = 0;
            for (int j = 0; j < l; j++) {
                if (j == c)
                    continue;
                x[ii][jj] = mat[i][j];
                jj++;
            }
            ii++;
        }
        return x;
    }

    double det(double M[][], int n) {
        double result;
        if (n == 2)
            result = M[0][0] * M[1][1] - M[1][0] * M[0][1];
        else {
            result = 0;
            for (int j = 0; j < n; j++) {
                double[][] m = cofactor(M, 0, j);
                result += (Math.pow(-1.0, 2 + j) * M[0][j] * det(m, n - 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Determinant d = new Determinant();
        d.getMat();
        System.out.println("Determinant = " + d.det(d.a, d.n));
    }
}