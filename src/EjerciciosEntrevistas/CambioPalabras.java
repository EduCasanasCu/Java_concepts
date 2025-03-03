package EjerciciosEntrevistas;

/*
    Dada una frase cambia todas sus vocales por la letra o.
 */

import java.util.List;

public class CambioPalabras {
    public static void main(String[] args) {

        String frase = "Hola mundo, buenos dias";

        List<Character> vocales = List.of('a','e','i','o','u');

        for (int i=0; i<frase.length();i++){
            char letra = frase.charAt(i);
            if(vocales.contains(letra)){
                frase = frase.replace(letra, 'o');
            }
        }
        System.out.println(frase);
    }
}



/*
        --OTRA FORMA DE SOLUCION usando arreglo,String.valueOf() y 2 bucles FOR--

    String frase = "Hola mundo, buenos dias";

        char[] vocales = {'a','e','i','o','u'};

        for (int i=0; i<frase.length();i++){
            String letra = frase.substring(i,i+1); //.substring(inicio, fin) el fin no se incluye.
            for (int j=0; j<vocales.length;j++){
                if(letra.equals(String.valueOf(vocales[j]))){
                    frase = frase.replace(letra, "o");
                }
            }
        }
        System.out.println(frase);
 */




/*          --OTRA FORMA DE SOLUCION usando toCharArray()--

    String frase = "Hola mundo, buenos dias";

        char[] fraseArray = frase.toCharArray();

        for (int i=0; i<fraseArray.length;i++){
            if(fraseArray[i] == 'a'){
                fraseArray[i]='o';
            }
            if(fraseArray[i] == 'e'){
                fraseArray[i]='o';
            }
            if(fraseArray[i] == 'i'){
                fraseArray[i]='o';
            }
            if(fraseArray[i] == 'o'){
                fraseArray[i]='o';
            }
            if(fraseArray[i] == 'u'){
                fraseArray[i]='o';
            }
        }

        String frasefinal = new String(fraseArray);
        System.out.println(frasefinal);
 */
