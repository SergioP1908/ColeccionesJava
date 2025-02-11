package ZoologicoTest;
public class Zoologico {

    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico();//Se debe crear una instancia 
        //para poder ejecutar la funcion ( Esto ocurre cuando no tiene el static)
        // Al ser una funcion que no tiene estatic y es llamada por una Static
        //Debe instanciarse
        zoo.abrirZoo();
    }

    private void abrirZoo(){

        Leon leon = new Leon(true, "Mufasa", 190);

        leon.cazar();

        leon.beber();

        leon.comer();

        
        Vaca vaca = new Vaca("Lola", 200, 0);

        vaca.mugir();

        vaca.comer();

        Animal vaca1 = new Vaca ("MuuuuVaca", 200, 2); // siempre hay que ver con que clase esta creada
        // al estar creada con "new Vaca", se le llama desde la clase Vaca
        
        vaca1.comer(); // se puede llamar ya que la clase a la que se hace referencia es a Animal
        //por lo tanto animal tiene la funcion (comer)

        //vaca1.mugir(); no se puede ejecutar ya que mugir solamente esta en la clase vaca y no en la clase Animal

        Animal leon1 = new Leon(true, "Asndcj", 9); // siempre hay que ver de que tipo es el objeto ( Tipo Leon )

        // solo se puede convertir a animales con los cuales se hayan creado con ese tipo de objeto

        Vaca vaca2 = (Vaca)vaca1; // se debe asignar una nueva variable el cual se le asigne que es el tipo Vaca

        // vaca2 = (Vaca)leon1; no se puede ejecutar porque la clase leon no es una vaca (Leon != vaca)

        vaca2.mugir(); // se modifica la variable y ahora si se puede llamar a mugir
    }
}
