package Abstracción;

class Ave extends Animal implements volador {
    String tamanio;

    public Ave (String nombre, int edad , String tamanio) {
        super(nombre,edad);
        this.nombre = nombre;
        this.tamanio=tamanio;
    }

    void hacerSonido(){
        System.out.println("fiuu fiuuu");
    }

    //Necesario colocar public en los método de interface
    public void vuela(){
        System.out.println("Esta volando...");
    }

    public void transportar(){
        System.out.println("Llevando ramitas y comida");
    }


}