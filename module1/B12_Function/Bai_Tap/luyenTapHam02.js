let options = document.getElementById('options');

function calculate() {
    switch (options.value) {
        case '1' : {
            calculate1();
            break;
        }
        case '2' : {
            calculate2();
            break;
        }
        case '3' : {
            calculate3();
            break;
        }
        case '4' : {
            calculate4()
            break;
        }
        case '5' : {
            calculate5();
            break;
        }
        case '6' : {
            calculate6();
            break;
        }
        case '7' : {
            calculate7();
            break;
        }
        case '8' : {
            calculate8();
            break;
        }
        case '9' : {
            calculate9();
            break;
        }
        default : {
            alert('Vui lòng nhập tên bài từ 1 đến 5')
        }
    }
}
// Bt1 : Tính bình phương 1 số
function calculate1(number) {
    number=parseFloat(prompt('Nhập số bất kì'));
    alert('Bình phương số đó là '+Math.pow(number,2))
}
//BT2 : Tính diện tích , chu vi hình tròn
function calculate2(radius) {
    radius=parseFloat(prompt('Nhập bán kính'));
    let perimeter= 2* Math.PI *radius;
    let area=  Math.PI *Math.pow(radius,2);
    alert('Chu vi hình tròn là '+perimeter);
    alert('Diện tích hình tròn là '+area);
}
//BT3 : Tính giai thừa của một số
function calculate3(number) {
    number=parseInt(prompt('Nhập số nguyên'));
    let result=1;
    for(let i=1;i<=number;i++) {
        result*=i
    }
    alert('Giai thừa của số đó là'+result);
}
//BT4 : kiểm tra kí tự nhập vào có phải số không
function calculate4(number) {
    number=prompt('Nhập vào số bạn muốn kiểm tra')
    let result='';
    if(isNaN(number)) {
        result+='Đây không phải là số'
    }
    else {
        result+='Đây là số'
    }
    alert(result)
}
//BT5 tìm số nhỏ nhất trong 3 số
function calculate5(number1, number2, number3) {
    number1=parseFloat(prompt('nhập vào số đầu tiên'));
    number2=parseFloat(prompt('nhập vào số thứ hai'));
    number3=parseFloat(prompt('nhập vào số thứ ba'));
    let min =number1 ;
    if(min>number2) {
        min=number2;
    }
    if(min>number3) {
        min=number3;
    }
    alert('Số nhỏ nhất là '+ min)
}
//Bt6 :Nhập số nguyên kiểm tra .nếu dương => true , ngược lại false
function calculate6(number) {
    number=parseFloat(prompt('Nhập vào số bạn muốn kiểm tra'));
    if(isNaN(number) || !Number.isInteger(number)) {
        alert('Đây không phải là số nguyên');
    }
    else {
        if(number>0) {
          return   alert(true);
        }
        else {
          return   alert(false);
        }
    }
}
// Bt7 : Đổi chố 2 số nguyên
function calculate7(number1,number2) {
    number1=parseFloat(prompt('Nhập vào số đầu tiên'));
    number2=parseFloat(prompt('Nhập vào số thứ hai'));
    alert('Hai số bạn đã nhập vào là '+number1+' và '+number2)
    let number=number1;
    number1=number2;
    number2=number;
    alert('Hai số bạn đã nhập vào là '+number1+' và '+number2)
}
//BT8 : Đảo ngược 1 mảng bất kì
function calculate8(array) {
    array=[];
    let length=parseFloat(prompt('Nhập vào độ dài mảng muốn tạo'));
    for (let i=0; i<length;i++) {
        let element=prompt('Nhập phần tử con')
        array.push(element);
    }
    alert('Mảng trươc khi đảo ngược '+array)
    array.reverse();
    alert('Mảng sau khi đảo ngược '+array)
}
//Bt9 : Đếm phần tử trong mảng
function calculate9(array,elementCheck) {
    array=[];
    let length=parseFloat(prompt('Nhập vào độ dài mảng muốn tạo'));
    for (let i=0; i<length;i++) {
        element=prompt('Nhập phần tử con');
        array.push(element);
    }
    alert(array)
    let count=0;
    elementCheck=prompt('Nhập phần tử bạn muốn tìm');
    let check=false;
    for(let i=0;i<array.length;i++) {
        if(array[i] == elementCheck) {
            count++;
            check=true;
        }
    }
    if(!check) {
        count=-1
    }
    alert(count)
}