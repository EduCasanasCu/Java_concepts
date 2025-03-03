package Enums.ejemplo2;

public enum DiaSemana {
    LUNES(false),
    MARTES(false),
    MIERCOLES(false),
    JUEVES(false),
    VIERNES(false),
    SABADO(true),
    DOMINGO(true);

    private boolean esFinSemana;

    DiaSemana(boolean esFinSemana){
        this.esFinSemana = esFinSemana;
    }

    public boolean getEsFinSemana(){
        return esFinSemana;
    }
}
