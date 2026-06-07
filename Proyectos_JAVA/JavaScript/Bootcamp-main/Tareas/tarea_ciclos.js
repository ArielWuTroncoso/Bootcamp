/*  EJERCICIOS - CONTROL DE FLUJO

Ciclos for:
1.	Escribe un programa que imprima los números del 1 al 10 utilizando un bucle for.

*/

/*

for (let num=1; num <= 10; num++){
    console.log(num);
}


//2.	Imprime los números pares del 1 al 20 utilizando un bucle for y una sentencia if.
console.log("Números pares del 1 al 20 : ")
for (let num2=1 ; num2 <=20; num2++){
    if (num2 %2 == 0 )
        console.log(num2);

}
*/
/*
//3.	Escribe un programa que muestre la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for.

const prompt = require("prompt-sync")()
let num3 = prompt("Ingrese número a multiplicar: ")

for(let multi=1;multi<=10;multi ++){
    let result= num3*multi;
    if (multi <= 10)
        console.log(num3,"x",multi, "= ",result);
}

*/

// 4.	Dada una lista de números, calcula la suma de todos los elementos utilizando un bucle for.

const prompt = require("prompt-sync")()

/*

let lista = [1,4,3,4,10];
let suma = 0;

    for (let valor of lista) {
    suma += valor;
    }

console.log("La suma total es:", suma);

*/
/*
//Primera opción de código lista


let lista2 = [1,2,3,4,5];

let suma2 = 0;

for(let i = 0; i < lista2.length; i++){  // El i++ NO significa: "sumar el siguiente número”, “ Significa:
    // Significa avanzar a la siguiente posición del array.
    // length devuelve la cantidad de elementos del array.
//
// Recorrido real:
// vuelta 1 → i = 0
// vuelta 2 → i = 1
// vuelta 3 → i = 2
// vuelta 4 → i = 3
// vuelta 5 → i = 4
    suma2 = suma2 + lista2[i]; // "suma" se suma a el repaso de la lista ciclo a ciclo, elemente a elemento

 // Acumulación de valores.
    //
    // lista2[i]
    // → Accede al elemento del array según la posición actual de i.
    //
    // Ejemplo:
    // si i = 0 → lista2[0] = 1
    // si i = 1 → lista2[1] = 2
    //
    // suma2 va acumulando elemento por elemento.
    //
    // Equivale a:
    // suma2 += lista2[i];

    // Desarrollo paso a paso:
    //
    // vuelta 1:
    // suma2 = 0 + 1 = 1
    //
    // vuelta 2:
    // suma2 = 1 + 2 = 3
    //
    // vuelta 3:
    // suma2 = 3 + 3 = 6
    //
    // vuelta 4:
    // suma2 = 6 + 4 = 10
    //
    // vuelta 5:
    // suma2 = 10 + 5 = 15
}

console.log("La suma total es:", suma2);




//    node Tarea_ciclos.js

//console.log(lista[i]) // Repasa toda la lista

 //                                        #### Ciclos while: #######


//5) 1.0.	Crea un programa que cuente hacia atrás desde 10 hasta 1 utilizando un bucle while.
console.log("Ciclos WHILE: Secuencia inversa desde 10: ")
let contador=10
while(contador >= 1){
    console.log(contador)
    contador--

}



/*

//5) 1.1.	Escribe un programa que sume números ingresados por el usuario hasta que se ingrese un número negativo utilizando un bucle while.


let suma3 = 0;
let num5 = 0;

while(num5 >= 0){

    num5 = parseInt(prompt("Ingrese un número: "));

    if(num5 >= 0){

        suma3 += num5;
        console.log("Suma actual: ",suma3);

    }
}

console.log("La suma total es:", suma3);


 */

// 5) 1.2.	Implementa un juego de adivinanza en el que el usuario debe adivinar un número secreto. Utiliza un bucle while para permitir múltiples intentos.

