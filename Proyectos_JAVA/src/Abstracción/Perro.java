package Abstracción;

class Perro extends Animal {

    // Atributos
    public String nombre;
    public String raza;
    public Perro (String nombre,String raza, int edad){
        super(nombre,edad);
        this.nombre = nombre;
        this.raza = raza;
    }

    public void comer(){
        System.out.println("Esta comiendo...");
    }

    @Override
    void hacerSonido(){
        System.out.println("Guau");
    }
    }