const prompt= require("prompt-sync")(); //se añade esto para invocar el uso de prompt

let nombre = prompt("¿Cuál es tú nombre?") 
let edad = prompt("¿Cuál es tú edad?")
let comuna = prompt("¿Cuál es tú comuna?")

console.log(`Hola mundo, mi nombre es ${nombre}, tengo ${edad} años soy de ${comuna}.`)



