let a = document.getElementById("a");
let b = document.getElementById("b");
let c = document.getElementById("c");
let result = document.getElementById("result");
let delta;
let x1;
let x2;
let d;

function show() {
        delta = (b.value * b.value) - 4 *( a.value * c.value);
         if(delta > 0){
                 x1 =( -b.value*1 + Math.sqrt(delta)) / (2*a.value);
                 x2 =( -b.value   - Math.sqrt(delta)) / (2*a.value);
                 result.innerText = "Phương trình có 2 nghiệm " +  " x1 = " + x1  +  " và x2= " + x2;
         }else if(delta = 0){
                 x1 = x2 = -b.value / (2 * a.value);
                 result.innerText = " phương trình có nghiệm kép x1 = x2 = " + x1;
         }else{
                 result.innerText = " Phương trình vô nghiệm"
         }
}