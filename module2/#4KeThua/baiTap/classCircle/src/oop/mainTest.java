package oop;

public class mainTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5, "yellow");
        System.out.println(circle);
        circle.setRadius(6);
        System.out.println(circle);

        System.out.println("---------------------------------------");

        Cylinder cylinder = new Cylinder(10);
        System.out.println(cylinder);
        cylinder = new Cylinder(10, "blue", 20);
        System.out.println(cylinder);
        cylinder.setRadius(2);
        System.out.println(cylinder);
    }
}
