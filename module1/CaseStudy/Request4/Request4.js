let name = document.getElementById('name');
let idNumber = document.getElementById('idNumber');
let dateOfBirth = document.getElementById('dateOfBirth');
let email = document.getElementById('email');
let address = document.getElementById('address');
let customer = document.getElementById('customer')
let discount = document.getElementById('discount');
let amount = document.getElementById('amount');
let rentDays = document.getElementById('rentDays');
let typeOfHouse = document.getElementById('typeOfHouse');
let typeOfRoom = document.getElementById('rentDays');
let temp=false;
//Hàm chính show menu
function showMenu() {
    temp=true;
    condition();
    while (temp) {
        let options = parseInt(prompt('1.Show Information Customer\n' +
            '2.Edit Information Customer\n' +
            '3.Show the amount to be paid after discount\n' +
            '4.Add Customers to the list\n' +
            '5.Delete Customers from the list'));
        switch (options) {
            case 1: {
                showInformation();
                break;
            }
            case 2 : {
                temp=false;
                break;
            }
            case 3: {
                calculate();
                break;
            }
            case 4: {
                addNameCustomer();
                break;
            }
            case 5: {
                deleteCustomer();
                break;
            }
            default: {
                alert('Bạn chỉ được chọn các đề xuất trên');
                break;
            }
        }
    }

}
//Show thông tin khách hàng
function showInformation() {
    alert("Thông tin của bạn\n" + "Your Name :" + name.value + "\n" + "ID Number :" + idNumber.value + "\n" + "Date Of Birth :" + dateOfBirth.value
        + "\n" + "Email :" + email.value + "\n" + "Address :" + address.value + "\n" + "Customer :" + customer.value + "\n" + "Discount Code :" + discount.value
        + "\n" + "Amount of people :" + amount.value + "\n" + "Rent Days :" + rentDays.value + "\n" +
        "Type Of House:" + typeOfHouse.value + "\n" + "Type Of Room:" + typeOfRoom.value
    )
}

