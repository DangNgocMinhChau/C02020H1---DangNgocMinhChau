package Modules;

import java.io.Serializable;

public class Villa extends Service implements Serializable  {
    private String roomStandard;
    private String comfortDescription;
    private double poolArea;
    private int numberOfFloors;


    public Villa(String villa){

    }

    public Villa(String id, String serviceName, double areaUsed, double rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, String comfortDescription, double poolArea, int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.comfortDescription = comfortDescription;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String roomStandard, String comfortDescription, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.comfortDescription = comfortDescription;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {

    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
                "Mô tả tiện nghi khác : " + getComfortDescription() + "\n" +
                "Diện tích hồ bơi : " + getPoolArea() + "\n" +
                "Số tầng : " + getNumberOfFloors() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Tiêu chuẩn phòng là : "+this.roomStandard + "\n" +
                "Mô tả tiện nghi khác : "+this.comfortDescription + "\n" +
                "Diện tích hồ bơi : "+this.poolArea + "\n" +
                "Số tầng " +this.numberOfFloors;
    }
}
