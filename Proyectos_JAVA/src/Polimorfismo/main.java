package Polimorfismo;


public class main {
    public static void main(String[] args) {

        var gatito = new Gato("Belinda",5,"\nNaranjo");
        System.out.println(gatito.nombre + " color: " + gatito.color );
        gatito.comer();
        gatito.hacerSonido();


        var perrito = new Perro( "Jack" , "terrier" ,3 );
        var animalito = new Animal("Morro", 5);


        System.out.println(perrito.nombre +" raza: " + perrito.raza+" edad: " + perrito.edad);
        System.out.println(animalito.nombre +" edad: "+ animalito.edad);
        perrito.hacerSonido();
        animalito.comer();
    }
}