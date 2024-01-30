package es.etg.instituto;

import java.util.List;
import java.util.Set;

public interface Matriculable {
    
    public void matricular (Alumno a);
    public void desmatricular(Alumno a);
    public List<Alumno> listarAlumnos();
    public void agregar(Curso c);
    public void eliminar(Curso c);
    public Set<Curso> listarCursos();
}
