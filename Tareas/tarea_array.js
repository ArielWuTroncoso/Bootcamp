/* 

# Nivel 1 — Conociendo los arrays

## Ejercicio 1: Crear un array

Crea un array llamado `frutas` con 5 frutas distintas y muéstralo por consola.

### Ejemplo esperado

```jsx
["Manzana","Pera","Uva","Plátano","Kiwi"]
```
*/


frutas = ["manzanas", "peras", "naranjas", "uvas", "papayas"];
console.log(frutas);




//node tarea_array.js

/*  
## Ejercicio 2: Mostrar un elemento

Dado este array:

Muestra por consola:

- El primer color
- El último color
*/

let colores = ["Rojo", "Azul", "Verde", "Amarillo"];

console.log("¿Que colores son el primero y último?")
console.log(colores[0], colores[3])


/* 
## Ejercicio 3: Contar elementos

Crea un array con nombres de animales y muestra:

- Cuántos elementos tiene el array

Pista:

```jsx
.length
```

---
*/

animales = ["Cerdo", "rata", "búho", "perro", "gato"];
console.log("Cuantos animales hay en la lista: ")
console.log(animales.length)


//    node tarea_array.js
/*


############### Nivel 2 — Recorrer arrays  #####################

## Ejercicio 4: Mostrar todos los elementos

Dado el array:

```jsx

Recorre el array usando `for` y muestra cada número.
*/

let numeros = [10, 20, 30, 40, 50];

let variable = 0;
console.log("la lista de todos los números en la lista es: ")
for (let i = 0; i < numeros.length; i++) {


    console.log(numeros[i])
}


/*

## Ejercicio 5: Sumar números

Crea un array con 5 números y recórrelo para calcular la suma total.

### Ejemplo

    ```jsx
let numeros= [2,4,6,8];
```

Resultado:

```
La suma es: 20
```
*/

let numeros2 = [2, 4, 6, 8, 10];
variable2 = 0;
for (let i = 1; i < numeros2.length; i++) {
    variable2 = numeros2[i];
    variable2 = variable2 + variable2;
}

console.log("La suma total de la lista es:", variable2)

/*
//    node tarea_array.js

## Ejercicio 6: Contar mayores de edad

Dado el array:

```jsx
let edades= [12,18,25,14,30,17];
```

Cuenta cuántas personas son mayores o iguales a 18.


*/
let edades = [12, 18, 25, 14, 30, 17];
let variableedad = 0;
let mayoresedad = 0;

for (let ii = 0; ii < edades.length; ii++) {

    variableedad = edades[ii];
    if (variableedad >= 18) {
        mayoresedad++

    }
}
console.log("Hay", mayoresedad, "personas mayores de edad");


//    node tarea_array.js
/*
---

# Nivel 3 — Modificar arrays

## Ejercicio 7: Agregar elementos

Crea un array vacío llamado`compras`.


    Agrega 3 productos usando:

- `push()`

Luego muestra el array.

---
*/
const prompt = require("prompt-sync")()
/*


let compras = [];
while (compras.length < 3) {
    let productos = prompt("Ingrese producto a la lista de compras: ")
    compras.push(productos);
}
console.log(compras)

/*

//    node tarea_array.js

## Ejercicio 8: Eliminar el último elemento

Dado:

```jsx
let estudiantes= ["Ana","Pedro","Luis","María"];
```

Elimina el último estudiante y muestra:

- El array actualizado
    - El estudiante eliminado

---
*/
/*
let estudiantes = ["Ana", "Pedro", "Luis", "María"];

ultimo = estudiantes.length - 1
ultimo2 = (estudiantes[ultimo])
estudiantes.pop(estudiantes.length - 1)
console.log(estudiantes)
console.log("Estudiante eliminado de lista: ", ultimo2)
*/

/*
node tarea_array.js

## Ejercicio 9: Buscar elemento

Dado:

```jsx
let paises= ["Chile","Argentina","Perú","México"];
```

Pregunta al usuario un país usando`prompt`.

    Indica:

- "País encontrado"
    - "País no encontrado"

Pista:

```
includes()
```

---
*/
/*
let paises = ["Chile", "Argentina", "Perú", "México"];
let pais = prompt("Elija un país: ");
encontrado = paises.includes(pais);
console.log(pais)
console.log(paises)

if (encontrado == true) {
    console.log("País encontrado")
} else
    console.log("País no encontrado")

*/

//    node tarea_array.js
/*
################# Nivel 4 — Arrays + condicionales  ######################

## Ejercicio 10: Números pares

Recorre un array y muestra solamente los números pares.

### Ejemplo

    ```jsx
let numeros= [1,2,3,4,5,6,7,8];
```

Salida:

```
2
4
6
8
*/
/*
let numeros3 = [1, 2, 3, 4, 5, 6, 7, 8];
pares = 0
for (pares of numeros3) {
    if (pares % 2 == 0) {
        console.log("Números pares en lista: ")
        console.log(pares)
    }

}
*/
//     node tarea_array.js
/*
## Ejercicio 11: Número mayor

Encuentra el número más grande dentro de un array.

### Ejemplo

    ```jsx
let numeros= [5,9,2,20,1];
```
Resultado:
```
El número mayor es 20
*/
/*
let numeros4 = [5, 9, 2, 20, 1];

numeros4.sort((a, b) => a - b)
let ordenando = numeros4.length - 1
ultimonum = numeros4[ordenando]


console.log("El número mayor es: ", ultimonum,)
*/
/*

node tarea_array.js
## Ejercicio 12: Promedio

Calcula el promedio de un array de notas.

### Ejemplo

    ```jsx
let notas= [5.5,6.0,4.8,7.0];


```
*/

