package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {
    @SuppressWarnings({"unused"})
    public static void main(String[] args) {

        Field[] fields = Analyzable.class.getDeclaredFields();
        List<Field> matches = Arrays.stream(fields)
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    if (annotation != null && field.getName().equalsIgnoreCase(annotation.name()))
                        return true;
                    else
                        return false;
                })
                .collect(Collectors.toList());
        List<Field> doesNotMatch = Arrays.stream(fields)
                .filter(field -> {
                    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                    if (annotation == null || !field.getName().equalsIgnoreCase(annotation.name()))
                        return true;
                    else
                        return false;
                })
                .collect(Collectors.toList());
        System.out.println("Fields with same names:");
        for (Field field:
                matches) {
            System.out.println(field.getName());
        }
        System.out.println("\nFields with different names:");
        for (Field field:
             doesNotMatch) {
            System.out.println(field.getName());
        }
        int x = 5;
        int y = 10;
        String str = "str";
        String str1 = "stringg";


    }

}
