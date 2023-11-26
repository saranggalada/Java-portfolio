import java.util.Scanner;

public class DateCalculator {
    int n, d, m, y;

    DateCalculator() {
        n = 0;
        d = 0;
        m = 1;
        y = 0;
    }

    void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        y = input.nextInt();
        System.out.print("Enter day number: ");
        n = input.nextInt();
        if (y % 4 == 0 || (y % 100 == 0) && (y % 400 == 0)) {
            if (n > 366) {
                System.out.print("Invalid day.");
                System.exit(0);
            }
        } else if (n > 365) {
            System.out.print("Invalid day.");
            System.exit(0);
        }
    }

    void dayToDate() {
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ((y % 100 == 0) && (y % 400 == 0) || (y % 4 == 0) && (y % 100 != 0)) {
            days[2]++;
        }
        int num = n;
        while (num > days[m]) {
            num -= days[m];
            m++;
        }
        d = num;
    }

    void display() {
        String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        System.out.println("Day " + n + " is " + months[m] + " " + d + ", " + y);
    }

    public static void main(String[] args) {
        DateCalculator x = new DateCalculator();
        x.accept();
        x.dayToDate();
        x.display();
    }
}
