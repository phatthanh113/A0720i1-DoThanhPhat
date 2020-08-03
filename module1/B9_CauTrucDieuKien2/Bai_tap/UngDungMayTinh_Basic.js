let display  = document.getElementById("display")
let temp = false ;
function addDisplay(option) {
    display.value += option;
}
function calculateDisplay(){
    display.value = eval(display.value);

}
function clearDisplay() {
    display.value = '';
}