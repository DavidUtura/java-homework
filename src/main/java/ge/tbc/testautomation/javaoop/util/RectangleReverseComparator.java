package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.util.Comparator;

public class RectangleReverseComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rectangle1, Rectangle rectangle2) {
        return Double.compare(rectangle2.getArea(),rectangle1.getArea());

    }
}
