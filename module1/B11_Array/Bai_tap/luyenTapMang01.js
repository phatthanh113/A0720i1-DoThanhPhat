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
        default : {
            alert('vui lòng nhập tên bài từ 1 đến 3')
        }
    }
}
function calculate1() {
    let arr=[];
    let count=0;
    let array=[]
    for(let i=0;i<10;i++){
        let number=parseFloat(prompt('Nhập một số bất kì'));
        array.push(number);
        if(Number.isInteger(number)&&number>=10){
            arr.push(number);
            count++
        }
    }
    document.writeln('Dãy vừa nhập là ' + array.toString() +'<br>')
    document.writeln('Các số là số nguyên và >=10 trong dãy vừa nhập là ' + arr.toString()+'<br>');
    document.writeln('Có '+count+' số')
}
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