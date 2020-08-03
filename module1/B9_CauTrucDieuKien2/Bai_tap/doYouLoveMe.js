function yesValue() {
    let result = "Yes ,I love you too"
    alert(result)
}
function noValue()     {
    let x = Math.round(Math.random() * 300);
    let y = Math.round(Math.random() * 300);

    document.getElementById('btnNo').style.left = x + 'px';
    document.getElementById('btnNo').style.top = y + 'px';
}