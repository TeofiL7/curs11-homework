package ex3;

import ex2.Person;

public class Employee extends Person {
    private String company;
    private int salary;
    public Employee(int salary ,String company, String name, int age, String hairColour) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }


    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
