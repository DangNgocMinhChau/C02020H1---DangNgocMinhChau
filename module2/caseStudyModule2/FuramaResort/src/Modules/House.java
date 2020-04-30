package Modules;

import java.io.Serializable;

public class House extends Service implements Serializable {
    private String roomStandard;
    private String comfortStandard;
    private int numberOfFloors;

    public House(){

    }

    public House(String id, String serviceName, double areaUsed, double rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, String comfortStandard, int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.comfortStandard = comfortStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, String comfortStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.comfortStandard = comfortStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getComfortStandard() {
        return comfortStandard;
    }

    public void setComfortStandard(String comfortStandard) {
        this.comfortStandard = comfortStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfor() {
        System.out.println( "Khu nghĩ dướng Furama xin kính chào quý khách : " + "\n" +
                "Tên dịch vụ là : " + getServiceName() + " \n" +
                "Diện tích sử dụng là : " + getAreaUsed() + "\n" +
                "Chi phí thuê là : " + getRentalCosts() + "\n" +
                "Số lượng người tối đa : " + getMaximumNumberOfPeople() + "\n" +
                "Kiểu thuê : " + getRentalType() + "\n" +
                "Tiêu chuẩn phòng : " + getRoomStandard() + "\n" +
                "Mô tả tiện nghi khác : " + getComfortStandard() + "\n" +
                "Số tầng : " + getNumberOfFloors() + "\n ");
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return 0;
    }

    @Override
    public boolean equals() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Tiêu chuẩn phòng là : "+this.roomStandard + "\n" +
                "Mô tả tiện nghi khác : "+this.comfortStandard + "\n" +
                "Số tầng " +this.numberOfFloors;
    }
}
