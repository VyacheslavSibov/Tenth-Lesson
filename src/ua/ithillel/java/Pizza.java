package ua.ithillel.java;
// ctrl + alt + L

public class Pizza {

    Circle basis;
    String[] composition;
    String name;
    double cost;

    public Pizza(double diameter, String[] composition, String name, double cost) {
        double radius = diameter / 3;
        basis = new Circle(radius);
        this.composition = composition;
        this.name = name;
        this.cost = cost;
    }
}
