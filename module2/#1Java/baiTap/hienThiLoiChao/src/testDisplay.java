import java.util.Scanner;

public class testDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cua ban vao: ");
        String name = scanner.nextLine();
        System.out.println("chao " + name );
    }
}
