package ge.tbc.testautomation.javaoop.figures;

import java.util.Comparator;

public class RectangleCompare implements Comparator {
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
}
