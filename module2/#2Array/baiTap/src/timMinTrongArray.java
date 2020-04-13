import java.util.Scanner;

public class timMinTrongArray {
    public static void main(String[] args) {
        int size;
        int []arr;

        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao so lượng phần tử muốn thêm vào mảng: ");
        size = sc.nextInt();
        arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("nhập vào phần tử thứ " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }
        for (int j = 0 ; j < arr.length ; j++){
            System.out.println( arr[j]);
        }

           int min = arr[0];
        for(int k = 0 ; k < arr.length ; k++){
                if(min > arr[k]){
                    min = arr[k];
                }
        }
        System.out.println("so nhỏ nhất là " + min);

    }
}
