package edu.ib;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0) throw new IllegalArgumentException("Compensation should be greater than zero");
        if (hours < 0 || hours >168) throw new IllegalArgumentException("Employee cannot work so hard");
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40)
            return hours*wage;
        else
            return 40*wage+(hours-40)*wage*1.5;
    }
}
