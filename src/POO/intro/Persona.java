package POO.intro;

public class Persona {
    public String name;
    public String phone;
    public String surname;
    public String email;

    public Persona(String name, String phone, String surname, String email) {
        this.name = name;
        this.phone = phone;
        this.surname = surname;
        this.email = email;
    }

    public void showData(){
        System.out.println("Nombre: "+name+" Apellido: "+surname+" Telefono: "+phone+" Email: "+email);
    }


}
