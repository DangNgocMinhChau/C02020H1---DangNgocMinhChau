package Modules;

import java.io.Serializable;

public class Villa extends Service implements Serializable {
    private String tieuchuanPhong;
    private String moTaTienNghiKhac;
    private double dienTichHoBoi;
    private int soTang;


    public Villa(String villa){

    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuchuanPhong, String moTaTienNghiKhac, double dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuchuanPhong = tieuchuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuchuanPhong, String moTaTienNghiKhac, double dienTichHoBoi, int soTang) {
        this.tieuchuanPhong = tieuchuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa() {

    }


    public String getTieuchuanPhong() {
        return tieuchuanPhong;
    }

    public void setTieuchuanPhong(String tieuchuanPhong) {
        this.tieuchuanPhong = tieuchuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public void showInfor() {
        System.out.println( "Khu nghĩ dướng Furama xin kính chào quý khách : " + "\n" +
                "Tên dịch vụ là : " + getTenDichVu() + " \n" +
                "Diện tích sử dụng là : " + getDienTichSuDung() + "\n" +
                "Chi phí thuê là : " + getChiPhiThue() + "\n" +
                "Số lượng người tối đa : " + getSoLuongNguoiToiDa() + "\n" +
                "Kiểu thuê : " + getKieuThue() + "\n" +
                "Tiêu chuẩn phòng : " + getTieuchuanPhong() + "\n" +
                "Mô tả tiện nghi khác : " + getMoTaTienNghiKhac() + "\n" +
                "Diện tích hồ bơi : " + getDienTichHoBoi() + "\n" +
                "Số tầng : " + getSoTang() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Tiêu chuẩn phòng là : "+this.tieuchuanPhong + "\n" +
                "Mô tả tiện nghi khác : "+this.moTaTienNghiKhac + "\n" +
                "Diện tích hồ bơi : "+this.dienTichHoBoi + "\n" +
                "Số tầng " +this.soTang;
    }
}
