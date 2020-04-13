import java.util.Scanner;

public class testMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner  = new Scanner(System.in);
        while (choice != 0) {
        System.out.println("menu");
        System.out.println("1. ve hinh chu nhat");
        System.out.println("2. ve hinh tam giac");
        System.out.println("3. ve hinh vuong");
        System.out.println("4. Exit");
        System.out.println("nhap hinh ban muon ve");
        choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 2:
                    System.out.println("**********");
                    System.out.println("*********");
                    System.out.println("********");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 3:
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");
                    System.out.println("* * * * * * * * * *");

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong co trong menu");


            }
        }
    }
}
