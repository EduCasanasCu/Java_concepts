package POO.Polimorfismo;

import java.time.LocalDateTime;

public class Mensaje {
    private String texto;
    private LocalDateTime fecha;

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }

    public void enivarMensaje(){

    }


    @Override
    public String toString() {
        return "Mensaje{" +
                "texto='" + texto + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
