let number = document.getElementById("num");
let result = document.getElementById("result");

function show() {
    if(number.value >=18){
        result.innerText = ""
    }else {
            result.innerText = " không đủ tuổi học lớp 10"
    }

}