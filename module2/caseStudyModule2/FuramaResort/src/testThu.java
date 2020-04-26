import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class testThu {
    public static void main(String[] args) {
//        // khai báo TreeSet có kiểu là String
////        TreeSet<String> treeSet = new TreeSet<>();
////
////        // thêm vào phần tử cho treeSet
////        treeSet.add("C#");
////        treeSet.add("Java");
////        treeSet.add("PHP");
////        treeSet.add("SQL");
////        treeSet.add("HTML");
////        treeSet.add("CSS");
////        System.out.println(treeSet);
////        // khai báo một Iterator có kiểu là String
////        Iterator<String> iterator = treeSet.iterator();
////
////        // hiển thị các phần tử có trong treeSet
////        // bằng cách sử dụng Iterator
////        System.out.println("Các phần tử có trong treeSet là: ");
////        while (iterator.hasNext()) {
////            System.out.print(iterator.next() + "\t");
////        }
////
//////


//        String test = "^S[V]{1}+V[L]{1}+[-]+[0-9]{4}$";
//        String vl = "SVVL-1295";
//        System.out.println(Pattern.matches(test,vl));

        String checkTen ="^[A-Z].+$";
        String a = "sang 01";
        System.out.println(Pattern.matches(checkTen,a));
    }
}
