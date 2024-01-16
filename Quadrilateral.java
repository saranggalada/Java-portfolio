import java.util.*;

public class Quadrilateral {
    double perimeter, area;
    String type;

    public Quadrilateral(double len, double wid) { // new Class made
        perimeter = 2 * (len + wid);
        area = len * wid; // Calculation of area, type and
        if (len == wid) {
            type = "Square";
        } // perimeter of a quadrilateral
        else
            type = "Rectangle";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = input.nextDouble();
        System.out.print("Enter width: ");
        double w = input.nextDouble();
        Quadrilateral quad = new Quadrilateral(l, w);
        System.out.println("The given quadrilateral is a " + quad.type + " of perimeter: " + quad.perimeter
                + " units and area: " + quad.area + " unit^2.");
    }
}