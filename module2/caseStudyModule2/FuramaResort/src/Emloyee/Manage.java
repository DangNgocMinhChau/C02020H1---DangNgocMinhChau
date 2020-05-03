package Emloyee;

public class Manage extends Employee {

    public Manage(String nameEmployee, String birthdayEmployee, String idCardEmployee, String numberPhoneEmployee, String emailEmployee, String levelEmployee, String locationEmployee, String salaryEmployee) {
        super(nameEmployee, birthdayEmployee, idCardEmployee, numberPhoneEmployee, emailEmployee, levelEmployee, locationEmployee, salaryEmployee);
    }

    @Override
    public String toString() {
        return "Mã Employee : " + this.codeEmployee + "\n"+
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
