const prompt = require("prompt-sync")();

    // node Calculando.js

let calculadora= {



     


    suma:function(num1,num2){
        return (num1 + num2)

    },

    resta:function(num1,num2){
        return (num1-num2)

    },

    multiplicación:function(num1,num2){
        return (num1*num2)

    },

    división:function(num1,num2){
        if (num2 == 0){
            console.log("Ingrese un valor superior a cero")

        }else return (num1/num2)
    },


    pedirnumero: function(){

        let num = parseInt(prompt(("ingrese un número: ")));
        if(isNaN (num)){
            console.log("Ese no es un número, ingrese otra vez")
        } else return num;
        
    },

    ejecutartarea:function(operacion){

         let num1 = calculadora.pedirnumero()
        let num2 = calculadora.pedirnumero()
        let resultado = operacion(num1,num2);
        return console.log("resultado: ",resultado);

    },

    menu: function(){

        while(true){

         console.log("#### Calculadora ####")
            console.log("1) SUMAR")
            console.log("2) RESTAR")
            console.log("3) MULTIPLICAR")
            console.log("4) DIVIDIR")
            console.log("5) SALIR")

            let resultado;

            let opcion=parseInt(prompt("Ingrese su opción: "));

            switch(opcion){

                case 1:
                    calculadora.ejecutartarea(this.suma)
                    break
                case 2:
                    calculadora.ejecutartarea(this.resta)
                    break
                case 3:
                    calculadora.ejecutartarea(this.multiplicación)
                    break
                case 4:
                    calculadora.ejecutartarea(this.división)
                    break
                case 5:
                    return console.log("Saliendo")
            }
            }

    },

 
    // node Calculando.js

}

calculadora.menu();