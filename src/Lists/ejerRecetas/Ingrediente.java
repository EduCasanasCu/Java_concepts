package Lists.ejerRecetas;

public class Ingrediente {

    private String nombre;
    private int cantidad;
    private UnidadMedida unidadMedida;
    private boolean esOpcional;

    public Ingrediente(String nombre, int cantidad, UnidadMedida unidadMedida, boolean esOpcional) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.esOpcional = esOpcional;
    }

    public Ingrediente(String nombre, int cantidad, UnidadMedida unidadMedida) {
        this(nombre, cantidad, unidadMedida, false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public boolean getEsOpcional() {
        return esOpcional;
    }

    public void setEsOpcional(boolean esOpcional) {
        this.esOpcional = esOpcional;
    }

    public String toString(){
        if(unidadMedida!=null){
            return cantidad + " " + unidadMedida.toString().toLowerCase() + " de " + nombre;
        }else{
            return cantidad + " " + nombre;
        }
    }
}
