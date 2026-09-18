abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle area: " + rectangle.area());
    }
}