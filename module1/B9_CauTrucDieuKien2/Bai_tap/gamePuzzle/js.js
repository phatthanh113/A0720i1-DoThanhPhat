let img1 = document.getElementById("img1");
let img2 = document.getElementById("img2");
let img3 = document.getElementById("img3");
let img4 = document.getElementById("img4");
let img5 = document.getElementById("img5");

function changeImage(number) {
    switch (number) {
        case 1 : {
            if (img1.getAttribute("src") === 'Images/Hinh%201a.png') {
                img1.src = 'Images/Hinh%202a.png'
            } else if (img1.getAttribute("src") === 'Images/Hinh%202a.png') {
                img1.src = 'Images/Hinh%203a.png'
            } else if (img1.getAttribute("src") === 'Images/Hinh%203a.png') {
                img1.src = 'Images/Hinh%201a.png'
            }
            break;
        }
        case 2 : {
            if (img2.getAttribute("src") === 'Images/Hinh%201b.png') {
                img2.src = 'Images/Hinh%202b.png'
            } else if (img2.getAttribute("src") === 'Images/Hinh%202b.png') {
                img2.src = 'Images/Hinh%203b.png'
            } else if (img2.getAttribute("src") === 'Images/Hinh%203b.png') {
                img2.src = 'Images/Hinh%201b.png'
            }
            break;
        }
        case 3 : {
            if (img3.getAttribute("src") === 'Images/Hinh%201c.png') {
                img3.src = 'Images/Hinh%202c.png'
            } else if (img3.getAttribute("src") === 'Images/Hinh%202c.png') {
                img3.src = 'Images/Hinh%203c.png'
            } else if (img3.getAttribute("src") === 'Images/Hinh%203c.png') {
                img3.src = 'Images/Hinh%201c.png'
            }
            break;
        }
        case 4 : {
            if (img4.getAttribute("src") === 'Images/Hinh%201d.png') {
                img4.src = 'Images/Hinh%202d.png'
            } else if (img4.getAttribute("src") === 'Images/Hinh%202d.png') {
                img4.src = 'Images/Hinh%203d.png'
            } else if (img4.getAttribute("src") === 'Images/Hinh%203d.png') {
                img4.src = 'Images/Hinh%201d.png'
            }
            break;
        }
        case 5 : {
            if (img5.getAttribute("src") === 'Images/Hinh%201e.png') {
                img5.src = 'Images/Hinh%202e.png'
            } else if (img5.getAttribute("src") === 'Images/Hinh%202e.png') {
                img5.src = 'Images/Hinh%203e.png'
            } else if (img5.getAttribute("src") === 'Images/Hinh%203e.png') {
                img5.src = 'Images/Hinh%201e.png'
            }
            break;
        }
    }
    checkImage();
}

function checkImage() {
    if (img1.getAttribute("src") === 'Images/Hinh%202a.png'
        && img2.getAttribute("src") === 'Images/Hinh%202b.png'
        && img3.getAttribute("src") === 'Images/Hinh%202c.png'
        && img4.getAttribute("src") === 'Images/Hinh%202d.png'
        && img5.getAttribute("src") === 'Images/Hinh%202e.png') {
        alert('Bạn đã đúng')
    }
        }