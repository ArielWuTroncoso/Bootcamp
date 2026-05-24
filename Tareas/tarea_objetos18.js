/* 
19/5/26, 22:17 Ejercicios Objetos
https://righteous-baron-17e.notion.site/Ejercicios-Objetos-3654db47a255802b9dfdc25d40a927e8 1/2


Aquí tienes una lista de 18 ejercicios para practicar objetos en JavaScript. Estos
ejercicios te ayudarán a mejorar tus habilidades de programación orientada a objetos
en JavaScript,
  */

//1. Crea un objeto "persona" con propiedades como nombre, edad y género.
let persona = {
    nombre : "Ariel",
    edad : 32,
    género : "masculino"
}

console.log(`Mi nombre es ${persona.nombre} tengo ${persona.edad} años y pertenezco al género ${persona.género}`);


// node tarea_objetos18.js


//2. Agrega un método al objeto "persona" que imprima su información en la consola.

let persona2 = {
    nombre : "Ariel",
    edad : 32,
    género : "masculino",

    saludar: function(){
        return `Hola soy ${this.nombre} tengo ${this.edad} años, y pertenezco al género ${this.género}`
    }
}

console.log(persona2.nombre);
console.log(persona2.saludar());



//3. Crea un objeto "libro" con propiedades como título, autor y año de publicación.

let libro ={
    título: "Las mil caras del héroe",
    autor: "Joseph Campbell",
    año: "1949",

//4. Agrega un método al objeto "libro" que muestre la información completa del libro.
    infolibro : function(){
        return `Título del libro escogido es ${this.título}, su autor es ${this.autor}, y se publicó el año ${this.año}.`


    }
}
console.log(libro.infolibro());
console.log(Object.entries(libro));//agregado especial por mí cuenta para ver toda la info en matriz

// node tarea_objetos18.js


//5. Crea un objeto "cuenta bancaria" con propiedades como saldo y titular de la cuenta.
const prompt=require("prompt-sync")()

let cuentabancaria ={ //El objeto se crea cómo variable con llaves {} y sigo igual =
    saldo : 10000000,
    titular: "Ariel Wu",

    //6. Agrega métodos al objeto "cuenta bancaria" para depositar y retirar dinero.
    operacion : function(){ //Un método se crea cómo una variable usando doble punto e invocando function(){}
        let opcion;
        while (opcion != 3){
            console.log("1. Depositar dinero");
            console.log("2. Retirar dinero");
            console.log("3. Salir");


            let num1=0;
            opcion = parseInt(prompt("Ingrese una opción: "))
            if (isNaN(opcion)) { //manera de describir que no es un número NaN (not a number)
            console.log("Opción inválida (no es un número)");
            continue;
}
            
            switch(opcion){
                case 1:{
                    console.log("Saldo actual: ");
                    console.log(cuentabancaria.saldo);
                    num1=Number(prompt("Ingrese cantidad a depositar: "));
                    this.saldo= this.saldo + num1;
                    console.log(`Su saldo actualizado es: ${this.saldo}`);
                    break
                }
            
                case 2:{
                    console.log("Saldo actual: ");
                    console.log(cuentabancaria.saldo);
                    num1=Number(prompt("Ingrese cantidad a retirar: "));
                    if(this.saldo < num1){
                        console.log(`Cantidad supera el máximo disponible`)
                        
                    }else {
                        this.saldo = this.saldo- num1;
                        console.log(`Su saldo actualizado es: ${this.saldo}`);
                        break
                    }   
                }
                
            }    
            

        }
    }
}
cuentabancaria.operacion();

// node tarea_objetos18.js


//7. Crea un objeto "rectángulo" con propiedades de longitud y ancho.

let rectangulo = { 

    longitud : 50,
    ancho: 30,
    area:0,

 //8. Agrega un método al objeto "rectángulo" que calcule el área del rectángulo.   

    sacandoarea : function(){
        area= this.ancho * this.longitud;
        return(`El área del rectángulo es: ${area}`);
        // para hacer funcionar una acción en consola, debemos usar return 
    }
    
}
console.log(rectangulo.sacandoarea()); 
//invocar un método lleva punto (.) después del objeto y doble paréntesis



// node tarea_objetos18.js

//9. Crea un objeto "círculo" con propiedades de radio.

