package br.com.simplecrud.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory CRUD = Persistence.createEntityManagerFactory("SimpleCRUD");

    public static EntityManager getEntityManagerSimpleCrud() {
        return CRUD.createEntityManager();
    }
}
