let a = document.getElementById("num1");
let b = document.getElementById("num2");
let result = document.getElementById("result");

function Click() {
    if(a.value % b.value == 0 ){
        result.innerText = " a chia hết cho b "
}   else {
        result.innerText = " a ko chia hết cho b"
    }


}