let circulo={
    radio: 50, //simpre debe ir una coma SI, no es la última etiqueta del objeto y doble punto para definir
    pi:3.14,
    areacircle:0,
 //10. Agrega un método al objeto "círculo" que calcule el área del círculo. (A=pi*r^2)

    areacirculo:function(){

        areacircle = this.pi* this.radio* this.radio//al usar variable dentro de método, usar signo igual =

        return `El área del círculo cuyo radio es ${this.radio}, es ${areacircle}`// una variable no 
        //necesita usar .this, ya que eso sólo es para etiquetas (propiedades)
    } 
}
console.log(circulo.areacirculo());

/*

console.log("########################################################");
// node tarea_objetos18.js

//11. Crea un objeto "estudiante" con propiedades como nombre, edad y lista de materias.

let estudiante ={
    nombre: "Ariel",
    edad: 32,
    materiales:["cuaderno","lapizazul","lapiznegro","marcador"],

    //12. agrega un método para agregar y quitar elementos de la lista

    editarlista: function(){
        console.log("#### Bienvenido a su lista de materiales ####")
        console.log("¿Que de desea hacer en la lista? ")
        console.log("1. Ver lista")
        console.log("2. Agregar un elemento a la lista")
        console.log("3. Quitar un elemento a la lista")
        console.log("4. Salir")
        let consulta; //Para definir variable sin valor, no usar el signo igual "="

        while(consulta !== "4"){ //ciclo while sólo debe ir dentro de un método(o función) y no en un objeto
            consulta = prompt("Escribir opción : ")// no usar let pq ya fue declarada fuera del ciclo
            switch(consulta){
                case "1": //case van con doble punto ":"
                    console.log(estudiante.materiales)
                    break

                case "2": 
                    console.log(estudiante.listamas())
                    break

                case "3":
                    console.log(estudiante.listamenos())
                    break
                case "4":
                    console.log(`Saliendo del programa "Estudiante"`)
                    break
                }
        }    

    },

    listamas: function(){
        let agregar=(prompt("Escribe el material para agregar a la lista: "))
        return this.materiales.push(agregar)

    }, //para agregar otro método dsps de otro más, debemos respetar el uso de comas "," 
    //aunque tengamos la llave cerrada "}"

    listamenos: function(){

        let quitar=(prompt("Escribe el material a quitar de la lista: "))
        let indice= this.materiales.indexOf(quitar)
        if (indice !== -1){
            this.materiales.splice(indice,1)
        }
        return console.log(estudiante.materiales);
    }
    
}

console.log(estudiante.editarlista())


// node tarea_objetos18.js

//13. Crea un objeto "tienda en línea" con propiedades como nombre de la tienda y lista de productos.

let tiendaenlinea ={
    nombretienda: "Shopping",
    listaproducto:[ "zapatos","zapatillas","poleras","pantalones","gorros"],

    //14. Agrega métodos al objeto "tienda en línea" para agregar y eliminar productos.

    verproductos: function(){
        return console.log(tiendaenlinea.listaproducto)
        
    },

    agregarproductos: function(){
        let sumarproductos=prompt("Ingrese el producto a agregar: ")
        return this.listaproducto.push(sumarproductos),console.log(this.listaproducto)
        // return devuelve un valor o acción, no permite visualizar en consola.
        //para ello podríamos agregar un return + console.log, y para realizar dos
        //acciones de return, agregar la coma ","
    },

    quitarproductos: function(){
        let restarproductos=prompt("Ingrese el producto a quitar: ")
        let indice2= this.listaproducto.indexOf(restarproductos)
        if (indice2 !== -1){ //el if esta pq sino encuentra el elemento me borra el último de la lista
            this.listaproducto.splice(indice2,1)
        }

        return console.log(this.listaproducto)
    },

    menutienda:function(){
        console.log(
            `##### Bienvenido al inventario de tienda ${this.nombretienda} #####`)

        console.log("1) Mostrar lista")
        console.log("2) Añadir elemento")
        console.log("3) Quitar elemento")
        console.log("4) Salir")

        let opcion2;
        while(opcion2 !==4 ){
            opcion2=Number(prompt("Ingrese una opción: "))

            switch(opcion2){
                case 1:
                    console.log(tiendaenlinea.verproductos())
                    break
                case 2:
                    console.log(tiendaenlinea.agregarproductos())
                    break
                case 3:
                    console.log(tiendaenlinea.quitarproductos())
                    break
            }
        }

    }
    
}
console.log(tiendaenlinea.menutienda());
// siempre que queramos ver algo para la consola, ya sea en el código, o dentro de funciones
// debemos usar el console.log, return es sólo para devolver algo dentro de la función o código.
*/

