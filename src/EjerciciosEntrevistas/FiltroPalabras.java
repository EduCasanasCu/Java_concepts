package EjerciciosEntrevistas;

import java.util.List;
import java.util.Scanner;
/*
    Ejercicio | Realizar un programa que reciba una cadena de texto y si contiene una 'mala palabra'
    no muestre el mensaje.
 */
public class FiltroPalabras {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        List<String> palabrasProhibidas = List.of("tonto","bruto","gil","pendejo","bobo");

        System.out.println("Ingrese la frase: ");
        String frase = ingreso.nextLine();

        String[] palabrasArray = frase.split(" ");

        boolean palabraProhibidaEncontrada = false;
        for (String palabra : palabrasArray) {
            if(palabrasProhibidas.contains(palabra)){
                palabraProhibidaEncontrada = true;
            }
        }

        if(palabraProhibidaEncontrada) {
            System.out.println("Has ingresado una palabra prohibida!");
        }else {
            System.out.println(frase);
        }

    }
}
