package VideoGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        // CREAMOS OBJETOS DE LA CLASE VideoGame
        var Juego1 = new VideoGame("Star wars battlefrontII", "shooter", 10000);
        var Juego2 = new VideoGame("FIFA2026", "SPORT", 49990);
        var Juego3 = new VideoGame("Efootball26", "SPORT", 1);



        // CREAMOS UN OBJETO DE LA CLASE HIJA ConsoleGame
        var Consola = new ConsoleGame(
                "Red dead redemption",
                "aventure",
                29990,
                "PS5 - XBOX"
        );

        // CREAMOS UN OBJETO DE LA CLASE HIJA PCGame
        var requisitos = new PCGame(
                "Mount&Blade",
                "Rol",
                28990,
                "Procesador: Intel® Core™ i3-8100 / AMD Ryzen™ 3 1200 / Snapdragon X Elite" +
                        "\nMemoria: 6 GB de RAM" +
                        "\nGráficos: Intel® UHD Graphics 630 / NVIDIA® GeForce® GTX 660 2GB / AMD Radeon™ HD 7850 2GB"
        );


        // INGRESAR PRECIOS UNA SOLA VEZ
        Juego1.PreciosInt();
        Juego2.PreciosInt();
        Juego3.PreciosInt();
        Consola.PreciosInt();
        requisitos.PreciosInt();

        // LISTA DE TIPO PADRE VideoGame EN < >
        // <VideoGame> INDICA QUE LA LISTA SOLO PUEDE GUARDAR
        // OBJETOS DE TIPO VideoGame O DE SUS CLASES HIJAS
        ArrayList<VideoGame> juegoslista = new ArrayList<>();

        // AÑADIMOS OBJETOS A LA LISTA
        juegoslista.add(Juego1);
        juegoslista.add(Juego2);
        juegoslista.add(Juego3);

        // TAMBIÉN PODEMOS AÑADIR OBJETOS DE CLASES HIJAS
        // PORQUE ConsoleGame Y PCGame HEREDAN DE VideoGame
        juegoslista.add(Consola);
        juegoslista.add(requisitos);

        // RECORREMOS LA LISTA CON forEach()
        // verLista ES UNA VARIABLE TEMPORAL QUE REPRESENTA
        // CADA OBJETO GUARDADO DENTRO DE LA LISTA
        // POLIFORMISMO, AUNQUE LISTA SE DE TIPO CLASS "VideoGame" PODEMOS VER OBJETOS DE "VideoGame","PCGame" ó "ConsoleGame
        juegoslista.forEach(verLista -> verLista.showInfo());



        // EJECUTAMOS EL MÉTODO showInfo() CON CADA OBJETO (POLIFORMISMO)
        Juego1.showInfo();
        Juego2.showInfo();
        Juego3.showInfo();
        Consola.showInfo();
        requisitos.showInfo();

    }



}