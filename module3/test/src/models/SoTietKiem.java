package models;

public abstract class SoTietKiem {
    private String id;
    private String idCustomer;
    private String dateOpen;
    private String dateSend ;
    private String money;
    private String lai_suat;

    public SoTietKiem() {
    }

    public SoTietKiem(String id, String idCustomer, String dateOpen, String dateSend, String money, String lai_suat) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.dateOpen = dateOpen;
        this.dateSend = dateSend;
        this.money = money;
        this.lai_suat = lai_suat;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getLai_suat() {
        return lai_suat;
    }

    public void setLai_suat(String lai_suat) {
        this.lai_suat = lai_suat;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(String dateOpen) {
        this.dateOpen = dateOpen;
    }

    public String getDateSend() {
        return dateSend;
    }

    public void setDateSend(String dateSend) {
        this.dateSend = dateSend;
    }

    @Override
    public String toString() {
        return "SoTietKiem{" +
                "id='" + id + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", dateOpen='" + dateOpen + '\'' +
                ", dateSend='" + dateSend + '\'' +
                ", money='" + money + '\'' +
                ", lai_suat='" + lai_suat + '\'' +
                '}';
    }
}
