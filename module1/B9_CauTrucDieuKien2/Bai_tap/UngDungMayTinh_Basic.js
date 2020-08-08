let display  = document.getElementById("display");
let temp=false;
function addDisplay(option) {
    if(option != '+' && option != '-'&& option != '*'&& option != '/'){
        if (temp){
            clearDisplay();
        }
    }
    temp=false;
    display.value += option;
}
function clearDisplay() {
    display.value = '';
}
function calculateDisplay(){
    display.value = eval(display.value);
    temp=true;
}
