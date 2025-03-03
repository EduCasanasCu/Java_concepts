package Functions;

import java.util.Scanner;

public class Ejer1RockPaperScissors {
    public static void main (String[] args) {
        String[] opcionesComputador = {"Piedra", "Papel", "Tijera"};

        Scanner ingreso = new Scanner(System.in);

        System.out.println("1) Piedra\n2) Papel\n3) Tijera");
        System.out.println("Escoga un numero como la opcion: ");

        // opcion que ingresa el jugador
        int opcion = ingreso.nextInt();

        // numero aleatorio para que escoga del arreglo
        int numAleatorio = (int) (Math.random()*2); // generamos un num aleatorio entre 0,1,2

        elegirGanador(opcion, numAleatorio, opcionesComputador);
    }

    private static void elegirGanador(int opcion, int numAleatorio, String[] opcionesComputador) {
        switch (opcion){
            case 1:
                if (numAleatorio ==0){
                    System.out.println("Empate!, la computadora eligió " + opcionesComputador[numAleatorio]);
                } else if (numAleatorio ==1) {
                    System.out.println("Ganó el computador!, la computadora eligió " + opcionesComputador[numAleatorio]);
                }
                else {
                    System.out.println("Ganó el jugador!, la computadora eligió " + opcionesComputador[numAleatorio]);
                }
                break;
            case 2:
                if (numAleatorio ==1){
                    System.out.println("Empate!, la computadora eligió " + opcionesComputador[numAleatorio]);
                } else if (numAleatorio ==2) {
                    System.out.println("Ganó el computador!, la computadora eligió " + opcionesComputador[numAleatorio]);
                }
                else {
                    System.out.println("Ganó el jugador!, la computadora eligió " + opcionesComputador[numAleatorio]);
                }
                break;
            case 3:
                if (numAleatorio ==2){
                    System.out.println("Empate!, la computadora eligió " + opcionesComputador[numAleatorio]);
                } else if (numAleatorio ==0) {
                    System.out.println("Ganó el computador!, la computadora eligió " + opcionesComputador[numAleatorio]);
                }
                else {
                    System.out.println("Ganó el jugador!, la computadora eligió " + opcionesComputador[numAleatorio]);
                }
                break;
        }
    }
}
