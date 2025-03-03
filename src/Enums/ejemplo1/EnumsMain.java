package Enums.ejemplo1;

public class EnumsMain {
    public static void main(String[] args) {

        Clima estadoClima = Clima.LLUVIOSO;

        switch (estadoClima){
            case NIEVE -> System.out.println("Hoy esta nevando");
            case LLUVIOSO -> System.out.println("Hoy esta lluviendo torrencialmente");
            case TORMENTA_ELECTRICA -> System.out.println("Hoy hay tormenta electrica");
        }



    }
}
