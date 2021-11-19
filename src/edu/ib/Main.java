package edu.ib;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();

        try {
            SalariedEmployee se1 = new SalariedEmployee("John", "Zoe",
                    "12345", 500);
            HourlyEmployee he1 = new HourlyEmployee("Alan", "Star", "56438", 23, 39);

            employees.add(se1);
            employees.add(he1);

            for (Employee e : employees)
                System.out.println(e);

            for (Employee e : employees) {

                if (e instanceof  HourlyEmployee){
                    HourlyEmployee he=(HourlyEmployee) e;
                    System.out.println("Wage= " + he.getWage());
                }

            }

        } catch (IllegalArgumentException e) {

            System.out.println("Something went wrong");
        }

    }
}
