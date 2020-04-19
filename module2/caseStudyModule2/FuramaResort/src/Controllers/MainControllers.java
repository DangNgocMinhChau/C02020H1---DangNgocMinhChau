package Controllers;

import Modules.House;
import Modules.Room;
import Modules.Villa;
import luuFile.SerializeFileFactory;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class MainControllers {

    public static void addNewService() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.println("mời bạn lựa chọn dịch vụ theo mong muốn : ");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                System.out.println("---------------------------------------------");
                menuVilla();
                break;
            case 2:
                System.out.println("---------------------------------------------");
                menuHouse();
                break;
            case 3:
                System.out.println("---------------------------------------------");
                menuRoom();
                break;
            case 4:
                displayMainMennu();
                break;
            case 5:
                System.err.println("Bạn đã kết thúc chương trình ! Hẹn gặp lại");
                System.exit(0);
                break;
        }
    }


    public static void displayMainMennu() {

        System.out.println("1. Add New Services" + "\n" +
                "2. Show Services " + "\n" +
                "3. Add New Customer" + "\n" +
                "4. Show Information of Customer " + "\n" +
                "5. Add New Booking" + "\n" +
                "6. Show Information of Employee" + "\n" +
                "7. Exit" + "\n");
        System.out.println("mời bạn nhập vào lựa chọn");
        int choose = new Scanner(System.in).nextInt();

        switch (choose) {
            case 1:
                addNewService();
            case 2:

        }
    }


    // Phần lưu thông tin của Villa
    Scanner sc = new Scanner(System.in);

    static ArrayList<Villa> dsVL = new ArrayList<Villa>();

    public static void menuVilla() {
        System.out.println("1.Nhập Villa");
        System.out.println("2.Xuất Villa");
        System.out.println("3.Lưu Villa");
        System.out.println("4.Đọc Villa");
        System.out.println("5.Quay lại");
        System.out.println("6.Thoát");
        System.out.println("Bạn muốn làm gì ?");
        int l = new Scanner(System.in).nextInt();

        switch (l) {
            case 1:
                nhap();
                System.out.println("---------------------------------------------");
                break;
            case 2:
                System.out.println("thông tin danh sách Villa là : ");
                xuat();
                System.out.println("---------------------------------------------");
                break;
            case 3:
                luu();
                System.out.println("---------------------------------------------");
                break;
            case 4:
                doc();
                System.out.println("---------------------------------------------");
                break;
            case 5:
                addNewService();
                System.out.println("---------------------------------------------");
                break;
            case 6:
                System.err.println("Bạn đã thoát khỏi Villa !");
                System.exit(0);
                System.out.println("---------------------------------------------");
        }
    }

    private static void doc() {
//        System.out.println("bạn muốn đọc đường dẫn nào : ");
//        String path = new Scanner(System.in).nextLine();
        dsVL = SerializeFileFactory.docFile("E:/dulieuVL.csv");
        System.out.println("Đã đọc xong ! Bạn hãy chọn xuất để hiển thị ra lại thông tin !");
    }

    private static void luu() {
//        System.out.println("bạn muốn lưu vào đường dẫn nào : ");
//        String path = new Scanner(System.in).nextLine();
        boolean kq = SerializeFileFactory.luuFile(dsVL, "E:/dulieuVL.csv");
        if (kq = true) {
            System.out.println("đã lưu file thành công danh sách Villa");
        } else {
            System.out.println("lưu chưa thành công danh sách Villa");
        }

    }

    private static void xuat() {
        for (Villa vl : dsVL) {
            System.out.println(vl);
            System.out.println("Đã đọc xong ! Bạn chọn xuất để hiển thị thông tin của danh sách Villa");
            System.out.println("---------------------------------------------------------------------");
        }
    }

    private static void nhap() {
        System.out.print("Tên dịch vụ : ");
        String tenDichVu = new Scanner(System.in).nextLine();
        System.out.print("Diện tích sử dụng là : ");
        double dienTichSuDung = new Scanner(System.in).nextDouble();

        System.out.print("Chi phí thuê là : ");
        double cPhiThue = new Scanner(System.in).nextDouble();

        System.out.print("Số lượng người tối đa : ");
        int soLuongNguoiToiDa = new Scanner(System.in).nextInt();

        System.out.print("Kiểu thuê là : ");
        String kieuThue = new Scanner(System.in).nextLine();

        System.out.print("Tiêu chuẩn phòng là : ");
        String tieuchuanPhong = new Scanner(System.in).nextLine();

        System.out.print("Mô tả tiện nghi khác : ");
        String moTaTienNghiKhac = new Scanner(System.in).nextLine();

        System.out.print("Diện tích hồ bơi là : ");
        double dienTichHoBoi = new Scanner(System.in).nextDouble();

        System.out.print("Số tầng : ");
        int soTang = new Scanner(System.in).nextInt();

        Villa villa = new Villa(tenDichVu, dienTichSuDung, cPhiThue, soLuongNguoiToiDa, kieuThue, tieuchuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
        dsVL.add(villa);

    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Phần lưu thông tin của House

    static ArrayList<House> dsHouse = new ArrayList<House>();

    public static void menuHouse() {
        System.out.println("1.Nhập vào House");
        System.out.println("2.Xuất ra House");
        System.out.println("3.Lưu file House");
        System.out.println("4.Đọc file House");
        System.out.println("5.Quay lại");
        System.out.println("6.Thoát ");
        System.out.println("Bạn muốn làm gì ? ");
        int h = new Scanner(System.in).nextInt();

        switch (h) {
            case 1:
                nhapHouse();
                System.out.println("-------------------------------------------------");
                break;
            case 2:
                System.out.println("thông tin danh sách House là : ");
                xuatHouse();
                System.out.println("-------------------------------------------------");
                break;
            case 3:
                luuHouse();
                System.out.println("-------------------------------------------------");
                break;
            case 4:
                docHouse();
                System.out.println("-------------------------------------------------");
                break;
            case 5:
                addNewService();
                break;
            case 6:
                System.err.println("Bạn đã thoát khỏi House !");
                System.exit(0);
                System.out.println("-------------------------------------------------");
                break;
        }
    }


    private static void xuatHouse() {
        for (House house : dsHouse) {
            System.out.println(house);
        }
    }

    private static void nhapHouse() {
        System.out.print("Tên dịch vụ : ");
        String tenDichVu = new Scanner(System.in).nextLine();
        System.out.print("Diện tích sử dụng là : ");
        double dienTichSuDung = new Scanner(System.in).nextDouble();

        System.out.print("Chi phí thuê là : ");
        double cPhiThue = new Scanner(System.in).nextDouble();

        System.out.print("Số lượng người tối đa : ");
        int soLuongNguoiToiDa = new Scanner(System.in).nextInt();

        System.out.print("Kiểu thuê là : ");
        String kieuThue = new Scanner(System.in).nextLine();

        System.out.print("Tiêu chuẩn phòng là : ");
        String tieuchuanPhong = new Scanner(System.in).nextLine();

        System.out.print("Mô tả tiện nghi khác : ");
        String moTaTienNghiKhac = new Scanner(System.in).nextLine();

        System.out.print("Số tầng : ");
        int soTang = new Scanner(System.in).nextInt();

        House house = new House(tenDichVu, dienTichSuDung, cPhiThue, soLuongNguoiToiDa, kieuThue, tieuchuanPhong, moTaTienNghiKhac, soTang);

        dsHouse.add(house);

    }

    private static void luuHouse() {
        boolean kq = SerializeFileFactory.luuFileHouse(dsHouse, "E:/luuFileHouse.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách House ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách House ");
        }
    }

    private static void docHouse() {
        dsHouse = SerializeFileFactory.docFileHouse("E:/luuFileHouse.csv");
        System.out.println("Đã đọc xong!. Bạn hãy chọn xuất để hiển thị ra lại thông tin của danh sách House ");
        System.out.println("--------------------------------------------------------------");
    }


    //----------------------------------------------------------------------------------------------------------------------------


    // Room

    static ArrayList<Room> dsRoom = new ArrayList<Room>();

    public static void menuRoom() {
        System.out.println("1.Nhập vào Room");
        System.out.println("2.Xuất ra Room");
        System.out.println("3.Lưu file Room");
        System.out.println("4.Đọc file Room");
        System.out.println("5.Quay lại");
        System.out.println("6.Thoát ");
        System.out.println("Bạn muốn làm gì ? ");
        int h = new Scanner(System.in).nextInt();

        switch (h) {
            case 1:
                nhapRoom();
                System.out.println("---------------------------------------------");
                break;
            case 2:
                System.out.println("thông tin danh sách Room là : ");
                xuatRoom();
                System.out.println("---------------------------------------------");
                break;

            case 3:
                luuRoom();
                System.out.println("---------------------------------------------");
                break;
            case 4:
                docRoom();
                System.out.println("---------------------------------------------");
                break;
            case 5:
                System.out.println("---------------------------------------------");
                addNewService();
                break;
            case 6:
                System.err.println("Bạn đã thoát khỏi Room ! ");
                System.exit(0);
                System.out.println("---------------------------------------------");
                break;
        }
    }


    private static void xuatRoom() {
        for (Room room : dsRoom) {
            System.out.println(room);
        }
    }

    private static void nhapRoom() {
        System.out.print("Tên dịch vụ : ");
        String tenDichVu = new Scanner(System.in).nextLine();
        System.out.print("Diện tích sử dụng là : ");
        double dienTichSuDung = new Scanner(System.in).nextDouble();

        System.out.print("Chi phí thuê là : ");
        double cPhiThue = new Scanner(System.in).nextDouble();

        System.out.print("Số lượng người tối đa : ");
        int soLuongNguoiToiDa = new Scanner(System.in).nextInt();

        System.out.print("Kiểu thuê là : ");
        String kieuThue = new Scanner(System.in).nextLine();

        System.out.print("Dịch vụ miễn phí đi kèm : ");
        String dichVuMienPhiDiKem = new Scanner(System.in).nextLine();


        Room room = new Room(tenDichVu, dienTichSuDung, cPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhiDiKem);

        dsRoom.add(room);

    }

    private static void luuRoom() {
        boolean kq = SerializeFileFactory.luuFileRoom(dsRoom, "E:/luuFileRoom.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách Room ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách Room ");
        }
    }

    private static void docRoom() {
        dsRoom = SerializeFileFactory.docFileRoom("E:/luuFileRoom.csv");
        System.out.println("Đã đọc xong!. Bạn hãy chọn xuất để hiển thị ra lại thông tin danh sách Room ");
        System.out.println("-------------------------------------------------------------");
    }

}



