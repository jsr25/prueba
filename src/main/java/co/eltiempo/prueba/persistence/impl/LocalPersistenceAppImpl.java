package co.eltiempo.prueba.persistence.impl;

import co.eltiempo.prueba.entity.Course;
import co.eltiempo.prueba.entity.Student;
import co.eltiempo.prueba.persistence.LocalPersistenceApp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class LocalPersistenceAppImpl implements LocalPersistenceApp {

    private ConcurrentHashMap<String, Course> courses;
    private static LocalPersistenceAppImpl persistenceApp= null;

    public static LocalPersistenceAppImpl getPersistence(){
        if(persistenceApp==null){
            persistenceApp=new LocalPersistenceAppImpl();
        }
        return persistenceApp;
    }

    private LocalPersistenceAppImpl(){
        courses = new ConcurrentHashMap<String,Course>();
        initial();
    }

    private void initial() {
        Course c1 = new Course();
        c1.setName("Programacion1");
        c1.setPlaces(15);
        c1.setPrefix("p1");
        Course c2 = new Course();
        c2.setName("Programacion2");
        c2.setPlaces(15);
        c2.setPrefix("p2");
        Course c3 = new Course();
        c3.setName("Programacion3");
        c3.setPlaces(15);
        c3.setPrefix("p3");
        Student prueba = new Student();
        prueba.setName("Juan");
        prueba.setLastName("Ramos");
        prueba.setFaculty("Ingenieria");
        prueba.setIdentificationCard("00000000");

        c1.addStudent(prueba);
        c2.addStudent(prueba);


        courses.put(c1.getPrefix(),c1);
        courses.put(c2.getPrefix(),c2);
        courses.put(c3.getPrefix(),c3);
    }


    @Override
    public List<Student> getAllStudent(String course) {
        ConcurrentHashMap<String,Student>  students =courses.get(course).getStudents();
        return new ArrayList<>(students.values());
    }

    @Override
    public boolean addStudent(Student student, String course) {
        Course course1=courses.get(course);
        return course1.addStudent(student);
    }

    @Override
    public boolean updateStudent(Student student, String course) {
        Course course1=courses.get(course);
        return course1.updateStudent(student);
    }

    @Override
    public boolean removeStudent(String cc, String course) {
        Course course1=courses.get(course);
        return course1.removeStudent(cc);
    }
}
