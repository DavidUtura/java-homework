package ge.tbc.testautomation.javaoop.figures;

public  class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle radius: " + this.radius;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        if (this.radius > otherCircle.radius) {
            return 1;
        } else if (this.radius < otherCircle.radius) {
            return -1;
        } else {
            return 0;
        }
    }
    }

