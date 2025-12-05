package ge.tbc.testautomation.generics;

public class AnyPair<E,T>{
    public E getElementOne() {
        return elementOne;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    private E elementOne;
    private T elementTwo;
    public AnyPair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    @Override
    public String toString() {
        return "ElementOne: " + elementOne + "\nElementTwo: " + elementTwo;
    }
}
