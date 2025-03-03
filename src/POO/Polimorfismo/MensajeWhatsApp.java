package POO.Polimorfismo;

public class MensajeWhatsApp extends Mensaje{
    private String telefono;

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void enivarMensaje(){
        System.out.println("Enviando mensaje via whatsapp..");
    }

    @Override
    public String toString() {
        return "MensajeSMS{" +
                "telefono='" + telefono + '\'' +
                '}';
    }
}
