package Optional;

import java.util.Optional;

public class Optional_ifPresent {

    public static void main(String[] args) {

        // Ejemplo: Uso de ifPresent para ejecutar una acción si el valor está presente
        
        String name = "Soy un valor"; // si fuera null, no imprime nada.

        Optional<String> optionalIfPresent = Optional.ofNullable(name);

        optionalIfPresent.ifPresent(val -> System.out.println("Usando ifPresent: " + val));
    }
    
}
/* Detalle del ejemplo
 	Uso de ifPresent:
    Ejecuta una acción (en este caso, imprimir el valor) solo si el Optional contiene un valor.
 */
