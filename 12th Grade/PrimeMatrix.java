import java.util.Scanner;

public class PrimeMatrix {
    int n, m, pmat[][], currentPrime;

    PrimeMatrix(int m, int n) {
        this.m = m;
        this.n = n;
        pmat = new int[m][n];
        currentPrime = 1;
    }

    boolean isPrime(int x) {
        int factors = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                factors++;
            }
        }
        return (factors == 0);
    }

    int nextPrime() {
        currentPrime++;
        boolean b = false;
        while (!b) {
            if (isPrime(currentPrime)) {
                b = true;
            } else {
                currentPrime++;
            }
        }
        return currentPrime;
    }

    void fillPrime() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pmat[i][j] = nextPrime();
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pmat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter number of columns: ");
        int c = input.nextInt();
        PrimeMatrix pm = new PrimeMatrix(r, c);
        pm.fillPrime();
        pm.printMatrix();
    }
}
