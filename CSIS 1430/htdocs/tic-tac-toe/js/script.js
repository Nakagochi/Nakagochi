var plNameArray = ["Player 1", "Player 2"];
var gamePiece = ['X', 'O'];
var winCode = [7, 56, 73, 84, 146, 273, 292, 448];
var playerTotals = [0, 0];
var playerWins = [0, 0, 0];
var turn = 0;
var gameOver = false;
var gameBoard = ["pos1", "pos2", "pos3", "pos4", "pos5", "pos6", "pos7", "pos8", "pos9"];

function getPlayerName() {
    if (document.getElementById("player1").value == "") {
        plNameArray[0] = "Player 1";
    } else {
        plNameArray[0] = document.getElementById("player1").value;
    }

    if (document.getElementById("player2").value == "") {
        plNameArray[1] = "Player 2";
    } else {
        plNameArray[1] = document.getElementById("player2").value;
    }

    setGameBoard();
}


function setGameBoard() {
    document.getElementById("mainSection").className = "show";
    document.getElementById("submit").disabled = true;
    document.getElementById("pl1").innerText = plNameArray[0];
    document.getElementById("pl2").innerText = plNameArray[1];
    document.getElementById("playerTurn").innerText = "It's " + plNameArray[turn] + "'s Turn";

}


function changeLetter(position, totals, playerWent) {
    if (!gameOver) {
        position.innerText = gamePiece[turn];
        playerTotals[turn] += totals;

        if (isWin(winCode, turn)) {
            document.getElementById("playerTurn").innerText = plNameArray[turn] + " Wins";
            endGame(turn);
        } else if (gameOver) {
            document.getElementById("playerTurn").innerText = "It's a tie!";
            endGame(2);
        } else {
            setTurn(position);
        }
    }

}

function isWin(code, playerTurn) {
    for (x = 0; x < code.length; x++) {
        if ((playerTotals[playerTurn] & code[x]) == code[x]) {
            gameOver = true;
            return true;
        }
    }
    if (playerTotals[0] + playerTotals[1] == 511) {
        gameOver = true;
    }
    return false;
}

function scoreBoard(win) {
    playerWins[win] += 1;
    document.getElementById("winPL1").innerText = playerWins[0];
    document.getElementById("winPL2").innerText = playerWins[1];
    document.getElementById("winTie").innerText = playerWins[2];

}

function clearBoard() {
    for (x = 0; x < gameBoard.length; x++) {
        document.getElementById(gameBoard[x]).innerText = "";
        document.getElementById(gameBoard[x]).style.cursor = "pointer";
        document.getElementById(gameBoard[x]).style.pointerEvents = 'auto';
    }

    playerTotals = [0, 0];
    turn = 0;
    gameOver = false;
    document.getElementById("playerTurn").innerText = "It's " + plNameArray[turn] + "'s Turn";
    document.getElementById("mainSection").className = "board";
    scoreBoard();

}

function endGame(winValue) {
    scoreBoard(winValue);
    document.getElementById("mainSection").className = "board";
    for (x = 0; x < gameBoard.length; x++) {
        document.getElementById(gameBoard[x]).style.pointerEvents = 'none';
    }
}

function setTurn(position, playerWent) {

    if (turn == 0) {
        turn = 1;
    } else {

        turn = 0;
    }
    document.getElementById("playerTurn").innerText = "It's " + plNameArray[turn] + "'s Turn";
    position.style.pointerEvents = 'none';
}