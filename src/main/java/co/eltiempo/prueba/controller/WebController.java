package co.eltiempo.prueba.controller;

import co.eltiempo.prueba.entity.Student;
import co.eltiempo.prueba.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador web de las peticiones HTTP
 */
@Controller
public class WebController {

    @Autowired
    private StudentServiceImpl service;


    /**
     * Obtiene los estudiantes de un
     * curso espeficico
     * @param course  nombre del curso
     * @return retorna el listado de estudiantes del curso
     */
    @GetMapping("/getall/{course}")
    public ResponseEntity<?> getAll(@PathVariable("course") String course) {
        List<Student> list = service.getAllStudent(course);

        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);

    }

    /**
     * Se añade el estudiante a un curso especifico
     * @param student datos del estudiante
     * @param course nombre del curso
     * @return valor booleano indicando que la operacion se hizo correctamente
     */
    @PostMapping("/add/{course}")
    public ResponseEntity<?> add(@RequestBody Student student,@PathVariable("course") String course) {
        if(service.addStudent(student,course)){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    /**
     *Se actualizan los datos del usuario
     * de un curso especifico
     * @param student datos del estudiante
     * @param course nombre del curso
     * @return valor booleano indicando que se pudo actualizar la informacion del estudiante
     */
    @PutMapping("/update/{course}")
    public ResponseEntity<?> update(@RequestBody Student student,@PathVariable("course") String course) {
        if(service.updateStudent(student,course)){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    /**
     * Se elimina un estudiante de un curso
     * especifico
     * @param id identificacion del estudiante
     * @param course nombre del curso
     * @return valor booleano indicando que se pudo eliminar el estudiante
     */
    @DeleteMapping("/delete/{course}/{id}")
    public ResponseEntity<?> delete(@PathVariable("course") String course,@PathVariable("id") String id) {
        if(service.removeStudent(id,course)){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
