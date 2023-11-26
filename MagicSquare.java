import java.util.Scanner;

public class MagicSquare {
    int n, m[][], MagicVal;

    MagicSquare(int n) {
        this.n = n;
        m = new int[n][n];
        MagicVal = n * (n * n + 1) / 2;
    }

    void ReadMatrix() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ": ");
                m[i][j] = input.nextInt();
            }
        }
    }

    void PrintMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean isMagic() {
        int d1sum = 0;
        int d2sum = 0;
        for (int j = 0; j < n; j++) {
            d1sum += m[j][j];
            d2sum += m[n - (j + 1)][n - (j + 1)];
        }
        if (d1sum != MagicVal) {
            return false;
        }
        if (d2sum != MagicVal) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                int csum = 0;
                int rsum = 0;
                for (int j = 0; j < n; j++) {
                    rsum += m[i][j];
                    csum += m[j][i];
                }
                if (csum != MagicVal) {
                    return false;
                }
                if (rsum != MagicVal) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        MagicSquare msq = new MagicSquare(3);
        msq.ReadMatrix();
        System.out.println("Original matrix:");
        msq.PrintMatrix();
        if (msq.isMagic()) {
            System.out.println("Matrix is a magic square:");
        } else {
            System.out.println("Matrix is not a magic square:");
        }
        System.out.println("Magic value was " + msq.MagicVal);
    }
}