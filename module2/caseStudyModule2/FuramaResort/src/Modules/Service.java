package Modules;

import java.io.Serializable;

public abstract class Service implements Serializable {
    private String id;
    protected String tenDichVu;
    protected double dienTichSuDung;
    protected double chiPhiThue;
    protected int soLuongNguoiToiDa;
    protected String kieuThue;

    public Service(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public Service() {

    }


    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public void showInfor1() {
        System.out.println("Khu nghĩ dướng Furama xin kính chào quý khách : " + "\n" +
                "Tên dịch vụ là : " + getTenDichVu() + " \n" +
                "Diện tích sử dụng là : " + getDienTichSuDung() + "\n" +
                "Chi phí thuê là : " + getChiPhiThue() + "\n" +
                "Số lượng người tối đa : " + getSoLuongNguoiToiDa() + "\n" +
                "Kiểu thuê : " + getKieuThue() + "\n");
    }

    @Override
    public String toString() {
        return "Tên dịch vụ là : " + this.tenDichVu + "\n"
                + "Diện tích sử dụng là : " + this.dienTichSuDung + "\n" +
                "Chi phí thuê là : " + this.chiPhiThue + "\n" +
                "Số lượng người tối đa : " + this.soLuongNguoiToiDa + "\n" +
                "Kiểu thuê : " + this.kieuThue;
    }

    public abstract void showInfor();

}
