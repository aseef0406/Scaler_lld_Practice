package com.aseef.lld.creationalDP.problem2;

public class TaxCalculatorFactory {

    public TaxCalculator getTaxCalculator(EmployeeType employeeType){

        switch(employeeType){
            case FULL : return new FTTaxCalaculator();
            case PART_TIME: return new PTTaxCalculator();
            case INTERN: return new InternTaxCalculator();
            default: return new InternTaxCalculator();
        }
    }
}
