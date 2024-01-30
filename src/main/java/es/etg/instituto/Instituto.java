package es.etg.instituto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instituto implements Matriculable{
    
    //Array
    //public static final int MAX = 100;
    //private Curso [] cursos = new Curso[MAX];
    //private Alumno [] alumnos = new Alumno[MAX];

    //Colecciones
    private Set<Curso> cursos = new HashSet<Curso>();
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    @Override
    public void matricular(Alumno a) {
        alumnos.add(a);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return alumnos;
    }

    @Override
    public void desmatricular(Alumno a) {
        alumnos.remove(a);
    }

    @Override
    public void agregar(Curso c) {
        cursos.add(c);
    }

    @Override
    public void eliminar(Curso c) {
        cursos.remove(c);
    }

    @Override
    public Set<Curso> listarCursos() {
        return cursos;
    }
}
