package co.eltiempo.prueba.repository.impl;

import co.eltiempo.prueba.entity.Student;
import co.eltiempo.prueba.persistence.impl.LocalPersistenceAppImpl;
import co.eltiempo.prueba.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepositoryImpl implements StudentRepository {

    private final LocalPersistenceAppImpl persistenceApp;

    public StudentRepositoryImpl(){
        persistenceApp = LocalPersistenceAppImpl.getPersistence();
    }

    @Override
    public List<Student> getAllStudent(String course) {
        return persistenceApp.getAllStudent(course);
    }

    @Override
    public boolean addStudent(Student student, String course) {
        return persistenceApp.addStudent(student,course);
    }

    @Override
    public boolean updateStudent(Student student, String course) {
        return persistenceApp.updateStudent(student, course);
    }

    @Override
    public boolean removeStudent(String cc, String course) {
        return persistenceApp.removeStudent(cc, course);
    }
}
