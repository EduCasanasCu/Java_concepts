package Optional;

import java.util.Optional;

public class Optional_flatMap {

    public static void main(String[] args) {

        // Ejemplo: Uso de flatMap cuando la transformación retorna otro Optional

        Optional<String> optional3 = Optional.of("Buenos dias");

        Optional<Integer> longitudOptional = optional3.flatMap(val -> Optional.of(val.length()));

        longitudOptional.ifPresent(len -> System.out.println("Longitud de: "+ optional3.get()+" "+ len));

    }
    
}
/* Detalle del ejemplo
    Uso de flatMap:
    Se utiliza cuando la transformación devuelve otro Optional, evitando tener un Optional anidado.
 */
