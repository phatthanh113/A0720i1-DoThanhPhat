let arrListCustomer=new Array();
function displayMainMenu(options) {
    options=parseInt(prompt('1.Add New Customer'+
        '\n 2.Display Information Customer'+
        '\n 3.Edit Information Customer'+
        '\n 4.Delete Customer'+
        '\n 5.Exit'));
    switch (options) {
        case 1: {
            addNewCustomer();
            break;
        }
        case 2: {
           displayInfoCustomer();
            break;
        }
        case 3: {
            editInfoCustomer();
            break;
        }
        case 4: {
            deleteCustomer();
            break;
        }
        case 5: {
            break;
        }
        default: {
            alert('Không có sự lựa chọn này');
            break;
        }
    }
}
displayMainMenu();
//Thêm người dùng vào danh sách
function addNewCustomer() {
    alert('Hiện tại trong danh sách có '+arrListCustomer.length+' khách hàng');
        let name=prompt('Input Name Person');
        let age=prompt('Input Age');
        let idNumber=prompt('Input ID Number');
        let dateOfBirth=prompt('Input Date Of Birth');
        let email=prompt('Input Email');
        let address=prompt('Input Address');
        let customerType=prompt('Input Customer Type');
        let discount=prompt('Input Discount');
        let amount=prompt('Input Amount');
        let typeOfRoom=prompt('Input Type of Room');
        let typeOfHouse=prompt('Input Type Of House');
        let arrCustomerInfo= new Array();
        // arrCustomerInfo.push(name);
        arrCustomerInfo.push(name,age,idNumber,dateOfBirth,email,address,customerType,discount,amount,typeOfHouse,typeOfRoom);
        arrListCustomer.push(arrCustomerInfo);
    alert(arrListCustomer);
    displayMainMenu();
}
//Hiển thỉ toàn bộ thông tin khách hàng
function displayInfoCustomer() {
    //Hiển thị tên khách hàng cho người dùng biết
    let result='Bạn muốn xem thông tin khách hàng nào ?\n';
    for(let i=0;i<arrListCustomer.length;i++) {
        result+= i+'. ' + arrListCustomer[i][0] + '\n';
    }
    alert();
    //Hiển thị thông tin từng khách hàng
    let numberCustomer=parseFloat(prompt(result));
    alert('Name: '+arrListCustomer[numberCustomer][0]+'\n'+
        'Age: '+arrListCustomer[numberCustomer][1]+'\n'+
        'ID Number: '+arrListCustomer[numberCustomer][2]+'\n'+
        'Date Of Birth: '+arrListCustomer[numberCustomer][3]+'\n'+
        'Email: '+arrListCustomer[numberCustomer][4]+'\n'+
        'Address: '+arrListCustomer[numberCustomer][5]+'\n'+
        'Customer type: '+arrListCustomer[numberCustomer][6]+'\n'+
        'Discount: '+arrListCustomer[numberCustomer][7]+'\n'+
        'Amount: '+arrListCustomer[numberCustomer][8]+'\n'+
        'Type of room : '+arrListCustomer[numberCustomer][9]+'\n'+
        'Type of house: '+arrListCustomer[numberCustomer][10]+'\n');
    displayMainMenu();
}
//Sửa thông tin người dùng
function editInfoCustomer() {
    //Hiển thị tên khách hàng cho người dùng biết
    let result='Bạn muốn sửa thông tin khách hàng nào ?\n';
    for(let i=0;i<arrListCustomer.length;i++) {
        result+= i+'. ' + arrListCustomer[i][0] + '\n';
    }
    //Sửa thông tin khách hàng
    let numberCustomer=parseFloat(prompt(result));
    let choice=parseFloat(prompt('Nhập sự lựa chọn bạn muốn sửa'+'\n'+
    '0.Name\n'+'1.Age\n'+'2.ID Number\n'+'3.Birthday\n'+'4.Email\n'+'5.Address\n'+'6.Customer Type\n'
        +'7.Discount\n'+'8.Amount\n'+'9.Type of room\n'+'10.Type of house\n'));
    let check=false;
    for(let i=0; i < arrListCustomer[numberCustomer].length;i++) {
        if(i === choice) {
            arrListCustomer[numberCustomer][i]=prompt('Nhập sự chỉnh sửa của bạn');
            alert('Bạn đã sửa thành công');
            check=true;
        }
    }
    if(!check) {
        alert('Không có sự lựa chọn này')
    }
    displayMainMenu();
}
//Xóa Khách hàng
function deleteCustomer() {
    //Hiển thị tên khách hàng cho người dùng biết
    let result='Bạn muốn xóa khách hàng nào ?\n';
    for(let i=0;i<arrListCustomer.length;i++) {
        result+= i+'. ' + arrListCustomer[i][0] + '\n';
    }
    alert(result);
    //Xóa khách hàng
    let numberCustomer=parseFloat(prompt('Nhập số thứ tự khách hàng bạn muốn xóa'));
    if(confirm('Bạn có chắc chắn muốn xóa khách hàng này không')) {
        arrListCustomer.splice(numberCustomer,1);
        alert('Bạn đã xóa thành công')
    }
    displayMainMenu();
}
