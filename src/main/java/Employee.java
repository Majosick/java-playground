public class Employee {

    private String firstName;
    private int salary;
    private String position;

    public Employee(String firstName, int salary, String position) {
        this.firstName = firstName;
        this.salary = salary;
        this.position = position;
    }

    public void increaseSalaryBy(int newSalary) {
        this.salary += newSalary ;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getSalary() {
        return salary;
    }
}
