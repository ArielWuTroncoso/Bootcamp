// Función mostrar usuario
function mostrarUsuario(usuario){

    // Contenedor HTML
    const contenedor = document.querySelector('#usuario')

    // Crear nombre
    const nombre = document.createElement('h2')

    // Asignar nombre
    nombre.textContent = usuario.name

    // Crear email
    const email = document.createElement('p')

    // Mostrar email
    email.textContent = "Email: " + usuario.email

    // Crear teléfono
    const telefono = document.createElement('p')

    // Mostrar teléfono
    telefono.textContent = "Teléfono: " + usuario.phone

    // Agregar elementos
    contenedor.appendChild(nombre)

    contenedor.appendChild(email)

    contenedor.appendChild(telefono)

}


// Consumir API automáticamente
fetch('https://jsonplaceholder.typicode.com/users/1')

    // Convertir JSON
    .then(response => response.json())

    // Obtener datos
    .then(datos => {

        // Mostrar usuario
        mostrarUsuario(datos)

    })

    // Mostrar errores
    .catch(error => console.log(error))