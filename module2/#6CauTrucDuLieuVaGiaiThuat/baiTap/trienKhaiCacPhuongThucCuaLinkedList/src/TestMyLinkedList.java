import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
         class SinhVien{
            private int id;
            private String name;

             public SinhVien() {
             }

             public SinhVien(int id, String name) {
                 this.id = id;
                 this.name = name;
             }


             public int getId() {
                 return id;
             }

             public void setId(int id) {
                 this.id = id;
             }

             public String getName() {
                 return name;
             }

             public void setName(String name) {
                 this.name = name;
             }
         }


         MyLinkedList<SinhVien> list = new MyLinkedList<>();
         SinhVien sinhVien1 = new SinhVien(1,"chau");
         SinhVien sinhVien2 = new SinhVien(2,"dang ");
         SinhVien sinhVien3 = new SinhVien(3,"king");
         SinhVien sinhVien4 = new SinhVien(4,"hai");
         SinhVien sinhVien5 = new SinhVien(5,"trieu");

         list.addFirst(sinhVien1);
         list.addFirst(sinhVien2);
         list.addFirst(sinhVien5);
         list.addLast(sinhVien3);
         list.add(1,sinhVien4);
//         list.remove(2);
//        list.clear();



         for (int i = 0 ; i < list.numNodes ; i++){
//            SinhVien sv = (SinhVien) list.get(i);
             System.out.println(list.get(i).getName());
         }

//            SinhVien sv = (SinhVien) list.getFirst();
//            System.out.println(sv.getName());

        System.out.println(list.getLast().getName());

    }





}
