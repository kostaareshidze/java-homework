package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figures{
    private double a;
    private double b;

    public Rectangle(double area, double perimeter, double a, double b) {
        super(area, perimeter);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    @Override
    public double getArea(){
        return a * b;
    }
    @Override
    public double getPerimeter(){
        return (a + b) * 2;
    }
}