/*

while(true){ //“ true = repetir para siempre”
    let num6 =parseInt(prompt("Ingrese el número correcto: "))
    if (num6 === 7){
        console.log(" Felicidades, ¡has acertado! ");
        break // "única forma de romper un ciclo while sin condición específica "
    }

}
*/

/*

//5) 1.3.	Calcula el factorial de un número ingresado por el usuario utilizando un bucle while.
let num10=0
while(true){
    let num8 =parseInt(prompt("Ingrese número factorial: "))
    for(num9=1;num9 <=num8 ; num9++ ){
        num11 =num10 *num9
        console.log("Factorial de ",num8, "es :",num10," x ", num9 ,"= ",num11)
        num10++
        if(num10 === num9)
            console.log("El factorial de ",num8,"es : ",num11)
    }
break
}


*/

//    node tarea_ciclos.js

//5) 1.4	Crea un programa que genere la secuencia de Fibonacci hasta un número dado utilizando un bucle while.
// es la suma de los dos numeros anteriores comenzando con 0,1,1,2,3,5,8,13,21,34



listafibo = [0, 1];
suma4 = 0;
let fibo = parseInt(prompt("Ingrese número para la secuencia de Fibonacci: "))
while (listafibo[listafibo.length - 1] < fibo) {

    suma4 = ((listafibo[listafibo.length - 1]) + (listafibo[listafibo.length - 2]));
    listafibo.push(suma4);
    console.log(listafibo);

}


/*
listafibo = [0, 1];
suma4 = 0;

let fibo = parseInt(prompt("Ingrese número para la secuencia de Fibonacci: "));

while (true) {

    if (listafibo[listafibo.length - 1] < fibo) {

        suma4 = listafibo[listafibo.length - 1] + listafibo[listafibo.length - 2];

        listafibo.push(suma4);

        console.log(listafibo[listafibo.length - 1]);

    } else {
        break;
    }

}
*/


/*
Sentencias if:
1.	Escribe un programa que determine si un número ingresado por el usuario es positivo o cero utilizando sentencias if.


let num15=parseInt(prompt("Ingrese número: "))
if(num15=== 0){
    console.log("El número ", num15, " es cero")
}else if(num15>0){
    console.log("El número ", num15, " es positivo")

}else{
    console.log("Pruebe con otro número")
}

*/
// node tarea_ciclos.js



/*
2.	Crea un programa que verifique si un número es par o impar utilizando una sentencia if.


let num16=parseInt(prompt("Porfavor ingrese número  : "))
if(num16 %2 === 0){
    console.log("El número es par")
}else{
    console.log("El número es impar")
}

*/


// node tarea_ciclos.js
/*
3.	Implementa un programa que determine si un año ingresado por el usuario es bisiesto o no utilizando sentencias if.
// Los años bisiestos son los que se pueden dividir por 4
// los No bisiestos se pueden dividir por 100, con la excepción si también se pueden dividir por 400. 'O'
*/
/*
let num17=parseInt(prompt("Ingrese el año que desea buscar : "))

if((num17 % 4 === 0 && num17 % 100 !== 0) || (num17 % 400 === 0)){

    console.log("El año", num17, "es Bisiesto");
} else {
    console.log("El año", num17, "NO es Bisiesto");
}
*/



// node tarea_ciclos.js
/*
4.	Solicita al usuario ingresar dos números y determina cuál de ellos es mayor utilizando sentencias if.
*/

/*
let num18=parseInt(prompt("Ingrese el primer número: "))
let num19=parseInt(prompt("Ingrese el segundo número: "))

if(num18>num19){
    console.log("El número",num18," es mayor que",num19)

}else{
    console.log("El número",num19," es mayor que",num18)
}


/*
Estos ejercicios te ayudarán a practicar los conceptos básicos de ciclos y bifurcación, relacionados con ciclos for, ciclos while y sentencias if. ¡Buena suerte!

*/

//    node Tarea_ciclos.js
