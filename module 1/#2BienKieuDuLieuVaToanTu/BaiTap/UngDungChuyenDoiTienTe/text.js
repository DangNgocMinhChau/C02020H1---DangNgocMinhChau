function show() {
    var number = document.getElementById("number").value;
    var toCurrency =document .getElementById("toCurrency");
    var fromCurrency = document.getElementById("fromCurrency");
    var result = document.getElementById("result");
    var total
    if(fromCurrency.value === "VietNam" && toCurrency.value ==="USD"){
            total = number / 23000;
    }
    else if (fromCurrency.value === "USD" && toCurrency.value ==="VietNam"){
            total = number * 23000;
    }
            result.innerText=total;
}