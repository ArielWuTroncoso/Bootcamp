
function mostrarDatos (title){
const contenedorPosts = document.querySelector('#posts')
const desordenadaLista = document.createElement('ul')
const itemLista = document.createElement('li')
itemLista.textContent = title
desordenadaLista.appendChild(itemLista)
contenedorPosts.appendChild(desordenadaLista)

}

//Usando .then y .catch
/*  
fetch('https://jsonplaceholder.typicode.com/posts') //api que provee datos 
.then (response => response.json())
.then(datos => {
    datos.forEach(dato => {
    mostrarDatos (dato.title)
    });
})
.catch(error => console.log(error))

*/

//USANDO async - try - catch
/*  
async function fetchPosts(){
    try{
        const response = await fetch('https://jsonplaceholder.typicode.com/posts')
        const datos = await response.json()
        
        datos.forEach(dato => {
            mostrarDatos(dato.title)
            console.log(dato.title)
        });
    } catch (error) {
        console.log(error)
}
}

fetchPosts();
*/

//Ahora async- try - catch con ingreso de cantidad de datos mostrados:

let cantidad = Number(prompt("Ingrese la cantidad de datos: "))
async function fetchPosts(){
    try{
        const response = await fetch('https://jsonplaceholder.typicode.com/posts')
        const datos = await response.json()
        for (let i=0 ; i < cantidad; i++){
            const dato = datos[i]
            mostrarDatos(dato.title)
        }
    } catch (error) {
        console.log(error)
}}
fetchPosts()


/*
// USANDO axios
axios.get('https://jsonplaceholder.typicode.com/posts')
.then(response => {
    const datos = response.data
    datos.forEach(dato => {
    mostrarDatos (dato.title)
    });
    }) .catch(error => console.log(error))

  */
