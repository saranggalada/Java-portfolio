import java.util.Scanner;

public class MatrixInverse {
    Scanner input = new Scanner(System.in);
    float[][] a = new float[3][3];
    float[][] I = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

    void getMat() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter element " + (j + 1) + " of row " + (i + 1) + ": ");
                a[i][j] = input.nextFloat();
            }
        }
    }

    void Inverse() {
        float x = (a[1][2] * a[0][1] - a[1][1] * a[0][2]) / (a[2][2] * a[1][1] - a[2][1] * a[1][2]);
        float y = (a[2][1] * a[0][2] - a[2][2] * a[0][1]) / (a[2][2] * a[1][1] - a[2][1] * a[1][2]);
        for (int j = 0; j < 3; j++) {
            I[0][j] += (y * I[1][j] + x * I[2][j]);
            a[0][j] += (y * a[1][j] + x * a[2][j]);
        }
        for (int j = 0; j < 3; j++) {
            I[0][j] /= a[0][0];
        }
        for (int j = 0; j < 3; j++) {
            a[0][j] /= a[0][0];
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                I[i][j] -= a[i][0] * I[0][j];
            }
        }
        for (int i = 1; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                a[i][j] -= a[i][0] * a[0][j];
            }
        }
        for (int j = 0; j < 3; j++) {
            I[1][j] -= (a[1][2] / a[2][2]) * I[2][j];
        }
        for (int j = 0; j < 3; j++) {
            a[1][j] -= (a[1][2] / a[2][2]) * a[2][j];
        }
        for (int j = 0; j < 3; j++) {
            I[2][j] -= (a[2][1] / a[1][1]) * I[1][j];
        }
        for (int j = 0; j < 3; j++) {
            a[2][j] -= (a[2][1] / a[1][1]) * a[1][j];
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                I[i][j] /= a[i][i];
            }
        }
    }

    void display(float[][] m) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixInverse im = new MatrixInverse();
        im.getMat();
        im.Inverse();
        System.out.println("Inverse of your matrix is...");
        im.display(im.I);
    }
}