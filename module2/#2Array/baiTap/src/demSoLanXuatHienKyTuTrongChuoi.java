import java.util.Scanner;

public class demSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        int count = 0;
        String a = "aaddcndda";
        String b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ký tự cần tìm");
          b = sc.nextLine();

        for(int i =0 ; i < a.length(); i++){
            if(b.equals(a.charAt(i))){
                count++;

            }
        }
        System.out.println(count);



    }
}
