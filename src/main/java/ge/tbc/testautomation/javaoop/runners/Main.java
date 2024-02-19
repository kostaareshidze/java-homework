package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(Math.random());
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle1 = new Circle(Math.random());
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle2 = new Circle(Math.random());
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle3 = new Circle(Math.random());
        System.out.println(Circle.numberOfCircleInstances);

        Circle circle4 = new Circle(Math.random());
        System.out.println(Circle.numberOfCircleInstances);

        String toString1 = Util.circleToString(circle);
        String toString2 = Util.circleToString(circle1);
        String toString3 = Util.circleToString(circle2);
        String toString4 = Util.circleToString(circle3);
        String toString5 = Util.circleToString(circle4);
        System.out.println(toString1);
        System.out.println(toString2);
        System.out.println(toString3);
        System.out.println(toString4);
        System.out.println(toString5);
        System.out.println(toString1);

    }
}
