import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.util.Scanner;

public class testReadNumberConvertText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("số bạn cần đọc là : ");
            int number = scanner.nextInt();

            int t = number;
            int sd = number % 10;
            int t2 = t / 10;
            int sd2 = t2 % 10;
            int t3 = t2 / 10;
            int sd3 = t3 % 10;
            switch (sd3) {
                case 0:
                    System.out.print(" Không");
                    break;
                case 1:
                    System.out.print(" một trăm");
                    break;
                case 2:
                    System.out.print(" hai trăm");
                    break;
                case 3:
                    System.out.print(" ba trăm");
                    break;
                case 4:
                    System.out.print(" bốn trăm");
                    break;
                case 5:
                    System.out.print(" năm trăm");
                    break;
                case 6:
                    System.out.print(" sáu trăm");
                    break;
                case 7:
                    System.out.print(" bảy trăm");
                    break;
                case 8:
                    System.out.print(" tám trăm");
                    break;
                case 9:
                    System.out.print(" chín trăm");
                    break;
            }
            switch (sd2) {
                case 0:
                    System.out.print(" lẻ");
                    break;
                case 1:
                    System.out.print(" mười ");
                    break;
                case 2:
                    System.out.print(" hai mươi");
                    break;
                case 3:
                    System.out.print(" ba mươi");
                    break;
                case 4:
                    System.out.print(" bốn mươi");
                    break;
                case 5:
                    System.out.print(" năm mươi");
                    break;
                case 6:
                    System.out.print(" sáu mươi");
                    break;
                case 7:
                    System.out.print(" bảy mươi");
                    break;
                case 8:
                    System.out.print(" tám mươi");
                    break;
                case 9:
                    System.out.print(" chín mươi");
                    break;

            }
            switch (sd) {
                case 0:
                    System.out.print(" Không");
                    break;
                case 1:
                    System.out.print(" một");
                    break;
                case 2:
                    System.out.print(" hai");
                    break;
                case 3:
                    System.out.print(" ba");
                    break;
                case 4:
                    System.out.print(" bốn");
                    break;
                case 5:
                    System.out.print(" năm");
                    break;
                case 6:
                    System.out.print(" sáu");
                    break;
                case 7:
                    System.out.print(" bảy");
                    break;
                case 8:
                    System.out.print(" tám");
                    break;
                case 9:
                    System.out.print(" chín");
                    break;
            }
            System.out.println();
        }

    }
}
