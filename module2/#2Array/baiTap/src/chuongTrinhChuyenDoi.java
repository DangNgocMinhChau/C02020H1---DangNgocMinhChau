import java.util.Scanner;

public class chuongTrinhChuyenDoi {
    public static void main(String[] args) {

        int choice = -1;
        while (choice != 0) {
            System.out.println("chuong trinh thay doi nhiet do");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.println("nhap vao nhiet do muon quy doi");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("C -> F");
                    double f = sc.nextDouble();
                    System.out.println("nhiet do chuyen tu C-> F la : " + celsiusToFahrenheit(f));
                    break;
                case 2:
                    System.out.println("F -> C ");
                    double c = sc.nextDouble();
                    System.out.println("nhiet do chuyen tu F -> C la : " + fahrenheitToCelsius(c));
                    break;
                case 3 :
                    System.exit(3);
            }


        }
    }

    public static double celsiusToFahrenheit (double celsius){
            double fahrenheit = (9.0/5)* celsius + 32;
            return fahrenheit;
    }
    public static double fahrenheitToCelsius (double fahrenheit){
            double celsius = (5.0/9)*(fahrenheit - 32);
            return celsius;
    }
}

