package POO.Ejer2;

import java.util.Scanner;

public class PersonaOptional {

    public String nombre;
    public String apellido;
    public String telefono;
    public String email;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Telefono: "+telefono+" Email: "+email;
    }

    public void cargaDatos(){
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = ingreso.nextLine();

        System.out.println("Ingrese el apellido: ");
        apellido = ingreso.nextLine();

        System.out.println("Ingrese el telefono: ");
        telefono = ingreso.nextLine();

        System.out.println("Ingrese el email: ");
        email = ingreso.nextLine();

    }
}
