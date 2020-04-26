package Modules;

import java.io.Serializable;

public class Room extends Service implements Serializable {
    private String dichVuMienPhiDiKem;

    public Room(){

    }

    public Room(String id,String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(id,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public void showInfor() {
        System.out.println("Khu nghĩ dướng Furama xin kính chào quý khách : " + "\n" +
                "Tên dịch vụ là : " + getTenDichVu() + " \n" +
                "Diện tích sử dụng là : " + getDienTichSuDung() + "\n" +
                "Chi phí thuê là : " + getChiPhiThue() + "\n" +
                "Số lượng người tối đa : " + getSoLuongNguoiToiDa() + "\n" +
                "Kiểu thuê : " + getKieuThue() + "\n" +
                "Dịch vụ miễn phí đi kèm : " + getDichVuMienPhiDiKem());
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "Dịch vụ miễn phí đi kèm : " + this.dichVuMienPhiDiKem;
    }
}
