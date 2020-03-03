let num1 = document.getElementById("num1");
let num2 = document.getElementById("num2");
let num3 = document.getElementById("num3");
let result = document.getElementById("result");
function show() {
        if(num1.value*1 > num2.value*1 && num1.value*1>num3.value*1){
            result.innerText = num1.value + "số lớn nhất"
        }else if(num2.value*1 > num1.value*1 && num2.value*1 > num3.value*1 ){
            result.innerText = num2.value + " là số lớn nhất"
        }
        else {
            result.innerText = num3.value + " là số lớn nhất"
        }
}


