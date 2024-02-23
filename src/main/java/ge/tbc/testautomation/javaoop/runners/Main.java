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
        try {
            Circle circle = new Circle(5);
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(5);
            Circle circle3 = new Circle(5);
            Circle circle4 = new Circle(5);
            Circle circle5 = new Circle(5);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n ----------");
        try {

            Circle circle5 = new Circle(-5);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        String str = "Test Automation Bootcamp 6, 2022";
        System.out.println(str.substring(5,15).toLowerCase());
        System.out.println("-----------");

        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("-----------");

        System.out.println("Length of this string is: " + str.length());

        System.out.println("-----------");

        System.out.println(str.replace(" ", "-"));

        System.out.println("-----------");

        String[] strings = {"599-144-155-166", "599-144-155", "555-543-232",
                "555-543-2321", "592-111-111"};
        for (String string : strings) {
            System.out.println(phoneNumberValidation(string.replace("-", "")));
        }


    }

    private static boolean phoneNumberValidation(String phoneNumber){
        String pattern = "(555|595|592|599)\\d{6}";
        return Pattern.compile(pattern).matcher(phoneNumber).matches();

    }
}
