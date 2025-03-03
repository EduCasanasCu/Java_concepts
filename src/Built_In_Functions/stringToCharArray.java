package Built_In_Functions;

public class stringToCharArray {
    public static void main(String[] args) {

        /*
            La función toCharArray() se utiliza para convertir un objeto de tipo String
            en un arreglo de caracteres (char[]). Es una manera simple y directa de acceder a
            cada carácter de una cadena de texto como elementos individuales.
         */

        String texto = "Hola Mundo";

        // Convertir el String a un arreglo de caracteres
        char[] caracteres = texto.toCharArray();

        // Imprimir cada carácter
        for (char c : caracteres) {
            System.out.println(c);
        }

        /*
            Como los String en Java son inmutables, no puedes modificar directamente
            sus caracteres. Sin embargo, al convertir el String en un arreglo de caracteres,
            puedes modificarlo.
         */
        String palabra = "python";
        char[] caracteres2 = palabra.toCharArray();
        caracteres2[0] = Character.toUpperCase(caracteres2[0]); // Convertir 'p' a 'P'

        String resultado = new String(caracteres2); // Crear un nuevo objeto de tipo String a partir de un arreglo de caracteres.
        System.out.println(resultado); // Salida: Python


        /*
            Reversa de un String:
            Puedes invertir un String usando el arreglo de caracteres.
         */

        String palabraIni = "Hola Mundo";
        char[] caracteresIni = palabraIni.toCharArray();

        for (int i = caracteresIni.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
        // Salida: aloH
    }
}
