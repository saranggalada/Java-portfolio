class Goods {
    String description;
    double price;

    Goods(String d, double p) {
        description = d;
        price = p;
    }

    String display() {
        return ("Item: " + description + " costs " + price);
    }
}

interface Taxable {
    double taxRate = 0.08;

    double calculateTax();
}

class Book extends Goods implements Taxable {
    String author;
    double deliveryCharges;

    Book(String d, double p, String a, double dc) {
        super(d, p);
        this.author = a;
        this.deliveryCharges = dc;
    }

    String display() {
        return (super.display() + " plus delivery charges " + this.deliveryCharges + " plus Tax " + calculateTax());
    }

    public double calculateTax() {
        return (price + this.deliveryCharges) * taxRate;
    }
}

class Test {
    public static void main(String[] args) {
        Book b = new Book("Pride and Prejudice", 275.0, "Jane Austin", 25.0);
        System.out.println(b.display());
    }
}