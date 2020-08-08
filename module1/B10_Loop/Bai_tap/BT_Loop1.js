let submit = document.getElementById('submit');

function calculateDisplay() {
    submit = parseInt(submit.value);
    switch (submit) {
        case 1: {
            calculate1();
            break;
        }
        case 2: {
            calculate2();
            break;
        }
        case 3: {
            calculate3();
            break;
        }
        case 4: {
            calculate4();
            break;
        }
        case 5: {
            calculate5();
            break;
        }
        case 6: {
            calculate6();
            break;
        }
        case 7: {
            calculate7();
            break;
        }
    }

}
//Bài tập 1 : In ra 100 số đầu tiên
function calculate1() {
    for (let i = 1; i <= 100; i++) {
        if (i === 100) {
            break;
        }
        document.write(i + ',')
    }
    alert('Đã hoàn thành')
}
//Bài tập 2 :Lấy thông tin nhiệt độ
function calculate2() {
    let n=true;
    let degree='';
    while (n) {
        degree = parseInt(prompt('Nhập nhiệt độ của bạn'));
        if(degree<20){
            alert('Bạn cần tăng nhiệt độ')
        }
        else if(degree>100){
            alert('Bạn cần giảm nhiệt độ')
        }
        else{
            break;
        }
        n++;
    }
    document.writeln(degree)
}
//Bài tập 3 : in ra 20 số trong dãy fibonaci
function calculate3() {
    let a1 = 0;
    let a2 = 1;
    let a = 0;
    let result= a1+ ',';
    for (let i = 1; i <= 20; i++) {
        a1 = a2;
        a2 = a;
        a = a1 + a2;
        result += a + ','
    }
    document.writeln(result)
}
//Bài tập 4 : in ra số đầu tiên trong dãy fibonacci chia hết cho 5.
function calculate4() {
    let a1 = 0;
    let a2 = 1;
    let a = 0;
    let number=2;
    while (number) {
        a1 = a2;
        a2 = a;
        a = a1 + a2;
        if(a%5 === 0){
            break;
        }
    }
    document.write(a)
}
//Bài tập 5 :Tính tổng của 20 số đầu tiên trong dãy fibonacci.
function calculate5(){
    let a1 = 0;
    let a2 = 1;
    let a = 0;
    let result=0;
    for (let i = 2; i <= 21; i++) {
        a1 = a2;
        a2 = a;
        a = a1 + a2;
        result += a;
    }
    document.writeln(result)
}
//Bài tập 6 :Tính tổng của 30 số chia hết cho 7 đầu tiên trong các số tự nhiên.
function calculate6() {
    let number =0;
    let result=0;
    let i=0;
    while (i<30){
        if(number%7===0){
            i++;
            result += number;
        }
        number++;
    }
    document.write(result)
}
//Bài tập 7
function calculate7() {
    let result='';
    let number='';
    let i=1;
    for (i;i<=100;i++){
        if(i%3===0){
            if(i%5===0){
                number='FizzBuzz'+'<br>';
            }
            else {
                number='Fizz'+'<br>';
            }
        }
        else if(i%5===0){
            number='Buzz'+'<br>';
        }
        else {
            number=i+'<br>';
        }
        result+=number
    }
    document.writeln(result)
}