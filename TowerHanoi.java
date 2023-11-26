import java.util.Scanner;

public class TowerHanoi {
    static void towerHanoi(int nDisk, String from, String temp, String to) {
        if (nDisk == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            towerHanoi(nDisk - 1, from, to, temp);
            System.out.println("Move disk " + nDisk + " from " + from + " to " + to);
            towerHanoi(nDisk - 1, temp, from, to);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();
        System.out.print("Enter name of initial tower: ");
        String from = input.next();
        System.out.print("Enter name of destination tower: ");
        String to = input.next();
        System.out.print("Enter name of intermediate tower: ");
        String temp = input.next();
        towerHanoi(n, from, temp, to);
    }
}
