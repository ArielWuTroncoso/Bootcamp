

// this : se usa para llamar a los valores de las etiquetas de cada función
// etiquetas de definen con doble punto
//

const persona1 = {
        nombre: "Juan",
        edad: 30,
        saludar: function(){
        return `Hola, mi nombre es ${this.nombre},y tengo ${this.edad} años`
    }
}
    console.log(persona1.nombre)
    console.log(persona1.saludar())

    // node objetos_this_clases.js



const auto={
    
    color : "rojo",
    marca : "Toyota",
    velocidad : 0,

    aceleracion: function(){
    this.velocidad= this.velocidad + 10;
    return (`El ${this.marca} ${this.color} va a una velocidad de :${this.velocidad} km/h `)
    }
}

console.log(auto.aceleracion())
console.log(auto.aceleracion())
console.log(auto.aceleracion())


// Uso de clase para molder objetos y hacerlos óptimo la creación de multiple objetos que ocupen
// mismos atributos

class auto2{
    constructora(marca,color,kilometraje) {

        this.marca2= marca2,
        this.color2= color2,
        this.kilometraje2=kilometraje2
    }

    identificar(){
        return `Este auto ${this.marca2} color ${this.color2} tiene ${this.kilometraje2} kilómetros recorridos`
    }
}

const audi= new auto2("Audi","Negro",1000);
const mercedez= new auto2("Mercedez Benz","Verde",10000);
const volvo= new auto2("Volvo","amarillo",5000);

console.log(audi.identificar())
console.log(mercedez.identificar())
console.log(volvo.identificar())

 // node objetos_this_clases.js


        


