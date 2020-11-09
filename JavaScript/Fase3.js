
var nom = ['F','e','r','r','a','n'];
var lletres_nom = {};
var text = "";

for(n in nom) {
    var z = nom[n];
    if(Object.keys(lletres_nom).includes(z)){
        lletres_nom[z] = lletres_nom[z] + 1;
    } else {
        lletres_nom[z] = 1;
    }
}

for(l in lletres_nom) {
    text += l + ": " + lletres_nom[l] + "<br>";
}

document.getElementById("fase3").innerHTML = text;
