package shapes;


import interfaces.ShapeWithPerimeter;

public class Pentagon extends Shape implements ShapeWithPerimeter {
    private double sideLength;

    public Pentagon(double sideLength) {
        super("Pentagon");
        this.sideLength = sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 5 * sideLength;
    }
}