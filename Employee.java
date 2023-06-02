public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        double increaseAmount = salary * percentage / 100;
        salary += increaseAmount;
    }

    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("zearah", "teacher", 50000);

        // Print employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: $" + employee.getSalary());

        // Increase the salary by 10%
        employee.increaseSalary(10);

        // Print the updated salary
        System.out.println("Updated Salary: $" + employee.getSalary());
    }
}

