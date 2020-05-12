var word = [];
var magic;

function getWordsFirstStory() {
    word[0] = prompt("Please enter a Verb");
    word[1] = prompt("Please enter a Noun");
    word[2] = prompt("Please enter a Adjective");
    word[3] = prompt("Please enter a Noun");
    word[4] = prompt("Please enter a Pronoun");
    word[5] = prompt("Please enter a Adverb");
    word[6] = prompt("Please enter a Verb");
    word[7] = prompt("Please enter a Adjective");
    word[8] = prompt("Please enter a Past Tense Verb");
    word[9] = prompt("Please enter a Adjective");
    word[10] = prompt("Please enter a Preposition");
    word[11] = prompt("Please enter a Past Tense Verb");
    word[12] = prompt("Please enter a Noun");
    word[13] = prompt("Please enter a Verb");
    word[14] = prompt("Please enter a Interjection");
    word[15] = prompt("Please enter a Preposition");
    word[16] = prompt("Please enter a Pronoun");
    word[17] = prompt("Please enter a Noun");
    word[18] = prompt("Please enter a Verb");
    word[19] = prompt("Please enter a Conjunction");
    word[20] = prompt("Please enter a Adverb");
    word[21] = prompt("Please enter a Noun");
    word[22] = prompt("Please enter a Conjunction");
    word[23] = prompt("Please enter a Interjection");
}

function getWordsSecondStory() {
    word[1] = prompt("Please Enter A Noun");
    word[4] = prompt("Please Enter A Noun");
    word[2] = prompt("Please Enter A Verb");
    word[5] = prompt("Please Enter A Verb");
    word[0] = prompt("Please Enter A Adjective");
    word[6] = prompt("Please Enter A Adjective");
    word[7] = prompt("Please Enter A Adjective");
    word[3] = prompt("Please Enter A Pronoun");
}

function printStory1() {
    getWordsFirstStory();
    document.getElementById("story").innerHTML =
        "I was " + word[0] + " down the " + word[1] + " when I saw a " + word[2] + " " + word[3] + ". " + word[4] + " was " + word[5] + " " + word[6] + " in the air in a " + word[7] + " way. As I " + word[8] + " a " + word[9] + " group " + word[10] + " people, I " + word[11] + " that the president of " + word[12] + " has " + word[13] + " national " + word[3] + " " + word[6] + " day. " + word[14] + "! It is " + word[15] + " what this world come to. First, " + word[16] + " declared National " + word[17] + " " + word[18] + " day " + word[19] + " now National " + word[3] + " " + word[6] + " day? Next, " + word[16] + " will " + word[20] + " make an " + word[21] + " awareness day " + word[22] + " " + word[16] + " can. " + word[23] + "!";
    alert("I was " + word[0] + " down the " + word[1] + " when I saw a " + word[2] + " " + word[3] + ". " + word[4] + " was " + word[5] + " " + word[6] + " in the air in a " + word[7] + " way. As I " + word[8] + " a " + word[9] + " group " + word[10] + " people, I " + word[11] + " that the president of " + word[12] + " has " + word[13] + " national " + word[3] + " " + word[6] + " day. " + word[14] + "! It is " + word[15] + " what this world come to. First, " + word[16] + " declared National " + word[17] + " " + word[18] + " day " + word[19] + " now National " + word[3] + " " + word[6] + " day? Next, " + word[16] + " will " + word[20] + " make an " + word[21] + " awareness day " + word[22] + " " + word[16] + " can. " + word[23] + "!");
    clearVar();
}

function printStory2() {
    getWordsSecondStory();
    document.getElementById("story").innerText = "A " + word[0] + " " + word[1] + " " + word[2] + " in the sky. As " + word[3] + " is " + word[2] + " in the sky " + word[3] + " sees a " + word[4] + " " + word[5] + " below. " + word[4] + " is " + word[6] + " and " + word[7] + ". " + word[3] + " goes and makes friends with " + word[4] + ".";
    alert("A " + word[0] + " " + word[1] + " " + word[2] + " in the sky. As " + word[3] + " is " + word[2] + " in the sky " + word[3] + " sees a " + word[4] + " " + word[5] + " below. " + word[4] + " is " + word[6] + " and " + magic + ". " + word[3] + " goes and makes friends with " + word[4] + ".");
    clearVar();
}

function clearVar() {
    for (i = 0; i > 24; i++) {
        word[i] = null;
    }
}

/*
Story 2
  "A " + word[0] + " " + word[1] + " " + word[2] + " in the sky. As " + word[3] + " is " + word[2] + " in the sky " + word[3] + " sees a " + word[4] + " " + word[5] + " below. " + word[4] + " is " + word[6] + " and " + word[7] + ". " + word[3] + " goes and makes friends with " + word[4] + ".";
*/

/*
Stroy 1
 "I was " + word[0] + " down the " + word[1] + " when I saw a " + word[2] + " " + word[3] + ". " + word[4] + " was " + word[5] + " " + word[6] + " in the air in a " + word[7] + " way. As I " + word[8] + " a " + word[9] + " group " + word[10] + " people, I " + word[11] + " that the president of " + word[12] + " has " + word[13] + " national " + word[3] + " " + word[6] + " day. " + word[14] + "! It is " + word[15] + " what this world come to. First, " + word[16] + " declared National " + word[17] + " " + word[18] + " day " + word[19] + " now National " + word[3] + " " + word[6] + " day? Next, " + word[16] + " will " + word[20] + " make an " + word[21] + " awareness day " + word[22] + " " + word[16] + " can. " + word[23] + "!";
*/