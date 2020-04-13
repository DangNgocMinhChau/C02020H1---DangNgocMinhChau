public class testSum {
    public static int sum(int a , int b){
        int result = 0;
        for(int i = a ; i <= b ; i++){
            result += i;

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sum(99,100));
    }
}

