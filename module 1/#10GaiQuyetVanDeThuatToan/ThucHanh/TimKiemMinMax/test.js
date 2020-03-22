 function finMin(arr) {
        var min = arr[0];
                for (let i= 0;i<arr.length ; i++){
                    if(arr[i] < min){
                        min = arr[i];
                    }
                }
                return min
 }
 function finMax(arr) {
     var max = arr[0];
     for (let i= 0;i<arr.length ; i++){
         if(arr[i] > max){
             max = arr[i];
         }
     }
     return max
 }



 var num = [];
            for (var i = 0 ; i < 100 ; i++){
                num[i] = Math.floor(Math.random()*100)
                num[i] += "\n"
            }
            var minValue = finMin(num);
            var maxValue = finMax(num);
 document.write(num);
 document.write("<br/>");
 document.write("The minimum value is: " + minValue);
 document.write("<br/>");
 document.write("The maxmum value is: " + maxValue);