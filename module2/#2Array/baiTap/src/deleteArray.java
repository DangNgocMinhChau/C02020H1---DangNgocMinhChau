import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5 , 5 ,5 , 5 , 5 , 7, 8};
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so can xoa : ");
        x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] == x) {
                if (arr[i] == x) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = 0;


                    System.out.println("nằm ở phần tử thứ " + i);
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }
}
