package spring.mvc_hibernate_aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc_hibernate_aop.entities.Employee;
import spring.mvc_hibernate_aop.services.EmployeeService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam(name = "empId") int id, Model model){
        Employee curEmployee = employeeService.getEmployee(id);
        model.addAttribute("employee", curEmployee);
        employeeService.saveEmployee(curEmployee);
        return "employee-info";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam(name = "empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

}
