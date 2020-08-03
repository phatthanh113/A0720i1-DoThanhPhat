let height = document.getElementById("height");
let weight = document.getElementById("weight");


function calculator() {
    let bmi = parseInt(weight.value) / Math.pow(height.value, 2);
    document.getElementById("bmiResult").innerHTML = "Your BMI : " + bmi
    let result = 0
    if (isNaN(bmi)  || parseInt(weight.value) < 0) {
        result = "Bạn đã nhập số sai"
        prompt(result)
    } else {
        if (bmi < 18) {
            result = "Underweight";
        } else if (bmi < 25.0) {
            result = "Normal"
        } else if (bmi < 30.0) {
            result = "Overweight"
        } else {
            result = "Obese"
        }
    }
    document.getElementById("resultDisplay").innerHTML= result
}