package models;

import java.io.IOException;

public class SoTietKiemCoThoiHan extends SoTietKiem{
    private String ky_han ;

    public SoTietKiemCoThoiHan() {
    }

    public SoTietKiemCoThoiHan(String id, String idCustomer, String dateOpen, String dateSend, String money, String lai_suat) {
        super(id, idCustomer, dateOpen, dateSend, money, lai_suat);
    }

    public SoTietKiemCoThoiHan(String id, String idCustomer, String dateOpen, String dateSend, String money, String lai_suat, String ky_han) {
        super(id, idCustomer, dateOpen, dateSend, money, lai_suat);
        this.ky_han = ky_han;
    }

    public String getKy_han() {
        return ky_han;
    }

    public void setKy_han(String ky_han) {
        this.ky_han = ky_han;
    }

    @Override
    public String toString() {
        return "SoTietKiemCoThoiHan{" +
                "ky_han='" + ky_han + '\'' +
                "} " + super.toString();
    }
}
