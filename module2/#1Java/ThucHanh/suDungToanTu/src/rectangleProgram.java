import java.util.Scanner;

public class rectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width : ");
        width = sc.nextFloat();

        System.out.println("Enter Height : ");
        height = sc.nextFloat();

        float are = width * height;
        System.out.println("Area is : " + are);
    }
}
