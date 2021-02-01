package model.dto;

public class ShopDTO {
    private int idCus ;
    private String nameCus ;
    private String namePro ;
    private String birthDay ;

    public ShopDTO(int idCus, String nameCus, String namePro, String birthDay) {
        this.idCus = idCus;
        this.nameCus = nameCus;
        this.namePro = namePro;
        this.birthDay = birthDay;
    }

    public ShopDTO() {
    }

    public int getIdCus() {
        return idCus;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
