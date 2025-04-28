import java.util.Arrays;
import java.util.List;

class Person{
    String name;
    int age;
    double salary;
    Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary+"\n");
        System.out.println();
    }
}

public class SortingList {
    public static void main(String[] args) {
        List<Person> details = Arrays.asList(
          new Person("Kshitij", 21, 30000),
          new Person("Aman", 20, 400000),
          new Person("Ram", 23, 3000)
        );
        List<Person> ordered = details.stream().sorted((d1,d2)->Double.compare(d1.salary, d2.salary)).toList();

       for(Person p : ordered){
           p.displayDetails();
       }
    }
}
