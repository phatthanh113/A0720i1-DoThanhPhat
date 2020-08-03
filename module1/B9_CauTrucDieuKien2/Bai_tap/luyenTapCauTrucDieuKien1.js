//Bài tập 1
function calculate1() {
    let a = document.getElementById("number1");
    let b = document.getElementById("number2");
    let resultDisplay = 0;
    let result = a.value % b.value == 0
    if (result) {
        resultDisplay = "a chia hết cho b"
    } else {
        resultDisplay = "a không chia hết cho b"
    }
    document.getElementById("resultDisplay1").innerHTML = resultDisplay
}

//Bài tập 2
function calculate2() {
    let age = document.getElementById("age");
    let resultDisplay = 0;
    if (age.value < 0) {
        resultDisplay = "Bạn đã nhập sai"
    } else {
        if (age.value < 15) {
            resultDisplay = "Bạn chưa đủ tuổi để học lớp 10"
        } else {
            resultDisplay = "Bạn đã đủ tuổi để học lớp 10"
        }
    }
    document.getElementById("resultDisplay2").innerHTML = resultDisplay
}

//Bài tập 3
function calculate3() {
    let number = document.getElementById("number");
    let resultDisplay = 0;
    if (number.value < 0) {
        resultDisplay = "Số này nhỏ hơn 0"
    } else if (number.value == 0) {
        resultDisplay = "Số này là số 0"
    } else {
        resultDisplay = "Số này lớn hơn 0"
    }
    document.getElementById("resultDisplay3").innerHTML = resultDisplay
}

//Bài tập 4
function calculate4() {
    let a = document.getElementById("numberA");
    let b = document.getElementById("numberB");
    let c = document.getElementById("numberC");
    let max = parseInt(a.value);
    if (max < parseInt(b.value)) {
        max = parseInt(b.value)
    }
    if (max < parseInt(c.value)) {
        max = parseInt(c.value)
    }
    document.getElementById("resultDisplay4").innerHTML = "Số lớn nhất trong ba số là " + max

}

//Bài tập 5
function calculate5() {
    let diligenceGrade = document.getElementById('diligenceGrade');
    let midTermGrade = document.getElementById('midTermGrade');
    let endTermGrade = document.getElementById('endTermGrade');
    let sum = parseInt(diligenceGrade.value) * 2 + parseInt(midTermGrade.value) * 2 + parseInt(endTermGrade.value) * 6;
    let result = sum / 10;
    // Đặt điều kiện
    let condition1 = parseInt(diligenceGrade.value) < 0 || parseInt(diligenceGrade.value) > 10;
    let condition2 = parseInt(midTermGrade.value) < 0 || parseInt(midTermGrade.value) > 10;
    let condition3 = parseInt(endTermGrade.value) < 0 || parseInt(endTermGrade.value) > 10;
    if (condition1 || condition2 || condition3) {
        resultDisplay = 'Bạn đã nhập điểm sai'
    } else {
        if (result < 4) {
            resultDisplay = "F"
        } else if (result >= 4 && result < 5.5) {
            resultDisplay = "D"
        } else if (result >= 5.5 && result < 7) {
            resultDisplay = "C"
        } else if (result >= 7 && result < 8.5) {
            resultDisplay = "B"
        } else {
            resultDisplay = "A"
        }
    }
    document.getElementById("result5").innerHTML='Điểm tổng kết của bạn là '+result;
    document.getElementById("resultDisplay5").innerHTML= 'Bạn được loại '+resultDisplay
}