// node tarea_objetos18.js

//15. Crea un objeto "playlist" con propiedades como nombre y lista de canciones.
// versión larga sin uso de propiedad en funciones


/*
let playlist ={
    grupo: "Oasis",
    listaoasis:["stand by me", "wonderwall","supersonic"],
    artista: "michael jackson",
    listajackson:["beat it","billie jean","smooth criminal"],

    //16. Agrega métodos al objeto "playlist" para agregar y eliminar canciones.

    escogerlista: function(){
        let opcionlista;
        let opcioncancion;
        console.log("#### Bienvenido a sus playlist #### ")
        console.log("Listas disponibles: ")
        console.log("1)" , this.grupo)
        console.log("2)" , this.artista)
        
        while(opcionlista !== 3){
            opcionlista =Number(prompt("Seleccione lista: "))
            switch(opcionlista){
                case 1:{ //agregar funcion escogercancion y agregar/quitar cancion en cada decisión
                console.log(this.listaoasis)
                console.log(playlist.escogercancion())
                break
                
                }case 2:{
                console.log(this.listajackson)
                console.log(playlist.escogercancion2())
                break
                }case 3:{
                console.log("Saliendo")
                break
                }
            }
        
    }
    },


     escogercancion: function(){
        console.log("### Menú lista ### :")
        console.log("1) Añadir cancion")
        console.log("2) Quitar cancion")
        console.log("3) Salir")
    
        
        let opcionmenu;
        while(opcionmenu !==3){
            opcionmenu =Number(prompt("Seleccionar opción: "))
            switch(opcionmenu){

                case 1:
                    console.log(playlist.agregaroasis())
                    break
                case 2:
                    console.log(playlist.quitaroasis())
                    break
                case 3:
                    console.log("Saliendo")
                    break

            }
        }
        },

         
    escogercancion2: function(){
        console.log("### Menú lista ### :")
        console.log("1) Añadir cancion")
        console.log("2) Quitar cancion")
        console.log("3) Salir")
    
        
        let opcionmenu2;
        while(opcionmenu2 !==3){
            opcionmenu2 =Number(prompt("Seleccionar opción: "))
            switch(opcionmenu2){

                case 1:
                    return console.log(playlist.agregarjackson())
                    break
                case 2:
                    return console.log(playlist.quitarjackson())
                    break
                case 3:
                    return console.log("Saliendo")
                    break

            }
        }
        },

    agregaroasis:function(){
        let ingresarcancion= prompt("Ingrese la nueva canción: ")
        return this.listaoasis.push(ingresarcancion),console.log(this.listaoasis)
            
    },

     quitaroasis:function(){
        let quitarcancion= prompt("Ingrese la canción a eliminar: ")
        return quitar =this.listaoasis.indexOf(quitarcancion),this.listaoasis.splice(quitar,1),console.log(this.listaoasis)
        
            
    }, 

     agregarjackson:function(){
        let ingresarcancion2= prompt("Ingrese la nueva canción: ")
        return this.listajackson.push(ingresarcancion2), console.log(this.listajackson)
            
            
    },

  

     quitarjackson:function(){
        let quitarcancion2= prompt("Ingrese la canción a eliminar: ")
        return quitar2=this.listajackson.indexOf(quitarcancion2),this.listajackson.splice(quitar2,1),console.log(this.listajackson)
        
    },

}


console.log(playlist.escogerlista())

*/




// versión corta de playlist, usando propiedad de funciones



