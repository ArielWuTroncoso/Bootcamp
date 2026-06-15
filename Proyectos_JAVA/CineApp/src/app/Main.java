package app;

import service.CineService;


public class Main {

    public static void main(String[] args) {

        CineService atencionCine = new CineService();

        atencionCine.arrancarMenu();
    }
}