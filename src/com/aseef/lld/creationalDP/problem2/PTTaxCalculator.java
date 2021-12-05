package com.aseef.lld.creationalDP.problem2;

public class PTTaxCalculator implements TaxCalculator{
//    Part Time Employees
//      20% PT
//      5% GST
//      2% ST

    @Override
    public double calculateTax(Employee employee) {
        int salary = employee.getSalary();
        return (0.20*salary)+
                (0.05*salary)+
                (0.02*salary);
    }
}
