import java.util.Scanner;

public class testNamNhuan {
    public static void main(String[] args) {
        System.out.println("nhập năm bạn muốn kiểm tra : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();



        if(year % 4 == 0 && year % 100 != 0 ){
            System.out.println(year + "  là năm nhuân");
        }else if (year % 100 == 0 &&  year % 400 != 0){
            System.out.println(year + " không phải là năm nhuận");
        }else if(year % 100 == 0 &&  year % 400 == 0){
            System.out.println(year + "  là năm nhuân");
        }
    }
}
