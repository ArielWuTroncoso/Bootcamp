// Función mostrar frase
function mostrarFrase(datos){

    // Seleccionar contenedor
    const contenedor = document.querySelector('#frase')

    // Limpiar contenido anterior
    contenedor.innerHTML = ""

    // Crear frase
    const frase = document.createElement('h2')

    // Mostrar frase
    frase.textContent = datos.quote

    // Crear autor
    const autor = document.createElement('p')

    // Mostrar autor
    autor.textContent = "Autor: " + datos.author

    // Agregar elementos
    contenedor.appendChild(frase)

    contenedor.appendChild(autor)

}


// Seleccionar botón
const boton = document.querySelector('#btnFrase')


// Evento click
boton.addEventListener('click', () => {

    // Consumir API
    fetch('https://dummyjson.com/quotes/random')

        // Convertir JSON
        .then(response => response.json())

        // Obtener datos
        .then(datos => {

            // Mostrar frase
            mostrarFrase(datos)

        })

        // Capturar errores
        .catch(error => console.log(error))

})