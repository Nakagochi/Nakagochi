var x = null;
var lottoNum = [];
var lottoString = "";
var r = null;
var contLotto = [];
var contLottoPos = 0;
var contLottoString;

function getRandom() {
    x = document.getElementById("lotto").value;
    for (i = 0; i < x; i++) {
        r = Math.ceil(Math.random() * 100);
        if (r <= 9) { r = "0" + r; }
        if (r == 100) { r = "03"; }
        containsRepeat();
        lottoNum[i] = r;
    }

}

function getString() {
    if (lottoNum.length < 0) {
        setString();
        document.getElementById("num").innerText = lottoString;
    } else {
        lottoNum = [];
        setString();
        document.getElementById("num").innerText = lottoString;
    }
}

function setString() {
    getRandom();
    lottoString = lottoNum.join("-");
    lottoList();
}

function containsRepeat() {
    while (lottoNum.includes(r)) {
        r = Math.ceil(Math.random() * 100);
        if (r <= 9) { r = "0" + r; }
        if (r == 100) { r = "03"; }
    }
}

function lottoList() {
    contLotto[contLottoPos] = lottoString;
    contLottoPos++;
}


function lottoPrint() {

    var lottoList = document.createElement("LI");
    var lottoTextElm = document.createTextNode(contLotto[contLottoPos - 1]);
    lottoList.appendChild(lottoTextElm);
    document.getElementById("contL").appendChild(lottoList);
}

function changeFont() {
    document.getElementById("changed").className = "lotto-numbers";
}

function printLotto() {
    document.getElementById("lottoPing").play();
    getString();
    document.getElementById("lottoButton").disabled = true;

    document.getElementById("lottoButton").innerText = "Get A New Number!!"
    lottoPrint();
    changeFont();

    window.setTimeout(buttonPress, 2800);

}

function buttonPress() {
    document.getElementById("lottoButton").disabled = false;
}