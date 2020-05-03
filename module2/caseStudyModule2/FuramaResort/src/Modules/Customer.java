package Modules;

import java.io.Serializable;
import java.util.Comparator;

public class Customer extends Service implements Serializable, Comparable<Customer>, Comparator<Customer>,Movie4D {

    private String nameCustomer;
    public String birthDayCustomer;
    private String genderCustomer;
    private String idCardCustomer;
    private String phoneNumberCustomer;
    private String emailCustomer;
    private String speciesCustomer;
    private String addressCustomer;
    private Object services;

    public Customer(String nameCustomer, int birthDayCustomer, String genderCustomer, String idCardCustomer, int phoneNumberCustomer, String emailCustomer, String addressCustomer, String customer, Object services) {

    }

    public Customer(String birthDayCustomer) {
        this.birthDayCustomer = birthDayCustomer;
    }

    public Customer(String nameCustomer, String birthDayCustomer,
                    String genderCustomer, String idCardCustomer, String phoneNumberCustomer,
                    String emailCustomer, String speciesCustomer, String addressCustomer, Object services) {

        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.emailCustomer = emailCustomer;
        this.speciesCustomer = speciesCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
    }

    public Customer(String nameCustomer, String birthDayCustomer, String genderCustomer, String idCardCustomer, int phoneNumberCustomer, String emailCustomer, String addressCustomer, String customer) {

    }

    public Customer() {

    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDayCustomer() {
        return birthDayCustomer;
    }

    public void setBirthDayCustomer(String birthDayCustomer) {
        this.birthDayCustomer = birthDayCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Object getServices() {
        return services;
    }

    public void setServices(Object services) {
        this.services = services;
    }

    public String getSpeciesCustomer() {
        return speciesCustomer;
    }

    public void setSpeciesCustomer(String speciesCustomer) {
        this.speciesCustomer = speciesCustomer;
    }

    public void showInfor() {

    }


    @Override
    public String toString() {
        return "Tên Khách hàng : " + nameCustomer + "\n" +
                "Ngày sinh  : " + birthDayCustomer + "\n" +
                "Giới tính : " + genderCustomer + "\n" +
                "Số CMND : " + idCardCustomer + "\n" +
                "Số ĐTDĐ   : " + phoneNumberCustomer + "\n" +
                "Email : " + emailCustomer + "\n" +
                "Loại  : " + speciesCustomer + "\n" +
                "Địa chỉ : " + addressCustomer + "\n" +
                "---------------Dịch vụ---------------" + "\n" + services + "\n" +
                "---------------~~~~~~~~--------------" + "\n";
    }

    @Override
    public String muaVe() {
        return " Đã mua vé ";
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }


    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.nameCustomer.compareTo(o2.nameCustomer);
    }

    @Override
    public boolean equals() {
        return false;
    }


}
