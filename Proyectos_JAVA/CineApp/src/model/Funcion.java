package model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private Pelicula peliculaEnSala;
    private String horaFuncion;
    private int cuposSala;

    private List<Entrada> entradasEmitidas;


    public Funcion(Pelicula peliculaEnSala, String horaFuncion, int cuposSala) {
        this.peliculaEnSala = peliculaEnSala;
        this.horaFuncion = horaFuncion;
        this.cuposSala = cuposSala;
        this.entradasEmitidas = new ArrayList<>();
    }

    public Pelicula getPelicula() {
        return peliculaEnSala;
    }

    public String getHorario() {
        return horaFuncion;
    }

    public int getTotalAsientos() {
        return cuposSala;
    }


    public List<Entrada> getEntradasEmitidas() {
        return entradasEmitidas;
    }

    public int contarAsientosLibres() {
        // disponibles = capacidad total menos lo que ya se vendió
        return cuposSala - entradasEmitidas.size();
    }

    public boolean quedanAsientos() {
        return contarAsientosLibres() > 0;
    }


    public boolean estaOcupado(int asientoConsultado) {
        // revisa una por una las entradas ya vendidas
        for (Entrada entrada : entradasEmitidas) {
            if (entrada.getNumeroAsiento() == asientoConsultado) {
                return true;
            }
        }

        return false;
    }

    public boolean asientoExiste(int asientoConsultado) {
        // evita que pidan asientos fuera de la sala
        return asientoConsultado >= 1 && asientoConsultado <= cuposSala;
    }


    public boolean registrarVenta(Entrada entrada) {
        // acá se valida que la venta tenga sentido antes de guardarla
        if (!quedanAsientos()) {
            return false;
        }

        if (!asientoExiste(entrada.getNumeroAsiento())) {
            return false;
        }

        if (estaOcupado(entrada.getNumeroAsiento())) {
            return false;
        }

        // si pasó todas las validaciones, recién se guarda
        entradasEmitidas.add(entrada);
        return true;
    }

    public void imprimirDetalleFuncion() {
        System.out.println("Película: " + peliculaEnSala.getTitulo()
                + " | Horario: " + horaFuncion
                + " | Capacidad: " + cuposSala
                + " | Disponibles: " + contarAsientosLibres());
    }
}