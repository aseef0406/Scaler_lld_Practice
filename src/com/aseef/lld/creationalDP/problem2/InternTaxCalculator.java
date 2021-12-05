package com.aseef.lld.creationalDP.problem2;

public class InternTaxCalculator implements TaxCalculator{
//    Interns
//      20% PT

    @Override
    public double calculateTax(Employee employee) {
        int salary = employee.getSalary();
        return (0.20*salary);
        //learn typing

    }
}
