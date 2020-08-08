// Bài tập 1
function calculate1() {
    let celsiusDegree = document.getElementById("celsiusDegree");
    let fahrenheitDegree = 0;
    if (parseInt(celsiusDegree.value) < 0) {
        alert('Bạn đã nhập sai số')
    } else {
        fahrenheitDegree = parseInt(celsiusDegree.value) * 1.8 + 32;
    }
    document.getElementById("resultDisplay1").innerHTML = "Độ F là " + fahrenheitDegree
}

//  Bài tập 2
function calculate2() {
    let meter = document.getElementById("meter");
    let condition = parseInt(meter.value) > 0
    let feet = 0
    if (condition) {
        feet = parseInt(meter.value) * 3.2808;
        document.getElementById("resultDisplay2").innerHTML = 'Kết quả nhận được là ' +
            feet + ' feet'
    } else {
        alert('Bạn đã nhập sai số')
    }
}

// Bài tập 3
function calculate3() {
    let side = document.getElementById("side");
    let condition = parseInt(side.value) > 0;
    let squareArea = 0;
    if (condition) {
        squareArea = Math.pow(parseInt(side.value), 2);
    } else {
        alert("Bạn đã nhập sai")
    }
    document.getElementById("resultDisplay3").innerHTML = "Diện tích hình vuông là " + squareArea
}

//Bài tập 4
function calculate4() {
    let length = document.getElementById("length");
    let width = document.getElementById("width");
    let condition1 = parseInt(length.value) > 0;
    let condition2 = parseInt(width.value) > 0;
    let rectangleArea = 0;
    if (condition1 && condition2) {
        rectangleArea = parseInt(length.value) * parseInt(width.value);
        document.getElementById("resultDisplay4").innerHTML = "Diện tích hình chữ nhật là " + rectangleArea
    } else {
        alert("Bạn đã nhập sai")
    }
}

// Bài tập 5
function calculate5() {
    let a = document.getElementById('a')
    let b = document.getElementById('b')
    let result = 0;
    if (Number(a.value) == 0 && Number(b.value) != 0) {
        result = 'vô nghiệm'
    } else if (Number(a.value) == 0 && Number(b.value) == 0) {
        result = 'vô số nghiệm'
    } else if (Number(a.value) != 0) {
        result = 'có nghiệm x là ' + Number(-b.value) / Number(a.value)
    }
    document.getElementById('resultDisplay5').innerHTML = 'Phương trình ' + result
}

// Bài tập 6
function calculate6() {
    let A = document.getElementById("A");
    let B = document.getElementById("B");
    let C = document.getElementById("C");
    let condition = Number(A.value) != 0
    let result = 0;
    if (condition) {
        let delta = Math.pow(Number(B.value), 2) - 4 * Number(A.value) * Number(C.value);
        if (delta < 0) {
            result = 'Vô nghiệm'
        } else if (delta == 0) {
            let root = -Number(B.value)/(2*Number(A.value))
            result = 'có nghiệm kép là '+ root;
        }else {
            let root1= (-Number(B.value)-Math.sqrt(delta))/(2*Number(A.value));
            let root2= (-Number(B.value)+Math.sqrt(delta))/(2*Number(A.value));
            result = "có 2 nghiệm phân biệt là "+root1+" hoặc "+root2 ;
        }
    }else {
        result =  'không phải phương trình bậc 2 '
    }
    document.getElementById('resultDisplay6').innerHTML='Phương trình này '+result

}

// Bài tập 7
function  calculate7() {
    let firstSide =document.getElementById('firstSide');
    let secondSide =document.getElementById('secondSide');
    let condition1 = Number(firstSide.value) <0;
    let condition2 = Number(secondSide.value) <0;
    let rectangleArea=0;
    if(condition1||condition2) {
        alert('Bạn đã nhập cạnh sai')
    }else {
        rectangleArea= 0.5*Number(firstSide.value)*Number(secondSide.value);
    }
    document.getElementById('resultDisplay7').innerHTML='Diện tích tam giác vuông là: '+rectangleArea;
}

