package com.capillary.calendar.api;

import com.capillary.calendar.model.Employee;
import com.capillary.calendar.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/employee")
@RestController
public class EmployeeController {
    private final EmployeeService empService;

    @Autowired
    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee emp){
        empService.addEmployee(emp);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return empService.getAllEmployee();
    }
}
