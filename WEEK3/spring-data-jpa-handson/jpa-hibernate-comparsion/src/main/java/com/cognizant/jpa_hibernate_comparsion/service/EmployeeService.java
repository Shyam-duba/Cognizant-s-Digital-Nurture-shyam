package com.cognizant.jpa_hibernate_comparsion.service;


import com.cognizant.jpa_hibernate_comparsion.model.Employee;
import com.cognizant.jpa_hibernate_comparsion.repository.EmployeeRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.jpa_hibernate_comparsion.util.HibernateUtil;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void addEmployee(Employee employee) {
        Transaction tx = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            session.save(employee);

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }


    public void addEmployeeSpringJpa(Employee employee) {
        employeeRepository.save(employee);
    }

}
