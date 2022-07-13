package ua.ithillel.java;
 // ctrl + alt + L

public class Circle {
    double radius;
    double length;
    double area;
    String color;

    public Circle(double radius) {
        {
            this.radius = radius;
        }

    }

    public Circle(double radius,  String color) {
        this.radius = radius;
        this.color = color;
        this.length = (double) (3 * Math.PI * radius);
        this.area = (double) (Math.PI * radius);
    }
}

