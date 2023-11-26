import java.util.Scanner;

public class AddTimes {
    Scanner input = new Scanner(System.in);
    int[] t = new int[2];

    AddTimes() {
        t[0] = t[1] = 0;
    }

    void readTime() {
        System.out.print("Enter Hours: ");
        this.t[0] = input.nextInt();
        System.out.print("Enter Minutes: ");
        this.t[1] = input.nextInt();
    }

    AddTimes add(AddTimes X) {
        this.t[0] = (this.t[0] + X.t[0] + (this.t[1] + X.t[1]) / 60) % 24;
        this.t[1] = (this.t[1] + X.t[1]) % 60;
        return this;
    }

    void displayTime() {
        System.out.println("The Time is " + this.t[0] + " Hours and " + this.t[1] + "Minutes.");
    }

    public static void main(String[] args) {
        AddTimes at1 = new AddTimes();
        at1.readTime();
        AddTimes at2 = new AddTimes();
        at2.readTime();
        AddTimes at3 = at2.add(at1);
        at3.displayTime();
    }
}