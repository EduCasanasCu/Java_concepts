package POO.Herencia;

public class Animal {
    public String nombre;
    private int velocity;

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    protected void correr(){
        System.out.printf("Estoy corriendo a %d km",velocity);
    }

}
