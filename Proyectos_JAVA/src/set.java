import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

    public class set {
        public static void main(String[] args) {

        Set<String> correos = new HashSet<>();

        correos.add("juan@mail.com");
        correos.add("ana@mail.com");
        correos.add("juan@mail.com"); // ignorado

        boolean existe = correos.contains("a@mail.com");

        correos.remove("b@mail.com");

        int total = correos.size();

        for (String correo : correos) {
                System.out.println(correo);
            }

        Iterator <String> it = correos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    /*


     ## 🧪 **14. Ejercicio Sugerido**

        Crear un programa que:

                1. Use un `Set<String>` para correos
        2. Permita agregar correos
        3. Evite duplicados automáticamente
        4. Verifique si un correo existe
        5. Muestre el total de correos únicos

 */







}}
