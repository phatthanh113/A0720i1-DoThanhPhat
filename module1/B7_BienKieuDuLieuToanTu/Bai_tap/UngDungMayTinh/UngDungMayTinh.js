// Gọi hàm tính tổng
// let a = Number(document.getElementById("number_1"))
// let b = Number(document.getElementById("number_2"))
let a = Number(document.getElementById("number_1").value)
let b = Number(document.getElementById("number_2").value)
function addNumber(a,b) {
    let a = Number(document.getElementById("number_1").value);
    let b = Number(document.getElementById("number_2").value);
    let add = a+b ;
    return alert(add)
}
function subNumber() {
    let a = Number(document.getElementById("number_1").value)
    let b = Number(document.getElementById("number_2").value)
    let sub = a-b ;
    return alert(sub)
}
function mulNumber() {
    let a = Number(document.getElementById("number_1").value)
    let b = Number(document.getElementById("number_2").value)
    let mul = a*b ;
    return alert(mul)
}
function divNumber() {
    let a = Number(document.getElementById("number_1").value)
    let b = Number(document.getElementById("number_2").value)
    let div = a/b ;
    return alert(div)
}
