let b = document.getElementById("game");

let data = "";
let board = [];

for (let i = 0; i < 10; i++) {
    board[i] = new Array(".", ".", ".", ".", ".", ".", ".", ".", ".", ".",);
}

for (let i = 0; i < 10; i++) {
    data += "<br/>";
    for (let j = 0; j < 10; j++) {
        data += board[i][j] + "&nbsp", "&nbsp";
    }

}
// data += "<br/><br/> <input type='button' value='Play' onclick='playGame1()'>";
b.innerHTML = data;

function playGame1() {
    let positionX = prompt("nhập vào x");
    let positionY = prompt("nhập vào y");
    data = "";
    board[positionX][positionY] = "X";
    for (let i = 0; i < 10; i++) {
        data += "<br/>";
        for (let j = 0; j < 10; j++) {
            data += board[i][j] + "&nbsp", "&nbsp", "&nbsp", "&nbsp";
        }

    }
    win();
    b.innerHTML = "<hr/>" + data;
}

function playGame2() {
    let positionX = prompt("nhập vào x");
    let positionY = prompt("nhập vào y");
    data = "";
    board[positionX][positionY] = "Y";
    for (let i = 0; i < 10; i++) {
        data += "<br/>";
        for (let j = 0; j < 10; j++) {
            data += board[i][j] + "&nbsp", "&nbsp", "&nbsp", "&nbsp";
        }

    }
    win();
    b.innerHTML = "<hr/>" + data;
}

function win() {
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[i].length; j++) {
            if (board[i][j] !== ".") {
                if ((board[i][j] === board[i][j + 1] && board[i][j] === board[i][j + 2])
                    || (board[i][j] === board[i + 1][j] && board[i][j] === board[i + 2][j])
                    || (board[i][j] === board[i + 1][j + 1] && board[i][j] === board[i + 2][j + 2])) {
                    alert("win");
                    return true;

                }
            }
        }
    }
    return false;
}
