package co.eltiempo.prueba.repository;

import co.eltiempo.prueba.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentRepository {

    /**
     * Obtiene los estudiantes de un
     * curso espeficico
     * @param course  nombre del curso
     * @return retorna el listado de estudiantes del curso
     */
    public List<Student> getAllStudent(String course);

    /**
     * Se añade el estudiante a un curso especifico
     * @param student datos del estudiante
     * @param course nombre del curso
     * @return valor booleano indicando que la operacion se hizo correctamente
     */
    public boolean addStudent(Student student, String course);

    /**
     *Se actualizan los datos del usuario
     * de un curso especifico
     * @param student datos del estudiante
     * @param course nombre del curso
     * @return valor booleano indicando que se pudo actualizar la informacion del estudiante
     */
    public boolean updateStudent(Student student, String course);

    /**
     * Se elimina un estudiante de un curso
     * especifico
     * @param cc identificacion del estudiante
     * @param course nombre del curso
     * @return valor booleano indicando que se pudo eliminar el estudiante
     */
    public boolean removeStudent(String cc, String course);
}
