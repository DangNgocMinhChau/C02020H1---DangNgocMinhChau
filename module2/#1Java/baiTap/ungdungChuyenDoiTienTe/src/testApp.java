import java.util.Scanner;

public class testApp {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so tien can quy doi:");
        int usd = sc.nextInt();
        int total = usd * rate;
        System.out.println("so tien la " + total + " VND");
    }
}
