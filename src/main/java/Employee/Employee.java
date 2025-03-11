package Employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String firstName;
    private int salary;
    private String position;

    public Employee(String firstName, int salary, String position) {
        this.firstName = firstName;
        this.salary = salary;
        this.position = position;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Peter", 10000, "boss");
        Employee e2 = new Employee("Adam", 15000, "boss");
        Employee e3 = new Employee("Matthew", 20000, "boss");

        e2.increaseSalaryBy(2000);


        // Immutable lista
        List<Employee> employeeList2 = List.of(e1, e2, e3);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        for (Employee e : employeeList) {
            if (e.getSalary() < 20000) {
                System.out.println(e.getFirstName() + " earns less than 20000");
            }
        }
        employeeList.stream();
    }

    public void increaseSalaryBy(int newSalary) {
        this.salary += newSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }
}
