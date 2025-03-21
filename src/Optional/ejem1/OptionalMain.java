package Optional.ejem1;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        Optional<PersonaOptional> cliente = getCliente(2);
        if(cliente.isPresent()){
            System.out.println(cliente.get().getNombre());
        }
    }

    public static Optional<PersonaOptional> getCliente(int id){
        PersonaOptional cliente = new PersonaOptional();
        return Optional.of(cliente);
    }
}
