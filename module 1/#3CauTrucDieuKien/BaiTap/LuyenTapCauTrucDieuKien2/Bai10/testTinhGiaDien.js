let number = document.getElementById("cal");
let result = document.getElementById("result");
let a = 50 * 1678; // từ 50 trở lên
let b = 50 * 1734;//51 đến 100
let c = 100 * 2014;//101 đến 200
let d = 100 * 2536;//201 đến 300
let e = 100 * 2834;//301 đến 400
let total;

function show() {
    if (number.value <= 50) {
        total = (number.value * 1678)
    } else if (number.value >= 51 && number.value <= 100) {
        total =  (a + (number.value - 50) * 1734)

    } else if (number.value >= 101 && number.value <= 200) {
        total =(a + b + (number.value - 100) * 2014);

    } else if (number.value >= 201 && number.value <= 300) {
        total =  (a + b + c + (number.value - 200) * 2536)

    } else if (number.value >= 301 && number.value <= 400) {
        total = (a + b + c + d + (number.value - 300) * 2834)

    } else if(number.value > 400) {
        total = (a + b + c + d + e +  (number.value - 400) * 2927)
    }
        result.innerText = "Số tiền là : " +  ( total + ( total*10/100 )) + "VNĐ" ;
}