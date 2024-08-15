package com.cognizant.DN30.EmployeeManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.util.*;

import repositories.DepartmentRepository;
import repositories.EmployeeRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repositories")
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	@Autowired
	EmployeeRepository er;
	
	
	@Override
	public void run(String... args)throws Exception {
		Employee em =new Employee();
		em.setName("Abc");
		em.setId(12345678L);
		em.setEmail("abc@gmail.com");
		er.save(em);
		List<Employee> list=er.findByName("Abc");
		for (Employee item : list) {
            System.out.println(item.getName());
        }
	}
}
