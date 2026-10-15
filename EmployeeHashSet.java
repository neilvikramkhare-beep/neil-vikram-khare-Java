import java.util.HashSet;
public class EmployeeHashSet {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();
        Employee emp1 = new Employee(1, "John Doe", "Engineering");
        Employee emp2 = new Employee(2, "Jane Smith", "Marketing");
        Employee emp3 = new Employee(3, "Alice Johnson", "Sales");
        Employee emp4 = new Employee(1, "John Doe", "Engineering"); 
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);
        System.out.println("Employees in the HashSet:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }
    }
}
