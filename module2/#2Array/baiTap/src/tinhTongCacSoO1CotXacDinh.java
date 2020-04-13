import java.util.Scanner;

public class tinhTongCacSoO1CotXacDinh {
    public static void main(String[] args) {

        int[][] arr;
        int c;
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dong ");
        m = sc.nextInt();
        System.out.println("nhap so cot ");
        n = sc.nextInt();

        arr = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.println("arr[" + i + "]" + "["+ j +"]" );
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print( arr[i][j] + "\t");

            }
        }

        System.out.println("nhập vào số cột muốn tính : ");
        c = sc.nextInt();
        int total = 0;
            for (int i = 0 ; i < 3 ; i++){
                System.out.println(arr[i][c]);
                total += arr[i][c];
            }
        System.out.println(total);
    }
}
