package com.cognizant.jpa_hibernate_comparsion.util;

import com.cognizant.jpa_hibernate_comparsion.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            Configuration config = new Configuration();

            // Set Hibernate properties manually
            config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3305/ormlearn");
            config.setProperty("hibernate.connection.username", "root");
            config.setProperty("hibernate.connection.password", "22501a4458");
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.hbm2ddl.auto", "update"); // or "create" for testing
            config.setProperty("hibernate.show_sql", "true");

            // Add annotated entity class
            config.addAnnotatedClass(Employee.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties()).build();

            sessionFactory = config.buildSessionFactory(serviceRegistry);

        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
