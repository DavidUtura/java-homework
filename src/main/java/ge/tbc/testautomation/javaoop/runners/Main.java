package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args) {
        double[] radiuss = {11.0, 7.5, 10.2, 12.3, 3.8};

        Circle[] circles = new Circle[radiuss.length];

        for (int i = 0; i < radiuss.length; i++) {
            circles[i] = new Circle(radiuss[i]);
            System.out.println("Number of circles: " + Circle.numberOfCircleInstances);
        }

        for (Circle circle : circles) {
            String circleToString = Util.circleToString(circle);
            System.out.println(circleToString);
        }
    }
}
