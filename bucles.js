// ############# CICLO IF #########

const prompt = require("prompt-sync")();

/*
let edad =parseInt(prompt("¿Cuál es tu edad? :")); //parseInt siempre devuelve un texto aunque se añada números.
console.log("Tú edad es",edad);

if(edad >= 18 && edad<=100){
    console.log("Es un adulto")
} else if (edad > 12 && edad<=17){
    console.log("Es un adolescente")
} else if (edad <= 12){
    console.log("Es un niño")
} else {
    console.log("Agrega una edad válida")
}

*/

/*  

// #########    CICLO WHILE  #########


let num=1

while(num<=10){


console.log("Se ejecutará hasta que sea falsa")

num = num +1

}

*/



/*

while(true){

let edad =parseInt(prompt("¿Cuál es tu edad? :")); //parseInt siempre devuelve un texto aunque se añada números.
console.log("Tú edad es",edad);

if(edad >= 18 && edad<=100){
    console.log("Es un adulto")
    break
} else if (edad > 12 && edad<=17){
    console.log("Es un adolescente")
    break
} else if (edad <= 12){
    console.log("Es un niño")
    break
} else {
    console.log("Esa no es una edad válida, ingrese otro valor : ")
    
}}


*/


/* 

//Ciclo IF

for(let i=1; i <= 10; i ++){

    console.log(i)
}
 */



let frutas = ["manzanas","peras","uvas"];


// Aquí me muestra el nombre de la posición de la lista que yo le indique
console.log(frutas[0])

// Aquí me muestra el último objeto o posición de la lista
console.log(frutas[frutas.length - 1])

// aquí vemos lista completa e identica
console.log(frutas)


//para encontrar posición de elemento por palabra
console.log("Encontrando posición por palabra (indexOf(ejemplo:manzanas)")
console.log(frutas.indexOf("manzanas"))




// of para encontrar elemento por elemento
for(fruta of frutas){

    if(fruta == "peras"){
        console.log("Voy hacer mermelada de: ",fruta )

    }
}



// in para encontrar posición: muestra la lista de las cosas hacía abajo pero en índices
for(let posicion in frutas){
    console.log(posicion)
}

// in para encontrar posición: muestra la lista de las cosas hacía abajo pero en nombres

for(let posicion in frutas){

    console.log("posición frutas con in en modo lista y nombre (no índice): ",frutas[posicion])
}



/*  

// Usando switch y case para nombrar nuevas variables habilitadas para escribir.
// switch es condicional alternatica de if,else if,else.

    rol = prompt("¿Cuál es tu rol? ");
    switch(rol){
        case "admin":
        console.log("Tiene acceso ");
        break
        case "editor":
        console.log("Puede editar ");
        break
        case "usuario":
        console.log("Puede ver  ")
        break
    default :
        console.log("Usuario inválido")
    }

*/


//creando prompt con funcion .find

let ingresefruta = prompt("Ingrese la fruta a buscar: ");

let encontrado = frutas.find(fruta => fruta === ingresefruta);

if (encontrado) {
    console.log("La fruta", ingresefruta, "se encuentra en la lista");
    console.log("Posición nro : ",(frutas.indexOf(ingresefruta)))

}else{
    console.log("La fruta", ingresefruta, "NO se encuentra en la lista");
}

// Usando la función .includes para sólo saber si el elemento está en la lista

let buscarfruta = prompt("Ingrese la fruta a buscar: ");

if (frutas.includes(buscarfruta)) {
    console.log("La fruta sí está en la lista");
} else {
    console.log("La fruta NO está en la lista");
}

// node bucles.js