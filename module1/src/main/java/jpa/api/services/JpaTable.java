package jpa.api.services;

import jpa.api.config.AppEntityManager;
import jpa.api.entities.Category;

public class JpaTable {

    public static void main(String[] args) {

        var entityManager = AppEntityManager.getEntityManager("mysql-jpa");

        Category category = new Category();
        category.setType("category_type");

        entityManager.getTransaction().begin();

        entityManager.persist(category);

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
