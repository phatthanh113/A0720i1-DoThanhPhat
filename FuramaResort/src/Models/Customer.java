package Models;

public class Customer{
    private String name;
    private String dayOfBirth;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dayOfBirth, String gender, String idNumber, String phoneNumber, String customerType, String address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void useServices(Services services) {
        System.out.println("bạn đang sử dụng dịch vụ"+services.getNameService());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
