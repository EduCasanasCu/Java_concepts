package EjerciciosEntrevistas;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};

        long inicio = System.nanoTime();

        bubbleSort(array);

        long fin = System.nanoTime();

        double tiempoSegundos = (fin - inicio) / 1_000_000_000.0;

        System.out.printf("El algoritmo tardó %.9f segundos%n", tiempoSegundos);


        showSortedAlgorithm(array);
    }


    private static void showSortedAlgorithm(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }


    // forma de hacer el metodo de ordenamiento de burbuja.
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


}
