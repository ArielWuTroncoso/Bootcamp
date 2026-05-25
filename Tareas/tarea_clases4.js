
/*  


# Ejercicios Clases

### **1. Crea una clase Persona**

**Objetivo:** Abstraer una persona con sus propiedades básicas.

**Instrucciones:**

Crea una clase llamada Persona con las siguientes propiedades:

- nombre (string)
- edad (number)
- Agrega un método llamado saludar() que devuelva un string como: "Hola, me llamo Juan y tengo 30 años."

Instancia al menos una persona y llama al método saludar().
*/

class Persona{

    constructor(nombre,edad){// método para construir propiedades
        this.nombre= nombre;
        this.edad= edad;
    }

    saludar(){//métodos se declaran con "()" paréntesis 
        return (`Hola mi nombre es ${this.nombre} y tengo ${this.edad} años`)

    }

}

const ariel = new Persona("Ariel",32);//instanciamos un nuevo objeto
//En JavaScript “instanciar” significa crear un nuevo objeto usando el molde de una clase.

console.log(ariel.saludar())


//   node tarea_clases4.js
/*
### **2. Clase Rectángulo con área y perímetro**

**Objetivo:** Usar métodos para realizar cálculos.

**Instrucciones:**

Crea una clase Rectangulo que reciba ancho y alto como parámetros.

Agrega los métodos:

- calcularArea(): retorna el área.
- calcularPerimetro(): retorna el perímetro.

Instancia al menos dos rectangulos y aplica los métodos. 
*/
//   node tarea_clases4.js

class rectangulo {

    constructor(ancho,alto){
        this.alto=alto
        this.ancho=ancho
    
    }

    calculararea(){
        let areatotal = this.ancho*this.alto
        return(`el área del rectángulo es ${areatotal}`)
    }

    calcularperimetro(){
        let perimetrototal = this.ancho*2 + this.alto*2
        return(`El perímetro del rectángulo es ${perimetrototal}`)
    }
}

const rectangulo1 = new rectangulo(50,10);

const rectangulo2 = new rectangulo(100,10);

console.log(rectangulo1.calculararea())
console.log(rectangulo2.calcularperimetro())


//   node tarea_clases4.js
/*
### **3. Clase CuentaBancaria con métodos de depósito y retiro**

**Objetivo:** Simular un comportamiento realista.

**Instrucciones:**

Crea una clase CuentaBancaria con:

- titular (string)
- saldo (number, inicia en 0)
    
    Agrega métodos:
    
- depositar(cantidad)
- retirar(cantidad) (solo si hay saldo suficiente)
- verSaldo()

//   node tarea_clases4.js
Simula algunas transacciones.
*/

const prompt = require("prompt-sync")()
class cuentabancaria{

    constructor(titular,saldo){

        this.titular=titular
        this.saldo=saldo
    }

    menu(){
        console.log("Bienvenido a JAVA Bank")
        console.log("1) Depositar")
        console.log("2) Retirar")
        console.log("3) Saldo")
        console.log("4) Salir")

        let opcion;

        while(opcion !== 4){

            opcion = prompt("Ingrese su opción: ")
            switch(opcion){

                case 1:

            }
        }

    }


    depositar(){

        let montodeposito= Number(prompt("Ingrese monto a depositar : ")) 
        let deposito = this.saldo + montodeposito
        
        return (`Su saldo es: ${deposito} `)
    }

    retirar(){
        let retiro;
        let montoretiro= Number(prompt("Ingrese monto a retirar :"))  
        if(montoretiro > this.saldo){
            console.log("Saldo insuficiente")
        } else 
            retiro = this.saldo - montoretiro
            return (`Su saldo es: ${retiro} `)
    }

    versaldo(){
        return (`El saldo actual es: ${this.saldo}`)
    }
}

const Javier = new cuentabancaria("Javier Wood", 10000000)
const Pedro = new cuentabancaria("Pedro Piedra", 20000000)
const Julian = new cuentabancaria("Julian Toro", 30000000)


console.log(Javier.retirar())
console.log(Pedro.retirar())

//  node tarea_clases4.js

/*

### **4. Simula una tienda con una clase Tienda**

**Objetivo:** Practicar interacción entre clases.

**Instrucciones:**

Crea una clase Tienda que tenga:

- un nombre
- una lista de productos (array de objetos de la clase Producto)

Agrega métodos:

- agregarProducto(producto)
- mostrarInventario(): que liste todos los productos con su precio.
*/
//  node tarea_clases4.js


class Tienda{

    constructor(nombre, inventario = []){

        this.nombre = nombre;
        this.inventario = inventario;
    }

    agregarproducto(){

        let nombre = prompt("Ingrese nombre del producto: ");

        let precio = Number(prompt("Ingrese precio del producto: "));

        let nuevoProducto = new Producto(nombre, precio);

        this.inventario.push(nuevoProducto);
    }

    verinventario(){

        console.log("### INVENTARIO ###");

        for(let producto of this.inventario){

            console.log(`${producto.nombre} : $${producto.precio}`);
        }
    }
}

class Producto{

    constructor(nombre, precio){

        this.nombre = nombre;
        this.precio = precio;
    }
}

const tienda1 = new Tienda("Falabella");

tienda1.agregarproducto();

tienda1.agregarproducto();

tienda1.verinventario();


//  node tarea_clases4.js