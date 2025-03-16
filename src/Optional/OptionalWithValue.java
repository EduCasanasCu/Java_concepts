package Optional;

import java.util.Optional;

public class OptionalWithValue {

    public static void main(String[] args) {

        // Ejemplo: Creación de Optional con un valor no nulo
        
        Optional<String> optional1 = Optional.of("Hola Mundo");

        if (optional1.isPresent()) {
        System.out.println("Valor presente: " + optional1.get());
        }
    }
    
}
/* Detalle del ejemplo
 * Creación con Optional.of:
Se crea un Optional que contiene un valor no nulo. 
Si intentas pasar null a of(), se lanzará un NullPointerException.
 */
