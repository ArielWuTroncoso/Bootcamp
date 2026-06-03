// Para incluir estos algoritmos, necesitamos conectar
// este archivo JS en el index mediante <script>


/* =========================
   SELECCIÓN DE ELEMENTOS
========================= */


const nombreInput = document.querySelector('#name')
// const crea una variable constante
// document representa todo el HTML
// querySelector() busca un elemento
// '#name' busca un id llamado "name"


const mensaje = document.querySelector('#mensaje')
// Selecciona el textarea con id="mensaje"


const botonPost = document.querySelector('#btn-post')
// Selecciona el botón publicar


const contenedorPublicaciones = document.querySelector('#contenedor-post')
// Selecciona el div donde aparecerán los posts


/* =========================
   FUNCIÓN CREAR PUBLICACIÓN
========================= */


function crearPublicacion(nombre, mensaje){
// function crea una función reutilizable
// crearPublicacion es el nombre de la función
// nombre y mensaje son parámetros recibidos


// Creamos un div para guardar la publicación

    const postUser = document.createElement('div')
    // createElement() crea un elemento HTML
    // 'div' crea una caja contenedora


    postUser.classList.add('posteo')
    // classList permite manejar clases CSS
    // add() agrega una clase
    // 'posteo' será usada en CSS


// Creamos un h4 para el nombre del usuario

    const nombreUsuario = document.createElement('h4')
    // 'h4' crea un título pequeño


// Insertamos el nombre recibido

    nombreUsuario.textContent = nombre;
    // textContent cambia el texto interno


// Creamos un párrafo para el mensaje

    const mensajeUsuario = document.createElement('p')
    // 'p' crea un párrafo HTML


// Insertamos el mensaje recibido

    mensajeUsuario.textContent = mensaje;
    // Muestra el mensaje escrito por el usuario


/* =========================
   AGREGAR ELEMENTOS
========================= */


// appendChild() agrega elementos hijos dentro de otro elemento

    postUser.appendChild(nombreUsuario)
    // Agrega el nombre dentro del div


    postUser.appendChild(mensajeUsuario)
    // Agrega el mensaje dentro del div


    contenedorPublicaciones.appendChild(postUser)
    // Inserta la publicación completa en pantalla

}


/* =========================
   EVENTO DEL BOTÓN
========================= */


botonPost.addEventListener('click', function(){
// addEventListener() detecta eventos
// 'click' detecta clics del mouse
// function() ejecuta código cuando ocurre el evento


    event.preventDefault()
    // preventDefault() evita recargar el formulario


/* =========================
   OBTENER DATOS DEL INPUT
========================= */


    const valorInputNombre = nombreInput.value;
    // value obtiene el texto escrito en el input


    const valorMensaje = mensaje.value;
    // Obtiene el texto escrito en el textarea


/* =========================
   VALIDACIÓN
========================= */


// Verifica si algún campo está vacío

    if(valorInputNombre === '' || valorMensaje === ''){
    // if evalúa condiciones
    // === compara igualdad exacta
    // '' representa texto vacío
    // || significa "o"

        alert('Debes completar los cambios')
        // alert() muestra una ventana emergente


        return
        // return detiene la función

    }else crearPublicacion(valorInputNombre, valorMensaje);
    // else se ejecuta si la condición es falsa
    // Llama a crearPublicacion()


/* =========================
   LIMPIAR CAMPOS
========================= */


    nombreInput.value = ''
    // Vacía el input del nombre


    mensaje.value = ''
    // Vacía el textarea

})
// Fin del evento click
/* 
const nombreInput = document.querySelector('#name')
const mensaje = document.querySelector('#mensaje')
const botonPost = document.querySelector('#btn-post')
const contenedorPublicaciones = document.querySelector('#contenedor-post')
 
function crearPublicacion(nombre, mensaje){
    const postUser = document.createElement('div')
    postUser.classList.add('posteo')
    const nombreUsuario = document.createElement('h4')
    nombreUsuario.textContent = nombre;
    const mensajeUsuario = document.createElement('p')
    mensajeUsuario.textContent = mensaje;
    postUser.appendChild(nombreUsuario)
    postUser.appendChild(mensajeUsuario)
    contenedorPublicaciones.appendChild(postUser)
}
 
botonPost.addEventListener('click', function(){
    event.preventDefault()
    const valorInputNombre = nombreInput.value;
    const valorMensaje = mensaje.value;
 
    if(valorInputNombre === '' || valorMensaje === ''){
        alert('Debes completar los campos')
    } else {
        crearPublicacion(valorInputNombre, valorMensaje);
        nombreInput.value = ''
        mensaje.value = ''
 
    }
 
 
})
 

*/

