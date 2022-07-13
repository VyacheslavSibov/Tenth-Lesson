package ua.ithillel.java;
// ctrl + alt + L

public class Main {
    public static void main(String[] args) {

        Circle Circle = new Circle(4.3, "red");
        System.out.println("Длина круга: " + Circle.length);
        System.out.println("Площадь круга: " + Circle.area);
        System.out.println("Цвет круга: " + Circle.color);
    }
}
