package shapes;

import interfaces.ShapeWithArea;

public class Square extends Shape implements ShapeWithArea {
    private double sideLength;

    public Square(double sideLength) {
        super("Square");
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }
}