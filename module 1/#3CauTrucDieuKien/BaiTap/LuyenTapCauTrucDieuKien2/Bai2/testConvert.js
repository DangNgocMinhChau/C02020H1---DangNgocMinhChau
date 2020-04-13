let num = document.getElementById("num");
let result = document.getElementById("result");

function show() {
        result.innerText = num.value + " độ C " + " = " +  (num.value * 3.2808) + " độ F";
}