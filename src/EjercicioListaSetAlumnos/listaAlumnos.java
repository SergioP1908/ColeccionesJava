package EjercicioListaSetAlumnos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import alumnosSet.Alumno;

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

public class listaAlumnos {

    public listaAlumnos(){

    }


    public static void main(String[] args) {

        listaAlumnos newAlumnos = new listaAlumnos();

        ArrayList <Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("N1", "A1", 17, 9, "shdhyuswdeb@qwqw"));

        alumnos.add(new Alumno("N2", "A2", 17, 4, "shdhyuswdeb@qwqw"));

        alumnos.add(new Alumno("N1", "A3", 17, 3, "shdhyuswdeb@qwqw"));

        alumnos.add(new Alumno("N4", "A4", 17, 6, "shdhyuswdeb@qwqw"));

        alumnos.add(new Alumno("N5", "A5", 17, 4, "shdhyuswdeb@qwqw"));

        alumnos.add(new Alumno("N6", "A6", 17, 5, "shdhyuswdeb@qwqw"));
        
        newAlumnos.mostrarAlumnos(alumnos);

        
        //newAlumnos.buscarAlumno(alumnos);

        newAlumnos.aulasAlumno(alumnos);

        
    }

    private  void  mostrarAlumnos(List <Alumno> alumnos){
        
        

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Alumno "+(i+1));
            System.out.println(alumnos.get(i));
        }

        
    }

    private  String buscarAlumno(List<Alumno>alumnos){
        
		Scanner scan = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del alumno que desea buscar: ");
		String buscAlumno = scan.nextLine().toUpperCase();

        System.out.println("El nombre que esta buscando es : "+buscAlumno);
       
        int cantAlumnos = 0;
		for (Alumno alumno : alumnos) {



            if(buscAlumno.equals(alumno.getNombre()) ){
                
                
                cantAlumnos++;

                System.out.println("Se ha encontrado "+cantAlumnos+ " alumno con un nombre similar");
                System.out.println("La nota media del alumno es "+alumno.getNotaMedia());
            }
            
        }

        System.out.println("Se han encontrado una cantidad de alumnos :"+cantAlumnos);
        return buscAlumno;
    }

    private Map <String, List<Alumno>> aulasAlumno(List<Alumno>alumnos){

        Map <String, List<Alumno>> aulas = new LinkedHashMap<>();

        System.out.println("=============Aulas==============");
        aulas.put("AULA 1", alumnos.subList(0, 2));
        aulas.put("AULA 2", alumnos.subList(2, 4));
        aulas.put("AULA 3", alumnos.subList(4, 6));

        Set <String> aulaAlumnos = aulas.keySet();

        for (String aula : aulaAlumnos) {
            
            System.out.println(aula + " "+aulas.get(aula));

            
        }

        return aulas;
    }

    private double notaPromedio (Map <String, List<Alumno>> alumnos){


        double notMedia=0;
        return notMedia;
    }
}
