let array = [];
let number = parseInt(prompt('Nhập vào sô phần tử bạn muốn có trong mảng'));
for (let i = 0; i < number; i++) {
    let element = parseInt(prompt('Nhập các phần tử nguyên'));
    array.push(element);
}
let oddSum = 0;
for (let arr of array) {
    if (arr % 2 !== 0 &&  arr > 0) {
        oddSum += arr
    }
}