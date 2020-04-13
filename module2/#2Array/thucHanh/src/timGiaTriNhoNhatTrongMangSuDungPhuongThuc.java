public class timGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,8,9,6};
        int index = minValue(arr);
        System.out.println("min :" + arr[index]);
    }
    public static int minValue(int []arr){
        int min = arr[0];
        int index = 0;
        for (int i = 0 ; i <arr.length ; i++){
                if(arr[i] < min){
                    min = arr[i];
                    index = i;
                }
        }
        return index;
    }
}
