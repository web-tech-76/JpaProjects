package jpa.app.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Module2EntityManager {

    public static EntityManager getEntityManager(String persistenceUnit) {
        EntityManagerFactory entityManagerFactory;
        EntityManager entityManager;
        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
