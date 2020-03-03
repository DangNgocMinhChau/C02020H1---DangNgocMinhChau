let num = document.getElementById("num");
let result = document.getElementById("result");
let total1;
    //  50s giây đầu tiên
let a = 50*600;
    // 150s tiếp theo
let b = 150*400;
    //phí thuê bao bắt buộc
let c = 25000;
function show() {
    if(num.value <= 50 ){
            total = num.value*1 *600 ;

    }else if (num.value <= 200 && num.value >=50){
             total = a + ((num.value*1 - 50)* 400);

    }else{
            total = a + b  +(num.value*1 - 200)*200;
    }
    result.innerText = "Số tiền là : " + ( total + c) + "VNĐ";
}