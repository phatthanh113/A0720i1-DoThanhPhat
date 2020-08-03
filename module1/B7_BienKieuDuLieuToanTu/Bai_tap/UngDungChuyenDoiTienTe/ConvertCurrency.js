function convertCurrency() {
    let result = 0;
    let money = document.getElementById("money");
    let fromCurrency = document.getElementById("fromCurrency");
    let toCurrency = document.getElementById("toCurrency");
    if (isNaN(money.value) || money.value < 0) {
        result = "Bạn đã nhập sai" ;
    } else {
        if (fromCurrency.value === "USD" && toCurrency.value === "VND") {
            result = money.value * 23000 + " VND";
        } else if (fromCurrency.value === "VND" && toCurrency.value === "USD") {
            result = money.value / 23000 + " $";
        } else {
            result = "Mời bạn đổi giá trị tiền tệ"
        }
    }
    alert(result)
}
