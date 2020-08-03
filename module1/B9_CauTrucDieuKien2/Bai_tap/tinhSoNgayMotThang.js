let month = document.getElementById("month");

function calculate_Display() {
    let result = 0;
    switch (month.value) {
        case "1":
        case "3":
        case "5":
        case "7":
        case "8":
        case "10":
        case "12":
            result = "Tháng " + month.value + " có 31 ngày"
            break;
        case "4":
        case "6":
        case"9":
        case "11":
            result = "Tháng " + month.value + " có 30 ngày"
            break;
        case "2":
            result = "Tháng " + month.value + " có 28 hoặc 29 ngày"
            break;
        default :
                result = "Một năm chỉ có 12 tháng :))"
            break;
    }
    alert(result)
}