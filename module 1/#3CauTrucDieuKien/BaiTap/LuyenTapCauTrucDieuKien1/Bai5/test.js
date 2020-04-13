let testScore1 = document.getElementById("testScore1");
let testScore2 = document.getElementById("testScore2");
let testScore3 = document.getElementById("testScore3");
let result =document.getElementById("result");
let total;
let abc;

function show() {
    console.log(123);
    total = (testScore1.value*1 + testScore2.value*1 + (testScore3.value*2)*1 )/3;
    result.innerText = (total >= 8) ? ("xếp loại giỏi") : (total >= 6) ?
            ("xếp loại khá") : (total >= 5)?
                ("Xếp loại trung bình"):("xếp loại yếu");


}