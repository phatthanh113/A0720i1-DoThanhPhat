package models;

public class SoTietKiemDaiHan extends SoTietKiem {
    private String uu_dai ;
    private String ky_han;


    public SoTietKiemDaiHan() {
    }

    public SoTietKiemDaiHan(String id, String idCustomer, String dateOpen, String dateSend, String money, String lai_suat, String uu_dai, String ky_han) {
        super(id, idCustomer, dateOpen, dateSend, money, lai_suat);
        this.uu_dai = uu_dai;
        this.ky_han = ky_han;
    }
    public SoTietKiemDaiHan(String id, String idCustomer, String dateOpen, String dateSend, String money, String lai_suat) {
        super(id, idCustomer, dateOpen, dateSend, money, lai_suat);
    }

    public String getUu_dai() {
        return uu_dai;
    }

    public void setUu_dai(String uu_dai) {
        this.uu_dai = uu_dai;
    }

    public String getKy_han() {
        return ky_han;
    }

    public void setKy_han(String ky_han) {
        this.ky_han = ky_han;
    }

    @Override
    public String toString() {
        return "SoTietKiemDaiHan{" +
                "uu_dai='" + uu_dai + '\'' +
                ", ky_han='" + ky_han + '\'' +
                "} " + super.toString();
    }
}
