import java.util.Scanner;

public class ungDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int []arrayList;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("so luong sinh vien de kiem tra");
            size = sc.nextInt();
            if(size > 30){
                System.out.println("ung dung chi co the kiem tra 1 lan duoi 30 sinh vien");
            }
        }while (size > 30);
        arrayList = new int[size];

            for (int i = 0 ; i < arrayList.length ; i++){
                System.out.println("nhap vao diem cua hoc sinh " + (i+1) + " :");
                arrayList[i] = sc.nextInt();
            }
            int count = 0;
            for (int j = 0 ; j< arrayList.length ; j++){
                if(arrayList[j] >= 5){
                    System.out.println("dien cua hs " + (j+1) + " la : " + arrayList[j] + " đã thi đỗ" );
                    count++;

                }else {
                    System.out.println("dien cua hs " + (j+1) + " la : " + arrayList[j] + " ko thi đỗ" );
                }

            }
        System.out.println("so luong hoc sinh thi đỗ " + count);

    }
}
