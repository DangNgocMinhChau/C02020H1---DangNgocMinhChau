let result = document.getElementById("result");

function cal(e) {
      result.innerText = result.value + e;
}
function get() {
    result.innerText = "";
}
function equa() {
    result.innerText = eval(result.value);
}