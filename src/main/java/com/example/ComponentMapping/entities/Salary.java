package com.example.ComponentMapping.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {
    private int basicsalary;
    private int taxamount;

    private int apecialallowancesalary;

    public int getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(int basicsalary) {
        this.basicsalary = basicsalary;
    }

//    public int getBonussalary() {
//        return bonussalary;
//    }
//
//    public void setBonussalary(int bonussalary) {
//        this.bonussalary = bonussalary;
//    }

    public int getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(int taxamount) {
        this.taxamount = taxamount;
    }

    public int getApecialallowancesalary() {
        return apecialallowancesalary;
    }

    public void setApecialallowancesalary(int apecialallowancesalary) {
        this.apecialallowancesalary = apecialallowancesalary;
    }
}