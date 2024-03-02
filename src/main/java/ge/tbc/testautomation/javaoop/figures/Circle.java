package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

import java.util.HashSet;

public class Circle extends Figures implements IResizableCircle, IValidCircle, Comparable {
    public double radius;


    public Circle(double radius) throws LimitException, RadiusException{
        super();



        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        Class<?> clazz = Circle.class;
        Package pkg = clazz.getPackage();
        String packageName = pkg.getName();
        System.out.println(packageName);
    }

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
         circle.setRadius(2 * radius);
         return circle;
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        circle.setRadius(byvValue * (radius / 2));
        return circle;
    }

    @Override
    public boolean validateCircle(Circle circle) {
        return !(circle.getRadius() < 0);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.radius == circle.radius)
            return 0;
        else if (this.radius > circle.radius)
            return 1;
        else
            return -1;
    }



}
