package com.capillary.calendar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    //members
    private final int empId;

    private final String empName;
    private final String empMail;
    private final String empOffice;
    private final String empDept;
    private final String empDesignation;

    //constructors
    public Employee(@JsonProperty("empId") int empId,@JsonProperty("empName") String empName,
                    @JsonProperty("empMail") String empMail,@JsonProperty("empOffice") String empOffice,
                    @JsonProperty("empDept") String empDept,@JsonProperty("empDesignation") String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empMail = empMail;
        this.empOffice = empOffice;
        this.empDept = empDept;
        this.empDesignation = empDesignation;
    }

    //getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpMail() {
        return empMail;
    }

    public String getEmpOffice() {
        return empOffice;
    }

    public String getEmpDept() {
        return empDept;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }
}
