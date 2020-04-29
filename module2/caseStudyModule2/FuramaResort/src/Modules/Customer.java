package Modules;

import java.io.Serializable;

public class Customer extends Service implements Serializable {
    private String nameCustomer;
    private String birthDayCustomer;
    private String genderCustomer;
    private String idCardCustomer;
    private int phoneNumberCustomer;
    private String emailCustomer;
    private String addressCustomer;
    private Object services;

    public Customer(String customer, String nameCustomer, String name, int cardCustomer, int idCardCustomer, String emailCustomer, String addressCustomer) {

    }

    public Customer(String nameCustomer, String birthDayCustomer,
                    String genderCustomer, String idCardCustomer, int phoneNumberCustomer,
                    String emailCustomer, String addressCustomer, Object services) {
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
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

    public int getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(int phoneNumberCustomer) {
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

    public void showInfor(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", birthDayCustomer='" + birthDayCustomer + '\'' +
                ", genderCustomer='" + genderCustomer + '\'' +
                ", idCardCustomer=" + idCardCustomer +
                ", phoneNumberCustomer=" + phoneNumberCustomer +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                ", services=" + services +
                '}';
    }
}
