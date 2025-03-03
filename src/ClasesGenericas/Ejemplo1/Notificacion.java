package ClasesGenericas.Ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Notificacion<T> {

    private T objeto;
    private List<String> registroHistorico = new ArrayList<>();

    public Notificacion(T objeto){
        this.objeto = objeto;

    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public List<String> getRegistroHistorico() {
        return registroHistorico;
    }
}
