public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Employee 1", "2023-07-01", 50000);
        employees[1] = new Manager("Manager 1", "2022-03-15", 80000);
        employees[2] = new Employee("Employee 2", "2023-05-20", 60000);
        employees[3] = new Employee("Employee 3", "2023-01-10", 55000);

        System.out.println("Before salary raise:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Manager.raiseSalaryForAllExceptManagers(employees, 10000);

        System.out.println("After salary raise:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}