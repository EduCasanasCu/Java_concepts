package Enums.ejemplo2;

public class PaqueteMain {
    public static void main(String[] args) {

        EstadoPaquete estadoPaquete = EstadoPaquete.BIG_PERDIDO;

        if(estadoPaquete.isSmall()){
            System.out.println("Se perdio un paquete pequenio");
        }
        else {
            System.out.println("Se perdio un paquete grande");
        }


        DiaSemana diaSemana = DiaSemana.SABADO;

        if(diaSemana.getEsFinSemana()){
            System.out.println("Es fin de semana, relax!");
        }
        else{
            System.out.println("A trabajar!");
        }

    }
}
