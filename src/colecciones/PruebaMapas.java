package colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;


public class PruebaMapas {

    //import alt+shift+O

    public static void main(String[] args) {
        Map <String, Integer> mapa = new HashMap<>();
        //mapa.put("Clave1", 1);

        //mapa.put("Clave2", 3); //Para que funcione debe ser los datos 

        System.out.println(mapa.put("Clave1", 1));
        System.out.println(mapa.put("Clave1", 2));

        System.out.println(mapa.put("Clave2", 3));
        System.out.println(mapa.put("Clave2", 4));

        System.out.println("=======================");

        System.out.println(mapa.get("Clave1"));
        System.out.println(mapa.get("Clave2"));


        System.out.println("=========== clave ============");

        Set <String> claves = mapa.keySet();

        System.out.println(mapa.keySet());


        for (String clave : claves) {

            System.out.println(clave);
            
        }

        System.out.println("=======================");

        Collection<Integer> valores = mapa.values();

        System.out.println(mapa.values());
        
        for (Integer numero : valores) {

            System.out.println(numero);
            
        }

        System.out.println("==========Todas las Clave y valor =============");

        for (String clave : claves) {

            System.out.println(clave+" "+mapa.get(clave));
            
        }

        System.out.println("==========Clave y valor usando Entry =============");

        Set <Entry<String,Integer>> entries = mapa.entrySet();
        for (Entry<String,Integer> entry : entries) {
            
            System.out.println(entry);
        }

       /*
        * crear en una nueva clase 6 alumnos, agreagar todos en un lista

        creamos un metodo para mostrar la informacion de todos los alumnos

        otro metodo el cual se preguntara por el nombre de un alumno y dara la nota media de todos los alumnos que se llamen igual

        vamos a separa  a los alumnos por aula

        aula1=2 alumnos
        aula2=2 alumnos
        aula3=2 alumnos

        Mostra por cada aula los datos de los alumnos

        Indicar cual es el aula que tiene el alumno con la nota media mas alta

        *Intentar en la lista original ACTUALIZAR para todos los alumnos suspensos su nota media a 0*
        */

    }
}
