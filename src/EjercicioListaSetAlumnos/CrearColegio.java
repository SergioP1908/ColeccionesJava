package EjercicioListaSetAlumnos;

import java.util.List;
import java.util.Map;

import alumnosSet.Alumno;

public class CrearColegio {

    public static void main(String[] args) {

        listaAlumnos ejercicioAlumnos = new listaAlumnos();

    
        
        Colegio colegio1 = new Colegio("Cole1", "Dir1");

        Map<String, List<Alumno>> aulasColegio1 = ejercicioAlumnos.generarAlumnos(ejercicioAlumnos.generarAlumnos(6));

        colegio1.setAulas(null);
    }


}
