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
        default : {
            alert('vui lòng nhập tên bài từ 1 đến 6')
        }
    }
}
//BT1 : In ra các phần tử trong mảng
function calculate1() {
    let a = [
        [1, 2, 1, 24],
        [8, 11, 9, 4],
        [7, 0, 7, 27],
        [7, 4, 28, 14],
        [3, 10, 26, 7]
    ];
    let result ='';
    for(let i in a){
        result+='row '+ i +'<br>'
        for (let j in a[i]){
            result+= a[i][j]+'<br>'
        }
    }
    document.writeln(result)
}
//Bài tập 2 : in các phần tử trong mảng theo thứ tự đảo ngược
function calculate2() {
    let length =prompt('Nhập chiều dài mảng');
    let array =[]
    let i=0;
    while(i<length){
        let element=prompt('Nhập các phần tử trong mảng');
        array.push(element);
        i++;
    }
    document.writeln(array.reverse().join(''))
}
//In mảng và đếm số kí tự số trong mảng
function calculate3(array) {
    let length =prompt('Nhập chiều dài mảng');
    array =[];
    let i=0;
    let count=0;
    while(i<length){
        let element=prompt('Nhập các phần tử trong mảng');
        array.push(element);
        if(!isNaN(element)){
            count++;
        }
        i++;
    }
    document.writeln('Mảng này là' + array +'<br>');
    document.writeln('Mảng này có '+ count +'số');
}
//Đếm số từ trong 1 chuỗi
function calculate4(string) {
    string=prompt('Nhập một chuỗi bất kì');
    string=string.trim();
    let count=1;
    for (let i=0; i<string.length;i++){
        if(string[i-1]===' '&& string[i]=== ' '){
            continue
        }
        if(string[i]=== ' '){
            count++;
        }
    }
    document.writeln('Có '+count+' từ trong chuỗi');
}
//BT5 So sánh chuỗi A và chuỗi B
function calculate5() {
    let strA = prompt('Nhập vào chuỗi A');
    let strB = prompt('Nhập vào chuỗi B');
    let result = '';
    if (strA.length !== strB.length) {
        result ='Chuỗi A không bằng chuỗi B';
    }
    else {
        for (let i in strA) {
            if (strA[i] !== strB[i]) {
                result = 'Chuỗi A không bằng chuỗi B';
                break;
            } else {
                result = 'Chuỗi A bằng chuỗi B';
            }
        }
    }
        document.writeln(result)
    }
    // BT6 Thay đổi kí tự '-' trong mảng thành '_'
    function calculate6() {
        let length = prompt('Nhập chiều dài mảng');
        array = [];
        let i = 0;
        while (i < length) {
            let element = prompt('Nhập các phần tử trong mảng');
            array.push(element);
            i++;
        }
        let index;
        while (array.indexOf('-') !== -1) {
            index = array.indexOf('-');
            array[index] = '_';
        }
    document.writeln(array);
}