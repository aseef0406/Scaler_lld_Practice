package com.aseef.lld.creationalDP.problem2;

public class Client {

    public static void main(String[] args) {

        Employee a = new FTEmployee(EmployeeType.FULL);
        a.setSalary(100);

        Employee b = new PTEmployee(EmployeeType.PART_TIME);
        b.setSalary(100);

        Employee c = new InternEmployee(EmployeeType.INTERN);
        c.setSalary(100);

        TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();

        System.out.println("a's Tax: "+taxCalculatorFactory.getTaxCalculator(a.getEmployeeType()).calculateTax(a));
        System.out.println("b's Tax: "+taxCalculatorFactory.getTaxCalculator(b.getEmployeeType()).calculateTax(b));
        System.out.println("c's Tax: "+taxCalculatorFactory.getTaxCalculator(c.getEmployeeType()).calculateTax(c));

    }
}