let playlist = {

    grupo: "Oasis",

    listaoasis: [
        "stand by me",
        "wonderwall",
        "supersonic"
    ],

    artista: "Michael Jackson",

    listajackson: [
        "beat it",
        "billie jean",
        "smooth criminal"
    ],

    escogerlista: function () {

        let opcionlista = 0;

        while (opcionlista !== 3) {

            console.log("\n#### Bienvenido a sus playlist ####");
            console.log("1)", this.grupo);
            console.log("2)", this.artista);
            console.log("3) Salir");

            opcionlista = Number(prompt("Seleccione lista: "));

            switch (opcionlista) {

                case 1:
                    console.log(this.listaoasis);
                    this.menuCanciones(this.listaoasis);//aqui además de mostrar mi lista seleccionada
                    //agrego la función que tiene el menú de agregar y quitar, y reemplazo (lista)
                    //por mi lista indicada, asigno mi lista al parámetro lista, que es neutral.
                    break;

                case 2:
                    console.log(this.listajackson);
                    this.menuCanciones(this.listajackson);
                    break;

                case 3:
                    console.log("Saliendo...");
                    break;

                default:
                    console.log("Opción inválida");
            }
        }
    },

    menuCanciones: function (lista) {

        let opcion = 0;

        while (opcion !== 3) {

            console.log("\n### MENÚ CANCIONES ###");
            console.log("1) Añadir canción");
            console.log("2) Quitar canción");
            console.log("3) Salir");

            opcion = Number(prompt("Seleccione opción: "));

            switch (opcion) {

                case 1:
                    this.agregarCancion(lista);
                    break;

                case 2:
                    this.quitarCancion(lista);
                    break;

                case 3:
                    console.log("Volviendo...");
                    break;

                default:
                    console.log("Opción inválida");
            }
        }
    },

    agregarCancion: function (lista) {

        let nueva = prompt("Ingrese nueva canción: ");

        lista.push(nueva);

        console.log(lista);
    },

    quitarCancion: function (lista) {

        let eliminar = prompt("Ingrese canción a eliminar: ");

        let indice = lista.indexOf(eliminar);

        if (indice !== -1) {

            lista.splice(indice, 1);

            console.log("Canción eliminada");

        } else {

            console.log("Canción no encontrada");
        }

        console.log(lista);
    }
};

playlist.escogerlista();

// node tarea_objetos18.js

//17. Crea un objeto "calculadora" con métodos para realizar operaciones matemáticas básicas (suma, resta, multiplicación, división).

let calculadora={

    menu :function(){
        console.log(`#### Calculadora ####`)
        console.log(`1- Sumar dos números`)
        console.log(`2- Restar dos números`)
        console.log(`3- Multiplicar dos números`)
        console.log(`4- Dividir dos números`)
        console.log(`5 -Salir`)
        let opcion;
        while(opcion !== 5 ){
            opcion=Number(prompt("Seleccione una opción: "))
            switch(opcion){
                case 1:
                    resultado= this.ejecucion(this.suma),
                    console.log(resultado)
                    break
                case 2:
                    resultado= this.ejecucion(this.resta),
                    console.log(resultado)
                    break
                case 3:
                    resultado=this.ejecucion(this.multiplicar),
                    console.log(resultado)
                    break
                case 4:
                    resultado=this.ejecucion(this.division),
                    console.log(resultado)

                

            }
        }

    },

    introducirnumero:function(){
        let numero;
        while(true){
        numero=Number(prompt("Ingrese el número: "))
        if (!isNaN(numero) ){
            return numero

        }else{ console.log("Debe ingresar un número")}
    }
    },


    ejecucion:function(operacion){
        let num1= Number(this.introducirnumero())
        let num2= Number(this.introducirnumero())
        let resultado;
        resultado =operacion(num1,num2)
        /* !!!! Aquí haré de un parámetro una función (suma,resta...)
            Para cuando le asigne mi función matemática al parámetro "operación" de la f
            "ejecutar" ya tener sus parámetros (num1,num2) con valores. 
            Es como dejar el molde listo para usar la f suma,resta,multi... Pero en un parámetro
        ) */
        return resultado
    },

    
    suma:function(num1,num2){
        return num1 + num2

    },
    resta:function(num1,num2){
        return num1-num2
    },

    multiplicar:function(num1,num2){
        return num1*num2
    },

    division:function(num1,num2){
        
        if (num2 === 0){
            console.log("¡Error! No se puede dividir por cero")

        }else return num1/num2
    },
    
}

calculadora.menu()


// node tarea_objetos18.js

//18. Crea un objeto "equipo de fútbol" con propiedades como nombre del equipo y lista de jugadores.


// node tarea_objetos18.js

let equipo_de_futbol={

    colocolo:["Ariel", "Diego", "Jaime", "Carlos", "Pablo","Martin"],
}

console.log("Jugadores del equipo Club deportivo Colo Colo :")
console.log(equipo_de_futbol.colocolo);

// node tarea_objetos18.js