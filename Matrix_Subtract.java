import java.util.Scanner;

public class Matrix_Subtract {
    int n, m, mat[][];

    Matrix_Subtract(int m, int n) {
        this.n = n;
        this.m = m;
        mat = new int[m][n];
    }

    void getMatrix() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ": ");
                mat[i][j] = input.nextInt();
            }
        }
    }

    Matrix_Subtract subtract(Matrix_Subtract S) {
        Matrix_Subtract M = new Matrix_Subtract(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                M.mat[i][j] = this.mat[i][j] - S.mat[i][j];
            }
        }
        return M;
    }

    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix_Subtract m1 = new Matrix_Subtract(3, 4);
        m1.getMatrix();
        Matrix_Subtract m2 = new Matrix_Subtract(3, 4);
        m2.getMatrix();
        Matrix_Subtract m = m1.subtract(m2);
        m1.display();
        System.out.println(" - ");
        m2.display();
        System.out.println(" = ");
        m.display();
    }
}
