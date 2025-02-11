package ZoologicoTest;
public class Vaca extends Animal{

    private int numcuernos;

    //creamos el constructor para inicializarlo todo

    public Vaca (String nombre, double peso, int numcuernos){

        super(nombre, peso);

        this.numcuernos = numcuernos;

    }

    public void mugir(){

        System.out.println("La vaca "+ getNombre()+" esta mugiendo");

    }

    @Override  // Permite verificar si se esta sobreescribiendo correctamente
    // el metodo (de esta manera permite asegurar que el metodo que se esta sobreescribiendo 
    //es un metodo de la clase padre)
    public void comer(){

        System.out.println("La vaca "+getNombre()+" esta ruminado");
        
    }

}
