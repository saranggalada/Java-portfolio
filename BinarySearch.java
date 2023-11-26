import java.util.Scanner;

public class BinarySearch {
    int[] a;

    BinarySearch(int n) {
        a = new int[n];
    }

    void getArray() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter integer " + (i + 1) + " of the array: ");
            a[i] = input.nextInt();
        }
    }

    void SelectionSort() {
        int i, j, smallt, t, position;
        for (i = 0; i < a.length; i++) {
            smallt = a[i];
            position = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < smallt) {
                    smallt = a[j];
                    position = j;
                }
            }
            t = a[i];
            a[i] = a[position];
            a[position] = t;
        }
    }

    int Search(int l, int u, int val) {
        int mid = (l + u) / 2;
        if (l > u) {
            return -1;
        }
        if (val < a[mid]) {
            return Search(l, mid - 1, val);
        }
        if (val > a[mid]) {
            return Search(mid + 1, u, val);
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int len = input.nextInt();
        BinarySearch bs = new BinarySearch(len);
        bs.getArray();
        bs.SelectionSort();
        System.out.print("Enter a number to search in the array: ");
        int num = input.nextInt();
        int x = bs.Search(0, len, num);
        if (x == -1) {
            System.out.println((num) + " wasn't found in the array");
        } else {
            System.out.println(num + " lies in position " + (x + 1) + " of the array");
        }
    }
}
