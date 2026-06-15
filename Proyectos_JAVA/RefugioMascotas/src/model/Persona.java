package model;

public abstract class Persona {//CREANDO ATRIBUTO EN CLASE ABSTRACTA MÁS HERENCIA
    protected String nombre;

    public Persona(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {//CREANDO GETTER PARA USAR ATRIBUTO EN OTROS PAQUETES
        return nombre;
    }
}