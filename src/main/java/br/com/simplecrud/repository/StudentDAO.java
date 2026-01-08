package br.com.simplecrud.repository;

import br.com.simplecrud.model.Student;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentDAO {
    private final EntityManager entityManager;

    public StudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void logStudent(final Student student){
        this.entityManager.persist(student);
    }

    public Student consultByID(final Integer id){
        return this.entityManager.find(Student.class, id);
    }

    public List<Student> consultAll(){
        String sql = "SELECT s FROM Student s";
        return this.entityManager.createQuery(sql, Student.class).getResultList();
    }

    public void updateStudent(final Student student){
        this.entityManager.merge(student);
    }

    public void excludeStudent(final Student student){
        this.entityManager.remove(student);
    }
}
