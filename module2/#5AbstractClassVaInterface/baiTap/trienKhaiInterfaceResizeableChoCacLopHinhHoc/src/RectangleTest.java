public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("blue",true,12,5.9);
        System.out.println(rectangle);

        rectangle.resize(190);


    }
}
