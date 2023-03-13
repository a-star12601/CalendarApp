package com.capillary.calendar.dao;

import com.capillary.calendar.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("mock")
public class MockEmployeeDao implements IEmployeeDao {
    private static List<Employee> empList=new ArrayList<>();


    @Override
    public int insertEmployee(Employee emp) {
        empList.add(emp);
        return 1;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empList;
    }
}
