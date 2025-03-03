package HashMap;

import java.util.HashMap;
import java.util.Map;


/*  Una caracteristica es que los HASHMAPS no devuelven valores repetidos ni en orden.
    hola buenos dias hola dias
    {dias, buenos, hola}
 */
public class teoria_hashMap {

    public static void main (String[] args){

        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("ASAP", "As soon as possible");
        diccionario.put("OMG", "Oh my God!");
        diccionario.put("FYI", "For you information");
        diccionario.put("BTW", "By the way");

        System.out.println(diccionario.get("FYI")); // For you information

        System.out.println(diccionario.values()); // [By the way, For you information, Oh my God!, As soon as possible]

        System.out.println(diccionario.keySet()); // [BTW, FYI, OMG, ASAP]

    }
}
