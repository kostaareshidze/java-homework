package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle obj1, Rectangle obj2){
         if (obj1.getPerimeter() > obj2.getPerimeter()){
             System.out.println("Perimeter 1 > Perimeter 2");
         }else if (obj1.getPerimeter() < obj2.getPerimeter()){
             System.out.println("Perimeter 1 < Perimeter 2");
         }else {
             System.out.println("Perimeter 1 = Perimeter 2");
         }
    }
}
