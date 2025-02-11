package ZoologicoTest;
public class Animal {

    private String nombre;

    private double peso;

    /*public Animal (){

    }*/ //Si se llama a un contructor vacio la clase leon si funciona

    /*public Animal(){
        super();
    }*/

    

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(){
        System.out.println("El animal "+this.nombre+ " está comiendo");
    }

    public void beber(){
        System.out.println("El animal "+this.nombre+ " está bebiendo");
    }

    

}
