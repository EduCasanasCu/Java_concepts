package BuilderDesignPattern.ejemplo2;

import java.time.LocalDate;
import java.util.Objects;

public class UsuarioDTO {

    private final String name;
    private final String surname;
    private final String email;
    private final String phone;
    private final LocalDate fechaNacimiento;
    private final String gender;
    private final String maritalStatus;

    public UsuarioDTO(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.phone = builder.phone;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.gender = builder.gender;
        this.maritalStatus = builder.maritalStatus;
    }

    public static class Builder {

        private  String name;
        private  String surname;
        private  String email;
        private  String phone;
        private  LocalDate fechaNacimiento;
        private  String gender;
        private  String maritalStatus;

        public UsuarioDTO.Builder Name(String name) {
            this.name = name;
            return this;
        }

        public UsuarioDTO.Builder Surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UsuarioDTO.Builder Email(String email) {
            // se puede hacer otra validacion que no se inicialize con valor nulo
            Objects.requireNonNull(email);
            this.email = email;
            return this;
        }

        public UsuarioDTO.Builder Phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UsuarioDTO.Builder FechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public UsuarioDTO.Builder Gender(String gender) {
            this.gender = gender;
            return this;
        }

        public UsuarioDTO.Builder MaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public UsuarioDTO build(){
            // we can validate before to build the object
            if(name==null){
                name="";
            }
            if(fechaNacimiento.isBefore(LocalDate.now())){
                //todo
            }
            return new UsuarioDTO(this);
        }
    }

}
