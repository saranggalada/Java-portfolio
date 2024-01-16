import java.util.*;

public class SetDifference {
    int[] set;
    int size;

    SetDifference(int size) {
        this.size = size;
        set = new int[size];
    }

    void getSet() {
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < size; x++) {
            System.out.print("Enter element " + (x + 1) + " of this set: ");
            set[x] = input.nextInt();
        }
        System.out.println();
    }

    SetDifference subtract(SetDifference A) {
        String p = "";
        boolean b;
        int i;
        for (int x = 0; x < this.size; x++) {
            i = this.set[x];
            b = false;
            for (int y = 0; y < A.size; y++) {
                if (i == A.set[y]) {
                    b = true;
                }
            }
            if (b == false) {
                p += Integer.toString(i) + " ";
            }
        }
        String[] arr = p.split(" ");
        SetDifference d = new SetDifference(arr.length);
        for (int x = 0; x < d.size; x++) {
            d.set[x] = Integer.parseInt(arr[x]);
        }
        return d;
    }

    public String toString() {
        String s = "[";
        for (int x = 0; x < this.size; x++) {
            s += (Integer.toString(this.set[x])) + ",";
        }
        s = s.substring(0, s.length() - 1);
        s += "]";
        return s;
    }

    public static void main(String[] args) {
        SetDifference D1 = new SetDifference(5);
        D1.getSet();
        SetDifference D2 = new SetDifference(5);
        D2.getSet();
        SetDifference D3 = D1.subtract(D2);
        System.out.println(D3);
    }
}
