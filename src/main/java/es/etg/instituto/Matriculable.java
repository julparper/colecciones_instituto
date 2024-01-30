package es.etg.instituto;

import java.util.List;
import java.util.Set;

public interface Matriculable {
    
    /**
     * Permite agregar un alumno al instituto
     * @param a alumno a matricular
     */
    public void matricular (Alumno a);

    /**
     * Permite desmatricular a un alumno del instituto
     * @param a alumno a desmatricular
     */
    public void desmatricular(Alumno a);
    public List<Alumno> listarAlumnos();
    public void agregar(Curso c);
    public void eliminar(Curso c);
    public Set<Curso> listarCursos();
}
