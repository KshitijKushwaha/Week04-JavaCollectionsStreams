import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByProperty {
    public static Map<String, List<Employee>> grouping(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        return grouped;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = grouping(employees);
        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}