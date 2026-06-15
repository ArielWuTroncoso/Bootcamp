package Abstracción;


public class main {
    public static void main(String[] args) {

        var gatito = new Gato("Belinda",5,"\nNaranjo");
        System.out.println(gatito.nombre + " color: " + gatito.color );
        gatito.comer();
        gatito.hacerSonido();


        var perrito = new Perro( "Jack" , "terrier" ,3 );


        System.out.println(perrito.nombre +" raza: " + perrito.raza+" edad: " + perrito.edad);
        perrito.hacerSonido();


        var cuervo = new Ave("crow",3,"adulto");
        System.out.println("Nombre: "+cuervo.nombre
                +" edad: "+ cuervo.edad
                +" tamaño: "+ cuervo.tamanio);

        cuervo.vuela();
        cuervo.transportar();

        // Al def. un objeto o lista usamos String, int que tambien son una interface
        // list <Strig> Lista1 = new Arraylist <>();
        //Al crear objeto con interface "volador" le indicamos que es de tipo "Volador" en vez de var o String o int

        volador pajarito2 = new Ave("gallo",5,"adulto");
        pajarito2.transportar();



    }
}