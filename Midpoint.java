import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        x = y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void readPoint() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x-coordinate: ");
        x = input.nextInt();
        System.out.print("Enter y-coordinate: ");
        y = input.nextInt();
    }

    Point midPoint(Point B) {
        Point A = new Point(((B.x + x) / 2), ((B.y + y) / 2));
        return A;
    }

    String displayPoint() {
        return ("Point Coordinates: " + "(" + (x) + "," + (y) + ")" + "");
    }

    public static void main(String[] args) {
        Point P = new Point();
        Point Q = new Point();
        P.readPoint();
        Q.readPoint();
        Point M = P.midPoint(Q);
        System.out.println(M.displayPoint());
    }
}