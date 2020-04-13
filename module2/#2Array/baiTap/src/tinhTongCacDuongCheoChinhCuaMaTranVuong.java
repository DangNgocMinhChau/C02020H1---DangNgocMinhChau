import java.util.Scanner;

public class tinhTongCacDuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        int[][] arr;
        int m;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao số hàng :");
         m = sc.nextInt();
        System.out.println("nhập vào số cột : ");
        n = sc.nextInt();

        arr = new int [m][n];

        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.println("arr[" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
              total +=  arr[i][j];
                System.out.print(arr[i][j] + "\t");


            }
        }
        System.out.print("tổng các phần tử là : " + total);
    }
}
