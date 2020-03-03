let number = document.getElementById("old");
let result = document.getElementById("result");

function show() {
        if(number.value > 0 && number.value < 120 &&  number.value == parseInt(number.value) ){
                    result.innerText = " là số tuổi người"
        }else {
                    result.innerText = " ko là số tuổi người"
        }
}