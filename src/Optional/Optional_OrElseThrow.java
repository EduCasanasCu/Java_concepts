package Optional;

import java.util.Optional;

public class Optional_OrElseThrow {

    public static void main(String[] args) {

        // Ejemplo: Uso de orElseThrow para lanzar una excepción si no hay valor
        
        String valor = null; // si se asigna un valor, este se imprimirá.
        Optional<String> optional2 = Optional.ofNullable(valor);

        try {
            String valorOrThrow = optional2.orElseThrow(() -> new RuntimeException("No se encontró el valor"));
            System.out.println("Valor: " + valorOrThrow);
        } catch (RuntimeException ex) {
            System.out.println("Excepción capturada: " + ex.getMessage());
        }
    }
    
}
/* Detalle del ejemplo
    Uso de orElseThrow:
    Lanza una excepción si el Optional no tiene un valor presente, 
    permitiendo manejar el caso de ausencia de forma explícita.
 */
