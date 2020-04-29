package Modules;

import java.io.Serializable;

public class Room extends Service implements Serializable {
    private String serviceFree;

    public Room(String idRoom, String serviceNameRoom, double areaUsedRoom, double rentalCostsRoom, int maximumNumberOfPeopleRoom, String rentalType, String serviceFreeRoom){

    }

    public Room(String id, String serviceName, double areaUsed, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        super(id, serviceName, areaUsed, rentalCosts, maximumNumberOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public void showInfor() {
        System.out.println("Khu nghĩ dướng Furama xin kính chào quý khách : " + "\n" +
                "Tên dịch vụ là : " + getServiceName() + " \n" +
                "Diện tích sử dụng là : " + getAreaUsed() + "\n" +
                "Chi phí thuê là : " + getRentalCosts() + "\n" +
                "Số lượng người tối đa : " + getMaximumNumberOfPeople() + "\n" +
                "Kiểu thuê : " + getRentalType() + "\n" +
                "Dịch vụ miễn phí đi kèm : " + getServiceFree());
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Dịch vụ miễn phí đi kèm : " + this.serviceFree;
    }
}
