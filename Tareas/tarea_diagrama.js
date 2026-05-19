


//Ejercicios variados
//Actividad 1: Realizar el diagrama de flujo de los siguientes ejercicios y crear un programa.



//1Obtener la suma de dos números cualesquiera
/*
2.	Obtener e imprimir el nombre y la edad de una persona
3.	Obtener e imprimir el nombre, dirección y estado civil de una persona
*/

//4.	Capturar el nombre y dos calificaciones de un alumno e imprimir el promedio de estas.
const prompt = require("prompt-sync")()
/*  
let nombre1= prompt("Ingrese el primer nombre :");

let nota1= parseInt(prompt("Ingrese primera nota :"));
let nota2= parseInt(prompt("Ingrese segunda nota :"));


let promedio = ((nota1+nota2)/2);

console.log("El promedio de ambos es: ",promedio)
*/

// node tarea_diagrama.js

/*  

//5.	Obtener la suma y el promedio de cinco calificaciones que de un alumno

let notas = []; 

let suma = 0; 
// Servirá como acumulador para sumar todas las notas.

for(let i = 0; i < 5; i++){

    let nota = parseFloat(prompt("Ingrese una nota: "));
  // parseFloat() Convierte ese texto en número decimal.
    
    notas.push(nota);
    // push() agrega un elemento al final del array.

    suma += nota;
    // Operador de acumulación.
    // Equivale a:
    // suma = suma + nota;
    // Va sumando cada nota ingresada.
}

let promedio = suma / notas.length;

// notas.length
// → Devuelve la cantidad de elementos del array.
//
// Si hay 5 notas:
// promedio = suma / 5

console.log("Notas:", notas);
// Muestra el contenido completo del array.

console.log("Suma:", suma);
// Muestra la suma total de las notas.

console.log("Promedio:", promedio);
// Muestra el promedio final.

*/

/*
6.	Convertir dólares a pesos
7.	Obtener el descuento de un producto e imprimirlo.
8.	Imprimir el sueldo neto de un empleado considerando impuestos.
Actividad 2: Intentar codificar los siguientes ejercicios.
*/

/*  
//1.	Un alumno desea saber cuál será su calificación final en una materia. 
// Dicha calificación se compone de los siguientes porcentajes: 50% proyecto integrador, 
// 30% nota técnica y 20% nota tareas.

//    node tarea_diagrama.js

let notafinal=0;
let notaproyec =parseFloat(prompt("Ingrese nota proyecto:"));
let notatec=parseFloat(prompt("Ingrese nota técnica:"));
let notatareas=parseFloat(prompt("Ingrese nota tareas:"));

let nota1= notaproyec*0.5
let nota2= notatec*0.3
let nota3= notatareas*0.2

notafinal= nota1+nota2+nota3;

console.log("La nota final es :",notafinal);
*/


// node tarea_diagrama.js

/*  
//2.	Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto deberá 
// pagar finalmente por su compra.

let valorcompra= parseInt(prompt("Ingrese valor del producto:"));

let descuento= ((valorcompra*15)/100);

let valorfinal= valorcompra-descuento;

console.log(" El valor total de su compra es:",valorfinal);
*/



/*  
//3.	Realizar un algoritmo que calcule la edad de una persona.

let edad=parseInt(prompt("Ingrese su año de nacimiento: "))

let calculo= 2026-edad;

console.log("Su edad actual es:",calculo);

*/

// node tarea_diagrama.js

/*____________________
Ejercicio FIZZ BUZZ
Escribe un programa que imprima los primeros 100 números de FizzBuzz. La salida debe verse de la siguiente forma:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
*/


for(let i=0;i < 101; i++){
    
    if(i %3 == 0 && i %5 == 0){
        console.log("FizzBuzz");
    }if(i %3 ==0){
        console.log("Fizz");
    
    }else if(i %5 ==0){
        console.log("Buzz");
    
    }else console.log(i)
}