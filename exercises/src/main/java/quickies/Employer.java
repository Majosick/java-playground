package quickies;

import java.util.ArrayList;
import java.util.List;

public class Employer {

    private static int idCounter = 0;
    private String name;
    private int id;
    private double salary;


    public Employer(String name, double salary) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return this.name + " " + this.id + " " + this.salary;
    }


    public static void main(String[] args) {

        List<Employer> empList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            empList.add(new Employer("Adam" + i, 4998 + i));
        }

        empList.stream().filter(emp -> emp.getSalary() > 5000.0).forEach(System.out::println);


    }
}
