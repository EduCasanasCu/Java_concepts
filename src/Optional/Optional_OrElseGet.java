package Optional;

import java.util.Optional;

public class Optional_OrElseGet {

    public static void main(String[] args) {

        // Ejemplo: Uso de orElseGet para obtener un valor por defecto mediante un Supplier

        String valor = null; // si se asigna un string, imprimirá el valor al final.

        Optional<String> optional2 = Optional.ofNullable(valor);

        String valorConOrElseGet = optional2.orElseGet(() -> "Valor obtenido con orElseGet");

        System.out.println("Resultado: " + valorConOrElseGet);
    }

}
/* Detalle del ejemplo
 	Uso de orElseGet:
    Similar a orElse, pero recibe un Supplier que se ejecuta solo si el Optional está vacío.
 */