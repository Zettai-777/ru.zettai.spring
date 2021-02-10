package spring.mvc_hibernate_aop.dao;

import spring.mvc_hibernate_aop.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
