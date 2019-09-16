package com.codeclan.employeetrackerlab.employeetracker.controllers;


import com.codeclan.employeetrackerlab.employeetracker.models.Employee;
import com.codeclan.employeetrackerlab.employeetracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeContoller {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public Optional<Employee> getEmployee(@PathVariable Long id) { //@pathvariable used to specify ID
        return employeeRepository.findById(id);
    }


}
