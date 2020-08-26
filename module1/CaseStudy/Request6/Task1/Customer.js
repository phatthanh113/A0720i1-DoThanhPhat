class Customer {
    constructor(name, age, idNumber, dateOfBirth, email, address, customerType, discount,rentDays, amount, typeOfRoom, typeOfHouse) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.discount = discount;
        this.rentDays=rentDays;
        this.amount = amount;
        this.typeOfRoom = typeOfRoom;
        this.typeOfHouse = typeOfHouse;

    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getAge() {
        return this.age;
    }

    setAge(age) {
        this.age = age;
    }

    getIdNumber() {
        return this.idNumber;
    }

    setIdNumber(idNumber) {
        this.idNumber = idNumber;
    }

    getDateOfBirth() {
        return this.dateOfBirth;
    }

    setDateOfBirth(dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    getEmail() {
        return this.email;
    }

    setEmail(email) {
        this.email = email;
    }

    getAddress() {
        return this.address;
    }

    setAddress(address) {
        this.address;
    }

    getCustomerType() {
        return this.customerType;
    }

    setCustomerType(customerType) {
        this.customerType = customerType;
    }

    getDiscount() {
        return this.discount;
    }

    setDiscount(discount) {
        this.discount = discount;
    }

    getRentDays() {
        return this.rentDays;
    }

    setRentDays(rentDays) {
        this.rentDays = rentDays;
    }

    getAmount() {
        return this.amount;
    }

    setAmount(amount) {
        this.amount = amount;
    }

    getTypeOfRoom() {
        return this.typeOfRoom;
    }

    setTypeOfRoom(typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    getTypeOfHouse() {
        return this.typeOfRoom;
    }

    setTypeOfHouse(typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }
    getTotayPays () {
        let price=0;
        if(this.typeOfHouse==='Villa') {
            price=500;
        }
        else if(this.typeOfHouse==='House') {
            price=300;
        }
        else if(this.typeOfHouse==='Room') {
            price=200;
        }
        return this.getRentDays() * price*(1-this.getDiscount()/100);
    }
}