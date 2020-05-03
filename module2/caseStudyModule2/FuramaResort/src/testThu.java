import TaskCheckDuLieuDauVao.RegularExpression;

import java.text.ParseException;
import java.util.*;

public class testThu extends RegularExpression {
    public static void main(String[] args)  {
//      String c = "ádasd";
//        checkNumberPhone(c);
        // Với hàng đợi (queue) PriorityQueue phần tử sẽ được sắp xếp vị trí
        // theo trật tự tự nhiên của chúng.
        Queue<String> names = new PriorityQueue<String>();

        // offer(E): Thêm phần tử vào hàng đợi (queue).
        // Trả về true nếu thêm thành công.
        // Trả về false nếu hàng đợi không còn chỗ.
        names.offer("E");
        names.offer("A");
        names.offer("M");

        // add(E): Thêm một phần tử vào hàng đợi (queue).
        // Trả về true nếu thành công.
        // Ném ra một Exception nếu hàng đợi đã đầy.
        names.add("G");
        names.add("B");

        while (true) {
            // poll(): Lấy ra và loại bỏ phần tử đầu tiên ra khỏi hàng đợi.
            // Trả về null nếu không còn phần tử nào trong hàng đợi.
            String name = names.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name=" + name);
        }
    }
}