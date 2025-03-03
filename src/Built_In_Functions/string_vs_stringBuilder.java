package Built_In_Functions;

public class string_vs_stringBuilder {
    public static void main(String[] args) {
        /*
            String vs StringBuilder

            La diferencia clave entre String y StringBuilder en Java está en su mutabilidad
             y en cómo se manejan las operaciones con cadenas de texto.
         */

        /*
                -----STRING-----
            Un String es una clase inmutable, lo que significa que una vez creado,
            su valor no puede cambiar. Cada vez que haces una operación que parece modificar
            un String, en realidad se crea un nuevo objeto.
         */
        String texto = "Hola";
        texto = texto + " Mundo"; // Se crea un nuevo objeto "Hola Mundo"
        System.out.println(texto);

        /*
            En este caso, "Hola" no se modifica. En su lugar, se crea un nuevo objeto con el
             valor "Hola Mundo", lo que puede ser ineficiente si realizas muchas operaciones
              de concatenación.

            Ventajas:
	            •	Seguro para trabajar en entornos multihilo, ya que los objetos String no
	            cambian después de ser creados.
	            •	Ideal para cadenas de texto que no necesitan modificaciones frecuentes.

	        Concatenación: + o concat()
         */


        /*
                -----STRINGBUILDER-----
            Un StringBuilder es una clase mutable, lo que significa que puedes modificar
            directamente su contenido sin crear nuevos objetos en cada operación.
         */
        StringBuilder texto2 = new StringBuilder("Hola");
        texto2.append(" Mundo2"); // Modifica el mismo objeto
        System.out.println(texto2);

        /*
            Aquí, "Hola Mundo" se construye modificando el mismo objeto,
            lo que es más eficiente para operaciones repetitivas.

	    	Ventajas:
	            •	Eficiencia: Es mucho más rápido que String para operaciones como
	            concatenación, ya que no crea nuevos objetos.
	            •	Ideal para cuando necesitas realizar muchas modificaciones en una
	            cadena de texto, como en bucles o algoritmos.

	        Métodos: append(), insert(), delete()
         */
    }
}
