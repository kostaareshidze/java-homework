package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figures;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo){
        Class<?> classOne = objOne.getClass();
        Class<?> classTwo = objTwo.getClass();
        Field[] fieldsOne = classOne.getDeclaredFields();
        Field[] fieldsTwo = classTwo.getDeclaredFields();

        return new AnyPair<>(fieldsOne, fieldsTwo);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.asList(getDeclaredFields(25, "string").getElementOne()));
        System.out.println(Arrays.asList(getDeclaredFields(25, "string").getElementTwo()));
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        FigurePair<Circle,Rectangle> figurePair = new FigurePair<>(circle, rectangle);
        System.out.println(figurePair);

    }
}
