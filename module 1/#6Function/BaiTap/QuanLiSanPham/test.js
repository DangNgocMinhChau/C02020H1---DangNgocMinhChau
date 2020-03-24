var listProduct = [];
var a = document.getElementById("list");
var data ="";
var i = 0;

function addVal(inVal) {
        listProduct.push(inVal);
        data += "<br/><br/>" +  listProduct[listProduct.length -1] + "&nbsp;&nbsp;&nbsp;&nbsp;" +  "<button onclick="+"edit"+"("+i+")" +">Edit</button>" + "<button onclick="+"del"+"("+i+")"+">Delete</button>"  ;
        document.getElementById("result").innerHTML = "";
        document.getElementById("result").innerHTML = data;
        console.log(data);
        i++;
}

function edit(edit) {
        document.getElementById("result").innerHTML = "";
        data = "";
        listProduct[edit] = prompt("nhập sản phẩm bạn muốn thay thế")
        for (let e = 0 ; e <listProduct.length ; e++){
                data += "<br/><br/>" +  listProduct[e] + "&nbsp;&nbsp;&nbsp;&nbsp;" +  "<button onclick="+"edit"+"("+e+")" +">Edit</button>" + "<button onclick="+"del"+"("+e+")"+">Delete</button>"  ;
        }
        document.getElementById("result").innerHTML = data;
}

function del(del) {
        document.getElementById("result").innerHTML = "";
        data = "";
        listProduct.splice(del,del);
        for (let d = 0 ; d <listProduct.length ; d++){
                data += "<br/><br/>" +  listProduct[d] + "&nbsp;&nbsp;&nbsp;&nbsp;" +  "<button onclick="+"edit"+"("+d+")" +">Edit</button>" + "<button onclick="+"del"+"("+d+")"+">Delete</button>"  ;
        }
        document.getElementById("result").innerHTML = data;
}