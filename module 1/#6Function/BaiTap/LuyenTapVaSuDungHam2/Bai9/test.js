
let number = document.getElementById("arrayCharacter");
let b = document.getElementById("result");
let c = document.getElementById("character");
var count = "";
function arrayTest() {
        var array = new Array(10);
        for (let i= 0 ; i < array.length ; i++){
                array[i] = prompt("nhập mãng");
            }
    c = prompt("nhập số test");
    for (let j = 0 ; j < array.length ; j++){
        if(array[j] == c){
            alert("có trong mảng");
            count++
            console.log(array);
            console.log(count)
        }
        else {
            alert("ko có trong mảng");
        }
    }

}
