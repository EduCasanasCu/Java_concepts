package Optional;

import java.util.Optional;

public class OptionalWithMap {

    public static void main(String[] args) {

        // Ejemplo: Transformación de un valor con map

        Optional<String> optional1 = Optional.of("hola");

        Optional<Integer> longitud = optional1.map(String::length);

        longitud.ifPresent(len -> System.out.println("Longitud de la cadena: " + len));
    }
    
}
/* Detalle del ejemplo
 	Transformación con map:
    Convierte el contenido del Optional (por ejemplo, obtiene la longitud de una cadena) sin 
    tener que comprobar manualmente si el valor está presente.
 */
