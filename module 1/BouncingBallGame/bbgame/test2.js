const ON_MOVE_RIGHT = 0;
const ON_M0VE_LEFT = 1;

class Ball {
    constructor() {
        this.x = 200;
        this.y = 200;
        this.radius = 10;
        this.vX = 3;
        this.vY = 3;
        this.update = function () {
                this.x += this.vX;
                this.y += this.vY;
        };
        this.draw = function (ctx) {
            ctx.beginPath();
            ctx.arc(this.x,this.y,this.radius,0,Math.PI*2);
            ctx.fill();
            ctx.stroke();
        };
    }
}

class Bar {
    constructor() {
        this.x = 10;
        this.y =600;
        this.width = 200;
        this.height = 20;
        this.direction = null;
        this.update = function () {
            if(this.direction === ON_MOVE_RIGHT){
                if(this.x < 700 - this.width){
                    this.x += 6
                }

            }
            if(this.direction === ON_M0VE_LEFT){
                if(this.x > 0){
                    this.x -= 6
                }

            }
        };
        this.draw = function (ctx) {
            ctx.beginPath();

            ctx.fillRect(this.x,this.y,this.width,this.height);
            ctx.fillStyle = "red";
        }

    }
}
class Rock {
        constructor() {
            this.x = 20;
            this.y = 100;
            this.width = 20;
            this.height = 10;

            this.draw = function (ctx) {
                ctx.beginPath();
                ctx.fillRect(this.x,this.y,this.width,this.height)
            }
        }

}

class Game {
    constructor() {
        this.ball = new Ball();
        this.bar = new Bar();
        this.rock = new Rock();

        this.update = function () {
                game.bar.update();
                game.ball.update();
        };
        this.draw = function (ctx) {
            ctx.beginPath();
            ctx.clearRect(0,0,1000,1000);
            game.bar.draw(ctx);
            game.ball.draw(ctx);
            game.rock.draw(ctx);

        };
        this.checkCollision = function () {
                barAndBall();
                ballAndWall();
        };
        this.moveRightArrow = function () {
                game.bar.direction = ON_MOVE_RIGHT
        };
        this.moveLeftArrow = function () {
                game.bar.direction = ON_M0VE_LEFT
        }
    }
}


let game = new Game();

function barAndBall() {
        if(game.ball.x >= game.bar.x && game.ball.x <= game.bar.x  + game.bar.width){
                if(game.ball.y >= game.bar.y && game.ball.y <= game.bar.y + game.bar.height){
                            game.ball.vY = -game.ball.vY
                }
        }
}
function ballAndWall() {
        if(game.ball.x > 700 ){
            game.ball.vX = -game.ball.vX
        }
        if (game.ball.x < 0){
            game.ball.vX = -game.ball.vX
        }
    if(game.ball.y > 700 ){
        game.ball.vY = -game.ball.vY
    }
    if (game.ball.y < 0){
        game.ball.vY = -game.ball.vY
    }
}