package EjerciciosEntrevistas;

public class SelectionSortVariation {

    private static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                }
            }
            // Imprimir el estado del array después de cada iteración
            System.out.print("Iteración " + (i + 1) + ": ");
            printArray(array);
        }
    }

    // Método para imprimir el arreglo
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,5,1,3};

        System.out.println("Arreglo original:");
        printArray(array);

        System.out.println("\nProceso de ordenamiento:");
        SelectionSort(array);

        System.out.println("\nArreglo ordenado:");
        printArray(array);
    }

}
