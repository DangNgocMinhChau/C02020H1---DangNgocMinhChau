let a = document.getElementById("a");
let b = document.getElementById("b");
let result = document.getElementById("result");

function show() {
            result.innerText = "Phương trình bậc nhất " + a.value*1 + "x" + " + " + b.value*1 + " = " + " 0 => x = " + (-b.value / a.value);

 }