package ex3;



import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public static List<Employee> extractPerson(List<Employee> employees, int bigSalary){
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees){
            if (employee.getSalary() > bigSalary){
                result.add(employee);
            }
        }
        return result;
    }

    public static Integer calculateAllSalary(List<Employee> employees){
        Integer allSalary = 0;
        for (Employee employee : employees ){
            allSalary += employee.getSalary();
        }
        return allSalary;
    }

    public static Integer givesTheBiggestSalary(List<Employee> employees){
        Integer biggestSalary = 0;
        for (Employee employee : employees){
            if (employee.getSalary() > biggestSalary){
                biggestSalary = employee.getSalary();
            }
        }
        return biggestSalary;
    }
}