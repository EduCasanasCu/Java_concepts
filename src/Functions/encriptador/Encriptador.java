package Functions.encriptador;

public class Encriptador {

    private Integer clave = 1;

    public void setClave(Integer clave){
        this.clave = clave;
    }

    public String encriptar(String texto){
        StringBuilder resultado = new StringBuilder();

        for(int i=0; i<texto.length(); i++){
           int numASCII = texto.charAt(i);
           numASCII *= clave;
           resultado.append(numASCII).append("_");
        }
        return resultado.toString();
    };


    public String desencriptar(String texto){

        StringBuilder resultado = new StringBuilder();

        String[] textoArr = texto.split("_");

        for(int i=0; i<textoArr.length; i++){
            int numeros = Integer.parseInt(textoArr[i])/clave;
            String charFromInt = Character.toString(numeros);
            resultado.append(charFromInt);
        }
        return resultado.toString();
    };





    /* OJO PARA ESTUDIAR EL USO DE STRINGBUILDER Y TOCHARARRAY
        public String encriptar(String texto){
        StringBuilder resultado= new StringBuilder();

        for(int i=0; i<texto.length(); i++){
            resultado.append(texto.toCharArray()[i]); // texto.toCharArray()[i] devuelve un arreglo con el [i] para que me de solo el 1 caracter del arreglo.
            resultado.append("x");
        }
        return resultado.toString();
    };


    public String desencriptar(String texto){

        StringBuilder resultado = new StringBuilder();
        char[] txtArray = texto.toCharArray();

        for(int i=0; i<txtArray.length; i+=2){
            resultado.append(txtArray[i]);
        }

        return resultado.toString();
    };
     */
}
