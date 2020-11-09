
var nom = ['F','e','r','r','a','n'];
var vocal = ['A','a','E','e','I','i','O','o','U','u'];
var number = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];
var n;
var text = "";

for(n in nom) {
    if(number.includes(nom[n])) {
        text += nom[n] + ": Els nom de persones no contenen numeros! <br>";
    } else if(vocal.includes(nom[n])) {
        text += nom[n] + ": VOCAL <br>";
    } else {
        text += nom[n] + ": CONSONANT <br>";
    }
}

document.getElementById("fase2").innerHTML = text;
