
let number1 = document.getElementById("number_1") ;
let number2 = document.getElementById("number_2") ;
let result = 0  ;
function calculate(options) {
    switch (options) {
        case "+" : {
            result = parseFloat(number1.value) + parseFloat(number2.value)
        }
        case "-" : {
            result = parseFloat(number1.value) - parseFloat(number2.value)
        }
        case "x" : {
            result = parseFloat(number1.value) * parseFloat(number2.value)
        }
        case "/" : {
            result = parseFloat(number1.value) / parseFloat(number2.value)
        }
    }
    alert(result)
}

