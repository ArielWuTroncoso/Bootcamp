package Encapsulacion;
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private final String RUT; //final igual a constante, profe cambia a RUT en mayus para diferenciar la constante
    private String correo;

    // Constructor
    public Persona (String nombre, int edad, String rut) {
        this.nombre = nombre;
        setEdad(edad);
        this.RUT= rut; // Se cambió atributo a mayus, pero se le asigna variable en minuscula
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRUT() {
        return RUT;
    }

    public void setEdad(int edad) {
        if(edad > 0) {
            this.edad=edad;

    }




    }}

