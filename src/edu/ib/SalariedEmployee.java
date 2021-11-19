package edu.ib;

public class SalariedEmployee extends Employee  {

  private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0) throw new IllegalArgumentException("Compensation cannot be negative");

        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        String fromEmployee= super.toString();
        String newPart="," + weeklySalary + "}";
        String fullInfo=fromEmployee.substring(0,fromEmployee.length()-1)+newPart;
        return fullInfo;
    }
}
