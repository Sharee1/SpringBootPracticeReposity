package com.employee.employee.controller;


import com.employee.employee.entity.Employee;
import com.employee.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @RequestMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @RequestMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
    }


    @RequestMapping("/find/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findEmployeeByID(id);
    }

    public  void deleteEmployeeByID(@PathVariable ("id") Long id){
        employeeService.deleteEmployeeByID(id);


    }


}