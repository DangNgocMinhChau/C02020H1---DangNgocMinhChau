package Modules;

import java.io.Serializable;

public class House extends Service implements Serializable {
    private String tieuchuanPhong;
    private String moTaTienNghiKhac;
    private int soTang;

    public House(){

    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuchuanPhong, String moTaTienNghiKhac, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuchuanPhong = tieuchuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public House(String tieuchuanPhong, String moTaTienNghiKhac, int soTang) {
        this.tieuchuanPhong = tieuchuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
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
                "Số tầng : " + getSoTang() + "\n ");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Tiêu chuẩn phòng là : "+this.tieuchuanPhong + "\n" +
                "Mô tả tiện nghi khác : "+this.moTaTienNghiKhac + "\n" +
                "Số tầng " +this.soTang;
    }
}
