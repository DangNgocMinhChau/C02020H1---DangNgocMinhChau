package Modules;

public class Customer {
    private String nameCustomer;
    private String birthDayCustomer;
    private String grnderCustomer;
    private int idCardCustomer;
    private int phoneNumberCustomer;
    private String emailCustomer;
    private String addressCustomer;
    private Object services;

    public Customer() {

    }

    public Customer(String nameCustomer, String birthDayCustomer,
                    String grnderCustomer, int idCardCustomer, int phoneNumberCustomer,
                    String emailCustomer, String addressCustomer, Object services) {
        this.nameCustomer = nameCustomer;
        this.birthDayCustomer = birthDayCustomer;
        this.grnderCustomer = grnderCustomer;
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

    public String getGrnderCustomer() {
        return grnderCustomer;
    }

    public void setGrnderCustomer(String grnderCustomer) {
        this.grnderCustomer = grnderCustomer;
    }

    public int getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(int idCardCustomer) {
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

}
