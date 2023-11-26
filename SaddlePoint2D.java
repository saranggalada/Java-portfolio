import java.util.Scanner;

public class SaddlePoint2D {
    int n, smat[][];

    SaddlePoint2D(int n) {
        this.n = n;
        smat = new int[n][n];
    }

    void getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter only +ve integers!");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ": ");
                smat[i][j] = input.nextInt();
            }
        }
    }

    int min(int r) {
        int min = 0;
        int minval = smat[r][0];
        for (int j = 0; j < n; j++) {
            if (smat[r][j] < minval) {
                minval = smat[r][j];
                min = j;
            }
        }
        return min;
    }

    int max(int c) {
        int max = 0;
        int maxval = smat[0][c];
        for (int i = 0; i < n; i++) {
            if (smat[i][c] > maxval) {
                maxval = smat[i][c];
                max = i;
            }
        }
        return max;
    }

    int saddle() {
        for (int i = 0; i < n; i++) {
            if (smat[i][min(i)] == smat[max(min(i))][min(i)]) {
                return smat[i][min(i)];
            }
        }
        return -999;
    }

    void display() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(smat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SaddlePoint2D sp = new SaddlePoint2D(3);
        sp.getMatrix();
        System.out.println("Matrix");
        sp.display();
        if (sp.saddle() > 0) {
            System.out.println("has Saddle point " + sp.saddle());
        } else {
            System.out.println("has no Saddle point");
        }
    }
}