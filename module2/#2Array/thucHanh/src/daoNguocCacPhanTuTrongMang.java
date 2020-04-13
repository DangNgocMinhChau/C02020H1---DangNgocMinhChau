import java.util.Scanner;

public class daoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập vào leght của mảng :");
            size = sc.nextInt();
            if(size>20){
                System.out.println("nhap so nho hon 20:");
            }
        }while (size > 20);
        arr = new int[size];
        for (int i = 0 ; i< arr.length ; i++){
            System.out.println("nhap vao phan tu " + (i + 1) + " :") ;
            arr[i] = sc.nextInt();
        }

        for (int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j] + "\t");
        }

        for (int k = 0 ; k <arr.length /2 ; k++){
            int temp = arr[k];
            arr[k] = arr[size - 1 - k];
            arr[size - 1 - k ] = temp;
        }
        System.out.println();
        for (int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j] + "\t");
        }

    }
}
