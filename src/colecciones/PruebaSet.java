package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import alumnosSet.Alumno;
public class PruebaSet {

    public static void main(String[] args) {
         //Set <Alumno> alumnos = new HashSet<>();

         Set <Alumno> alumnos = new LinkedHashSet<>();

         alumnos.add(new Alumno("N1", "A1", 20, 7, null));

         alumnos.add(new Alumno("N1", "A1", 20, 7, null)); //Duplicado

         alumnos.add(new Alumno("N2", "A2", 22, 8, null));

         alumnos.add(new Alumno("N3", "A2", 22, 8, null));

         Alumno a4 = new Alumno("N4", null, 0, 0, null);

         System.out.println(alumnos.add(a4)); //Se añade el alumno N4 a la lista y devuelve un TRUE

         System.out.println(alumnos.add(a4));//Se vuelve a añadir N4 a la lista pero esta vez devuelve falso
         //porque no se pueden tener datos duplicados

         System.out.println(alumnos.size());
         

         for (Alumno alumno : alumnos) {

            System.out.println(alumno.getNombre());
            
         }

         System.out.println("----------------------------------------");
         Iterator <Alumno> ite = alumnos.iterator();

         while (ite.hasNext()) {
            Alumno a = ite.next();

         System.out.println(a.getNombre());
         }

         /* Alumno a = ite.next();

         System.out.println(a.getNombre());

         a = ite.next();

         System.out.println(a.getNombre());

         a = ite.next();

         System.out.println(a.getNombre()); */
         


    }
}
