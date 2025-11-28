package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public  class Circle extends Figure implements IResizable, IValidFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

        if (!validateFigure()) {
            throw new RadiusException("Radius is invalid");
        } else System.out.println("Circle is valid");
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return Math.PI * radius * 2;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        this.radius = radius * 2;
    }

    @Override
    public void customSize(double byValue) {
    this.radius = radius * byValue;
    }

    @Override
    public boolean validateFigure() {
        return this.radius > 0;
    }
}
