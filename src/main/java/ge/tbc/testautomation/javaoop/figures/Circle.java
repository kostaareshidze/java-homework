package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figures{
    public double radius;


    public Circle(double radius) throws LimitException, RadiusException{
        super();

        if (Figures.numberOfCircleInstances > 5)
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        if (radius < 0)
            throw new RadiusException("RADIUS VALUE NOT VALID");
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
