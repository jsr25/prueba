package co.eltiempo.prueba.course;

import co.eltiempo.prueba.entity.Course;
import co.eltiempo.prueba.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseTest {

    @Test
    public void testAddStudent(){
        Course c1 = new Course();
        c1.setName("Programacion1");
        c1.setPlaces(15);
        c1.setPrefix("p1");
        Student prueba = new Student();
        prueba.setName("Juan");
        prueba.setLastName("Ramos");
        prueba.setFaculty("Ingenieria");
        prueba.setIdentificationCard("00000000");
        c1.addStudent(prueba);

        Assertions.assertEquals(1,c1.getStudents().size());

    }

    @Test
    public void testUpdateStudent(){
        Course c1 = new Course();
        c1.setName("Programacion1");
        c1.setPlaces(15);
        c1.setPrefix("p1");
        Student prueba = new Student();
        prueba.setName("Juan");
        prueba.setLastName("Ramos");
        prueba.setFaculty("Ingenieria");
        prueba.setIdentificationCard("00000000");
        c1.addStudent(prueba);

        prueba.setLastName("Isaza");

        Assertions.assertEquals("Isaza",c1.getStudents().get("00000000").getLastName());

    }

    @Test
    public void testRevomeStudent(){
        Course c1 = new Course();
        c1.setName("Programacion1");
        c1.setPlaces(15);
        c1.setPrefix("p1");
        Student prueba = new Student();
        prueba.setName("Juan");
        prueba.setLastName("Ramos");
        prueba.setFaculty("Ingenieria");
        prueba.setIdentificationCard("00000000");
        c1.addStudent(prueba);
        c1.removeStudent("00000000");


        Assertions.assertEquals(0,c1.getStudents().size());

    }



}
