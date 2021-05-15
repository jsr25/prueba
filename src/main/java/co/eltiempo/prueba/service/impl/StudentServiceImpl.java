package co.eltiempo.prueba.service.impl;

import co.eltiempo.prueba.entity.Student;
import co.eltiempo.prueba.repository.impl.StudentRepositoryImpl;
import co.eltiempo.prueba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepositoryImpl studentRepository;


    @Override
    public List<Student> getAllStudent(String course) {
        return studentRepository.getAllStudent(course);
    }

    @Override
    public boolean addStudent(Student student, String course) {
        return studentRepository.addStudent(student,course);
    }

    @Override
    public boolean updateStudent(Student student, String course) {
        return studentRepository.updateStudent(student,course);
    }

    @Override
    public boolean removeStudent(String cc, String course) {
        return studentRepository.removeStudent(cc,course);
    }
}
