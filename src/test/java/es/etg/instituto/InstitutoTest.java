package es.etg.instituto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InstitutoTest 
{

    private Instituto instituto;

    @BeforeEach
    public void inicializar(){
        //Doy de alta un Instituto
        instituto = new Instituto();
    }

    @Test
    public void matricularTest(){
        
        int numAlumEsperado = 1;
        int numAlumReal;

        Alumno a = new Alumno();
        a.setNombre("Jorge");
        a.setApellidos("Apellidos");
        instituto.matricular(a);

        numAlumReal = instituto.listarAlumnos().size();

        assertEquals(numAlumEsperado, numAlumReal);
    }

    @Test
    public void agregarCursoTest(){
        
        int numCursosEsperado = 1;
        int numCursosReal;

        Curso c = new Curso();
        instituto.agregar(c);

        numCursosReal = instituto.listarCursos().size();

        assertEquals(numCursosEsperado, numCursosReal);
    }


}
