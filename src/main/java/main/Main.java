package main;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;
import shapes.Rectangle;
import shapes.Pentagon;
import utils.ShapePrinter;
import interfaces.ShapeWithArea;
import interfaces.ShapeWithPerimeter;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 6, 7, 8, 9);
        Rectangle rectangle = new Rectangle(4, 8);
        Pentagon pentagon = new Pentagon(5);

        ShapePrinter.displayShapeName(circle);
        ShapePrinter.displayShapeName(square);
        ShapePrinter.displayShapeName(triangle);
        ShapePrinter.displayShapeName(rectangle);
        ShapePrinter.displayShapeName(pentagon);

        System.out.println("Triangle Area: " + ((ShapeWithArea) triangle).calculateArea());
        System.out.println("Rectangle Area: " + ((ShapeWithArea) rectangle).calculateArea());
        System.out.println("Pentagon Perimeter: " + ((ShapeWithPerimeter) pentagon).calculatePerimeter());
    }
}
