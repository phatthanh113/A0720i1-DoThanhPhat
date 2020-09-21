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
            calculate4();
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
        case '8a' : {
            calculate8a();
            break;
        }
        case '8b' : {
            calculate8b();
            break;
        }
        case '9' : {
            calculate9();
            break;
        }
        case '10' : {
            calculate10();
            break;
        }
        case '11' : {
            calculate11();
            break;
        }
        case '12' : {
            calculate12();
            break;
        }
        default : {
            alert('Vui lòng nhập tên bài từ 1 đến 5')
        }
    }
}

//in ra các dấu * theo cấu trúc cho sẵn
function calculate1() {
    let result = '';
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 5; j++) {
            result += '*'
        }
        result += '<br>'
    }
    document.writeln(result);
}

//In ra ngày tháng năm tương ứng
function isLeapYear(year) {
    return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
}

function calculate2() {
    let month = parseFloat(prompt('Nhập tháng bạn muốn kiểm tra'));
    let year = parseFloat(prompt('Nhập năm bạn muốn kiểm tra'));
    let day = 30;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: {
            day = 31;
            break;
        }
        case 4:
        case 6:
        case 9:
        case 11: {
            day = 30;
            break;
        }
        case 2: {
            if (isLeapYear(year)) {
                day = 29;
            } else {
                day = 28;
            }
            break;
        }
    }
    alert('Tháng ' + month + ' Năm ' + year + ' Có ' + day + ' ngày ');
}

//Viết chương trình tính tổng các phân số
function calculate3(number) {
    number = parseInt(prompt('Nhập số bạn muốn tính'));
    let result = 0;
    for (let i = 1; i <= number; i++) {
        result += 1 / i
    }
    alert(result)
}

//Viết chương trình tính tổng các phân số
function calculate4(number) {
    number = parseInt(prompt('Nhập số phần tử bạn muốn tính'));
    let result = 15;
    let denominator = 1;
    for (let i = 1; i <= number; i++) {
        for (let j = 1; j <= i; j++) {
            denominator *= j;
        }
        if (i % 2 === 0) {
            result += 1 / denominator;
        } else {
            result += -1 / denominator;
        }
    }
    alert(result);
}

//Viết chương trình tính tổng các phân số
function calculate5(number) {
    number = parseInt(prompt('Nhập số phần tử bạn muốn tính'));
    let result = 0;
    let denominator = 1;
    for (let i = 1; i <= 2 * number - 1; i += 2) {
        for(let j=1;j<=i;j++) {
            denominator*=j;
        }
        result+= 1/denominator;
    }
    alert(result)
}

//tính giai thừa các số chẵn , lẻ
function calculate6(number) {
    number = parseInt(prompt('Nhập số phần tử bạn muốn tính'));
    let evenFactorial = 1;
    let oddFactorial = 1;
    for (let i = 2; i <= 2 * number; i += 2) {
        evenFactorial *= i;
    }
    for (let i = 1; i <= 2 * number - 1; i += 2) {
        oddFactorial *= i;
    }
    alert(evenFactorial);
    alert(oddFactorial);
}

//Tỉnh tổng và tính các chữ số của 1 số cho trước
function calculate7(number) {
    number = prompt('Nhập vào số bạn muốn tính tổng và tích các chữ số');
    let sum = 0;
    let product=1;
    for (let i = 0; i < number.length; i++) {
        sum += parseInt(number.charAt(i));
        product*= parseInt(number.charAt(i));
    }
    alert('sum: '+sum);
    alert('product: '+product);
}

//Tìm ước chung nhỏ nhất của 2 số
function calculate8a(numberA, numberB) {
    numberA = parseInt(prompt('Nhập vào số thứ nhất'));
    numberB = parseInt(prompt('Nhập vào số thứ hai'));
    let result=0;
    if (numberA==0 || numberB==0) {
        result = numberA + numberB ;
    }
    while (numberA!=numberB) {
        if(numberA > numberB) {
            numberA -= numberB;
        }else {
            numberB -= numberA;
        }
    }
    result=numberB;
    alert('UCLN của 2 số  là '+result);
}
//tìm bội chung nhỏ nhất của 2 số
function calculate8b(a,b) {
    a = parseInt(prompt('Nhập vào số thứ nhất'));
    b = parseInt(prompt('Nhập vào số thứ hai'));
    let max = a*b;
    let lcm=0;
    for(let i=maxNumber(a,b);i<=max ;i++) {
        if(i%a===0 && i%b ===0) {
            lcm=i;
            break;
        }
    }
    alert('Bội chung nhỏ nhất của 2 số là '+lcm)
}
//Thực hiện các công việc với chuỗi
function calculate9(string{
    string = prompt('Nhập chuỗi');
    //Đảo ngược chuỗi
    let reverseString = '';
    for (let i = string.length - 1; i >= 0; i--) {
        reverseString += string[i];
    }
    alert(reverseString);
    // Đổi chuỗi sang chữ hoa
    alert(string.toUpperCase());
    // Đổi chuỗi sang chữ thường
    alert(string.toLowerCase());
    //Đổi chữ hoa thành chữ thường và ngược lại
    let newString = '';
    for (let j = 0; j < string.length; j++) {
        if (string[j] === string[j].toLowerCase()) {
            newString += string[j].toUpperCase();
        } else if (string[j] === string[j].toUpperCase()) {
            newString += string[j].toLowerCase();
        }
    }
    alert(newString);
}

//Làm các công việc với chuỗi
function calculate10(string) {
    string = prompt('Nhập chuỗi');
    //In mỗi từ trên mỗi dòng
    string.trim();
    let result = '';
    let number = 1;
    for (let i = 0; i < string.length; i++) {
        if (string[i-1] !== ' ' && string[i] !== ' ') {
            result += string[i];
        } else if (string[i] === ' ' && string[i+1] === ' ') {
            continue;
        } else if (string[i-1] === ' ' && string[i] !== ' ') {
            result += '\n' + string[i];
            number += 1;
        }
    }
    alert(result);
    alert(number);
}

//
function calculate11(array) {
    array = [];
    let number = parseInt(prompt('Nhập vào sô phần tử bạn muốn có trong mảng'));
    for (let i = 0; i < number; i++) {
        let element = parseInt(prompt('Nhập các phần tử nguyên'));
        array.push(element);
    }
    let oddSum = 0;
    for (let arr of array) {
        if (arr % 2 !== 0 &&  arr > 0) {
            oddSum += arr
        }
    }
    alert(oddSum);
    array.sort((a,b) => a-b) ;
    alert(array);
    let addElement=parseInt(prompt('Nhập phần tử bạn muốn thêm'));
    array.push(addElement);
    array.sort((a,b) => a-b) ;
    alert(array);
}
// TÌm bội chung nhỏ nhất của 2 số
function maxNumber(a,b) {
    if(a == b || a > b) {
        return a
    }else {
        return b
    }
}

//
function calculate12() {

}