
// clase miércoles 29/05
// comentario

/* comentarios
jasdasdjasd
jasdj
*/

console.log("Hola Mundo");

let nombre = "Felipe";
nombre= "Ariel";
const rut = 132121;

console.log(nombre);

/* formas de nombrar variables para estetica y buenas practicas
1. camelCase
2. snake_case
3. PascalCase

*/

if (true) {
    var x = 5;
    let y = 10;
    console.log(y);
}

console.log(x); 


// Tipos de datos

console.log("######Tipos de datos######");

let variableString = "Soy un texto";
let variableNumber = 123;
let variableBoolean = true;
let variableNull = null;// null es un valor asignado a una variable para indicar que no tiene valor (se le declara un null a diferencia de undefined que no tiene ningun valor o letras)
let variableUndefined;// undefined es un valor asignado a una variable cuando no se le ha asignado un valor específico (eje.sin colocar =),pero igual devuelve o muestra undefined.

console.log(typeof variableString);
console.log(typeof variableNumber);
console.log(typeof variableBoolean);
console.log(typeof variableNull);
console.log(typeof variableUndefined);

// tipos de datos estructura dinámica 

let variabltipoobjeto = {
    datonombre: "Juan",
    datoedad: 25,   
    comuna: "Santiago",
}

// Tipo ARRAY O LISTA

let variableArray = ["Manzana", "Banana",true, "Naranja",18,[]];

console.log(variableArray);

// EL OPERADOR TYPEOF SE USA PARA DETERMINAR EL TIPO DE DATO DE UNA VARIABLE O VALOR EN TIEMPO DE EJECUCIÓN. DEVUELVE UNA CADENA QUE INDICA EL TIPO DE DATO, COMO "STRING", "NUMBER", "BOOLEAN", "OBJECT", "UNDEFINED", ENTRE OTROS. ES ÚTIL PARA VERIFICAR EL TIPO DE DATO ANTES DE REALIZAR OPERACIONES O PARA DEPURAR CÓDIGOS.
console.log(typeof(variableArray)); // typeof no es un tipo de dato, es un operador que devuelve el tipo de dato de una variable o valor. En este caso, devuelve "object" porque los arrays en JavaScript son considerados objetos.
console.log(typeof(nombre)); 

console.log(variableBoolean);


