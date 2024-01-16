import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int a[], int len) { // uses Selection Sort method to sort
        int i, j, k, smallt, t, position; // array elements in increasing order
        for (i = 0; i < len; i++) {
            smallt = a[i];
            position = i;
            for (j = i + 1; j < len; j++) {
                if (a[j] < smallt) {
                    smallt = a[j];
                    position = j;
                }
            }
            t = a[i];
            a[i] = a[position];
            a[position] = t;
        }
        for (k = 0; k < len; k++) {
            System.out.print(a[k]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Int array:");
        int len = input.nextInt();
        int[] array = new int[len];
        for (int h = 0; h < len; h++) {
            System.out.print("Enter Element " + (h + 1) + ": ");
            int element = input.nextInt();
            array[h] = element;
        }
        selectionSort(array, len);
    }
}