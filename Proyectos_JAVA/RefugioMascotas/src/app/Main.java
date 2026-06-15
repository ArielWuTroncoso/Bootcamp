package app;

import model.Mascota;
import service.RefugioService;

public class Main {

    public static void main(String[] args) {

        // CREAMOS EL OBJETO DEL SERVICIO
        RefugioService refugio = new RefugioService();

        // INICIAMOS EL MENÚ PRINCIPAL
        refugio.iniciar();

    }
}