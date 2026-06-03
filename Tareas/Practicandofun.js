

// calculadora con objeto y métodos:
const prompt=require("prompt-sync")();
let calculadora ={

    

    menu : function(){


        console.log("#### Calculadora ####")
            console.log("1) SUMAR")
            console.log("2) RESTAR")
            console.log("3) MULTIPLICAR")
            console.log("4) DIVIDIR")
            console.log("5) SALIR")

            let opcion;
            let resultado;


        while(opcion !== 5){
           
            opcion= Number(prompt("Ingrese su elección: "))

            switch(opcion){

                case 1: 
                this.ejecutar(this.suma)
                break
                case 2: 
                this.ejecutar(calculadora.resta)
                
                break
                case 3: 
                this.ejecutar(calculadora.multi)
                break
                case 4: 
                this.ejecutar(calculadora.division)
                break
                case 5: 
                return console.log("Saliendo del programa...")
                break
                default:
                    console.log("Opción inválida")

            }
        }
    
    },

    

    ejecutar: function(operacion){
        let num1 =calculadora.pedirnumero()
        let num2 =calculadora.pedirnumero()
        let resultado = operacion(num1, num2) 
        /* !!!! Aquí haré de un parámetro una función (suma,resta...)
            Para cuando le asigne mi función matemática al parámetro "operación" de la f
            "ejecutar" ya tener sus parámetros (num1,num2) con valores. 
            Es como dejar el molde listo para usar la f suma,resta,multi... Pero en un parámetro
        ) */
        return console.log(`El resultado es ${resultado}`) 
        // Return hace que al llamar a la función, 
        //esta me entregue el valor que le asigne a return.
    },
    pedirnumero: function(num1,num2){
        let numero = Number(prompt("Ingrese un número : "));
        if ( !isNaN (numero)){
            return numero// con return cada vez que llame la funcion, me entregara el nro 
        }else {console.log("Ese no es un número")}
    },

    suma: function(num1,num2){
        return num1 + num2

    },

    resta: function(num1,num2){
        return num1 - num2

    },
     multi: function(num1,num2){
        return num1 * num2

    },

     division: function(num1,num2){
        if (num2 === 0){
            console.log("¡Error! No se puede dividir por cero")

        }else return num1/num2
    },
    
    
}

calculadora.menu(); // va sin console.log porque no retorna un texto ni variable, son objeto y funcion


//  node practicandofun.js