/*
let notas = [5.5, 6.0, 4.8, 7.0];
let promedio = 0
let promedio2 = 0
let primedio3 = 0

for (i = 0; i < notas.length; i++) {
    promedio = notas[i]
    promedio2 = promedio2 + promedio
    console.log(promedio2)

}
let promedio3 = parseFloat((promedio2 / (notas.length)))
console.log("El promedio de la lista es:", promedio3)
*/
//   node tarea_array.js
/*
---

# Nivel 5 — Arrays con strings

## Ejercicio 13: Contar letras

Dado:

```jsx
let nombres= ["Ana","Felipe","Camila","Tomás"];
```

Muestra cuántas letras tiene cada nombre.
*/
/*
let nombres = ["Ana", "Felipe", "Camila", "Tomás"];

*/



/*
//      node tarea_array.js
---

## Ejercicio 14: Convertir a mayúsculas

Recorre un array de palabras y muestra cada palabra en mayúscula.

    Pista:

```
toUpperCase()
```
*/
/*
let listamayus = ["ariel", "jaime", "adrian", "antonia", "carlos", "jazmin"];

mayus = listamayus.map(mayus => mayus.toUpperCase())
console.log(mayus)

*/

//      node tarea_array.js
/*
---

## Ejercicio 15: Buscar palabras largas

Muestra solamente las palabras que tengan más de 5 letras.

---
*/

/*
# Nivel 6 — Arrays de objetos

## Ejercicio 16: Mostrar propiedades

Dado:

```jsx
let usuarios= [
    {nombre:"Ana", edad:20},
    {nombre:"Luis", edad:17},
    {nombre:"Pedro", edad:25}
];
```

Muestra:

```
Ana tiene 20 años
Luis tiene 17 años
```
*/
//      node tarea_array.js


let usuarios = [
    { nombre: "Ana", edad: 20 },
    { nombre: "Luis", edad: 17 },
    { nombre: "Pedro", edad: 25 }
];

console.log("Imprimiendo sólo dos nombres: ")

console.log(usuarios[0].nombre + " tiene " + usuarios[0].edad + " años");
console.log(usuarios[1].nombre + " tiene " + usuarios[1].edad + " años");




/*
//      node tarea_array.js
## Ejercicio 17: Filtrar mayores de edad

Usando el array anterior:

- Mostrar solamente los usuarios mayores de edad.
*/
/*
let filtrando = usuarios.filter(num => num.edad > 18)
console.log("Encontrando mayores de edad: ")
console.log(filtrando)
*/

/*
## Ejercicio 18: Buscar usuario

Pide un nombre al usuario y verifica si existe en el array de objetos.

---
*/
let buscarnombre = prompt("Ingrese un nombre a buscar: ")
let nombreencontrado = 0
for (let buscar of usuarios) {

    if (buscar.nombre == buscarnombre) {
        nombreencontrado = 1;
    }
    if (nombreencontrado == 1) {
        console.log("Usuario encontrado: ", buscarnombre, "tiene", buscar.edad, "años")
        break
    }

}

//           node tarea_array.js

/*

# Nivel 7 — Métodos modernos

## Ejercicio 19: map()

Dado:

```jsx
let numeros= [1,2,3,4];
```

Crear un nuevo array donde cada número esté multiplicado por 2.
*/
let numeros3 = [1, 2, 3, 4];
let multiplicados = numeros3.map(multi => multi * 2)
console.log("Números multiplicados por 2: ")
console.log(multiplicados)



//           node tarea_array.js
/*

## Ejercicio 20: filter()

Dado:

```jsx
let edades = [12,18,25,10,30];
```

Crear un nuevo array solamente con mayores de edad.
*/
let edades3 = [12, 18, 25, 10, 30];

let mayores2 = edades3.filter(num2 => num2 >= 18)
console.log("Números mayores de edad: ")
console.log(mayores2)

//           node tarea_array.js

/*
## Ejercicio 21: find()

Buscar un usuario específico dentro de un array de objetos.

*/

let user = [
    { nombre: "Ariel", edad: 32 },
    { nombre: "Lucas", edad: 21 },
    { nombre: "María", edad: 30 },
];
let usuarioabuscar = prompt("Ingrese un nombre a buscar: ")

let finder = user.find(coso => coso.nombre == usuarioabuscar)
console.log("Usuario encontrado: ", finder)

//           node tarea_array.js
/*

## Ejercicio 22: reduce()

Sumar todos los números de un array usando`reduce`.*/

let numeros5 = [10, 30, 10, 20, 30];
sumatoria = 0
let sumando = numeros5.reduce((acum, numm) => acum + numm, 0)
console.log("La suma total de la lista es: ", sumando)
