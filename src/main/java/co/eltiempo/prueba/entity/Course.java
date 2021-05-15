package co.eltiempo.prueba.entity;

import java.util.concurrent.ConcurrentHashMap;

public class Course {

    private String prefix;

    private String name;

    private Integer places;

    private ConcurrentHashMap<String,Student> students;

    public Course(){
        students = new ConcurrentHashMap<>();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    public ConcurrentHashMap<String, Student> getStudents() {
        return students;
    }

    /**
     * Agrega un estudiante al curso
     * @param student datos estudiante
     * @return valor booleano especificando si se realizo el proceso
     * correctamente
     */
    public boolean addStudent(Student student){
        boolean res = false;
        if(!students.containsKey(student.getIdentificationCard()) && students.size()<places){
            students.put(student.getIdentificationCard(),student);
            res=true;
        }

        return res;

    }

    /**
     * Se actualiza la informacion de un estudiante
     * ya registrado
     * @param student informacion del estudiante
     * @return valor booleano especificando si se realizo el proceso
     *  correctamente
     */
    public boolean updateStudent(Student student){
        boolean res = false;
        if(students.containsKey(student.getIdentificationCard())){
            students.put(student.getIdentificationCard(),student);
            res=true;
        }
        return res;
    }

    /**
     * Se elimina un estudiante registrado
     * @param identification identificacion del usuario
     * @return valor booleano especificando si se realizo el proceso
     * correctamente
     */
    public boolean removeStudent(String identification){
        boolean res = false;
        if(students.containsKey(identification)){
            students.remove(identification);
            res=true;
        }
        return res;
    }

}
