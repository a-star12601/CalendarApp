package com.capillary.calendar.service;

import com.capillary.calendar.dao.IEmployeeDao;
import com.capillary.calendar.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final IEmployeeDao empDao;

    @Autowired
    public EmployeeService(@Qualifier("mock") IEmployeeDao empDao) {
        this.empDao = empDao;
    }
    public int addEmployee(Employee emp){
        return empDao.insertEmployee(emp);
    }
    public List<Employee> getAllEmployee(){
        return empDao.getAllEmployee();
    }
}