//Bài tập 8
function calculate8() {
    let age =document.getElementById("age");
    let result='';
    let condition1 =parseInt(age.value)>0 && parseInt(age.value)<120;
    if (condition1) {
        result = 'Đây là tuổi một người';
    }else {
        result ="Đây không phải là tuổi một người";
    }
    document.getElementById('resultDisplay8').innerHTML=result
}
//Bài tập 9
function calculate9() {
    let aSide=document.getElementById("aSide");
    let bSide=document.getElementById("bSide");
    let cSide=document.getElementById("cSide");
    let condition1= Number(aSide.value)>0&&Number(bSide.value)>0&&Number(cSide.value)>0;
    let condition2=(Number(aSide.value)+Number(bSide.value))>Number(cSide.value);
    let condition3=(Number(bSide.value)+Number(cSide.value))>Number(aSide.value);
    let condition4=(Number(aSide.value)+Number(cSide.value))>Number(bSide.value);
    let result=''
    if(condition1&&condition2&&condition3&&condition4){
        result='Đây là 3 cạnh tam giác '
    }
    else {
        result='Đây không phải là 3 canh tam giác'
    }
    document.getElementById('resultDisplay9').innerHTML=result
}
//Bài tập 10
function calculate10() {
    let number=document.getElementById("number");
    number=parseInt(number.value);
    let price=0;
    let result=0;
    if(number>0&&number<=50){
        price=1678;
        result=number*price;
    }
    else if(number>50&&number<=100){
        price=1734;
        result=50*1678+(number-50)*price
    }
    else if(number>100&&number<=200){
        price=2014;
        result=50*1678+50*1734+(number-100)*price;
    }
    else if(number>200&&number<=300){
        price=2.536;
        result=50*1678+50*1734+100*2014-(number-200)*price;
    }
    else if(number>300&&number<=400){
        price=2.834;
        result=50*1678+50*1734+100*2014+100*2536+(number-300)*price;
    }
    else if(number>400){
        price=2.927;
        result=50*1678+50*1734+100*2014+100*2536+100*2834+(number-400)*price;
    }
    document.getElementById('resultDisplay10').innerHTML='Giá tiền điện của bạn là: '+result+'VNĐ'
}
//Bài tập 11
let salary=document.getElementById('salary');
function calculate11() {
    salary=parseInt(salary.value);
    let tax=0;
    let result=0;
    if(salary<5000000){
        tax=5/100;
    }
    else if (salary>=5000000&&salary<10000000){
        tax=10/100;
    }
    else if (salary>=10000000&&salary<18000000){
        tax=15/100;
    }
    else if (salary>=18000000&&salary<32000000){
        tax=20/100;
    }
    else if (salary>=32000000&&salary<52000000){
        tax=25/100;
    }
    else if (salary>=52000000&&salary<80000000){
        tax=30/100;
    }
    else if (salary>80000000){
        tax=25/100;
    }
    result=salary*tax;
    document.getElementById('resultDisplay11').innerHTML='Thuế thu nhập cá nhân của bạn là :'+result+'VND'
}

//Bài tập 12
function calculate12() {
    let money=document.getElementById('money');
    money=parseInt(money.value);
    let month=document.getElementById('month');
    month=parseInt(month.value);
    let rate=0;
    let profitAmonut=0;
    if(month<3){
        rate =5.8/100;
    }
    else if(month>=3&&month<6){
        rate =6/100;
    }
    else if(month>=6&&month>12){
        rate =6.5/100;
    }
    else if(month>=12){
        rate =7/100;
    }
    profitAmonut=money*(rate/12)*month;
    document.getElementById('resultDisplay12').innerHTML='Tiền lãi của bạn một tháng là'+profitAmonut+'VND'
}