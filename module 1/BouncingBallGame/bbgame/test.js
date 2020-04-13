// const ON_MOVE_RIGHT = 0;
// const ON_MOVE_LEFT = 1;
//
//
// class Ball {
//     constructor() {
//         this.x = 500;
//         this.y = 200;
//         this.radius = 10;
//         this.vX = 3;
//         this.vY = 3;
//         this.update = function () {
//             this.x -= this.vX;
//             this.y -= this.vY;
//
//
//         };
//         this.draw = function (ctx) {
//             ctx.beginPath();
//             ctx.arc(this.x, this.y, this.radius, 0, Math.PI * 2);
//             ctx.fill();
//             ctx.stroke();
//         };
//     }
// }
//
// class Bar {
//     constructor() {
//         this.x = 100;
//         this.y = 600;
//         this.width = 200;
//         this.height = 20;
//         this.direction = null;
//         this.update = function () {
//             if (this.direction === ON_MOVE_RIGHT) {
//                 if (this.x < 700 - this.width) {
//                     this.x += 6
//                 }
//
//             }
//             if (this.direction === ON_MOVE_LEFT) {
//                 if (this.x > 0) {
//                     this.x -= 6
//                 }
//
//             }
//
//         };
//         this.draw = function (ctx) {
//             ctx.beginPath();
//             ctx.fillStyle = "red";
//             ctx.fillRect(this.x, this.y, this.width, this.height);
//
//
//         };
//     }
// }
//
// class Game {
//     constructor() {
//         this.ball = new Ball();
//         this.bar = new Bar();
//         this.update = function () {
//             game.bar.update()
//             game.ball.update();
//         };
//         this.draw = function (ctx) {
//             ctx.beginPath();
//             ctx.clearRect(0, 0, 1000, 1000);
//             game.ball.draw(ctx);
//             game.bar.draw(ctx);
//         };
//         this.checkCollision = function () {
//                 checkBarAndBall()
//             checkBarAndWall()
//         };
//         this.onRightArrowDown = function () {
//             game.bar.direction = ON_MOVE_RIGHT
//         };
//         this.onLeftArrowDown = function () {
//             game.bar.direction = ON_MOVE_LEFT
//         }
//
//
//     }
// }
//
// let game = new Game();
//
// function checkBarAndBall() {
//         if(game.ball.x >= game.bar.x && game.ball.x <= game.bar.x + game.bar.width){
//             if(game.ball.y >= game.bar.y && game.ball.y <= game.bar.y + game.bar.height){
//                             game.ball.vY = - game.ball.vY;
//             }
//         }
// }
//
// function checkBarAndWall() {
//         if(game.ball.x < 0){
//                 game.ball.vX = -game.ball.vX
//         }
//         if(game.ball.y < 0){
//                 game.ball.vY = -game.ball.vY
//         }
//         if (game.ball.x >  700){
//                 game.ball.vX = -game.ball.vX
//
//         }if (game.ball.y > 700){
//                 game.ball.vY = - game.ball.vY
//
//     }
// }