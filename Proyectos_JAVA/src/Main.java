import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // static permite llamar la clase sin nada más (por eje un Objeto),
    // por eso va void "vacío"

    //args : puede ser sustituido por otra palabra
    public static void main (List <String> [] args){
        //Java es de tipado fuerte, por eso hay que declarar el tipo de dato:
        int numero =5;
        String saludo ="Hola mundo";
        System.out.println("numero :"+numero);
        System.out.println(saludo);
    }

}
