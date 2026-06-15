package service;

import interfaces.Adoptable;
import interfaces.Entrenable;
import model.*;
import util.InputUtil;

import java.util.*;


public class RefugioService {

    private Scanner scan = new Scanner(System.in);
    // ATRIBUTO DE LA CLASE (GLOBAL dentro de la clase)
    private List<Cliente> clientes = new ArrayList<>();


    public void iniciar() {

        boolean salir = false;

        while (!salir) {

            System.out.println("\n=== REFUGIO ANIMAL ===");
            System.out.println("1) Crear cliente");
            System.out.println("2) Registrar mascota");
            System.out.println("3) Ver clientes y mascotas");
            System.out.println("0) Salir");
            System.out.println("Ingrese su opción: ");


            int op = InputUtil.leerInt();

            switch (op) {

                case 1 -> clienteInput();

                case 2 -> mascotaInput();

                case 3 -> mostrarDatos();

                case 0 -> salir = true;

                default -> System.out.println("Opción inválida");
            }
        }
    }


    public void clienteInput() {

        System.out.println("Ingrese su nombre: ");
        String clienteNombre = InputUtil.leerString();

        // CREAMOS UN OBJETO Cliente UTILIZANDO EL NOMBRE INGRESADO
        Cliente cliente = new Cliente(clienteNombre);

        // AGREGAMOS EL OBJETO A LA LISTA
        clientes.add(cliente);

        System.out.println("Cliente registrado.");
    }


    public void mascotaInput() {
            boolean salir = false;
            while (!salir){
                System.out.println("Registro de Mascotas :");
                System.out.println("1) Perro");
                System.out.println("2) Gato ");
                System.out.println("3) volver ");

                System.out.println("Ingrese opción: ");

                int opcion = InputUtil.leerInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese su nombre: ");
                        String perroNombre = InputUtil.leerString();
                        System.out.println("Ingrese su edad: ");
                        int perroEdad = InputUtil.leerEdad();
                        Mascota perrito = new Perro(perroNombre, perroEdad) {
                        };
                        System.out.println("Seleccione un cliente:");
                        for (int i = 0; i < clientes.size(); i++) {

                            System.out.println(
                                    (i + 1) + ") " +
                                            clientes.get(i).getNombre());}

                        int indice = InputUtil.leerInt() - 1;

                        Cliente clienteUbicado =
                                clientes.get(indice);

                        clienteUbicado.agregarMascota(perrito);
                        System.out.println("Mascota registrada correctamente.");
                        break;
                    }

                    case 2 -> {

                        System.out.println("Ingrese su nombre: ");
                        String gatoNombre = InputUtil.leerString();

                        System.out.println("Ingrese su edad: ");
                        int gatoEdad = InputUtil.leerEdad();

                        Mascota gatito = new Gato(gatoNombre, gatoEdad);

                        System.out.println("Seleccione un cliente:");
                        for (int i = 0; i < clientes.size(); i++) {

                            System.out.println(
                                    (i + 1) + ") " +
                                            clientes.get(i).getNombre());
                        }

                        int indice = InputUtil.leerInt() - 1;

                        Cliente clienteUbicado =
                                clientes.get(indice);

                        clienteUbicado.agregarMascota(gatito);

                        System.out.println("Mascota registrada correctamente.");
                        break;
                    }
                    case 3 ->{return;}


                    }
                }

            }



    public void mostrarDatos() {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        System.out.println("=== CLIENTES Y MASCOTAS ===");

        for (Cliente varCliente : clientes) {

            System.out.println("\nCliente: " + varCliente.getNombre());

            List<Mascota> mascotas = varCliente.getMascotas();


            if (mascotas.isEmpty()) {

                System.out.println("Sin mascotas registradas.");

            } else {

                for (Mascota mascota : mascotas) {

                    mascota.mostrarInfo();
                    mascota.hacerSonido();

                    // instanceof PREGUNTA SI EL OBJETO IMPLEMENTA UNA interface
                    if (mascota instanceof Adoptable adoptable) {

                        System.out.println(adoptable.datosAdopcion());
                    }


                    if (mascota instanceof Entrenable entrenable) {

                        entrenable.entrenar();
                    }
                }
            }
        }
    }

        }








