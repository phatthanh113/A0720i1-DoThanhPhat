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
        default : {
            alert('vui lòng nhập tên bài từ 1 đến 3')
        }
    }
}
function calculate1() {
    let count=0 ;
    let arr=[];
     while(count<6){
        let element=prompt('Nhập các phần tử của mảng');
        arr.push(element);
        count++;
    }
    document.writeln(arr.toString())
}
function calculate2(){
    let str= prompt('Nhập một dãy số');
    let arr = [str[0]];
    let x=1;
    for(x;x<str.length;x++){
        if(str[x-1]%2==0&&str[x]%2==0){
            arr.push('-',str[x])
        }
        else {
            arr.push(str[x])
        }
    }
    return document.writeln(arr.join(''))
}
function calculate3() {
    let str=prompt('Nhập một dãy bất kì');
    let arr =[];
    for(let i=0; i < str.length;i++){
        if(str.charAt(i)===str.charAt(i).toUpperCase() ){
            arr.push(str.charAt(i).toLowerCase())
        }
        else if(str.charAt(i)===str.charAt(i).toLowerCase() ){
            arr.push(str.charAt(i).toUpperCase())
        }
        else {
            arr.push(str.charAt(i))
        }
    }
     document.writeln(arr.join(''))
}