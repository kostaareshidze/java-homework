package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figures;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;


public class Main {
    public static void main(String[] args) {
        Figures figures = new Figures(5, 9);
        System.out.println(figures.getPerimeter());
        System.out.println(figures.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 9, 1, 9);
        Rectangle rectangle1 = new Rectangle(1,2,5,9);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());
        HelperFunctions.compareRectangles(rectangle, rectangle1);

        Triangle triangle = new Triangle(1,2,4,3,6,2);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());


    }
}
