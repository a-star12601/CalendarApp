package com.capillary.calendar.dao;

import com.capillary.calendar.model.Employee;

import java.util.List;

public interface IEmployeeDao {

    int insertEmployee(Employee emp);

    List<Employee> getAllEmployee();
}
