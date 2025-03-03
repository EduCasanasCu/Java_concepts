package POO.Ejer2;

public class ArrayObjectsMain {
    public static void main(String[] args) {

        PersonaOptional[] ArregloPersona = new PersonaOptional[3];

        for (int i =0;i<3;i++){
            PersonaOptional persona = new PersonaOptional();
            persona.cargaDatos();
            ArregloPersona[i] = persona;
        }

        for (PersonaOptional persona : ArregloPersona) {
            System.out.println(persona.toString());
        }

    }
}
