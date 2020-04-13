let number = document.getElementById("nhapSo");
let result = document.getElementById("result");

function test() {
    if(number.value < 0 ){
        result.innerText =  "nhỏ hơn 0 "
    } else if (number.value == 0) {
        result.innerText =  " bằng 0 "
    } else {
        result.innerText =  " lớn hơn 0"
    }
}