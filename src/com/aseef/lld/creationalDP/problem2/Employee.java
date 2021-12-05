package com.aseef.lld.creationalDP.problem2;

public abstract class Employee {

    private EmployeeType employeeType;
    private int salary;


    public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
