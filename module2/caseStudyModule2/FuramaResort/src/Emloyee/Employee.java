package Emloyee;

import java.io.Serializable;

public  class  Employee implements Serializable {
    protected int codeEmployee;
    protected String nameEmployee;
    protected String birthdayEmployee;
    protected String idCardEmployee;
    protected String numberPhoneEmployee;
    protected String emailEmployee;
    protected String levelEmployee;
    protected String locationEmployee;
    protected String salaryEmployee;



    public Employee(String nameEmployee, String birthdayEmployee,
                    String idCardEmployee, String numberPhoneEmployee,
                    String emailEmployee, String levelEmployee, String locationEmployee, String salaryEmployee) {
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.idCardEmployee = idCardEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.levelEmployee = levelEmployee;
        this.locationEmployee = locationEmployee;
        this.salaryEmployee = salaryEmployee;
    }


    public int getCodeEmployee() {
        return codeEmployee;
    }

    public int setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
        return codeEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(String birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public String getNumberPhoneEmployee() {
        return numberPhoneEmployee;
    }

    public void setNumberPhoneEmployee(String numberPhoneEmployee) {
        this.numberPhoneEmployee = numberPhoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getLocationEmployee() {
        return locationEmployee;
    }

    public void setLocationEmployee(String locationEmployee) {
        this.locationEmployee = locationEmployee;
    }

    public String getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(String salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String toString() {
        return  "Code : " + this.codeEmployee+"\n"+
                "Họ tên : " + this.nameEmployee + "\n" +
                "Ngày sinh : " + this.birthdayEmployee + "\n" +
                "Số CMND : " + this.idCardEmployee + "\n" +
                "Số ĐT : " + this.numberPhoneEmployee + "\n" +
                "Email : " + this.emailEmployee +"\n" +
                "Trình độ : " + this.levelEmployee +"\n" +
                "Vị trí : " + this.locationEmployee +"\n"+
                "Lương : " + this.salaryEmployee;
    }
}
