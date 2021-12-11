package com.aseef.problem1;

public class TaxCalculatorImpl implements TaxCalculator{
    @Override
    public double calculateTax(Employee e) {
        return (0.20*e.getSalary()+0.03*e.getSalary());
    }
}
