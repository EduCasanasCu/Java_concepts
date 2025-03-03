package Lists.ejerRecetas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroRecetas {

    public void elegirReceta(){
        Scanner ingreso = new Scanner(System.in);

        // listado de recetas
        List<Receta> recetas = new ArrayList<>();

        Receta mofongo = getMofongo();
        recetas.add(mofongo);

        int contador = 1;
        for(Receta receta: recetas){
            System.out.println(contador + " )" + receta.getNombreReceta());
            contador++;
        }

        System.out.println("Que recetas deseas cocinar? ");

        int opcion = ingreso.nextInt();

        Receta receta = recetas.get(opcion-1);

        receta.mostrarIngredientes();
        receta.mostrarPasos();
    }

    private Receta getMofongo() {
        // instancia de un objeto de la clase Receta
        Receta mofongo = new Receta();
        mofongo.setNombreReceta("Mofongo");

        // listado de ingredientes
        List<Ingrediente> listaIngredientes = new ArrayList<>();

        //instancia de objetos
        Ingrediente ingrediente1 = new Ingrediente("Platano verde",
                3, null);

        // añadimos al listado
        listaIngredientes.add(ingrediente1);

        //instancia de otro objeto
        Ingrediente ingrediente2 = new Ingrediente("dientes de ajo",
                5, null);

        // añadimos al listado
        listaIngredientes.add(ingrediente2);

        //instancia de otro objeto
        Ingrediente ingrediente3 = new Ingrediente("aceite de oliva",
                4, UnidadMedida.CUCHARITAS);

        // añadimos al listado
        listaIngredientes.add(ingrediente3);

        //instancia de otro objeto opcional
        Ingrediente ingrediente4 = new Ingrediente("chicharrones de cerdo",
                6, null, true);

        // añadimos al listado
        listaIngredientes.add(ingrediente4);

        mofongo.setIngredientes(listaIngredientes);

        List<String> pasos = new ArrayList<>();

        pasos.add("paso...1");
        pasos.add("paso...2");
        pasos.add("paso...3");
        pasos.add("paso...4");

        mofongo.setPasos(pasos);

        return mofongo;
    }
}
