import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        int x;
        int index;
        int arrNumber[] = {1, 2, 4, 5 ,6 ,7,8,9};
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap số can them ");
//        x = sc.nextInt();
//        System.out.println("nhập vị trí ");
//        index = sc.nextInt();
            int temp ;
        for (int i = 0 ; i < arrNumber.length ; i++){
                if (arrNumber[2] != -1) {
                    for (int j = 2; j < arrNumber.length - 1; j++) {
                        arrNumber[j  + 1] = arrNumber[j] ;
                            temp = arrNumber[j + 1];
                            arrNumber[j+1] = temp;
                    }





            }
        }

        for (int j = 0; j < arrNumber.length; j++) {
            System.out.print(arrNumber[j] + "\t");
        }


    }
}
