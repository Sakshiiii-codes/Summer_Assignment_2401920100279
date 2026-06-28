class Box {

    double length;
    double breadth;

    // Constructor
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to find area
    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    double height;

    // Constructor
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    // Method to find volume
    public double volume() {
        return length * breadth * height;
    }
}

public class Main {

    public static void main(String[] args) {

        Box3D obj = new Box3D(5, 4, 3);

        System.out.println("Area = " + obj.area());
        System.out.println("Volume = " + obj.volume());
    }
}
