package BuilderDesignPattern.ejemplo2;

import java.time.LocalDate;

public class UsuarioDtoMain {
    public static void main(String[] args) {
        UsuarioDTO user = new UsuarioDTO.Builder()
                .Name("Edu")
                .Gender("M")
                .Email("edu@gmail.com")
                .FechaNacimiento(LocalDate.now().minusYears(20))
                .Surname("Cas")
                .Phone("097812345")
                .build();
    }
}
