// OPERADORES MATEMÁTICOS
//Clase miércoles 06/05

let a= 7;
let b= 2;

console.log(a+b);
console.log(a-b);
console.log(a*b);       
console.log(a/b);
console.log(a%b); // operador módulo o residuo, devuelve el resto de la división entre a y b
//Para números impares siempre devolverá un 1

//Operadores de asignación
let c = 10;
c=c+5; // c ahora es igual a 15
console.log(c); // c ahora es igual a 15

//también se puede escribir como c+=5, lo que es equivalente a c=c+5
//ejemplo:
c+=5; // c ahora es igual a 20
console.log(c); // c ahora es igual a 20

//OPERADORES DE COMPARACIÓN

let d = 5;
console.log("d = 5"); 
let e = 10;
console.log("e = 10");

console.log(d == e); // false
console.log(d != e); // true
console.log(d < e); // true
console.log(d > e); // false
console.log(d <= e); // true
console.log(d >= e); // false


Edad= 18;
console.log(Edad >= 18); // true

// operadores lógicos

console.log("Operador lógico AND (&&)");

console.log(true && true); // true
console.log(true && false); // false

console.log(d == 5 && e == 10); // true
console.log(d == 5 && e == 5); // false

console.log("Operador lógico OR (||)");

console.log(true || false); // true
console.log(false || false); // false   
console.log(d == 5 || e == 5); // true
console.log(d == 10 || e == 5); // false    

//Operador lógico NOT (!)
console.log(!true); // false
console.log(!false); // true
console.log(!(d == 5)); // false, porque d es igual a 5, entonces !true es false


//Operadores de incremento y decremento

let f = 5;
console.log(f); // 5
f++; // incrementa f en 1
console.log(f); // 6
f--; // decrementa f en 1
console.log(f); // 5

