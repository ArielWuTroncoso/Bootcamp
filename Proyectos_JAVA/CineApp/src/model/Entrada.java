package model;

public class Entrada {

    private Cliente comprador;
    private Funcion funcionElegida;
    private int asientoAsignado;


    public Entrada(Cliente comprador, Funcion funcionElegida, int asientoAsignado) {
        this.comprador = comprador;
        this.funcionElegida = funcionElegida;
        this.asientoAsignado = asientoAsignado;
    }

    public Cliente getCliente() {
        return comprador;
    }


    public Funcion getFuncion() {
        return funcionElegida;
    }

    public int getNumeroAsiento() {
        return asientoAsignado;
    }


    public void imprimirResumen() {
        System.out.println("Cliente: " + comprador.getNombre());
        System.out.println("Película: " + funcionElegida.getPelicula().getTitulo());
        System.out.println("Horario: " + funcionElegida.getHorario());
        System.out.println("Asiento: " + asientoAsignado);
    }
}