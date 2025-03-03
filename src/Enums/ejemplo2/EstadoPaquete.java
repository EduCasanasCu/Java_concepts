package Enums.ejemplo2;

public enum EstadoPaquete {

    SMALL_ENVIADO(true),
    SMALL_PERDIDO(true),
    SMALL_DEVUELTO(true),
    SMALL_RECIBIDO(true),
    SMALL_EN_TRANSITO(true),

    BIG_ENVIADO(false),
    BIG_PERDIDO(false),
    BIG_DEVUELTO(false),
    BIG_RECIBIDO(false),
    BIG_EN_TRANSITO(false);

    private boolean isSmall;

    // CONSTRUCTOR
    EstadoPaquete(boolean isSmall){
        this.isSmall = isSmall;
    }

    // GETTER
    public boolean isSmall(){
        return  isSmall;
    }
}



