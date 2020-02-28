 var numberOne =document.getElementById("numberOne");
 var numberTwo =document.getElementById("numberTwo");
 var total;
 var result = document.getElementById("result");
 function add() {
     total =  numberOne.value*1 + numberTwo.value*1;
     result.innerText =total;
 }
 function sub() {
     total =  numberOne.value + numberTwo.value;
     result.innerText =total;
 }
 function mul() {
     total =  numberOne.value + numberTwo.value;
     result.innerText =total;
 }
 function div() {
     total =  numberOne.value + numberTwo.value;
     result.innerText =total;
 }
