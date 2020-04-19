import java.util.Random;
import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(100);
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(10,20);
        Square square = new Square(10);
        circle.resize(number);
        System.out.println("-----------------------------------------------");
        rectangle.resize(number);
        System.out.println("-----------------------------------------------");
        square.resize(number);




    }
}
