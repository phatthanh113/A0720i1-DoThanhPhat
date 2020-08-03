let imgObj = document.getElementById('myImage')

function init() {
    imgObj = document.getElementById('myImage');
    imgObj.style.position = 'absolute';
    imgObj.style.left = '500px';
    imgObj.style.top = '20px'

}

function moveClick(options) {
    switch (options) {
        case 'right' :
            imgObj.style.left = parseInt(imgObj.style.left) + 30 + 'px';
            break;
        case 'left' :
            imgObj.style.left = parseInt(imgObj.style.left) - 30 + 'px';
            break;
        case 'top' :
            imgObj.style.top = parseInt(imgObj.style.top) - 10 + 'px';
            break;
        case 'down' :
            imgObj.style.top = parseInt(imgObj.style.top) + 10 + 'px';
            break;
    }
}
//
// function moveLoad(options) {
//     switch (options) {
//         case 37 :
//             imgObj.style.left = parseInt(imgObj.style.left) + 30 + 'px';
//             break;
//         case 38 :
//             imgObj.style.left = parseInt(imgObj.style.left) - 30 + 'px';
//             break;
//         case 39 :
//             imgObj.style.top = parseInt(imgObj.style.top) - 10 + 'px';
//             break;
//         case 40 :
//             imgObj.style.top = parseInt(imgObj.style.top) + 10 + 'px';
//             break;
//     }
// }
window.onload = init;
