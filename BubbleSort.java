import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int a[], int len) { // uses Bubble Sort method to sort
        int i, j, k, t; // array elements in increasing order
        for (i = 0; i < len; i++) {
            for (j = 0; j < (len - (i + 1)); j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
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
            System.out.print("Enter Element " + (h + 1) + ":");
            int element = input.nextInt();
            array[h] = element;
        }
        bubbleSort(array, len);
    }
}