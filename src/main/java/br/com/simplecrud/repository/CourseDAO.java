package br.com.simplecrud.repository;

import br.com.simplecrud.model.Course;
import jakarta.persistence.EntityManager;


public class CourseDAO {

    private final EntityManager entityManager;

    public CourseDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void logCourse(final Course course) {
        this.entityManager.persist(course);
    }

    public Course findCourseById(final Integer id) {
        return entityManager.find(Course.class, id);
    }

    public void atualizarCourse(final Course course) {
        this.entityManager.merge(course);
    }
}
