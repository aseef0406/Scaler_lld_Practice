package com.aseef.problem1;

public class Client {
    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculatorImpl();

        Employee a = new FTEmployee();
        a.setSalary(50);
        Employee b = new PTEmployee();
        b.setSalary(70);
        Employee c = new InternEmployee();
        c.setSalary(30);

        System.out.println("Salary "+a.getSalary()+"L Tax "+taxCalculator.calculateTax(a)+"L");
        System.out.println("Salary "+b.getSalary()+"L Tax "+taxCalculator.calculateTax(b)+"L");
        System.out.println("Salary "+c.getSalary()+"L Tax "+taxCalculator.calculateTax(c)+"L");

    }
}
