package POO.Herencia;

public class AnimalMain {
    public static void main(String[] args) {

        // Esto es propio de la clase Gato
        Gato gato = new Gato();
        gato.cola = "si";
        gato.numeroPatas = 4;
        gato.maullar();

        // La clase Gato al heredar de animal también puede..
        gato.nombre = "Pelusa";
        gato.setVelocity(5);
        gato.correr();
    }
}
