package HashMap.ejer1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static HashMap.ejer1.LimpiarFrase.limpiarFrase;

/*
    Escribe un programa que reciba una cadena de texto como entrada y cuente cuantas
    veces aparece cada palabra en el texto. Utiliza un HashMap para almacenar las palabras
    como claves y sus frecuencias como valores.
*/
public class ejer1Main {
    public static void main(String[] args) {
        Map<String, Integer> diccionario = new HashMap<>();

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = ingreso.nextLine();

        String fraseLimpia = limpiarFrase(frase);

        String[] palabrasArr = fraseLimpia.split(" ");


        for (String palabra : palabrasArr) {
            Integer contador = diccionario.get(palabra);
            if(contador==null){
                contador=1;
            }
            else{
                contador++;
            }
            diccionario.put(palabra, contador);
        }
        System.out.println(diccionario);
    }
}
