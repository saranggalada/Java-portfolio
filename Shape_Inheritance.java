class Shape {
    String color = "red";
    boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return ("Shape[color=" + color + ",filled=" + filled + "]");
    }
}

class Circle extends Shape {
    double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return (3.14 * radius * radius);
    }

    double getPerimeter() {
        return (6.28 * radius);
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return ("Circle[" + super.toString() + ",radius=" + radius + "]");
    }
}

class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    double getArea() {
        return (width * length);
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return ("Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]");
    }
}

class Square extends Rectangle {
    Square() {
    }

    Square(double side) {
        super(side, side);
    }

    Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    double getSide() {
        return width;
    }

    void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    void setWidth(double side) {
        this.width = side;
    }

    void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return ("Square[" + super.toString() + "]");
    }
}

class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        System.out.println(c);
        System.out.println(s);
    }
}
