package quickies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public static int nextID = 1;

    private String name;
    private int id;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.id = nextID;
        nextID++;
        this.salary = salary;

    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    public int tryMe() {
        try {
            System.out.println("1");
            return 1;
        } catch (Exception e) {
            System.out.println("2");
            return 2;
        } finally {
            System.out.println("3");
            return 3;
        }
    }

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        Employee e = new Employee("Adam ", 4999.0);
        for (int i = 0; i < 20; i++) {
//            e = new Employee("Adam " + i, 4999.0 + i);
//            empList.add(e);
            empList.add(new Employee("Adam " + i, 4999.0 + i));
        }

//        for (Employee emp : empList) {
//            if (emp.getSalary() > 3000.0) {
//                System.out.println(emp.toString());
//            }
//        }

//        empList.stream().filter(emp -> emp.getSalary() > 5000).forEach(System.out::println);
//        List<String> names = empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
//        names.stream().forEach(System.out::println);

        System.out.println(e.tryMe());

    }


}
