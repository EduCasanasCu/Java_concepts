package Lists.ejerRecetas;

import java.util.List;

public class Receta {


    private String nombreReceta;

    private List<String> pasos;

    private List<Ingrediente> ingredientes;


    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public List<String> getPasos() {
        return pasos;
    }

    public void setPasos(List<String> pasos) {
        this.pasos = pasos;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void mostrarIngredientes() {
        System.out.println("Ingredientes necesarios: ");

        for(Ingrediente ingrediente: ingredientes){
            System.out.println("- " + ingrediente.toString());
        }
    }

    public void mostrarPasos() {
        System.out.println("Pasos a seguir: ");

        for(String paso: pasos){
            System.out.println("- " + paso);
        }
    }
}
