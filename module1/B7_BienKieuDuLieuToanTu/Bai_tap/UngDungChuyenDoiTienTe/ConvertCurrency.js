function convertCurrency() {
    let amount =document.getElementById("amount");
    let fromCurrency=document.getElementById("fromCurrency");
    let toCurrency=document.getElementById("toCurrency");
    let amountNumber= Number(amount.value)
    let result = amountNumber /23000 ;
    alert(result)
}