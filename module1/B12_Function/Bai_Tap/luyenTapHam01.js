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
        default : {
            alert('Vui lòng nhập tên bài từ 1 đến 5')
        }
    }
}
//B1 :Tạo chuỗi hello
function calculate1() {
    alert('hello')
}
//B2 :Tăng giá trị đối số lên 1
function calculate2(number) {
    number=parseFloat(prompt('Nhập vào một số bất kì'));
    alert(++number);
}
//B3: nếu num1>num2 => hiển thị thông báo ; ngược lại trả về tổng
function calculate3(firstNum,secondNum) {
    firstNum=parseFloat(prompt('Nhập vào số đầu tiên'));
    secondNum=parseFloat(prompt('Nhập vào số thứ 2'));
    let sum =0;
    if(isNaN(firstNum)||isNaN(secondNum)) {
        alert('Bạn phải nhập đúng định dạng số')
    }
    else {
        if(firstNum>secondNum) {
            alert('Số thứ nhất lớn hơn số thứ hai')
        }
        else {
            sum=firstNum+secondNum;
            alert('Tổng của 2 số là '+sum);
        }
    }
}
//B4 :
function addNumbers(firstNum,secondNum) {
    let result=0;
    firstNum = 4;
    secondNum = 8;
    result = firstNum + secondNum;
    return console.log(result);
}

//B5
function calculate5(input) {
    input=prompt('Nhập tên chòm sao bạn muốn tìm(Vui lòng viết hoa chữ cái đầu mỗi từ)');
    input=input.trim();
    let array1 =['Polaris', 'Aldebaran', 'Deneb', 'Vega', 'Altair', 'Dubhe', 'Regulus'];
    let array2= ['Ursa Minor', 'Tarurus', 'Cygnus', 'Lyra', 'Aquila', 'Ursa Major', 'Leo'];
    let result='';
    for(i in array1) {
        if(array1[i]===input){
            result=array2[i];
            break;
        }
        else {
            result='không có chòm sao này'
        }
    }
    alert(result)
}