package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea() {
        return a * b;
    }

    @Override
    public double getLength() {
        return 2 * (a+b);
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }
    @Override
    public String toString() {
        return "Rectangle Side a: " + a + ", Rectangle Side b: " + b;
    }

}
