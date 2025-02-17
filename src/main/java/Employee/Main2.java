package Employee;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Piotr", 10000, "szef");
        Employee e2 = new Employee("Adam", 15000, "szef");
        Employee e3 = new Employee("Mati", 20000, "szef");

        e2.increaseSalaryBy(2000);

        List<Employee> lista = new ArrayList<>();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);

        for (Employee e : lista) {
            if (e.getSalary() < 20000) {
                System.out.println(e.getFirstName() + " zarabia mniej niż 20000");
            }
        }
        lista.stream();
    }
}
