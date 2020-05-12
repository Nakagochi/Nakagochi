
var birthStone = ["Garnet", "Amethyst", "Aquamarine", "Diamond", "Emerald", "Pearl", "Ruby", "Peridot", "Sapphire", "Opal", "Topaz", "Tanzanite"];

var season = ["Spring", "Summer", "Fall", "Winter"];

var month = ["january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"];

var name = prompt("Please enter your name: ");
var age = prompt("Please enter your age: ");
var birthMonth = prompt("Please enter your birth month:");
var x = month.indexOf(birthMonth.toLowerCase());
var y = 0;

if (x >= 2 && x <= 4)
{
    y = 0;
}
else if (x >= 5 && x <= 7)
{
    y = 1;
}
else if (x >= 8 && x <= 10)
{
    y = 2;
}
else if (x == 11 && x <= 1)
{
    y = 3;
}

if (x == -1)
{
    alert("The month you put in was either miss spelled or not a month.\nPlease try again by refreshing the page.")
}
else if (age < 50)
{
    alert("Hi " + name + "! You are " + age + ". You were born in " + birthMonth + "\nYour birhtstone is " + birthStone[x] + ". You were born in the " + season[y] + ".\n Oh how young you are! That is some special age!!");
}
else
{
    alert("Hi " + name + "! You are " + age + ". You were born in " + birthMonth + "\nYour birhtstone is " + birthStone[x] + ". You were born in the " + season[y] + ".\n Holy Guacamole! You are almost as old as dirt! ");
}
