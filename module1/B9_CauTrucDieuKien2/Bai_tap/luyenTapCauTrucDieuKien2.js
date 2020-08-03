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