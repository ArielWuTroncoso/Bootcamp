//DOM en secuencia 




// 1er paso: capturar el input de tareas
const tareaInput = document.querySelector('#tarea')

// 2do paso: capturar el botón publicar
const botonPost = document.querySelector('#btn-post')

// 3er paso: capturar el contenedor de publicaciones
const contenedorPublicaciones = document.querySelector('#contenedor-post')




// 4to paso: función que crea una nueva publicación
function crearPublicacion(tarea){

    // 8vo paso: crear el contenedor de la tarea
    const postTarea = document.createElement('div')

    postTarea.classList.add('posteo')//creando una class


    // 9no paso: crear el título de la tarea
    const nombreTarea = document.createElement('h4')

    nombreTarea.classList.add('tituloTarea')


    // 10mo paso: asignar el texto recibido al h4
    nombreTarea.textContent = tarea;



    // 11vo paso: crear botón borrar
    const botonBorrar = document.createElement('button')

    botonBorrar.textContent = ('Borrar') //le añadimos texto

    botonBorrar.classList.add('btn-borrar')


    // 12vo paso: eliminar la tarea al hacer click
    botonBorrar.addEventListener('click', function(){

        postTarea.remove()

    })


    // 13vo paso: agregar el título al div
    postTarea.appendChild(nombreTarea)

    // 14vo paso: agregar el botón al div
    postTarea.appendChild(botonBorrar)

    // 15vo paso: mostrar la publicación en pantalla
    contenedorPublicaciones.appendChild(postTarea)

}


// 5to paso: esperar click en Publicar
botonPost.addEventListener('click', function(){

    event.preventDefault()


    // 6to paso: obtener el valor escrito en el input
    const valorInputNombre = tareaInput.value;


    // 7mo paso: validar que el campo no esté vacío
    if(valorInputNombre === ''){

        alert('Debes completar los cambios')
        return
    }

    // Crear publicación con el texto ingresado
    else crearPublicacion(valorInputNombre);

    // 16vo paso: limpiar el input
    tareaInput.value = ''

})

