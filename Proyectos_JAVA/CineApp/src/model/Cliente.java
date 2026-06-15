package model;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Persona {

    private List<Entrada> historialEntradas;

    public Cliente(String nombreCompleto) {
        super(nombreCompleto);

        // cada cliente guarda sus propias entradas compradas
        this.historialEntradas = new ArrayList<>();
    }


    public List<Entrada> getEntradasCompradas() {
        return historialEntradas;
    }

    public void guardarEntrada(Entrada nuevaEntrada) {
        // cuando compra una entrada, se agrega a su historial
        historialEntradas.add(nuevaEntrada);
    }


    public void imprimirEntradas() {
        // si no tiene compras, no se intenta mostrar una lista vacía
        if (historialEntradas.isEmpty()) {
            System.out.println("El cliente todavía no tiene entradas compradas.");
            return;
        }

        System.out.println("\n=== Entradas de " + getNombre() + " ===");

        // se recorre todo lo que compró el cliente
        for (Entrada entrada : historialEntradas) {
            entrada.imprimirResumen();
            System.out.println("------------------------------");
        }
    }
}