const ON_MOVE_RIGHT = 0;
const ON_MOVE_LEFT = 1;
const ON_MOVE_UP = 2;
const ON_MOVE_DOWN = 3;
var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");


class Hero {
    constructor() {
        this.x = 200;
        this.y = 200;
        this.width = 20;
        this.height = 10;
        this.direction = null;
        this.update = function () {
            if(this.direction === ON_MOVE_RIGHT){
                this.x += 2;
            }
            if(this.direction === ON_MOVE_LEFT){
                this.x -= 2;
            }
            if(this.direction === ON_MOVE_UP){
                this.y -= 2;
            }
            if(this.direction === ON_MOVE_DOWN){
                this.y += 2;
            }
            this.draw();
        };
        this.draw = function () {
                ctx.beginPath();
                ctx.clearRect(0,0,2000,2000);
                ctx.fillStyle = "black";
                ctx.fillRect(this.x,this.y,this.width,this.height)
        }
    }
}

class Game {
    constructor() {
        this.hero = new Hero();
        this.update = function () {
                game.hero.update();
            requestAnimationFrame(game.update)
        };
        this.onRightArrowPressed = function () {
            game.hero.direction = ON_MOVE_RIGHT
        };
        this.onLeftArrowPressed = function () {
            game.hero.direction = ON_MOVE_LEFT
        };
        this.onUpArrowPressed = function () {
            game.hero.direction = ON_MOVE_UP
        };
        this.onDownArrowPressed = function () {
            game.hero.direction = ON_MOVE_DOWN
        }
    }
}
let game = new Game();