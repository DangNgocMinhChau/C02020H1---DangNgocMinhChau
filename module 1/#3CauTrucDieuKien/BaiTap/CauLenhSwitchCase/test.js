let num = document.getElementById("num");
let result = document.getElementById("result");
let text = "";
function cal() {
    switch (num.value*1) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:

            text = "tháng có 31 ngày";
            break;
        case 2:
            text = "tháng có 28 hoặc 29 ngày";
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            text = "tháng có 30 ngày";
            break;

    }
    result.innerText = text;

}