package POO.Polimorfismo;

public class MensajeriaMain {
    public static void main(String[] args) {

        Mensaje[] mensajes = new Mensaje[2];

        MensajeSMS sms = new MensajeSMS();
        sms.setTexto("Tu producto llegara pronto!");
        sms.setTelefono("097812345");

        MensajeEmail email = new MensajeEmail();
        email.setFrom("edu@gmail.com");
        email.setTo("jorge@outlook.com");
        email.setSubject("Congrats");
        email.setTexto("Bienvenida y accesos a repos");


        mensajes[0] = sms;
        mensajes[1] = email;

        for (Mensaje mensaje : mensajes) {
            mensaje.enivarMensaje();
        }

    }
}
