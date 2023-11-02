public class Manager extends Employee {
    public Manager(String name, String hireDate, double salary) {
        super(name, hireDate, salary);
    }

    public static void raiseSalaryForAllExceptManagers(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.raiseSalary(amount);
            }
        }
    }
}