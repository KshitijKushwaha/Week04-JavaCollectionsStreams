import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    static int count = 1;
    int id;
    String name;
    String dept;
    double sal;

    Employee(String name, String dept, double sal){
        this.id = count++;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return id + "- " + name + "- " + dept + "- " + sal;
    }
}
public class EmployeeData {

    public static void filteredByDept(List<Employee> e){
        System.out.println("Highest paid persons in the department : ");
        e.stream().filter(e1->e1.dept=="ECE" && e1.sal > 80000)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void sortBysalary(List<Employee> e){
        System.out.println("Sorted by Salary: ");
        e.stream()
                .sorted((e1, e2)->Double.compare(e2.sal, e1.sal))
                .forEach(System.out::println);
        System.out.println();
    }

    public static void groupByDept(List<Employee> e){
        Map<String, List<Employee>> grouped = e.stream()
                .collect(Collectors.groupingBy(e1-> e1.dept));

        grouped.forEach((dep, emplist)->{
            System.out.println("\nDepartment: "+dep);
            emplist.forEach(System.out::println);
        });
    }

    public static void averageSalByDept(List<Employee> e) {
        System.out.println("Average Salary by Department:");

        Map<String, Double> averageSalaries = e.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.dept,
                        Collectors.averagingDouble(emp -> emp.sal)
                ));
        averageSalaries.forEach((dept, avgSalary) ->
                System.out.println(dept + " : $" + avgSalary));
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Kshitij", "CSE", 100000),
                new Employee("Deekshith", "ECE", 90000),
                new Employee("Manoj", "CSE", 50000),
                new Employee("Aman", "ECE", 45000)
        );

        filteredByDept(list);
        sortBysalary(list);
        groupByDept(list);
        averageSalByDept(list);
    }
}
