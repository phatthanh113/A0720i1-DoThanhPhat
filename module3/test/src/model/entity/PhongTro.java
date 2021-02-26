package model.entity;

public class PhongTro {
    private int id ;
    private String namePerson ;
    private String phone ;
    private String dateOpen ;
    private int paymentId ;
    private String note ;

    public PhongTro() {
    }

    public PhongTro(int id, String namePerson, String phone, String dateOpen, int paymentId, String note) {
        this.id = id;
        this.namePerson = namePerson;
        this.phone = phone;
        this.dateOpen = dateOpen;
        this.paymentId = paymentId;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(String dateOpen) {
        this.dateOpen = dateOpen;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
