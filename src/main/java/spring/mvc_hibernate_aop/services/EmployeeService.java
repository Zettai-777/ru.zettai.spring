package spring.mvc_hibernate_aop.services;

import spring.mvc_hibernate_aop.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
}
