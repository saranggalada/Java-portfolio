abstract class Employee_AbstractClass {
    String firstName, lastName;
    int joinDay, joinMonth, joinYear;

    Employee_AbstractClass(String f, String l, int d, int m, int y) {
        this.firstName = f;
        this.lastName = l;
        this.joinDay = d;
        this.joinMonth = m;
        this.joinYear = y;
    }

    abstract void display();
}

class USEmployee extends Employee_AbstractClass {
    USEmployee(String f, String l, int d, int m, int y) {
        super(f, l, d, m, y);
    }

    void display() {
        System.out.println(this.firstName + " " + this.lastName + " joined on " + this.joinMonth + "/" + this.joinDay
                + "/" + this.joinYear);
    }
}

class IndianEmployee extends Employee_AbstractClass {
    IndianEmployee(String f, String l, int d, int m, int y) {
        super(f, l, d, m, y);
    }

    void display() {
        System.out.println(this.firstName + " " + this.lastName + " joined on " + this.joinDay + "/" + this.joinMonth
                + "/" + this.joinYear);
    }
}

class Test {
    public static void main(String[] args) {
        USEmployee usE = new USEmployee("John", "Doe", 12, 01, 2010);
        usE.display();
        IndianEmployee iE = new IndianEmployee("Sarang", "Galada", 12, 01, 2010);
        iE.display();
    }
}
