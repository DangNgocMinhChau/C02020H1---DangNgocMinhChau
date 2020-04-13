let sales = document.getElementById("sales");
let result = document.getElementById("result");
let result1 = document.getElementById("result1");
function show() {
    let total1 = (sales.value * 1 * 50);
             result1.innerText = "Tiền gốc của sản phẩm" + " " + total1 + "000 VNĐ";
    let total = (total1 * 20) / 100;
             result.innerText = "Tiền hoa hồng nhận được" + " " + total + "000 VNĐ";

}