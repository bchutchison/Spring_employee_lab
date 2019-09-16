package com.codeclan.employeetrackerlab.employeetracker.repositories;

import com.codeclan.employeetrackerlab.employeetracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