//Hàm viết Điều kiện
function condition() {
    // ĐIều kiện CMND
        let tempNumber;
        if (!isNaN(idNumber.value)) {
            tempNumber = parseFloat(idNumber.value);
            if (!Number.isInteger(tempNumber)|| tempNumber < 10000000 || tempNumber > 99999999) {
                alert('Cmnd Sai');
                temp=false;
                return;
            }
        }
        //Điều kiện ngày sinh
        if(dateOfBirth.value===''){
            alert('Bạn cần nhâp ngày sinh');
            temp=false;
            return;
        }
        // Điều kiện email
        let tempEmail=email.value;
        let countAt=0;
        let countDoc=0;
        for (let i=0;i<tempEmail.length;i++) {
            if (tempEmail.charAt(i) === '@') {
                countAt++;
                for (let j=i+1;j<tempEmail.length;j++){
                    if (tempEmail.charAt(j)==='.'){
                        countDoc++
                    }
                }
            }
        }
        if(countAt ==0||countDoc<1){
            alert('email sai');
            temp=false;
            return;
        }
        // Diều kiện rentDays
        let tempRentDays=rentDays.value;
        if (!isNaN(tempRentDays)){
            tempRentDays=parseFloat(tempRentDays);
            if(!Number.isInteger(tempRentDays)||tempRentDays<0){
                alert('Bạn đã nhập sai số ngày thuê ');
                temp=false;
                return;
            }
        }
        // Điều kiện số người đi cùng
        let tempAmount=amount.value;
        let check=false;
        if (!isNaN(tempAmount)){
            tempAmount=parseFloat(tempAmount);
            if(Number.isInteger(tempAmount)&&tempAmount>0){
                check=true;
            }
        }
        if(!check){
            alert('Bạn đã nhập sai số lượng người đi cùng');
            temp=false;
            return;
        }
        //Chuẩn hóa dữ liệu name
        let nameStadard=name.value;
        let tempName='';
        nameStadard=nameStadard.trim().toLowerCase();
        for (let i=0;i<nameStadard.length;i++){
            if(nameStadard.charAt(i)===' ' && nameStadard.charAt(i+1)===' '){
                continue;
            }
            if(i===0 || nameStadard.charAt(i-1)===' '){
                tempName+=nameStadard.charAt(i).toUpperCase();
                continue;
            }
            tempName+=nameStadard.charAt(i)
        }
    name.value=tempName;
}
//Hàm Tính giá tiền
function calculate() {
    let priceHouse = 0;
    let discount = 0;
    let price = 0;
    rentDays.value = parseInt(rentDays.value)
    // Giá loại dịch vụ
    switch (typeOfHouse.value) {
        case 'Villa' :
            priceHouse = 500;
            break;
        case 'House' :
            priceHouse = 300;
            break;
        case 'Room' :
            priceHouse = 100;
            break;
    }
    // Giảm giá theo địa chỉ
    switch (address.value) {
        case 'Đà Nẵng' :
            discount += 20;
            break;
        case 'Huế' :
            discount += 10;
            break;
        case 'Quảng Nam' :
            discount += 5;
            break;
        default:
            break;
    }
    // Giảm giá theo số ngày thuê phòng
    if (rentDays.value > 7) {
        discount += 30;
    } else if (rentDays.value >= 5 && rentDays.value <= 7) {
        discount += 20;
    } else if (rentDays.value > 2 && rentDays.value <= 4) {
        discount += 10;
    }
    // Giảm giá theo loại khách hàng
    switch (customer.value) {
        case "Diamond": {
            discount += 15;
            break;
        }
        case "Platinum": {
            discount += 10;
            break;
        }
        case "Gold": {
            discount += 5;
            break;
        }
        case "Silver": {
            discount += 2;
            break;
        }
        case "Member": {
            discount += 0;
            break;
        }
    }
    // Tính tiền cần phải trả
    price = priceHouse * rentDays.value - discount;
    alert('Tổng số tiền bạn đã được giảm ' + discount + '$' + '\n' +
        'Tổng số tiền bạn phải trả ' + price + '$')
}
// Thêm người dùng vào Danh sách
let arrNameCustomers=new Array();
function  addNameCustomer() {
    let number = parseInt(prompt('Nhập số lượng khách hàng bạn muốn thêm'));
    for (let i=0; i < number;i++) {
        let nameCustomer=prompt('Nhập tên của khách hàng ');
        arrNameCustomers.push(nameCustomer);
    }
    let result ='Danh sách khách hàng bạn muốn thêm : \n';
    arrNameCustomers.sort();
    for (let i=0 ; i<arrNameCustomers.length;i++){
        result+='No '+(i+1)+': '+ arrNameCustomers[i] + '\n';
    }
    alert(result)
}
//Xóa người dùng khỏi danh sách
function deleteCustomer() {
    let result ='Danh sách khách hàng của bạn : \n';
    arrNameCustomers.sort();
    for (let i=0 ; i<arrNameCustomers.length;i++){
        result+='No '+(i+1)+': '+ arrNameCustomers[i] + '\n';
    }
    let check=false;
    let numberCustormer=parseInt(prompt('Nhập số thứ tự tên mà bạn muốn xóa '+result));
    for(let i=0;i<arrNameCustomers.length;i++) {
        if(numberCustormer === (i+1)){
            arrNameCustomers.splice(i,1);
            check =true;
        }
    }
    if(!check){
        alert("Sự lựa chọn này không có")
    }
    result ='Danh sách sau khi chỉnh sửa : \n';
    arrNameCustomers.sort();
    for (let i=0 ; i<arrNameCustomers.length;i++){
        result+='No '+(i+1)+': '+ arrNameCustomers[i] + '\n';
    }
    alert(result)
}