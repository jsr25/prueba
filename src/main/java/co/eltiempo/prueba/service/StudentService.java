package co.eltiempo.prueba.service;

import co.eltiempo.prueba.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {

    /**
     * Obtiene todos los estudiante de
     * una clase
     * @param course nombre curso
     * @return datos de los estudiantes de un curso
     */
    public List<Student> getAllStudent(String course);

    /**
     * Se añade el estudiante a un curso especifico
     * @param student datos del estudiante
     * @param course nombre curso
     * @return valor booleano indicando que el proceso se hizo correctamente
     */
    public boolean addStudent(Student student, String course);

    /**
     *Actualiza la informacion de un estudiante de un curso en especifico
     * @param student datos del estudiante
     * @param course  nombre curso
     * @return valor booleano indicando que el proceso se hizo correctamente
     */
    public boolean updateStudent(Student student, String course);

    /**
     * Elimina un estudiante de una asignatura dato el curso
     * @param cc identificacion del estudiante
     * @param course nombre curso
     * @return valor booleano indicando que el proceso se hizo correctamente
     */
    public boolean removeStudent(String cc, String course);
}
