package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.TriangleSidesException;

public class Triangle extends Figure implements IResizable, IValidFigure {
    private double a;
    private double b;
    private double c;
    private double h;



    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

       if(!validateFigure()) {
            throw new TriangleSidesException("Triangle Sides are invalid");
       }else System.out.println("Triangle Sides are valid");

    }

    public double getArea() {
        return  b * h * 0.5;
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }


    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void doubleSize() {
        this.a *= 2;
        this.b *= 2;
        this.c *= 2;
        this.h *= 2;
    }

    @Override
    public void customSize(double byValue) {
        this.a *= byValue;
        this.b *= byValue;
        this.c *= byValue;
        this.h *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c &&
                a + c > b &&
                b + c > a;
    }
}
