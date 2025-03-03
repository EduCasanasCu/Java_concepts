package unitTestCalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSuma() {
        int resultado = 2 + 3;
        assertEquals(5, resultado); // Verifica que 2 + 3 es igual a 5
    }
}