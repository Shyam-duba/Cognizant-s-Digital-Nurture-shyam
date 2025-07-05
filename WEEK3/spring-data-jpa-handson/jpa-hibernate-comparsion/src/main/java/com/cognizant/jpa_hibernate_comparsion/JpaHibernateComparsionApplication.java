package com.cognizant.jpa_hibernate_comparsion;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import com.cognizant.jpa_hibernate_comparsion.model.Employee;
import com.cognizant.jpa_hibernate_comparsion.service.EmployeeService;

@SpringBootApplication
public class JpaHibernateComparsionApplication {
	private static EmployeeService employeeService;
	private static final Logger LOGGER = LoggerFactory.getLogger(JpaHibernateComparsionApplication.class);


	private static void testAddEmployeeUsingHibernate(){
		LOGGER.info("started testing using Hibernate");
		Employee e = new Employee();
		e.setEmployeeId(1);
		e.setName("luffy");
		e.setSalary(5000.20);

		employeeService.addEmployee(e);



		LOGGER.info("end");
	}
	private static void testAddEmployeeUsingSpingJpa(){
		LOGGER.info("started testing using Spring Jpa");
		Employee e = new Employee();
		e.setEmployeeId(2);
		e.setName("shyam");
		e.setSalary(50090.27);

		employeeService.addEmployeeSpringJpa(e);


		LOGGER.info("end");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaHibernateComparsionApplication.class, args);

		employeeService = context.getBean(EmployeeService.class);

		testAddEmployeeUsingHibernate();
		testAddEmployeeUsingSpingJpa();
	}
}
