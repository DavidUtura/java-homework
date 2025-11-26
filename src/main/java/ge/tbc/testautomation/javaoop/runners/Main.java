package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(11.0, 2.3);
        System.out.println("Created a rectangle with sides: a = " + rectangle.getA() + " and b = " + rectangle.getB());
        System.out.println("area = " + rectangle.getArea() + ",  perimeter = " + rectangle.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(5.0, 1.7, 5.4, 6.5);
        System.out.println("Created a triangle with sides: a = "
                + triangle.getA() + ", b = " + triangle.getB() + ", c = " + triangle.getC());
        System.out.println("height: " + triangle.getH() + ", area = "
                + triangle.getArea() + ", perimeter = " + triangle.getPerimeter());


        Rectangle rectangle2 = new Rectangle(2.1,8.8);
        HelperFunctions.compareRectangles(rectangle,rectangle2);

    }
}
