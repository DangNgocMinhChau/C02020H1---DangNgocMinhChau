let Rectangle = function (width, height) {
    this.width = width;
    this.height = height

    this.width = function () {
        return width
    };
    this.height = function () {
        return height
    };
    this.acreage = function () {
        return width * height
    };
    this.perimeter = function () {
        return (width * height) / 2
    }


}

let rectangle = new Rectangle(10, 4);
let S = rectangle.acreage();
let c = rectangle.perimeter();
 
function paintingRectangle() {
        var ctx = document.getElementById("myCanvas").getContext("2d");
        ctx.fillStyle = "#008000"
        ctx.fillRect(500,100,200,100)
}
paintingRectangle();




