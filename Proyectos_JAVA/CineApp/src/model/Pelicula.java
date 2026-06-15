package model;


public class Pelicula {
    private String titulo;
    private int minutosDuracion;

    public Pelicula(String titulo, int minutosDuracion) {
        this.titulo = titulo;
        this.minutosDuracion = minutosDuracion;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return minutosDuracion;
    }


    public void imprimirFicha() {
        System.out.println("Película: " + titulo + " | Duración: " + minutosDuracion + " min");
    }
}