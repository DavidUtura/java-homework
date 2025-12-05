package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnyPair<Field[], Field[]> random = getDeclaredFields(25,"forzaMilan");
        List<Field> intFields = Arrays.asList(random.getElementOne());
        List<Field> stringFields = Arrays.asList(random.getElementTwo());
        System.out.println("Integer Fields:" + intFields + "\n" +"String Fields:" + stringFields);

        Circle circle = new Circle(7.7);
        Rectangle rectangle = new Rectangle(3,6);

        FigurePair<Circle,Rectangle> rectangleAndCircle = new FigurePair<>(circle,rectangle);
        System.out.println(rectangleAndCircle);
    }

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] firstFields = objOne.getClass().getDeclaredFields();
        Field[] secondFields = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(firstFields, secondFields);

    }
}