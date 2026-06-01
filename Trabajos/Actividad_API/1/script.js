// Función para mostrar personajes
function mostrarDatos(personaje){

    // Selecciona el contenedor HTML
    const contenedorPosts = document.querySelector('#posts')

    // Crear tarjeta
    const tarjeta = document.createElement('div')

    // Crear nombre
    const nombre = document.createElement('h2')

    // Asignar nombre personaje
    nombre.textContent = personaje.name

    // Crear imagen
    const imagen = document.createElement('img')

    // URL imagen
    imagen.src = personaje.image

    // Tamaño imagen
    imagen.width = 200

    // Crear estado
    const estado = document.createElement('p')

    // Texto estado
    estado.textContent = "Estado: " + personaje.status

    // Agregar elementos a tarjeta
    tarjeta.appendChild(nombre)

    tarjeta.appendChild(imagen)

    tarjeta.appendChild(estado)

    // Mostrar tarjeta en HTML
    contenedorPosts.appendChild(tarjeta)

}


// Seleccionar botón
const boton = document.querySelector('#btnPersonaje')


// Evento click
boton.addEventListener('click', () => {

    // Consumir API
    fetch('https://rickandmortyapi.com/api/character')

        // Convertir respuesta a JSON
        .then(respuesta => respuesta.json())

        // Obtener datos
        .then(datos => {

            // Recorrer personajes
            datos.results.forEach(personaje => {

                // Mostrar personaje
                mostrarDatos(personaje)

            })

        })

        // Mostrar errores
        .catch(error => console.log(error))

})