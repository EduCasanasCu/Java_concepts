package Arrays;

import java.util.Scanner;

public class Ejer1LinksYT {
    public static void main (String[] args){
        System.out.println("Ingrese el link del video: ");
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();

        String[] arrayLink = url.split("v="); // ["https://www.youtube.com/watch?","mADwyyUavpM"]
        String id = arrayLink[1]; //"mADwyyUavpM"

        String[] idSinOtrosParams = id.split("&"); // cuando el split no tiene el caracter que separara el string, devuelve una lista con todo el string.
        id = idSinOtrosParams[0];

        String urlImg = "https://i3.ytimg.com/vi/"+ id+ "/maxresdefault.jpg";
        System.out.println("Máxima calidad: ".concat(urlImg));
    }
}
