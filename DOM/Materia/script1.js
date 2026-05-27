// console.log() muestra mensajes en la consola del navegador
console.log("Hola desde un archivo externo");


/* =========================
   SELECCIONAR ELEMENTOS
========================= */


const parrafo_id = document.getElementById('parrafo-id');
// const crea una variable constante
// document representa el documento HTML
// getElementById() busca un elemento por id
// 'parrafo-id' es el id buscado


console.log('parrafo_id');
// Muestra texto en consola


// Al tener una clase aplicada a varios elementos,
// se obtiene una colección/lista de elementos

const lista_parrafos = document.getElementsByClassName("parrafo-class");
// getElementsByClassName() busca elementos por clase
// Devuelve una colección HTML


console.log(lista_parrafos);
// Muestra toda la lista de párrafos


console.log(lista_parrafos[0]);
// [0] accede al primer elemento de la lista


const parrafo_query = document.querySelector(".parrafo-class")
// querySelector() busca el primer elemento coincidente
// ".parrafo-class" busca por clase usando .

console.log(parrafo_query)
// Muestra el primer elemento encontrado


const parrafo_queryAll = document.querySelectorAll(".parrafo-clas");
// querySelectorAll() busca TODOS los elementos coincidentes
// Devuelve una lista tipo NodeList

console.log("parrafo_queryAll");
// Muestra texto en consola


/* =========================
   RECORRER LISTAS
========================= */


// forEach() recorre cada elemento de una lista
// element representa cada elemento individual

parrafo_queryAll.forEach(element =>{

    console.log(element)
    // Muestra cada elemento de la lista

})


/* =========================
   PROPIEDADES Y MÉTODOS
========================= */


parrafo_id.textContent="texto cambiado"
// textContent cambia el texto interno


// style permite modificar CSS desde JavaScript

parrafo_id.style.textAlign='center'
// textAlign centra el texto


parrafo_id.style.color= 'blue'
// color cambia el color del texto


parrafo_id.innerHTML= '<strong> texto en negrita</strong>'
// innerHTML inserta HTML real
// <strong> aplica negrita


/* =========================
   CREAR ELEMENTOS
========================= */


const nuevoParrafo = document.createElement('p')
// createElement() crea un elemento HTML
// 'p' indica un párrafo


nuevoParrafo.textContent='Este es un nuevo parrafo desde js'
// Agrega texto al nuevo párrafo


document.body.appendChild(nuevoParrafo)
// body representa el cuerpo del HTML
// appendChild() agrega el elemento al final


/* =========================
   FUNCIONES
========================= */


function capturarDato(){
// function crea una función reutilizable
// capturarDato es el nombre de la función

    const nombre = prompt("Escribe tu nombre")
    // prompt() muestra una ventana para escribir texto

    console.log(nombre)
    // Muestra el nombre escrito

}


/* =========================
   EVENTOS
========================= */


const boton = document.querySelector('button')
// Busca el primer botón del HTML


boton.addEventListener('click',function(){
// addEventListener() detecta eventos
// 'click' detecta clics del mouse
// function() ejecuta código cuando ocurre el evento

    const nombre=prompt("Escribe tu nombre desde evento ")
    // Solicita un nombre al usuario

    alert("hey tu nombre es" + nombre)
    // alert() muestra una ventana emergente
    // + concatena textos

})