class Point {

    // Instance variables
    private int x;
    private int y;

    // Default Constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display Method
    public void display() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        Point p2 = new Point(10, 20);
        System.out.println("Parameterized Constructor:");
        p2.display();

        p2.setX(30);
        p2.setY(40);
        System.out.println("After setX() and setY():");
        p2.display();

        p2.setXY(50, 60);
        System.out.println("After setXY():");
        p2.display();
    }
}
