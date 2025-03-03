package Arrays;

import java.util.Scanner;

public class Ejer2PromNotas {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantAlumnos = input.nextInt();

        // Listas que contienen los nombres y los promedios finales de los alumnos.
        String[] alumnosArray = new String[cantAlumnos];
        double[] AvgArray = new double[cantAlumnos];

        for (int i = 0; i<cantAlumnos; i++){
            System.out.println(String.format("Ingrese el nombre del %d alumno: ",i+1));
            String name = input.next();
            alumnosArray[i] = name;

            System.out.println("Ingrese la 1era nota");
            double grade1 = input.nextDouble();

            System.out.println("Ingrese la 2da nota");
            double grade2 = input.nextDouble();

            double avg = (grade1 + grade2)/2;
            AvgArray[i] = avg;
        }
        // FOREACH
        for (String nombre: alumnosArray){
            System.out.println("Los alumnos son: ".concat(nombre));
        }

        // Recorrer 2 arreglos al mismo tiempo con STREAM
        java.util.stream.IntStream.range(0, alumnosArray.length)
                .forEach(i -> System.out.println(
                        "Nombre: " + alumnosArray[i] + ", Promedio: " + AvgArray[i]));
    }
}
