package BuilderDesignPattern.ejemplo1;

public class PersonMain {
    public static void main(String[] args) {
        Person persona = Person.Builder.aPerson()
                .withName("edu")
                .withSurname("cas")
                .withTelephone("097812345")
                .withEmail("edu@gmail.com")
                .build();
    }
}
