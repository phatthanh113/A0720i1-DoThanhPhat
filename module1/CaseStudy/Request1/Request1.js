//hàm onclick submit
function clickMouse() {
    //gọi biển cho họ và tên
    let name = document.getElementById("name").value;
    //gọi biển cho số CMND
    let idNumber = document.getElementById("idNumber").value;
    //gọi biển cho Ngày sinh
    let dateOfBirth = document.getElementById("dateOfBirth").value;
    //gọi biến cho email
    let mail = document.getElementById("mail").value;
    //gọi biến cho địa chỉ
    let address = document.getElementById("address").value;
    //gọi biến cho khách hàng,giá đã giảm
    let customer = document.getElementById("customer");
    let textCustomer = customer.options[customer.selectedIndex].text;
    let valueCustomer = Number(customer.value);
    //Gọi biến cho mã giảm giá
    let discount = document.getElementById("discount").value;
    //gọi biến cho số lượng người đi cùng
    let amount = document.getElementById("amount").value;
    //gọi biến số ngày thuê
    let rentDays = Number(document.getElementById("rentDays").value);
    //Gọi biến cho loại dịch vụ,giá loại dịch vụ
    let house = document.getElementById("typeOfHouse");
    let textHouse = house.options[house.selectedIndex].text;
    let priceHouse = Number(house.value);
    // gọi biến cho loại phòng
    let room = document.getElementById("typeOfRoom");
    let typeOfRoom = room.value;
    confirm("Thông tin của bạn" + "\n" + "Your Name :" + name + "\n" + "ID Number :" + idNumber + "\n" + "Date Of Birth :" + dateOfBirth
        + "\n" + "Email :" + mail + "\n" + "Address :" + address + "\n" + "Customer :" + textCustomer + "\n" + "Discount Code :" + discount
        + "\n" + "Amount of people :" + amount + "\n" + "Rent Days :" + rentDays + "\n" + "Rent Days :" + rentDays
        + "\n" + "Type Of House:" + textHouse + "\n" + "Type Of Room:" + typeOfRoom
    )
    // tính số tiền cần trả
    let payMoney;
    payMoney = priceHouse * rentDays * (1 - valueCustomer / 100);
    alert("Số tiền cần phải trả là :" + payMoney + "$")
}

//gọi hàm reset
function resetClick() {
    confirm("Bạn chắc chắn muốn reset ??")
}