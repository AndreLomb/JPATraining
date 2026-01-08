package br.com.simplecrud.service;

import br.com.simplecrud.model.Course;
import br.com.simplecrud.model.Student;
import br.com.simplecrud.repository.CourseDAO;
import br.com.simplecrud.repository.StudentDAO;
import br.com.simplecrud.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class EscolaService {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerSimpleCrud();
        logNewStudent(entityManager, logCourse(entityManager));
    }

    private static void logNewStudent(EntityManager entityManager, Course course) {
        Student newStudent = new Student();
        newStudent.setNome("Marcos");
        newStudent.setIdade(20);
        newStudent.setMatricula(11);

        StudentDAO studentDAO = new StudentDAO(entityManager);
        entityManager.getTransaction().begin();

        studentDAO.logStudent(newStudent);
        entityManager.flush();

        studentDAO.consultAll().forEach(student ->
                System.out.println("O estudante cadastrado foi: " + student));

        entityManager.close();
    }

    private static Course logCourse(EntityManager entityManager){
        CourseDAO courseDAO = new CourseDAO(entityManager);
        Course computerEngineering = new Course("Engenharia de Computação");
        entityManager.getTransaction().begin();
        courseDAO.logCourse(computerEngineering);
        entityManager.getTransaction().commit();
        entityManager.clear();
        return computerEngineering;
    }
}
