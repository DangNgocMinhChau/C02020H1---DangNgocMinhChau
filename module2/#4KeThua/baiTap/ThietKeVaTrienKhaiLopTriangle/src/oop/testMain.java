package oop;

public class testMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle =new Triangle("red" , true , 2.0 , 4.0 , 3.0);
        triangle.getArea();

        triangle.getPrimeter();
        triangle.toString();
        System.out.println(triangle);
    }
}
