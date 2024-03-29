package java.oop.lab_2_11.lab_2_11_4;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class Circle extends Shape implements Comparable { // should use Comparable<Circle>, will be discussed in "Generics" topic

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + shapeColor +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
        System.out.println("Area=" + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle that = (Circle) o; // dangerous(!!!), should be handled with some exception, stay tuned :)
        if (this.calcArea() > that.calcArea()) {
            return 1;
        }
        if (this.calcArea() < that.calcArea()) {
            return -1;
        }
        return 0;
    }
}
