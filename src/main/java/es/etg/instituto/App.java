package es.etg.instituto;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Instituto i = new Instituto();

        i.matricular(new Alumno());
        i.matricular(new Alumno());
        i.matricular(new Alumno());

        List<Alumno> l = i.listarAlumnos();
        System.out.print("");
    }
}
