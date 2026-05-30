// Para incluir estos algoritmos, necesitamos conectar
// este archivo JS en el index con la etiqueta <script>


const tareaInput = document.querySelector('#tarea')
// const crea una variable constante
// document representa todo el documento HTML
// querySelector() selecciona un elemento HTML
// '#tarea' busca el elemento con id="tarea"
contenedor-post


const botonPost = document.querySelector('#btn-post')
// Selecciona el botón publicar

const contenedorPublicaciones = document.querySelector('#contenedor-post')
// Selecciona el contenedor donde aparecerán las publicaciones


function crearPublicacion(tarea){
// function crea una función reutilizable
// crearPublicacion es el nombre de la función
// nombre = dato recibido con el nombre del usuario
// mensaje = dato recibido con el texto del mensaje


// Estamos creando un div para guardar la publicación

    const postTarea = document.createElement('div')
    // createElement() crea un nuevo elemento HTML
    // 'div' indica que se creará un <div>

    postTarea.classList.add('posteo')
    // classList permite manejar clases CSS
    // add() agrega una clase al elemento
    // 'posteo' será la clase CSS aplicada




    const nombreTarea = document.createElement('h4')
    // Crea un título <h4> para mostrar la tarea

    //añadimos la constante a una class
    nombreTarea.classList.add('tituloTarea')

    // Entre el div y el h4 agregamos el nombre de la tarea

    nombreTarea.textContent = tarea;
    // textContent cambia el texto interno del elemento
    // nombre es el valor recibido por la función


    const mensajeTarea = document.createElement('p')
    // Crea un párrafo <p> para el mensaje

    

   
     // =========================
    // BOTÓN BORRAR
    // =========================

    // Creando botón para borrar post
  const botonBorrar = document.createElement('button')
    // Crea un botón HTML

    botonBorrar.textContent = 'Borrar'
    // Texto visible del botón

    botonBorrar.classList.add('btn-borrar')
    // Clase CSS opcional

    // Evento para borrar la tarea
    botonBorrar.addEventListener('click', function(){

        postTarea.remove()
        // remove() elimina el elemento HTML

    })

  
    //aqui deben ir los POST, luego de crear la const, y los botones
    
// appendChild() agrega un elemento hijo dentro de otro elemento
    postTarea.appendChild(nombreTarea)
    // Agrega el nombre dentro del div

    postTarea.appendChild(botonBorrar)


    contenedorPublicaciones.appendChild(postTarea)
    // Agrega toda la publicación al contenedor principal

}
 

botonPost.addEventListener('click', function(){
// addEventListener() detecta eventos
// 'click' indica que reaccionará al hacer clic
// function() ejecuta código cuando ocurre el evento

    event.preventDefault()
    // preventDefault() evita que el formulario se recargue


// Guardamos el contenido escrito por el usuario

    const valorInputNombre = tareaInput.value;
    // value obtiene el texto escrito en el input


// Verifica si los campos están vacíos

    if(valorInputNombre === ''){
    // if evalúa una condición
    // === compara si los valores son exactamente iguales
    // '' representa un texto vacío
    // || significa "o"

        alert('Debes completar los cambios')
        // alert() muestra una ventana de aviso

        return
        // return detiene la ejecución de la función

    }else crearPublicacion(valorInputNombre);
    // else se ejecuta si la condición es falsa
    // Llama a la función crearPublicacion()


// Limpia los campos después de publicar

    tareaInput.value = ''
    // Vacía el input del nombre

  const botonBorrar = document.createElement('button')
    // Crea un botón HTML

    botonBorrar.textContent = 'Borrar'
    // Texto visible del botón

    botonBorrar.classList.add('btn-borrar')
    // Clase CSS opcional

    // Evento para borrar la tarea
    botonBorrar.addEventListener('click', function(){

        postTarea.remove()
        // remove() elimina el elemento HTML

    })
})



// Fin del evento click