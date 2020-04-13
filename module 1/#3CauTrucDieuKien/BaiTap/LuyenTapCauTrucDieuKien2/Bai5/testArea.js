let a = document.getElementById("a");
let b = document.getElementById("b");
let result = document.getElementById("result");

function show() {
    result.innerText = "Diện tích của tam giác vuông là : " + ( 1/2 * (a.value * b.value) );
}