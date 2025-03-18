package Optional;

import java.util.Optional;

public class Optional_WithValueOrNot {

    public static void main(String[] args) {

        // Ejemplo: Creación de Optional con un valor que puede ser nulo

        String valor = null;

        Optional<String> optional2 = Optional.ofNullable(valor);

        System.out.println("¿Valor presente? " + optional2.isPresent());

        System.out.println("Valor (o valor por defecto): " + optional2.orElse("Soy un valor por defecto!!!"));
    }
    
}

/* Detalle del ejemplo
    Creación con Optional.ofNullable:
    Permite crear un Optional que puede contener un valor o estar vacío (si el valor es null). 
    Luego, con orElse() se puede asignar un valor por defecto.
 */

