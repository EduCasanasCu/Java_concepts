package BuilderDesignPattern.ejemplo1;

public class Person {

    private String name;
    private String surname;
    private String telephone;
    private String email;


    public Person(String name, String surname, String telephone, String email) {
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    // BUILDER DESIGN PATTERN
    public static final class Builder {
        private String name;
        private String surname;
        private String telephone;
        private String email;

        private Builder() {
        }

        public static Builder aPerson() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(name, surname, telephone, email);
        }

    }

}
