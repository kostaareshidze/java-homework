package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figures{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double area, double perimeter, double a, double b, double c, double h) {
        super(area, perimeter);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getArea(){
        return (h * c) / 2;
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }
}
