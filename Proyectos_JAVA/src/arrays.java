
import java.util.ArrayList;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
            List<String> nombres = new ArrayList<>();
// Agregar elementos
        nombres.add("Seba");
        nombres.add("Juan");
        nombres.add("Maria");


//System.out.println(nombres);
// Acceder a elementos
        System.out.println(nombres.get(1));
// Modificar elementos
        nombres.set(1, "Ricardo");
        System.out.println(nombres.get(1));
// Eliminar elementos
        nombres.remove(0);

        // Eliminar elementos
        nombres.remove("Seba");
        // Por el indice o por el valor
        System.out.println(nombres.get(0));
        // Tamaño de la lista (dinamico)
                System.out.println(nombres.size());
        List<Integer> numeros = new ArrayList<>();
        for(int i=0; i<5; i++) {
            numeros.add(i);
        }
            System.out.println(numeros);

        System.out.println(numeros);
        for(int i= 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }


    }
}