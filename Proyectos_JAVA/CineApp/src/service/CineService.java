package service;

import model.Cliente;
import model.Entrada;
import model.Funcion;
import model.Pelicula;
import model.Persona;

import util.InputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CineService {

    private List<Persona> agendaPersonas;
    private List<Funcion> funcionesActivas;
    private Scanner teclado;


    public CineService() {
        this.agendaPersonas = new ArrayList<>();
        this.funcionesActivas = new ArrayList<>();
        this.teclado = new Scanner(System.in);

        // deja listas algunas funciones apenas parte el programa
        prepararCarteleraBase();
    }

    public void arrancarMenu() {
        int opcionElegida;

        do {
            System.out.println("\n#### Bienvenido a CineApp ####");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Revisar cartelera");
            System.out.println("3) Comprar entrada");
            System.out.println("4) Buscar entradas de cliente");
            System.out.println("0) Salir");

            opcionElegida = InputUtil.pedirNumeroEntero(teclado, "Elige una opción: ");

            switch (opcionElegida) {
                case 1 -> registrarClienteNuevo();
                case 2 -> mostrarCarteleraActual();
                case 3 -> procesarCompraEntrada();
                case 4 -> consultarEntradasCliente();
                case 0 -> System.out.println("Cerrando el sistema de cine...");
                default -> System.out.println("Esa opción no existe.");
            }

        } while (opcionElegida != 0);
    }


    private void registrarClienteNuevo() {
        String nombreCliente = InputUtil.pedirTextoNoVacio(teclado, "Nombre del cliente: ");

        // no deja repetir clientes con el mismo nombre
        if (encontrarCliente(nombreCliente) != null) {
            System.out.println("Ya existe un cliente con ese nombre.");
            return;
        }

        Cliente clienteNuevo = new Cliente(nombreCliente);
        agendaPersonas.add(clienteNuevo);

        System.out.println("Cliente guardado correctamente.");
    }

    private void mostrarCarteleraActual() {
        if (funcionesActivas.isEmpty()) {
            System.out.println("No hay funciones disponibles.");
            return;
        }

        System.out.println("\n=== Cartelera del día ===");

        for (int posicion = 0; posicion < funcionesActivas.size(); posicion++) {
            System.out.print((posicion + 1) + ") ");
            funcionesActivas.get(posicion).imprimirDetalleFuncion();
        }
    }


    private void procesarCompraEntrada() {
        Cliente clienteElegido = pedirClienteDelListado();
        if (clienteElegido == null) {
            return;
        }

        Funcion funcionElegida = pedirFuncionDelListado();
        if (funcionElegida == null) {
            return;
        }

        if (!funcionElegida.quedanAsientos()) {
            System.out.println("No hay asientos disponibles para esta función.");
            return;
        }

        int numeroAsiento = InputUtil.pedirNumeroEntero(teclado,
                "Número de asiento (1 a " + funcionElegida.getTotalAsientos() + "): ");

        if (!funcionElegida.asientoExiste(numeroAsiento)) {
            System.out.println("Número de asiento fuera de rango.");
            return;
        }

        if (funcionElegida.estaOcupado(numeroAsiento)) {
            System.out.println("Ese asiento ya fue vendido.");
            return;
        }


        Entrada entradaNueva = new Entrada(clienteElegido, funcionElegida, numeroAsiento);
        boolean compraLista = funcionElegida.registrarVenta(entradaNueva);

        if (compraLista) {
            clienteElegido.guardarEntrada(entradaNueva);

            System.out.println("Entrada comprada correctamente.");
            System.out.println("\nResumen de la entrada:");
            entradaNueva.imprimirResumen();
        } else {
            System.out.println("No fue posible realizar la compra.");
        }
    }

    private void consultarEntradasCliente() {
        Cliente clienteElegido = pedirClienteDelListado();

        if (clienteElegido == null) {
            return;
        }

        clienteElegido.imprimirEntradas();
    }


    private Cliente pedirClienteDelListado() {
        List<Cliente> clientes = armarListaClientes();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return null;
        }

        System.out.println("\n#### Clientes ####");

        for (int posicion = 0; posicion < clientes.size(); posicion++) {
            System.out.println((posicion + 1) + ") " + clientes.get(posicion).getNombre());
        }

        int opcionCliente = InputUtil.pedirNumeroEntero(teclado, "Seleccione un cliente: ");

        if (opcionCliente < 1 || opcionCliente > clientes.size()) {
            System.out.println("Cliente inválido.");
            return null;
        }

        return clientes.get(opcionCliente - 1);
    }

    private Funcion pedirFuncionDelListado() {
        if (funcionesActivas.isEmpty()) {
            System.out.println("No hay funciones disponibles.");
            return null;
        }

        System.out.println("\n#### Funciones disponibles ####");

        for (int posicion = 0; posicion < funcionesActivas.size(); posicion++) {
            System.out.print((posicion + 1) + ") ");
            funcionesActivas.get(posicion).imprimirDetalleFuncion();
        }

        int opcionFuncion = InputUtil.pedirNumeroEntero(teclado, "Seleccione una función: ");

        if (opcionFuncion < 1 || opcionFuncion > funcionesActivas.size()) {
            System.out.println("Función inválida.");
            return null;
        }

        return funcionesActivas.get(opcionFuncion - 1);
    }


    private Cliente encontrarCliente(String nombreBuscado) {
        for (Persona personaGuardada : agendaPersonas) {
            if (personaGuardada instanceof Cliente cliente && cliente.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return cliente;
            }
        }

        return null;
    }

    private List<Cliente> armarListaClientes() {
        List<Cliente> clientes = new ArrayList<>();

        // esto sirve para mostrar polimorfismo: se guardan como Persona y se filtran como Cliente
        for (Persona personaGuardada : agendaPersonas) {
            if (personaGuardada instanceof Cliente cliente) {
                clientes.add(cliente);
            }
        }

        return clientes;
    }

    private void prepararCarteleraBase() {
        Pelicula peliculaTarde = new Pelicula("Duna: Parte Dos", 166);
        Pelicula peliculaFamiliar = new Pelicula("Intensa-Mente 2", 96);
        Pelicula peliculaNoche = new Pelicula("Troja", 125);
        Pelicula peliculaHistorica = new Pelicula("Apocalypto", 145);


        funcionesActivas.add(new Funcion(peliculaTarde, "16:15", 16));
        funcionesActivas.add(new Funcion(peliculaFamiliar, "19:00", 10));
        funcionesActivas.add(new Funcion(peliculaNoche, "21:30", 20));
        funcionesActivas.add(new Funcion(peliculaHistorica, "22:00", 12));
    }
}