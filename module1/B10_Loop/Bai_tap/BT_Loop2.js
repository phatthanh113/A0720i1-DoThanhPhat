let submit = document.getElementById('submit');

function calculate() {
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
    }
}

// Bài tập 1: In ra dãy fibonaci
function calculate1() {
    let number = parseInt(prompt('Nhập số chữ số muốn xuất dãy'))
    let a1 = 0;
    let a2 = 1;
    let a = 0;
    let result =a1+','+a2+',';
    for (let i = 1; i <= number; i++) {
        a1 = a2;
        a2 = a;
        a = a1 + a2;
        result += a + ','
    }
    document.writeln(result)
}

//Bài tập 2 : TÍnh giai thừa của một số nguyên dương
function calculate2() {
    let number = parseInt(prompt('Nhập số muốn tính'));
    let result = 1;
    let i = 1;
    while (i <= number) {
        result *= i;
        i++;
    }
    document.writeln(result);
}

// Bài tập 3: Vẽ tam giác
function calculate3() {
    let number = parseInt(prompt('Nhập chiểu cao hình tam giác'));
    for (let i = 1; i <= number; i++) {
        document.writeln('<br>');
        for (let j = 1; j <= i; j++)
            document.writeln('*');
    }
    for (let k = number; k >= 1; k--) {
        document.write('<br>')
        for (let l = 1; l <= k; l++) {
            document.writeln('*')
        }
    }
    document.write('<br>')
    for (let i=0;i<=number;i++){
        for(j=0; j<i; j++)
            document.write("&ensp;");
        for(j=i;j<number; j++)
            document.write("*");
        document.write("<br>");
    }
    document.write('<br>')
    for (let i=0;i<=number;i++){
        for(j=0; j<i; j++)
        document.write("*");
        for(j=i;j<number; j++)
            document.write("&ensp;");
        document.write("<br>");
    }
    document.write('<br>')
}

//Bài tập 4 : Vẽ hình chữ nhật
function calculate4() {
    let length = parseInt(prompt('Nhập chiều dài hình chữ nhật'));
    let width = parseInt(prompt('Nhập chiều rộng hình chữ nhật'));
    let i = 0;
    while (i < length) {
        document.writeln('<br>');
        let j = 0;
        while (j < width) {
            document.writeln('*');
            j++
        }
        i++
    }
}

//Bài tập 5: Tính tiền lãi ngân hàng
// function f() {
//
// }