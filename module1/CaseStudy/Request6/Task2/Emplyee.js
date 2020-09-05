class Employee {
    constructor(name, idNumber, dateOfBirth, email, phoneNumber, level, position) {
        this.name = name;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.level = level;
        this.position = position;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        name=prompt('Nhập tên');
        this.name = name;
    }


    getIdNumber() {
        return this.idNumber;
    }

    setIdNumber(idNumber) {
        let regexIDNumber=/^[\d]{8,8}$/;
        do{
            idNumber=prompt('Nhập ID');
            if(regexIDNumber.test(idNumber)) {
                break;
            }else {
                alert('Bạn nhập sai định dạng')
            }
        }while (true);
        this.idNumber = idNumber;
    }

    getDateOfBirth() {
        return this.dateOfBirth;
    }

    setDateOfBirth(dateOfBirth) {
        let regexBirthday=/^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;
        do {
            dateOfBirth=prompt('Nhập Birthday');
            if(regexBirthday.test(dateOfBirth)) {
                break;
            }else {
                alert('Bạn nhập sai định dạng');
            }
        }while (true);
        this.dateOfBirth = dateOfBirth;
    }

    getEmail() {
        return this.email;
    }

    setEmail(email) {
        let regexEmail=/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/

        do {
            email=prompt('Nhập email');
            if(regexEmail.test(email)) {
                break;
            }else {
                alert('Bạn đã nhập sai định dạng email')
            }
        }while (true);

        this.email = email;
    }

    getPhoneNumber() {
        return this.phoneNumber;
    }

    setPhoneNumber(phoneNumber) {
        let regexPhoneNum=/^[\d]{9,10}$/;
        do{
            phoneNumber=prompt('Nhập số đthoai');
            if(regexPhoneNum.test(phoneNumber)){
                break;
            }else {
                alert('Bạn đã nhập sai định dạng số đt');
            }
        }while (true);
        this.phoneNumber=phoneNumber;
    }
    getLevel() {
        return this.level;
    }

    setLevel(level) {
        level=prompt('Nhập trình độ')
        this.level=level;
    }
    getPosition() {
        return this.position;
    }

    setPosition(position) {
        position=prompt('Nhập vị trí(Manager,Sale,Marketing)');
        position.toLowerCase();
        this.position=position;
    }
    getSalary() {
        let salary=0;
        if(this.getPosition()==='manager') {
            return salary= 500 ;
        }
        else if(this.getPosition()==='sale') {
            return salary= 300 ;
        }
        else if(this.getPosition()==='marketing') {
            return salary= 200 ;
        }
    }
}