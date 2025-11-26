package ge.tbc.testautomation.javaoop.util;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle r1, Rectangle r2) {
        if(r1.getPerimeter() > r2.getPerimeter()){
            System.out.println("First Rectangle's perimeter is bigger " + r1.getPerimeter() + " > " + r2.getPerimeter());
        } else if( r1.getPerimeter() < r2.getPerimeter()) {
            System.out.println("Second Rectangle's perimeter is bigger " + r1.getPerimeter() + " < " + r2.getPerimeter());

        }else if(r1.getPerimeter() == r2.getPerimeter()){
            System.out.println("They are equal " + r1.getPerimeter() + " == " + r2.getPerimeter());
        }


    }
}
