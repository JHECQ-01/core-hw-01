package shapes;

import interfaces.ShapeWithArea;

public class Circle extends Shape implements ShapeWithArea {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}