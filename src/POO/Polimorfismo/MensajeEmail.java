package POO.Polimorfismo;

public class MensajeEmail extends Mensaje {

    private String from;
    private String to;
    private String subject;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void enivarMensaje(){
        System.out.println("Enviando mensaje via email..");
    }


    @Override
    public String toString() {
        return "MensajeEmail{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
