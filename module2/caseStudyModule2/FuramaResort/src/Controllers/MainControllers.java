package Controllers;

import Modules.House;
import Modules.Room;
import Modules.Villa;
import luuFile.SerializeFileFactory;


import java.io.Serializable;
import java.util.*;
import java.util.regex.Pattern;

public class MainControllers implements Serializable {

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

    //-------------------------------------------------------------------------------------------------------------------
    public static void showService() {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Room Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        System.out.println("mời bạn chọn thông tin muốn hiển thị :");
        int c = new Scanner(System.in).nextInt();
        switch (c) {
            case 1:
                System.out.println("Danh sách Villa");
                docVL();
                xuatVL();
                break;
            case 2:
                System.out.println("Danh sách House");
                docHouse();
                xuatHouse();
                break;
            case 3:
                System.out.println("Danh sách Room");
                docRoom();
                xuatRoom();
                break;
            case 4:
                showAllNameVillaNotDuplicate();
                break;
            case 5:
                showAllNameHouseNotDuplicate();
                break;
            case 6:
                showAllNameRoomNotDuplicate();
                break;
            case 7:
                displayMainMennu();
                break;
            case 8:
                System.err.println("Bạn đã thoát ra ! Hẹn gặp lại ");
                System.exit(0);
                break;

        }
    }

    //-------------------------------House--------------------------------------------------
    private static void showAllNameHouseNotDuplicate() {
        TreeSet<String> treeSetHouse = new TreeSet<>(new HashSet<>());

        for (House house : dsHouse) {
            treeSetHouse.add(house.getTenDichVu());
        }
        Iterator<String> iterator = treeSetHouse.iterator();
        System.out.println("Danh sách các dịch vụ House gồm có là : ");
        while (iterator.hasNext()) {
            System.out.println(count++ + ": " + iterator.next());
        }
        System.out.println("--------------------------------------------------------");
    }
//------------------------------Room-------------------------------------------------------

    private static void showAllNameRoomNotDuplicate() {
        TreeSet<String> treeSetRoom = new TreeSet<>(new HashSet<>());

        for (Room room : dsRoom) {
            treeSetRoom.add(room.getTenDichVu());
        }
        Iterator<String> iterator = treeSetRoom.iterator();
        System.out.println("Danh sách các dịch vụ Room gồm có là : ");
        while (iterator.hasNext()) {
            System.out.println(count++ + ": " + iterator.next());
        }
        System.out.println("--------------------------------------------------------");

    }

    //-------------------------------Villa----------------------------------------------
    private static void showAllNameVillaNotDuplicate() {
        TreeSet<String> treeSetVilla = new TreeSet<>(new HashSet<>());

        for (Villa villa : dsVL) {
            treeSetVilla.add(villa.getTenDichVu());
        }
        Iterator<String> iterator = treeSetVilla.iterator();
        System.out.println("Danh sách các dịch vụ Villa gồm có là : ");
        while (iterator.hasNext()) {
            System.out.println(count++ + ": " + iterator.next());
        }
        System.out.println("--------------------------------------------------------");
    }

