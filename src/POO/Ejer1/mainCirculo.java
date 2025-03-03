package POO.Ejer1;

public class mainCirculo {
    public static void main(String[] args) {

        Circulo areaCirculo = new Circulo();

        areaCirculo.radio = 5;

        double resultado = areaCirculo.calcularArea();
        System.out.println(resultado);
    }
}
