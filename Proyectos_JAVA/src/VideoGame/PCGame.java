package VideoGame;

// AÑADIMOS extends PARA HEREDAR ATRIBUTOS Y MÉTODOS DE LA CLASE PADRE VideoGame
public class PCGame extends VideoGame {

    // ATRIBUTO NUEVO EXCLUSIVO DE LA CLASE HIJA
    private String requisitosMinimos;

    // CONSTRUCTOR DE LA CLASE HIJA PCGame
    public PCGame(String nombre, String genero,
                  int precio, String requisitosMinimos) {

        // MEDIANTE super LLAMAMOS AL CONSTRUCTOR DE LA CLASE PADRE VideoGame
        // PARA INICIALIZAR LOS ATRIBUTOS HEREDADOS:
        // nombre, genero y precio
        super(nombre, genero, precio);

        // MEDIANTE this GUARDAMOS EL VALOR RECIBIDO
        // EN EL ATRIBUTO DEL OBJETO ACTUAL
        this.requisitosMinimos = requisitosMinimos;
    }

    @Override
    public void showInfo() {

        // MEDIANTE @Override SOBRESCRIBIMOS EL MÉTODO showInfo()
        // HEREDADO DE LA CLASE PADRE

        // MEDIANTE super.showInfo() REUTILIZAMOS EL MÉTODO
        // DE LA CLASE PADRE VideoGame
        // MOSTRANDO nombre, genero y precio
        super.showInfo();

        // MOSTRAMOS EL ATRIBUTO EXCLUSIVO DE PCGame
        System.out.println("Requisitos mínimos: " + requisitosMinimos);
    }
}