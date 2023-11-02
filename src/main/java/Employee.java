import java.util.Comparator;

public class Employee {
    private String name;
    private String hireDate;
    private double salary;

    public Employee(String name, String hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public static Comparator<Employee> dateComparator = (e1, e2) -> {
        String[] date1 = e1.hireDate.split("-");
        String[] date2 = e2.hireDate.split("-");

        for (int i = 0; i < 3; i++) {
            int year1 = Integer.parseInt(date1[i]);
            int year2 = Integer.parseInt(date2[i]);
            if (year1 != year2) {
                return year1 - year2;
            }
        }
        return 0;
    };

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}