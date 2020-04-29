package Modules;

import java.io.Serializable;

public abstract class Service implements Serializable {
    protected String id ;
    protected String serviceName;
    protected double areaUsed;
    protected double rentalCosts;
    protected int maximumNumberOfPeople;
    protected String rentalType;

    public Service(String id, String serviceName, double areaUsed, double rentalCosts, int maximumNumberOfPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public Service() {

    }


    public String getServiceName() {
        return serviceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public void showInfor1() {
        System.out.println("Khu nghĩ dướng Furama xin kính chào quý khách : " + "\n" +
                "Tên dịch vụ là : " + getServiceName() + " \n" +
                "Diện tích sử dụng là : " + getAreaUsed() + "\n" +
                "Chi phí thuê là : " + getRentalCosts() + "\n" +
                "Số lượng người tối đa : " + getMaximumNumberOfPeople() + "\n" +
                "Kiểu thuê : " + getRentalType() + "\n");
    }

    @Override
    public String toString() {
        return  "Mã dịch vụ : "+ this.id +"\n"+
                "Tên dịch vụ là : " + this.serviceName + "\n"
                + "Diện tích sử dụng là : " + this.areaUsed + "\n" +
                "Chi phí thuê là : " + this.rentalCosts + "\n" +
                "Số lượng người tối đa : " + this.maximumNumberOfPeople + "\n" +
                "Kiểu thuê : " + this.rentalType;
    }

    public abstract void showInfor();

}
