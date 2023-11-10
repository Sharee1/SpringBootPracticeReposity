package com.employee.employee.service;

import com.employee.employee.entity.Employee;
import com.employee.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindAllEmployee() {
        List<Employee> expectedEmployees = Arrays.asList(
                new Employee(1L, "Shaheer", "shaheermajid2002@gmail.com", "Python Developer", "0317-1224795", "EWr", "EWr")
        );

        when(employeeRepository.findAll()).thenReturn(expectedEmployees);

    }

    @Test
    public void testUpdateEmployee() {

        Employee employeeToUpdate = new Employee(1L, "Mushaf Bhai", "Mushafbhai@gmail.com", "Full Stack ", "0317-1224795", "EWr", "Eewr");
        when(employeeRepository.save(employeeToUpdate)).thenReturn(employeeToUpdate);

    }

    @Test
    public void testFindEmployeeByID() {

        Long employeeIdToFind = 1L;
        Employee expectedEmployee = new Employee(1L, "Mushaf Bhai", "Mushafbhai@gmail.com", "Full Stack ", "0317-1224795", "EWr", "Eewr");
        Optional<Employee> optionalEmployee = Optional.of(expectedEmployee);
        when(employeeRepository.findById(employeeIdToFind)).thenReturn(optionalEmployee);



}}