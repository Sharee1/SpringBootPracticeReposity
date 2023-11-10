package com.employee.employee.controller;


import com.employee.employee.entity.Employee;
import com.employee.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
    }


    @GetMapping("/find/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findEmployeeByID(id);
    }
    @DeleteMapping("/delete/{id}")
    public  void deleteEmployeeByID(@PathVariable ("id") Long id){
        employeeService.deleteEmployeeByID(id);


    }


}