package Encapsulacion;

public class main {
    public static void main(String[] args) {
        var persona1 = new Persona ("Juan", 30,"15525444");
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        persona1.setNombre ("Maria");
        persona1.setEdad (50);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());}}