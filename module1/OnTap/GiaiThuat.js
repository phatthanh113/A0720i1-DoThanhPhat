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
        case '8' : {
            calculate8();
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
        default : {
            alert('Vui lòng nhập tên bài từ 1 đến 5')
        }
    }
}
//
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

//
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
    alert('Tháng '+month+' Năm '+year+' Có '+day+' ngày ');
}
//
function calculate3(number) {
    number=parseInt(prompt('Nhập số bạn muốn tính'));
    let result=0;
    for(let i=1; i <= number;i++) {
        result+=1/i
    }
    alert(result)
}
//
function calculate4(number) {
    number=parseInt(prompt('Nhập số phần tử bạn muốn tính'));
    let result=0;
    for(let i=1; i <= number;i++) {
        if(i%2===0) {
            result += 1/i;
        }else {
            result += -1/i;
        }
    }
    alert(result)
}
//
function calculate5(number) {
    number=parseInt(prompt('Nhập số phần tử bạn muốn tính'));
    let result=0;
    for(let i=1; i <= 2*number-1;i+=2) {
        result+=1/i;
    }
    alert(result)
}
//
function calculate6(number) {
    number=parseInt(prompt('Nhập số phần tử bạn muốn tính'));
    let evenFactorial=1;
    let oddFactorial=1;
    for(let i=2;i<=2*number;i+=2){
        evenFactorial*=i;
    }
    for(let i=1;i<=2*number-1;i+=2){
        oddFactorial*=i;
    }
    alert(evenFactorial);
    alert(oddFactorial);
}
//
function calculate7(number) {
    number=prompt('Nhập vào số bạn muốn tính tổng các chữ số');
    let result=0;
    for (let i=0; i < number.length;i++) {
        result+=parseInt(i);
    }
    alert(result);
}
//
function calculate8(numberA,numberB) {
    numberA=parseInt(prompt('Nhập vào số bạn muốn tính tổng các chữ số'));
    numberB=parseInt(prompt('Nhập vào số bạn muốn tính tổng các chữ số'));
    let maxCommon=0;
    let minCommon=0;
    if(numberA>numberB) {
        for(let i=1; i<numberB ;i++) {

        }
    }

}
// 
function calculate9(string) {
    string=prompt('Nhập chuỗi');
    let reverseString='';
    for(let i=string.length-1;i>=0;i--) {
        reverseString+=string[i];
    }
    alert(reverseString);
    alert(string.toUpperCase());
    alert(string.toLowerCase());
    let newString='';
    for(let j=0;j<string.length;j++) {
        if(string[j]===string[j].toLowerCase()) {
            newString+=string[j].toUpperCase();
        }
        else if(string[j]===string[j].toUpperCase()) {
            newString+=string[j].toLowerCase();
        }
    }
    alert(newString);
}
//
function calculate10(string) {
    string=prompt('Nhập chuỗi');
    string.trim();
    let result='';
    let number=1;
    for(let i=0; i<string.length;i++) {
        if(string[i-1] !==' ' && string[i] !== ' '){
            result+=string[i];
        }
        else if(string[i] ===' ' && string[i+1] === ' ') {
            continue;
        }
        else if(string[i-1] ===' ' && string[i] !== ' ') {
            result+='\n'+string[i];
            number+=1;
        }
    }
    alert(result);
    alert(number);
}
//
function calculate11(array) {
    array=[];
    let number=parseInt(prompt('Nhập vào sô phần tử bạn muốn có trong mảng'));
    for(let i=0;i<number;i++) {
        let element=parseInt(prompt('Nhập các phần tử nguyên'));
        array.push(element);
    }
    let oddSum=0;
    for(let arr of array) {
        if(arr%2 !== 0) {
            sum+=arr
        }
    }
    alert(oddSum);
}