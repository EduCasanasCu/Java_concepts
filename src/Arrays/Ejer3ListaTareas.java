package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer3ListaTareas {
    public static void main (String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Estudiar Java");
        lista.add("Practicar Java");
        lista.add("Hacer un portafolio en Java");

        int opcion = 1;
        while (!lista.isEmpty() || opcion!=4) {

            mostrarMenu();
            Scanner ingreso = new Scanner(System.in);
            opcion = ingreso.nextInt();

            switch (opcion){
                case 1:
                    agregarTarea(lista);
                    break;
                case 2:
                    mostrarTareas(lista);
                    eliminarTarea(lista);
                    break;
                case 3:
                    mostrarTareas(lista);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida!");
            }
        }
    }

    private static void agregarTarea(List<String> lista) {
        System.out.println("Cual es la tarea que deseas agregar? ");
        Scanner input = new Scanner(System.in);
        String tarea = input.nextLine();
        lista.add(tarea);
    }

    private static void mostrarMenu() {
        System.out.println("------Menu------");
        System.out.println("1) Agregar una tarea");
        System.out.println("2) Eliminar una tarea");
        System.out.println("3) Mostrar tareas");
        System.out.println("4) Salir");
        System.out.println("Que desea hacer? ");
    }

    private static void mostrarTareas(List<String> lista) {
        if (lista.isEmpty()){
            System.out.println("La lista esta vacia!");
        }
        else{
            System.out.println("-----Lista de tareas---------");
            int contador = 0;
            // Recorrido de la lista con foreach
            for (String tarea : lista) {
                contador++;
                System.out.println(contador + ") " + tarea);
            }
        }
    }

    private static void eliminarTarea(List<String> lista) {
        System.out.println("Que tarea deseas eliminar?");
        Scanner input = new Scanner(System.in);
        int numTarea = input.nextInt();
        lista.remove(numTarea - 1);
    }
}
