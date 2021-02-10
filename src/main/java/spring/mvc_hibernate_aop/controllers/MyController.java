package spring.mvc_hibernate_aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc_hibernate_aop.dao.EmployeeDao;
import spring.mvc_hibernate_aop.entities.Employee;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeDao.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }

}
