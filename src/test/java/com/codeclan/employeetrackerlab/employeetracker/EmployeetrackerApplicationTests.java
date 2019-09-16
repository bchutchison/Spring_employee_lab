package com.codeclan.employeetrackerlab.employeetracker;

import com.codeclan.employeetrackerlab.employeetracker.models.Employee;
import com.codeclan.employeetrackerlab.employeetracker.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeetrackerApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee() {
		Employee employee = new Employee("Louise", 20, 545454, "louise@email.com");
			employeeRepository.save(employee);
	}

}
