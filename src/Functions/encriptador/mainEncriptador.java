package Functions.encriptador;

public class mainEncriptador {
    public static void main (String[] args) {
        Encriptador encriptador = new Encriptador();
        encriptador.setClave(13);


        String texto = "Hola mundo feliz";
        String textoEncriptado = encriptador.encriptar(texto);

        System.out.println("El texto encriptado: "+ textoEncriptado);

        String textoDescencriptado = encriptador.desencriptar(textoEncriptado);
        System.out.println("Texto descencriptado: " + textoDescencriptado);
    }
}
