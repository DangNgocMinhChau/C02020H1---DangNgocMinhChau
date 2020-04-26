import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
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


    public static void main(String[] args) {

        Student student1 = new Student(1, "chau");
        Student student2 = new Student(2, "king ");
        Student student3 = new Student(3, "tuan");
        Student student4 = new Student(4, "hoang");
        Student student5 = new Student(5, "phuc");
        Student student6 = new Student(6, "nau");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();




        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
//        studentMyList.add(student6,2);

//
//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println( student.getId()+student.getName());
//
//        }
//
//        System.out.println( studentMyList.size());
//
//        System.out.println(studentMyList.get(2).getName());
//
//        System.out.println(studentMyList.indexOf(student6));
//        System.out.println(studentMyList.contains(student5));


        newMyList = studentMyList.clone();
        for (int i = 0 ; i < newMyList.size() ; i++){
            System.out.println(newMyList.get(i).getName());
        }

        newMyList.remove(0);
        for (int i = 0 ; i < newMyList.size() ; i++){
            System.out.println(newMyList.get(i).getName());
        }


    }
}