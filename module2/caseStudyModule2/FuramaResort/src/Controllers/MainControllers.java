package Controllers;

import Emloyee.Employee;
import Modules.Customer;
import Modules.House;
import Modules.Room;
import Modules.Villa;
import TaskCheckDuLieuDauVao.RegularExpression;
import luuFile.SerializeFileFactory;

import java.util.HashMap;
import java.util.Map;

import java.io.Serializable;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;

public class MainControllers extends RegularExpression implements Serializable {
    public static void displayMainMennu() throws ParseException {

        System.out.println("1. Add New Services" + "\n" +
                "2. Show Services " + "\n" +
                "3. Add New Customer" + "\n" +
                "4. Show Information of Customer " + "\n" +
                "5. Add New Booking" + "\n" +
                "6. Employee" + "\n" +
                "7. Exit" + "\n");
        System.out.println("mời bạn nhập vào lựa chọn");
        int choose = new Scanner(System.in).nextInt();

        switch (choose) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInfoCustomer();
                break;
            case 5:
                addNewBook();
                break;
            case 6:
                menuEmployee();
                break;
        }
    }

    //-----------------Employee----------------------
    public static void menuEmployee() throws ParseException {
        System.out.println("1. Add Employee " + "\n" +
                "2. Show Infor Employee" + "\n" +
                "3. Add Map Employee " + "\n" +
                "4. Show Map Employee " + "\n" +
                "5. Back " + "\n" +
                "6. Exit");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                addEmployee();
                menuEmployee();
                break;
            case 2:
                showInforEmployee();
                break;
            case 3:
                addMapEmployee();
                menuEmployee();
                break;
            case 4:
                showMapEmployee();
                break;
            case 5:
                displayMainMennu();
                break;
            case 6:
                System.err.println("Cảm ơn bạn đã xử dụng");
                System.exit(0);
        }
    }

    //------------------------------------------------
    public static void addNewService() throws ParseException {
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
    public static void showService() throws ParseException {
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
            treeSetHouse.add(house.getServiceName());
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
            treeSetRoom.add(room.getServiceName());
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
            treeSetVilla.add(villa.getServiceName());
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


    // Phần lưu thông tin của Villa---------------------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);

    static ArrayList<Villa> dsVL = new ArrayList<Villa>();

    public static void menuVilla() throws ParseException {
        System.out.println("1.Nhập Villa");
        System.out.println("2.Lưu Villa");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát");
        System.out.println("Bạn muốn làm gì ?");
        int l = new Scanner(System.in).nextInt();

        switch (l) {
            case 1:
                nhapVL();
                menuVilla();
                System.out.println("---------------------------------------------");
                break;
            case 2:
                luuVL();
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

    private static void luuVL() {

        boolean kq = SerializeFileFactory.luuFile(dsVL, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileVilla.csv");
        if (kq = true) {
            System.out.println("đã lưu file thành công danh sách Villa");
        } else {
            System.out.println("lưu chưa thành công danh sách Villa");
        }

    }

    private static void xuatVL() {
        int count = 1;
        for (Villa vl : dsVL) {
            System.out.println("Villa " + count + " : " + "\n" + vl);
            count++;
            System.out.println("---------------------------------------------------------------------");
        }
    }

    private static void nhapVL() {

        System.out.println("Mã dịch vụ : (SVVL-YYYY  -  Trong đó : YYYY là 4 chữ số.)");
        String idVilla = new Scanner(System.in).nextLine();
        String test = "^S[V]{1}+V[L]{1}+[-]+[0-9]{4}$";
        Pattern.matches(test, idVilla);
        while (Pattern.matches(test, idVilla) != true) {
            System.out.println("Mời bạn nhập lại đúng định dạng : ");
            idVilla = new Scanner(System.in).nextLine();
        }

        System.out.print("Tên dịch vụ : ");
        String serviceNameVilla = new Scanner(System.in).nextLine();
        checkStandardizedName(serviceNameVilla);


        System.out.print("Diện tích sử dụng là : ");
        double areaUsedVilla = new Scanner(System.in).nextDouble();
        checkAreaUsedAndAreaPool(areaUsedVilla);

        System.out.print("Chi phí thuê là : ");
        double rentalCostsVilla = new Scanner(System.in).nextDouble();
        checkRentalCosts(rentalCostsVilla);

        System.out.print("Số lượng người tối đa : ");
        int maximumNumberOfPeopleVilla = new Scanner(System.in).nextInt();
        checkMaximumNumberOfPeople(maximumNumberOfPeopleVilla);

        System.out.print("Kiểu thuê là : ");
        String rentalTypeVilla = new Scanner(System.in).nextLine();
        checkStandardizedName(rentalTypeVilla);

        System.out.print("Tiêu chuẩn phòng là : ");
        String roomStandardVilla = new Scanner(System.in).nextLine();
        checkStandardizedName(roomStandardVilla);

        System.out.print("Mô tả tiện nghi khác : ");
        String comfortDescriptionVilla = new Scanner(System.in).nextLine();


        System.out.print("Diện tích hồ bơi là : ");
        double poolAreaVilla = new Scanner(System.in).nextDouble();
        checkAreaUsedAndAreaPool(poolAreaVilla);

        System.out.print("Số tầng : ");
        int numberOfFloorsVilla = new Scanner(System.in).nextInt();
        checkNumberOfFloors(numberOfFloorsVilla);

        Villa villa = new Villa(idVilla, serviceNameVilla, areaUsedVilla, rentalCostsVilla, maximumNumberOfPeopleVilla, rentalTypeVilla, roomStandardVilla, comfortDescriptionVilla, poolAreaVilla, numberOfFloorsVilla);
        dsVL.add(villa);

    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Phần lưu thông tin của House

    static ArrayList<House> dsHouse = new ArrayList<House>();

    public static void menuHouse() throws ParseException {
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
        System.out.println("Mã dịch vụ : (SVHO-YYYY  -  Trong đó : YYYY là 4 chữ số.)");
        String idHouse = new Scanner(System.in).nextLine();
        String test = "^S[V]{1}+H[O]{1}+[-]+[0-9]{4}$";
        Pattern.matches(test, idHouse);
        while (Pattern.matches(test, idHouse) != true) {
            System.out.println("Mời bạn nhập lại đúng định dạng : ");
            idHouse = new Scanner(System.in).nextLine();
        }

        System.out.print("Tên dịch vụ : ");
        String serviceNameHouse = new Scanner(System.in).nextLine();
        checkStandardizedName(serviceNameHouse);

        System.out.print("Diện tích sử dụng là : ");
        double areaUsedHouse = new Scanner(System.in).nextDouble();
        checkAreaUsedAndAreaPool(areaUsedHouse);

        System.out.print("Chi phí thuê là : ");
        double rentalCostsHouse = new Scanner(System.in).nextDouble();
        checkRentalCosts(rentalCostsHouse);

        System.out.print("Số lượng người tối đa : ");
        int maximumNumberOfPeopleHouse = new Scanner(System.in).nextInt();
        checkMaximumNumberOfPeople(maximumNumberOfPeopleHouse);


        System.out.print("Kiểu thuê là : ");
        String rentalTypeHouse = new Scanner(System.in).nextLine();
        checkStandardizedName(rentalTypeHouse);


        System.out.print("Tiêu chuẩn phòng là : ");
        String roomStandardHouse = new Scanner(System.in).nextLine();
        checkStandardizedName(roomStandardHouse);


        System.out.print("Mô tả tiện nghi khác : ");
        String comfortStandardHouse = new Scanner(System.in).nextLine();


        System.out.print("Số tầng : ");
        int numberOfFloorsHouse = new Scanner(System.in).nextInt();
        checkNumberOfFloors(numberOfFloorsHouse);


        House house = new House(idHouse, serviceNameHouse, areaUsedHouse, rentalCostsHouse, maximumNumberOfPeopleHouse, rentalTypeHouse, roomStandardHouse, comfortStandardHouse, numberOfFloorsHouse);

        dsHouse.add(house);

    }

    private static void xuatHouse() {
        int count = 1;
        for (House house : dsHouse) {
            System.out.println("House " + count + " : " + "\n" + house);
            count++;
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

    public static void menuRoom() throws ParseException {
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
        int count = 1;
        for (Room room : dsRoom) {
            System.out.println("Room " + count + " : " + "\n" + room);
            count++;
        }
        System.out.println("----------------------------------------------------");
    }

    private static void nhapRoom() {
        System.out.println("Mã dịch vụ : (SVRO-YYYY)");
        String idRoom = new Scanner(System.in).nextLine();
        String test = "^S[V]{1}+R[O]{1}+[-]+[0-9]{4}$";
        Pattern.matches(test, idRoom);
        while (Pattern.matches(test, idRoom) != true) {
            System.out.println("Mời bạn nhập lại đúng định dạng : ");
            idRoom = new Scanner(System.in).nextLine();
        }

        System.out.print("Tên dịch vụ : ");
        String serviceNameRoom = new Scanner(System.in).nextLine();
        checkStandardizedName(serviceNameRoom);


        System.out.print("Diện tích sử dụng là : ");
        double areaUsedRoom = new Scanner(System.in).nextDouble();
        checkAreaUsedAndAreaPool(areaUsedRoom);

        System.out.print("Chi phí thuê là : ");
        double rentalCostsRoom = new Scanner(System.in).nextDouble();
        checkRentalCosts(rentalCostsRoom);


        System.out.print("Số lượng người tối đa : ");
        int maximumNumberOfPeopleRoom = new Scanner(System.in).nextInt();
        checkMaximumNumberOfPeople(maximumNumberOfPeopleRoom);


        System.out.print("Kiểu thuê là : ");
        String rentalTypeRoom = new Scanner(System.in).nextLine();
        checkStandardizedName(rentalTypeRoom);


        System.out.print("Dịch vụ miễn phí đi kèm : ");
        String serviceFreeRoom = new Scanner(System.in).nextLine();


        Room room = new Room(idRoom, serviceNameRoom, areaUsedRoom, rentalCostsRoom, maximumNumberOfPeopleRoom, rentalTypeRoom, serviceFreeRoom);
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


    //---------------------------- Task 5-----------------------------------


    public static void menuCustomer() throws ParseException {
        System.out.println("1. Add New Customer\t" +
                "2. Show Information Customers\t");
        System.out.println("Nhập vào lựa chọn của bạn : ");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                addNewCustomer();
                break;
            case 2:
                showInfoCustomer();
                break;
        }
    }


    public static ArrayList<Customer> dsCustomer = new ArrayList<Customer>();


    public static void addNewCustomer() throws ParseException {

        System.out.println("Nhập họ tên Customer ");
        String nameCustomer = new Scanner(System.in).nextLine();
        checkName(nameCustomer);

        System.out.println("Nhập ngày tháng năm sinh Customer ");
        String birthDayCustomer = new Scanner(System.in).nextLine();
        checkBirthday(birthDayCustomer);

        System.out.println("Nhập vào giới tính của Customer ");
        String genderCustomer = new Scanner(System.in).nextLine();
        checkGender(genderCustomer);

        System.out.println("Nhập vào ID của Customer ");
        String idCardCustomer = new Scanner(System.in).nextLine();
        checkIdCard(idCardCustomer);

        System.out.println("Nhập vào number Phone của Customer ");
        String phoneNumberCustomer = new Scanner(System.in).nextLine();
        checkNumberPhone(phoneNumberCustomer);

        System.out.println("Nhập vào email của Customer ");
        String emailCustomer = new Scanner(System.in).nextLine();
        checkEmail(emailCustomer);

        System.out.println("Nhập vào loại Customer ");
        String speciesCustomer = new Scanner(System.in).nextLine();

        System.out.println("Nhập vào địa chỉ của Customer ");
        String addressCustomer = new Scanner(System.in).nextLine();

        Object services = "Chưa cập nhật";


        dsCustomer.add(new Customer(nameCustomer, birthDayCustomer, genderCustomer, idCardCustomer,
                phoneNumberCustomer, emailCustomer, speciesCustomer, addressCustomer, services));

        Collections.sort(dsCustomer);
        luuCustomer();

    }


    private static void xuatCustomer() {

        Collections.sort(dsCustomer, new Customer());
        int count = 1;
        for (Customer st : dsCustomer) {

            System.out.println(count + " . " + st.getNameCustomer() + " " + st.getBirthDayCustomer());
//            System.out.println(st);
            count++;
        }

        System.out.println("--------------------------------------------------------------");
    }

    private static void luuCustomer() {
        boolean kq = SerializeFileFactory.luuFileCustomer(dsCustomer, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileCustomer.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách Customer ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách Customer ");
        }
    }

    private static void docCustomer() {
        dsCustomer = SerializeFileFactory.docFileCustomer("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileCustomer.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong! \n Đây là thông tin của Customer \n");
    }

    public static void showInfoCustomer() {
        docCustomer();
        xuatCustomer();
    }


//-------------------------Task 7 --------------------------------------------------


    public static void addNewBook() {
        System.out.println(" Danh sách Customer : \t ");
        showInfoCustomer();
        them();
    }

    private static void luuCustomerBooking() {
        boolean kq = SerializeFileFactory.luuFileCustomer(dsCustomer, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileCustomerBooking.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách CustomerBooking ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách CustomerBooking ");
        }
    }

    private static void docCustomerBooking() {
        dsCustomer = SerializeFileFactory.docFileCustomer("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileCustomerBooking.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong! \n Đây là thông tin của Customer \n");
    }

    private static void xuatCustomerBooking() {
        for (Customer customer : dsCustomer) {
            System.out.println(customer);
        }
    }

    public static void showInfoCustomerBooking() {
        docCustomerBooking();
        xuatCustomerBooking();

    }

    private static void them() {
        System.out.println("Lựa chọn khách hàng : ");
        int code = new Scanner(System.in).nextInt();
        System.out.println(dsCustomer.get(code - 1));
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n");
        System.out.println("Dịch vụ khách hàng muốn thuê là : ");
        int choose = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                docVL();
                xuatVL();
                System.out.println("Chọn Villa muốn thuê : ");
                int selection = new Scanner(System.in).nextInt();
                for (Villa villa : dsVL) {
                    dsVL.get(selection - 1);
                    dsCustomer.get(code - 1).setServices(dsVL.get(selection - 1));
                    System.out.println(dsCustomer.get(code - 1));
                    luuCustomerBooking();
                }
                break;

            case 2:
                docHouse();
                xuatHouse();
                System.out.println("Chọn House muốn thuê : ");
                int selectionHouse = new Scanner(System.in).nextInt();
                for (House house : dsHouse) {
                    dsHouse.get(selectionHouse - 1);
                    dsCustomer.get(code - 1).setServices(dsHouse.get(selectionHouse - 1));
                    System.out.println(dsCustomer.get(code - 1));
                    luuCustomerBooking();
                }
                break;

            case 3:
                docRoom();
                xuatRoom();
                System.out.println("Chọn Room muốn thuê : ");
                int selectionRoom = new Scanner(System.in).nextInt();
                for (Room room : dsRoom) {
                    dsRoom.get(selectionRoom - 1);
                    dsCustomer.get(code - 1).setServices(dsRoom.get(selectionRoom - 1));
                    System.out.println(dsCustomer.get(code - 1));
                    luuCustomerBooking();
                }
                break;
        }

    }

    //---------------------------------Task 9 ----------------------------------------------


    static ArrayList<Employee> dsEmployee = new ArrayList<Employee>();

    public static void addEmployee() {

        System.out.println("Nhập vào tên Employee : ");
        String nameEmployee = new Scanner(System.in).nextLine();
        checkName(nameEmployee);

        System.out.println("Nhập nắm sinh của Employee : ");
        String birthdayEmployee = new Scanner(System.in).nextLine();
        checkBirthday(birthdayEmployee);

        System.out.println("Nhập vào số CMND của Employee : ");
        String idCardEmployee = new Scanner(System.in).nextLine();
        checkIdCard(idCardEmployee);

        System.out.println("Nhập vào số ĐT của Employee : ");
        String numberPhoneEmployee = new Scanner(System.in).nextLine();
        checkNumberPhone(numberPhoneEmployee);


        System.out.println("Nhập vào email của Employee : ");
        String emailEmployee = new Scanner(System.in).nextLine();
        checkEmail(emailEmployee);

        System.out.println("Mời bạn nhập vào trình độ của Employee và chữ cái đầu tiên phải viết hoa " + "\n" +
                "Trình độ bao gồm : [Trung cấp , Cao đẳng , Đại học , Sau đại học]");
        String levelEmployee = new Scanner(System.in).nextLine();
        checkLevelEmployee(levelEmployee);

        System.out.println("Nhập vào vị trí của Emloyee và chữ cái đầu tiên phải viết hoa " + "\n" +
                "Vị trí bao gồm : [Lễ tân , Phục vụ , Chuyên viên , Giám sát , Quản lý , Giám đốc]");
        String locationEmployee = new Scanner(System.in).nextLine();
        checkLocationEmployee(locationEmployee);


        System.out.println("Lương của Emloyee : ");
        String salaryEmployee = new Scanner(System.in).nextLine();

        dsEmployee.add(new Employee(nameEmployee, birthdayEmployee, idCardEmployee,
                numberPhoneEmployee, emailEmployee, levelEmployee, locationEmployee, salaryEmployee));
        luuEmployee();
    }

    private static void luuEmployee() {
        boolean kq = SerializeFileFactory.luuFileEmployee(dsEmployee, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileEmployee.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách Employee ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách Employee ");
        }
    }

    private static void docEmployee() {
        dsEmployee = SerializeFileFactory.docFileEmployee("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileEmployee.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong! \n Đây là thông tin của Employee \n");
    }

    private static void xuatEmployee() {
        int count = 1;
        for (Employee employee : dsEmployee) {
            System.out.println("Employee " + count + " : " + "\n" + employee);
            count++;
        }
    }

    public static void showInforEmployee() {
        docEmployee();
        xuatEmployee();
    }

    public static void addMapEmployee() {
        System.out.println("Nhập Employ để nhập mã : ");
        int chooseEmployee = new Scanner(System.in).nextInt();

        System.out.println("Nhập vào mã Employee : ");
        int codeEmployee = new Scanner(System.in).nextInt();

        Map<Integer, Object> mapEmployee = new HashMap<Integer, Object>();
        int e = 0;
        for (Employee employee : dsEmployee) {
            e = employee.setCodeEmployee(codeEmployee);
        }

        dsEmployee.add((Employee) mapEmployee.put(e, dsEmployee.get(chooseEmployee - 1)));

        Set<Integer> set = mapEmployee.keySet();
        for (Integer key : set) {
            System.out.println(mapEmployee.get(key));
        }
        luuMapEmployee();

    }

    private static void luuMapEmployee() {
        boolean kq = SerializeFileFactory.luuFileEmployee(dsEmployee, "D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileMapEmployee.csv");
        if (kq = true) {
            System.out.println("bạn đã lưu thành công danh sách Employee ");
        } else {
            System.out.println("bạn lưu chưa thành công danh sách Employee ");
        }
    }

    private static void docMapEmployee() {
        dsEmployee = SerializeFileFactory.docFileEmployee("D://Hoc//hocLapTrinh//codeGym//cacModuleChuongTrinhHocCodeGym//module2//caseStudyModule2//luuFile/luuFileMapEmployee.csv");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Đã đọc xong! \n Đây là thông tin của Employee \n");
    }

    private static void xuatMapEmployee() {
        int count = 1;
        for (Employee employee : dsEmployee) {
            System.out.println("Employee " + count + " : " + "\n" + employee);
            count++;
        }
    }

    public static void showMapEmployee() {
        docMapEmployee();
        xuatMapEmployee();
    }


    //-----------------------------Task 10 ----------------------------------


    public static void customerMovie() {
        Queue<String> customersMovie = new LinkedList<>();
        docCustomer();
        xuatCustomer();
        System.out.println("Số lượng vé xem phim trong hôm nay là : ");
        int movieTickets = new Scanner(System.in).nextInt();
        int numberOfBuy = 1;
        while (numberOfBuy <= movieTickets) {
            System.out.println("nhập vào vi trí khách hàng muốn mua vé ");
            int selection = new Scanner(System.in).nextInt();
            customersMovie.offer(dsCustomer.get(selection - 1).getNameCustomer());

            System.out.println("Còn customer nào mua nữa ko : (c/k) ?");
            String check = new Scanner(System.in).nextLine();
            if (check.equalsIgnoreCase("k")) {
                break;

            } else {
                if (numberOfBuy == movieTickets) {
                    System.out.println("đã bán hết vé !");
                    int count = 1;
                    while (true) {
                        String name = customersMovie.poll();
                        if (name == null) {
                            break;
                        }
                        System.out.println(count + " : " + name);
                        count++;
                    }
                    break;

                } else {
                    numberOfBuy++;
                }

            }
        }
    }
}











