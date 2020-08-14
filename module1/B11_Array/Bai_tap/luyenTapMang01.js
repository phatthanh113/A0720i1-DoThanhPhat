let options = document.getElementById('options');

function calculate() {
    switch (options.value) {
        case '1' : {
            calculate1()
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
            calculate7()
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
            alert('Vui lòng nhập tên bài từ 1 đến 9')
        }
    }
}
//In mảng các số lớn hơn 10 và đếm
function calculate1() {
    let arr10=[];
    let array=[];
    let count=0;
    for(let i=0;i<10;i++){
        let number=parseFloat(prompt('Nhập một số bất kì'));
        array.push(number);
        if(Number.isInteger(number) && number>=10){
            arr10.push(number);
            count++
        }
    }
    document.writeln('Dãy vừa nhập là ' + array.toString() +'<br>')
    document.writeln('Các số là số nguyên và >=10 trong dãy vừa nhập là ' + arr10.toString()+'<br>');
    document.writeln('Có '+count+' số')
}
//Hiển thị giá trị lớn nhất trong mảng
function calculate2() {
    let arr =[];
    for (let i = 0; i < 10; i++) {
        let number = parseFloat(prompt('Nhập 10 phần tử trong dãy'));
        arr.push(number);
    }
    let max= arr[0];
    let j=1 ;
    for(j in arr){
        if(max < arr[j]){
            max = arr[j];
        }
    }
    document.writeln('Số lớn nhất trong dãy là '+max+'<br>'+'Nằm ở vị trí '+ j);
}
//Hiển thị giá trị lớn nhất trong mảng , tính giá trị trung bình
function calculate3() {
    let arr =[];
    let result=0;
    let i=0;
    while(i<10) {
        let number = parseFloat(prompt('Nhập 10 phần tử là số nguyên trong dãy'));
        if(Number.isInteger(number)){
            result+=number;
            arr.push(number);
            i++;
        }
        else {
            alert('Bạn phải nhập số nguyên')
        }
    }
    let max= arr[0];
    let j=1 ;
    for(j in arr){
        if(max < arr[j]){
            max = arr[j];
        }
    }
    result = result/10
    document.writeln('Số lớn nhất trong dãy là '+max+'<br>');
    document.writeln('Trung bình công của dãy là '+result);
}
//Đảo ngược các phần tử trong mảng
function calculate4() {
    let arr =[];
    for (let i = 0; i < 10; i++) {
        let number = parseFloat(prompt('Nhập 10 phần tử trong dãy'));

    }
    document.writeln('Dãy số sau khi bị đảo ngược là'+ arr.reverse().toString());
}
//Viết phương trình đếm số nguyên âm
function calculate5() {
    let arr = [];
    let numberLength = parseFloat(prompt('Nhập độ dài mảng bạn muốn tạo'));
    let i = 0;
    let count = 0;
    while (i < numberLength) {
        let number = parseFloat(prompt('Nhập các phần tử trong dãy'));
        if (!isNaN(number)) {
            if (number < 0) {
                count++
            }
            arr.push(number);
            i++;
        } else {
            alert('Bạn phải nhập số')
        }
    }
    alert('Số phần tử âm trong dãy bạn vừa nhập là '+ count)
}
// VIết phương trinh kiểm tra phần tử có trong mảng hay không
function calculate6() {
    let arr=[1,2,3,5,6,7,8,9,12,11];
    let number = 5;
    if(arr.indexOf(number) !== -1){
       return  document.writeln('Có number trong mảng')
    }
    else {
        return document.writeln('Không có number trong mảng')
    }
}
// VIết phương trinh kiểm tra phần tử có trong mảng hay không và xóa phần tử trong mảng
function calculate7() {
    let arr=[1,2,3,5,6,7,8,9,12,11];
    let number = 5;
    let index =arr.indexOf(number)
    if( index !== -1){
        arr.splice(index,1);
        arr.push(0)
    }
    document.writeln(arr)
}
//Xếp mảng theo thứ tự giảm dần
function calculate8() {
    let arr=[1,2,3,5,6,7,8,9,12,11];
    let sort= arr.sort((a,b) => b-a) ;
    document.writeln(arr)
}
// Nối mảng a và b vào c
function calculate9() {
    let arrA=[1,2,3,5,6,7,8,9,12,11];
    let arrB=[2,5,6,7,8,4,23,12,4,5];
    let arrC=[12,3,4,5,6,2,3,4,5,65,23,3,3,4,5,6,7,34,2,2];
    let result=arrC.concat(arrA).concat(arrB)
    document.writeln(result)
    console.log(result)
}