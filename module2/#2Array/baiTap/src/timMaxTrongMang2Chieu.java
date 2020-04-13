import java.util.Scanner;

public class timMaxTrongMang2Chieu {
    public static void main(String[] args) {
//        int[][] aray2Chieu = {
//                {1,2,3,4},
//                {4,66,6,7},
//                {8,9,10,11},
//        };

        int[][] arr;
        int m;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số hàng : ");
        m = sc.nextInt();
        System.out.println("nhập vào số cột : ");
        n = sc.nextInt();

        arr = new int[m][n];

         for (int i = 0 ; i < m ; i++){
             for (int j = 0 ; j < n ; j++){
                 System.out.println("nhập vào hàng thứ " + (i + 1) + " và cột thứ :" + (j + 1));
                 arr[i][j] = sc.nextInt();
             }
         }
        int max = arr[0][0];
        for (int i = 0 ; i< m ; i++){
            for (int j = 0 ; j  < n ; j++){
                    if(max < arr[i][j]){
                        max = arr[i][j];
                    }
            }
        }
        System.out.println(max + "là số lớn nhất ");
    }
}
