let a = document.getElementById("a");
let b = document.getElementById("b");
let c = document.getElementById("c");
let result = document.getElementById("result");

function show() {
            if(a.value*1 && b.value*1 && c.value*1 > 0) {
                    if(a.value*1 + b.value*1 > c.value*1){
                        if(b.value*1 + c.value*1 >a.value*1){
                            if(a.value*1 + c.value*1 > b.value*1){
                                   result.innerText = "a b c là cạnh của tam giác"
                            }else {
                                    result.innerText = " a b c không là cạnh của tam giác"
                            }

                        }

                    }
            }else {
                                    result.innerText = " a b c không là cạnh của tam giác"
            }
}