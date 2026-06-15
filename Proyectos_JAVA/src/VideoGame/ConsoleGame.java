package VideoGame;

// AÑADIMOS extends PARA HEREDAR ATRIBUTOS Y MÉTODOS DE LA CLASE PADRE VideoGame
public class ConsoleGame extends VideoGame {

    // ATRIBUTO NUEVO EXCLUSIVO DE LA CLASE HIJA
    private String consolaCompatible;

    // CONSTRUCTOR DE LA CLASE HIJA ConsoleGame
    public ConsoleGame(String nombre, String genero,
                       int precio, String consolaCompatible) {

        // MEDIANTE super LLAMAMOS AL CONSTRUCTOR DE LA CLASE PADRE VideoGame
        // PARA INICIALIZAR LOS ATRIBUTOS HEREDADOS:
        // nombre, genero y precio
        super(nombre, genero, precio);

        // MEDIANTE this GUARDAMOS EL VALOR RECIBIDO
        // EN EL ATRIBUTO DEL OBJETO ACTUAL
        this.consolaCompatible = consolaCompatible;
    }

    @Override
    public void showInfo() {

        // MEDIANTE super.showInfo() REUTILIZAMOS EL MÉTODO
        // DE LA CLASE PADRE VideoGame
        // MOSTRANDO nombre, genero y precio
        super.showInfo();

        // MOSTRAMOS EL ATRIBUTO EXCLUSIVO DE ConsoleGame
        System.out.println("Consola compatible: " + consolaCompatible);
    }
}