let x = 0;
let array = Array();

function addElementToArray() {
    array[x] = document.getElementById("testValue").value;
    alert("Element : " + array[x] + "add index" + x);
    x++;
    document.getElementById("testValue").value = "";

}

function displayArray() {
    let e = "<hr/>";
    for (let i = 0; i < array.lenght; i++) {
        e += "Element : " + i + "=" + array[i] + "< br/>";
    }
    document.getElementById("result").innerHTML = e;
}

function displayArray() {
    let e = "<hr/>";
    for (let i = 0; i < array.length; i++) {
        e += "Element " + i + " = " + array[i] + "<br/>";
    }
    document.getElementById("result").innerHTML = e;
}