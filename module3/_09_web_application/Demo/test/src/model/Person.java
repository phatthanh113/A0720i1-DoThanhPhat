package model;

import java.util.Date;

public class Person {
    private String fullName;
    private String address;
    private Date birthday;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public int getAge(){
        Date currentDay = new Date();
        return currentDay.getYear() - this.birthday.getYear()+1;
    }
    public String showBirthday(){
        return this.birthday.toString();
    }
}