    //----------------------------------------------------------------------------------------------------------------
    // displayMain

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
                showService();
        }
    }


    // Phần lưu thông tin của Villa
    Scanner sc = new Scanner(System.in);

    static ArrayList<Villa> dsVL = new ArrayList<Villa>();

    public static void menuVilla() {
        System.out.println("1.Nhập Villa");
        System.out.println("2.Lưu Villa");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát");
        System.out.println("Bạn muốn làm gì ?");
        int l = new Scanner(System.in).nextInt();

        switch (l) {
            case 1:
                nhap();
                menuVilla();
                System.out.println("---------------------------------------------");
                break;
            case 2:
                luu();
                System.out.println("---------------------------------------------");
                break;
            case 3:
                addNewService();
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.err.println("Bạn đã thoát khỏi Villa !");
                System.exit(0);
                System.out.println("---------------------------------------------");
        }
    }

    private static void docVL() {
        dsVL = SerializeFileFactory.docFile("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileVilla.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong ! \n Đây là thông tin của Villa ! \n ");

    }

    private static void luu() {

        boolean kq = SerializeFileFactory.luuFile(dsVL, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileVilla.csv");
        if (kq = true) {
            System.out.println("đã lưu file thành công danh sách Villa");
        } else {
            System.out.println("lưu chưa thành công danh sách Villa");
        }

    }

    private static void xuatVL() {
        for (Villa vl : dsVL) {
            System.out.println(vl);
            System.out.println("---------------------------------------------------------------------");
        }
    }

    private static void nhap() {

        System.out.println("Mã dịch vụ : (SVVL-YYYY  -  Trong đó : YYYY là 4 chữ số.)");
        String id = new Scanner(System.in).nextLine();
        String test = "^S[V]{1}+V[L]{1}+[-]+[0-9]{4}$";
        Pattern.matches(test, id);
        while (Pattern.matches(test, id) != true) {
            System.out.println("Mời bạn nhập lại đúng định dạng : ");
            id = new Scanner(System.in).nextLine();
        }

        System.out.print("Tên dịch vụ : ");
        String tenDichVu = new Scanner(System.in).nextLine();
        checkTen(tenDichVu);


        System.out.print("Diện tích sử dụng là : ");
        double dienTichSuDung = new Scanner(System.in).nextDouble();
        checkDienTich(dienTichSuDung);

        System.out.print("Chi phí thuê là : ");
        double cPhiThue = new Scanner(System.in).nextDouble();
        checkChiPhiThue(cPhiThue);

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
        checkDienTich(dienTichHoBoi);

        System.out.print("Số tầng : ");
        int soTang = new Scanner(System.in).nextInt();

        Villa villa = new Villa(id, tenDichVu, dienTichSuDung, cPhiThue, soLuongNguoiToiDa, kieuThue, tieuchuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
        dsVL.add(villa);

    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Phần lưu thông tin của House

    static ArrayList<House> dsHouse = new ArrayList<House>();

    public static void menuHouse() {
        System.out.println("1.Nhập vào House");
        System.out.println("2.Lưu file House");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát ");
        System.out.println("Bạn muốn làm gì ? ");
        int h = new Scanner(System.in).nextInt();

        switch (h) {
            case 1:
                nhapHouse();
                System.out.println("-------------------------------------------------");
                menuHouse();
                break;
            case 2:
                luuHouse();
                System.out.println("-------------------------------------------------");
                break;
            case 3:
                addNewService();
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.err.println("Bạn đã thoát khỏi House !");
                System.exit(0);
                System.out.println("-------------------------------------------------");
                break;
        }
    }


    private static void nhapHouse() {
        System.out.println("Mã dịch vụ : (SVXX-YYYY)");
        String id = new Scanner(System.in).nextLine();
        System.out.print("Tên dịch vụ : ");
        String tenDichVu = new Scanner(System.in).nextLine();
        System.out.print("Diện tích sử dụng là : ");
        double dienTichSuDung = new Scanner(System.in).nextDouble();
        checkDienTich(dienTichSuDung);

        System.out.print("Chi phí thuê là : ");
        double cPhiThue = new Scanner(System.in).nextDouble();
        checkChiPhiThue(cPhiThue);

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

        House house = new House(id, tenDichVu, dienTichSuDung, cPhiThue, soLuongNguoiToiDa, kieuThue, tieuchuanPhong, moTaTienNghiKhac, soTang);

        dsHouse.add(house);

    }

    private static void xuatHouse() {
        for (House house : dsHouse) {
            System.out.println(house);
        }
        System.out.println("--------------------------------------------------------------");
    }

    private static void luuHouse() {
        boolean kq = SerializeFileFactory.luuFileHouse(dsHouse, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileHouse.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách House ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách House ");
        }
    }

    private static void docHouse() {
        dsHouse = SerializeFileFactory.docFileHouse("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileHouse.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong! \n Đây là thông tin của house \n");
    }


    //----------------------------------------------------------------------------------------------------------------------------


    // Room

    static ArrayList<Room> dsRoom = new ArrayList<Room>();
    static int count = 1;

    public static void menuRoom() {
        System.out.println("1.Nhập vào Room");
        System.out.println("2.Lưu file Room");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát ");
        System.out.println("Bạn muốn làm gì ? ");
        int h = new Scanner(System.in).nextInt();

        switch (h) {
            case 1:
                System.out.println("Danh sách " + count++);
                nhapRoom();
                menuRoom();
                System.out.println("---------------------------------------------");
                break;
            case 2:
                luuRoom();
                System.out.println("---------------------------------------------");
                break;
            case 3:
                addNewService();
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.err.println("Bạn đã thoát khỏi Room ! ");
                System.exit(0);
                System.out.println("---------------------------------------------");
                break;
        }
    }


    private static void xuatRoom() {
        System.out.println("Đã đọc xong! \n Đây là thông tin của Room \n");
        for (Room room : dsRoom) {
            System.out.println(room);
        }
        System.out.println("----------------------------------------------------");
    }

    private static void nhapRoom() {
        System.out.println("Mã dịch vụ : (SVXX-YYYY)");
        String id = new Scanner(System.in).nextLine();

        System.out.print("Tên dịch vụ : ");
        String tenDichVu = new Scanner(System.in).nextLine();
        checkTen(tenDichVu);


        System.out.print("Diện tích sử dụng là : ");
        double dienTichSuDung = new Scanner(System.in).nextDouble();
        checkDienTich(dienTichSuDung);

        System.out.print("Chi phí thuê là : ");
        double chiPhiThue = new Scanner(System.in).nextDouble();
        checkChiPhiThue(chiPhiThue);


        System.out.print("Số lượng người tối đa : ");
        int soLuongNguoiToiDa = new Scanner(System.in).nextInt();
        checkSoLuongNguoiToiDa(soLuongNguoiToiDa);


        System.out.print("Kiểu thuê là : ");
        String kieuThue = new Scanner(System.in).nextLine();

        System.out.print("Dịch vụ miễn phí đi kèm : ");
        String dichVuMienPhiDiKem = new Scanner(System.in).nextLine();


        Room room = new Room(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhiDiKem);
        dsRoom.add(room);


    }

    private static void luuRoom() {
        boolean kq = SerializeFileFactory.luuFileRoom(dsRoom, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileRoom.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách Room ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách Room ");
        }
    }

    private static void docRoom() {
        dsRoom = SerializeFileFactory.docFileRoom("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileRoom.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong! \n Đây là thông tin của Room \n");

    }


    //---------------------------- Task 4-----------------------------------

    public static void checkTen(String tenDichVu) {
        String checkTen = "^[A-Z].+$";
        while (Pattern.matches(checkTen, tenDichVu) != true) {
            System.out.println("chữ cái đầu tien phải viết hoa : ");
            tenDichVu = new Scanner(System.in).nextLine();
        }
    }

    public static void checkDienTich(double dienTich) {
        while (dienTich < 30) {
            System.out.println("Diện tích phải lớn hơn 30m2");
            dienTich = new Scanner(System.in).nextDouble();
        }
    }

    public static void checkChiPhiThue(double chiPhi) {
        while (chiPhi < 0) {
            System.out.println("Chi phí thuê phải là số dương : ");
            chiPhi = new Scanner(System.in).nextDouble();
        }
    }

    public static void checkSoLuongNguoiToiDa(int sl){
            while (sl < 0 || sl >20){
                System.out.println("Số lượng người tối đa phải >0 và < 20 người");
                sl = new Scanner(System.in).nextInt();
            }
    }

}



