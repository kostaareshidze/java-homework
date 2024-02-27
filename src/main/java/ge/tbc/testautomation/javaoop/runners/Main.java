package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figures;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        System.out.println("Length of circle: " + circle.getLength());
        System.out.println("Area of Circle: " + circle.getArea());
        circle.printPackageName();
        System.out.println(circle.returnDoubleSizedCircle(circle));
        System.out.println(circle.returnCustomSizedCircle(circle, 5));
        Circle circle1 = new Circle(-9);
        System.out.println("With positive Number: " + circle.validateCircle(circle));
        System.out.println("With negative Number: " + circle.validateCircle(circle1));
    }
}
