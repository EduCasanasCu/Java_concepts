package Lists;

import java.util.ArrayList;
import java.util.List;

public class Listas_teoria {
    public static void main (String[] args) {
        List<String> nombres = new ArrayList<>();
        // agregar elementos a la lista.
        nombres.add("Edu");
        nombres.add("Jorge");
        nombres.add("Casanas");

        for(String name: nombres){
            System.out.println(name);
        }

        // Borrar elementos de la lista.
        nombres.remove(1); // borrar Jorge por indice
        nombres.remove("Edu"); // borrar Edu por nombre

        for(String name: nombres){
            System.out.println(name);
        }

    }
}
