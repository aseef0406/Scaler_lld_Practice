package com.aseef.lld.creationalDP.problem2;

public class FTTaxCalaculator implements TaxCalculator{
//    FT EMployees
//          30% PT
//          3% EC
//          2% ST

    @Override
    public double calculateTax(Employee employee) {
        int salary = employee.getSalary();
        return (0.30*salary)+
                (0.03*salary)+
                (0.02*salary);
    }
}
