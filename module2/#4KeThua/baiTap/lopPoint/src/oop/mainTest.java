package oop;



public class mainTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
       point2D.setX(1.0f);
       point2D.setY(2.0f);
       point2D.setXY(4.0f,5.7f);
       point2D.getXY();
        System.out.println(point2D);
        System.out.println("--------------------------------------");


        Point3D point3D = new Point3D();
        point3D.setX(1.0f);
        point3D.setY(2.0f);
        point3D.setXY(4.0f,5.7f);
        point3D.getXY();
        System.out.println(point3D);
    }
}
