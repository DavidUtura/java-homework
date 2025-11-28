package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.TriangleSidesException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Triangle;

public class Main {

    public static void main(String[] args) {

        try {
            Circle invalidCircle = new Circle(-3.7);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());

        }
        try {
            Triangle invalidTriangle = new Triangle(-3.7, 5.1, 4, 2.2);
        } catch (TriangleSidesException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------");
        Circle validCircle = new Circle(3.7);
        Triangle validTriangle = new Triangle(3.7, 5.1, 4, 2.2);
    }
}
