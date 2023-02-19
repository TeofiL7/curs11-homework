package ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> myEmployee = new ArrayList<>();
        myEmployee.add(new Employee(1500,"Lukoil","Marius",29,"brunet"));
        myEmployee.add(new Employee(2000,"Plexus","Andrei",28, "saten"));
        myEmployee.add(new Employee(1200,"Metro","Vlad",43,"brunet"));
        myEmployee.add(new Employee(3000,"Selgros","Ionut",44,"blond"));

        System.out.println(myEmployee);

        System.out.println("Person with more than a specified ammount");
        System.out.println(Company.extractPerson(myEmployee, 1700));


        System.out.println("Sum of all salaries");
        System.out.println(Company.calculateAllSalary(myEmployee));

        System.out.println("Biggest salary");
        System.out.println(Company.givesTheBiggestSalary(myEmployee));
    }
}
