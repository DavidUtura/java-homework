package ge.tbc.testautomation.javaoop.figures;

public  class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle radius: " + this.radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {

        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());

    }
}

