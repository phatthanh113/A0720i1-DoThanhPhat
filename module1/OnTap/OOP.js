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
        case '4' : {
            calculate4();
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
        case '7' : {
            calculate7();
            break;
        }
        case '8' : {
            calculate8();
            break;
        }
        default : {
            alert('Vui lòng nhập tên bài từ 1 đến 5')
        }
    }
}
//
function calculate1() {
    class Fraction{
        constructor(numerator,denominator) {
            this.numerator=numerator;
            this.denominator=denominator;
        }
        getValue() {
            return this.numerator/this.denominator;
        }
        setValue(numerator,denominator) {
            this.numerator=numerator;
            this.denominator=denominator;
        }
        calculateFraction(fraction) {
            let options=prompt('Nhập phép tính bạn muốn tính')
            switch (options) {
                case '+': {
                    return this.getValue() + fraction.getValue();
                    break;
                }
                case '-': {
                    return this.getValue() - fraction.getValue();
                    break;
                }
                case '*': {
                    return this.getValue() * fraction.getValue();
                    break;
                }
                case '/': {
                    return this.getValue() / fraction.getValue();
                    break;
                }
            }
        }
    }
    let fractionA= new Fraction(3,5);
    let fractionB= new Fraction(4,8);
    // fractionA.calculateFraction(fractionB);
    alert(fractionA.calculateFraction(fractionB));
}