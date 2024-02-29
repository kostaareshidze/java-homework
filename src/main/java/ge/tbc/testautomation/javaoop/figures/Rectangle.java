package ge.tbc.testautomation.javaoop.figures;

import java.util.Comparator;

public class Rectangle extends Figures implements Comparator {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    @Override
    public double getArea(){
        return a * b;
    }

    @Override
    public double getLength() {
        return 2 * (a + b);
    }

    @Override
    public void printPackageName() {

    }


    @Override
    public int compare(Object o1, Object o2) {
        Rectangle rectangle1 = (Rectangle) o1;
        Rectangle rectangle2 = (Rectangle) o2;
        if (rectangle1.getLength() == rectangle2.getLength())
            return 0;
        else if (rectangle1.getLength() > rectangle2.getLength())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
