

const inputpedidos = document.querySelector("#pedidos")
const botoningresar = document.querySelector("#boton")
const contenedor = document.querySelector("#contenedor_post")


function publicarpedido(pedido){

    console.log("Valor recibido:", pedido);
    const divposteo = document.createElement("div")
    divposteo.classList.add("classdivposteo")

    const titulopedido = document.createElement("h4")
    titulopedido.classList.add("classtitulopedido")

    titulopedido.textContent = pedido;

    const botonborrar = document.createElement("button");
    //añadimo un contenido de texto al botón creado (botonborrar)
    botonborrar.textContent="Borrar";
    botonborrar.classList.add("classborrar");

    botonborrar.addEventListener("click",function(){

        divposteo.remove()
    })
    // aqui añadimos 1ro al div: el titulopedido y botonborrar. Para luego añadir el div al contenedor creado en HTML
    divposteo.appendChild(titulopedido);
    divposteo.appendChild(botonborrar);
    contenedor.appendChild(divposteo);
}
    //aquí comienza la pre función para actiar la función principal(publicarpedido()) 
    //con la accion de hacer click en el boton ingresar

botoningresar.addEventListener("click",function(){

        event.preventDefault()

        nombrepedido = inputpedidos.value
        
        if (nombrepedido === ""){
        alert("No es válido, intente nuevamente")
        return

        }else publicarpedido(nombrepedido)


})

    inputpedidos.value= ""


