package com.employee.employee.service;

import com.employee.employee.entity.Employee;
import com.employee.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;}


    public Employee addEmployee( Employee employee){

       employee.setEmployeeCode(UUID.randomUUID().toString());
       return  employeeRepository.save(employee);}


    public List<Employee> findAllEmployee(){

        return employeeRepository.findAll();}

    public Employee updateEmployee( Employee employee){

        return  employeeRepository.save(employee);

    }


    public  Employee findEmployeeByID(Long id){


        return employeeRepository.findAllById(id);
    }
    public void deleteEmployeeByID(Long id){
        employeeRepository.deleteById(id);
    }


}
