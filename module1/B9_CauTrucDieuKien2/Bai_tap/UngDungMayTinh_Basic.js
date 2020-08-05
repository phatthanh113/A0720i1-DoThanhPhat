let display  = document.getElementById("display");
function addDisplay(option) {
    display.value += option;
}
function clearDisplay() {
    display.value = '';
}
function calculateDisplay(){
    display.value = eval(display.value);
}
